// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.recorder.encode;

import android.graphics.SurfaceTexture;
import android.hardware.display.VirtualDisplay;
import android.media.MediaCodec;
import android.opengl.EGL14;
import android.opengl.EGLExt;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.Choreographer;
import android.view.Display;
import android.view.Surface;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.recorder.instrumentation.Profiler;

// Referenced classes of package com.google.android.gms.games.recorder.encode:
//            EglControl, EglSurface, TextureBlitter

public final class FrameRateConverter
    implements android.graphics.SurfaceTexture.OnFrameAvailableListener, android.view.Choreographer.FrameCallback
{

    private final Choreographer mChoreographer = Choreographer.getInstance();
    Surface mDisplaySurface;
    SurfaceTexture mDisplayTexture;
    EglControl mEglControl;
    private final MediaCodec mEncoder;
    private final Surface mEncoderInputSurface;
    private final long mEncoderPeriodNanos;
    private final long mEncoderPeriodThresholdNanos;
    EglSurface mEncoderWindowSurface;
    final Handler mHandler = new Handler(Looper.myLooper());
    private int mHeight;
    private final float mIdentityMatrix[] = new float[16];
    boolean mIsDroppingFrames;
    boolean mIsStarted;
    long mNextEncoderFrameTime;
    private final long mRefreshOvershootNanos;
    private final long mRefreshPeriodNanos;
    private final Bundle mResumeCodec = new Bundle();
    private final Bundle mSuspendCodec = new Bundle();
    TextureBlitter mTextureBlitter;
    private int mTextureId;
    final VirtualDisplay mVirtualDisplay;
    private int mWidth;

    public FrameRateConverter(VirtualDisplay virtualdisplay, MediaCodec mediacodec, Surface surface, long l, long l1)
    {
        Preconditions.checkNotNull(virtualdisplay);
        Preconditions.checkNotNull(surface);
        mVirtualDisplay = virtualdisplay;
        mEncoder = mediacodec;
        mEncoderInputSurface = surface;
        mRefreshPeriodNanos = l;
        mRefreshOvershootNanos = (3L * l) / 4L;
        mEncoderPeriodNanos = l1;
        mEncoderPeriodThresholdNanos = mEncoderPeriodNanos / 10L;
        mediacodec = new DisplayMetrics();
        virtualdisplay.getDisplay().getRealMetrics(mediacodec);
        mWidth = ((DisplayMetrics) (mediacodec)).widthPixels;
        mHeight = ((DisplayMetrics) (mediacodec)).heightPixels;
        Matrix.setIdentityM(mIdentityMatrix, 0);
        mEglControl = new EglControl();
        mEncoderWindowSurface = new EglSurface(mEglControl, mEncoderInputSurface);
        mEncoderWindowSurface.makeCurrent();
        virtualdisplay = new int[1];
        GLES20.glGenTextures(1, virtualdisplay, 0);
        EglControl.checkGlError("glGenTextures");
        int i = virtualdisplay[0];
        GLES20.glBindTexture(36197, i);
        EglControl.checkGlError((new StringBuilder("glBindTexture ")).append(i).toString());
        GLES20.glTexParameterf(36197, 10241, 9728F);
        GLES20.glTexParameterf(36197, 10240, 9729F);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        EglControl.checkGlError("glTexParameter");
        mTextureId = i;
        mDisplayTexture = new SurfaceTexture(mTextureId);
        mDisplayTexture.setDefaultBufferSize(mWidth, mHeight);
        mDisplaySurface = new Surface(mDisplayTexture);
        mTextureBlitter = new TextureBlitter(mEglControl);
        GLES20.glViewport(0, 0, mWidth, mHeight);
        GLES20.glClearColor(0.0F, 0.0F, 0.0F, 1.0F);
        GLES20.glDisable(2929);
        GLES20.glDisable(2884);
    }

    public final void doFrame(long l)
    {
        if (!mIsDroppingFrames) goto _L2; else goto _L1
_L1:
        if (System.nanoTime() - l < mRefreshOvershootNanos)
        {
            if (mRefreshPeriodNanos + l >= mNextEncoderFrameTime)
            {
                mIsDroppingFrames = false;
            }
        } else
        {
            GamesLog.d("FrameRateConverter", "Skipping late refresh frame");
        }
_L4:
        mChoreographer.postFrameCallback(this);
        return;
_L2:
        if (l >= mNextEncoderFrameTime)
        {
            mIsDroppingFrames = true;
            while (mNextEncoderFrameTime <= l) 
            {
                mNextEncoderFrameTime = mNextEncoderFrameTime + mEncoderPeriodNanos;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void onFrameAvailable(SurfaceTexture surfacetexture)
    {
        com.google.android.gms.games.recorder.instrumentation.ProfileScope profilescope;
        if (!mIsStarted)
        {
            return;
        }
        surfacetexture = Profiler.getInstance();
        surfacetexture.incrementCounter("handled_input_capture_frames", 1);
        profilescope = surfacetexture.startTiming("handle_input_capture_frame");
        Profiler profiler;
        com.google.android.gms.games.recorder.instrumentation.ProfileScope profilescope1;
        long l;
        long l1;
        l = System.nanoTime();
        if (mNextEncoderFrameTime < 0L)
        {
            mNextEncoderFrameTime = l;
        }
        mDisplayTexture.updateTexImage();
        if (l < mNextEncoderFrameTime - mEncoderPeriodThresholdNanos)
        {
            break MISSING_BLOCK_LABEL_444;
        }
        l1 = mNextEncoderFrameTime;
        profiler = Profiler.getInstance();
        profiler.incrementCounter("copied_output_video_frames", 1);
        profilescope1 = profiler.startTiming("copy_output_video_frame");
        mEncoderWindowSurface.makeCurrent();
        GLES20.glClearColor(0.0F, 0.0F, 0.0F, 1.0F);
        GLES20.glClear(16384);
        GLES20.glViewport(0, 0, mWidth, mHeight);
        Object obj = mTextureBlitter;
        int i = mTextureId;
        float af[] = mIdentityMatrix;
        EglControl.checkGlError("draw start");
        GLES20.glUseProgram(((TextureBlitter) (obj)).mProgramHandle);
        EglControl.checkGlError("glUseProgram");
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i);
        GLES20.glUniformMatrix4fv(((TextureBlitter) (obj)).mUMvpMatrixLoc, 1, false, ((TextureBlitter) (obj)).mIdentityMatrix, 0);
        EglControl.checkGlError("glUniformMatrix4fv");
        GLES20.glUniformMatrix4fv(((TextureBlitter) (obj)).mUTexMatrixLoc, 1, false, af, 0);
        EglControl.checkGlError("glUniformMatrix4fv");
        GLES20.glEnableVertexAttribArray(((TextureBlitter) (obj)).mAPositionLoc);
        EglControl.checkGlError("glEnableVertexAttribArray");
        GLES20.glVertexAttribPointer(((TextureBlitter) (obj)).mAPositionLoc, 2, 5126, false, 8, TextureBlitter.FULL_RECTANGLE_BUF);
        EglControl.checkGlError("glVertexAttribPointer");
        GLES20.glEnableVertexAttribArray(((TextureBlitter) (obj)).mATextureCoordLoc);
        EglControl.checkGlError("glEnableVertexAttribArray");
        GLES20.glVertexAttribPointer(((TextureBlitter) (obj)).mATextureCoordLoc, 2, 5126, false, 8, TextureBlitter.FULL_RECTANGLE_TEX_BUF);
        EglControl.checkGlError("glVertexAttribPointer");
        GLES20.glDrawArrays(5, 0, 4);
        EglControl.checkGlError("glDrawArrays");
        GLES20.glDisableVertexAttribArray(((TextureBlitter) (obj)).mAPositionLoc);
        GLES20.glDisableVertexAttribArray(((TextureBlitter) (obj)).mATextureCoordLoc);
        GLES20.glBindTexture(36197, 0);
        GLES20.glUseProgram(0);
        Object obj1 = mEncoderWindowSurface;
        obj = ((EglSurface) (obj1)).mEglControl;
        obj1 = ((EglSurface) (obj1)).mEglSurface;
        EGLExt.eglPresentationTimeANDROID(((EglControl) (obj)).mEglDisplay, ((android.opengl.EGLSurface) (obj1)), l1);
        obj1 = mEncoderWindowSurface;
        obj = ((EglSurface) (obj1)).mEglControl;
        obj1 = ((EglSurface) (obj1)).mEglSurface;
        if (!EGL14.eglSwapBuffers(((EglControl) (obj)).mEglDisplay, ((android.opengl.EGLSurface) (obj1))))
        {
            GamesLog.d("ScreencastEglSurface", "WARNING: swapBuffers() failed");
        }
        profiler.stopTiming(profilescope1);
        do
        {
            mNextEncoderFrameTime = mNextEncoderFrameTime + mEncoderPeriodNanos;
            l1 = mNextEncoderFrameTime;
        } while (l1 <= l);
        surfacetexture.stopTiming(profilescope);
        return;
        Exception exception1;
        exception1;
        profiler.stopTiming(profilescope1);
        throw exception1;
        Exception exception;
        exception;
        surfacetexture.stopTiming(profilescope);
        throw exception;
    }

    public final void stop()
    {
        mIsStarted = false;
        mDisplayTexture.setOnFrameAvailableListener(null);
        mChoreographer.removeFrameCallback(this);
        mVirtualDisplay.setSurface(null);
    }
}
