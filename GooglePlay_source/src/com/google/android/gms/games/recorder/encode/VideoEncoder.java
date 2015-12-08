// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.recorder.encode;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.SurfaceTexture;
import android.hardware.display.VirtualDisplay;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.opengl.EGL14;
import android.opengl.GLES20;
import android.view.Display;
import android.view.Surface;
import android.view.WindowManager;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.util.VideoEncodingProfiles;
import com.google.android.gms.games.util.VideoUtils;
import java.io.IOException;

// Referenced classes of package com.google.android.gms.games.recorder.encode:
//            BaseEncoder, FrameRateConverter, EglControl, TextureBlitter, 
//            EglSurface, MediaMux

public final class VideoEncoder extends BaseEncoder
{

    private final FrameRateConverter mFrameRateConverter;
    private Surface mInputSurface;

    private VideoEncoder(MediaFormat mediaformat, MediaMux mediamux, VirtualDisplay virtualdisplay, long l)
        throws IOException
    {
        super(mediaformat, mediamux);
        mInputSurface = mEncoder.createInputSurface();
        if (mInputSurface == null)
        {
            throw new RuntimeException("Could not create input surface");
        } else
        {
            long l1 = 0x3b9aca00L / (long)mediaformat.getInteger("frame-rate");
            mFrameRateConverter = new FrameRateConverter(virtualdisplay, mEncoder, mInputSurface, l, l1);
            return;
        }
    }

    public static VideoEncoder newInstance(Context context, int i, MediaMux mediamux, VirtualDisplay virtualdisplay)
    {
        boolean flag = true;
        MediaFormat mediaformat;
        if (context.getResources().getConfiguration().orientation != 1)
        {
            flag = false;
        }
        mediaformat = VideoEncodingProfiles.getInstance(context).getVideoFormat(i, flag);
        if (mediaformat == null)
        {
            GamesLog.e("VideoEncoder", "Video quality level is not supported");
            return null;
        }
        long l = (long)(1000000000D / (double)((WindowManager)context.getSystemService("window")).getDefaultDisplay().getRefreshRate());
        try
        {
            context = new VideoEncoder(mediaformat, mediamux, virtualdisplay, l);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            GamesLog.e("VideoEncoder", "Could not create video encoder", context);
            return null;
        }
        return context;
    }

    public final void onInputBufferAvailable(MediaCodec mediacodec, int i)
    {
        if (VideoUtils.DBG)
        {
            GamesLog.e("VideoEncoder", "Video codec unexpectedly provided an input buffer");
            return;
        } else
        {
            GamesLog.w("VideoEncoder", "Video codec unexpectedly provided an input buffer");
            return;
        }
    }

    public final boolean release()
    {
        boolean flag = super.release();
        FrameRateConverter framerateconverter = mFrameRateConverter;
        if (!EGL14.eglMakeCurrent(framerateconverter.mEglControl.mEglDisplay, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_CONTEXT))
        {
            throw new RuntimeException("eglMakeCurrent failed");
        }
        if (framerateconverter.mTextureBlitter != null)
        {
            TextureBlitter textureblitter = framerateconverter.mTextureBlitter;
            if (textureblitter.mProgramHandle >= 0)
            {
                GLES20.glDeleteProgram(textureblitter.mProgramHandle);
                textureblitter.mProgramHandle = -1;
            }
            framerateconverter.mTextureBlitter = null;
        }
        framerateconverter.mDisplayTexture.release();
        framerateconverter.mDisplaySurface.release();
        EglSurface eglsurface = framerateconverter.mEncoderWindowSurface;
        EglControl eglcontrol = eglsurface.mEglControl;
        android.opengl.EGLSurface eglsurface1 = eglsurface.mEglSurface;
        EGL14.eglDestroySurface(eglcontrol.mEglDisplay, eglsurface1);
        eglsurface.mEglSurface = EGL14.EGL_NO_SURFACE;
        eglsurface.mHeight = -1;
        eglsurface.mWidth = -1;
        framerateconverter.mEglControl.release();
        if (mInputSurface != null)
        {
            mInputSurface.release();
            mInputSurface = null;
        }
        return flag;
    }

    protected final void signalEndOfStream()
    {
        VideoUtils.logChatty("VideoEncoder", "called signalEndOfStream");
        try
        {
            mFrameRateConverter.stop();
            mEncoder.signalEndOfInputStream();
            return;
        }
        catch (IllegalStateException illegalstateexception)
        {
            GamesLog.e("VideoEncoder", "Error ending stream for video encoder", illegalstateexception);
        }
    }

    public final boolean start()
    {
        boolean flag = super.start();
        if (flag)
        {
            FrameRateConverter framerateconverter = mFrameRateConverter;
            framerateconverter.mIsStarted = true;
            framerateconverter.mIsDroppingFrames = false;
            framerateconverter.mNextEncoderFrameTime = -1L;
            framerateconverter.mDisplayTexture.setOnFrameAvailableListener(framerateconverter, framerateconverter.mHandler);
            framerateconverter.mVirtualDisplay.setSurface(framerateconverter.mDisplaySurface);
        }
        return flag;
    }

    public final boolean stop()
    {
        mFrameRateConverter.stop();
        return super.stop();
    }
}
