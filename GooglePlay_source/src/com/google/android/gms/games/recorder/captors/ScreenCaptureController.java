// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.recorder.captors;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.hardware.display.VirtualDisplay;
import android.media.MediaFormat;
import android.net.Uri;
import android.os.HandlerThread;
import android.util.DisplayMetrics;
import android.view.Display;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.games.GamesStatusCodes;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.recorder.encode.AudioEncoder;
import com.google.android.gms.games.recorder.encode.AudioInput;
import com.google.android.gms.games.recorder.encode.MediaEncoder;
import com.google.android.gms.games.recorder.encode.MediaMux;
import com.google.android.gms.games.recorder.encode.MicInput;
import com.google.android.gms.games.recorder.encode.VideoEncoder;
import com.google.android.gms.games.recorder.util.VideoCapabilities;
import com.google.android.gms.games.util.VideoEncodingProfiles;
import com.google.android.gms.games.util.VideoHandler;
import com.google.android.gms.games.util.VideoUtils;

// Referenced classes of package com.google.android.gms.games.recorder.captors:
//            MediaMuxFactory

public final class ScreenCaptureController
{
    private class _cls9
        implements com.google.android.gms.games.recorder.encode.MediaMux.ResultCallback
    {

        final ScreenCaptureController this$0;

        public final void onResultAvailable(Uri uri)
        {
            VideoUtils.logChatty("ScreenCaptureController", "MediaMux.ResultCallback#onResultAvailable - muxer stopped");
            mCaptureStateCallback.onCaptureStopped(uri);
        }

        _cls9()
        {
            this$0 = ScreenCaptureController.this;
            super();
        }
    }

    public static interface CaptureStateCallback
    {

        public abstract void onCaptureError(int i);

        public abstract void onCaptureStarted();

        public abstract void onCaptureStopped(Uri uri);
    }


    MediaEncoder mAudioEncoder;
    AudioInput mAudioInput;
    CaptureStateCallback mCaptureStateCallback;
    final Runnable mCodecDrainTimeoutAction = new Runnable() {

        final ScreenCaptureController this$0;

        public final void run()
        {
            VideoUtils.logChatty("ScreenCaptureController", "running mCodecDrainTimeoutAction");
            VideoUtils.logChatty(ScreenCaptureController.this, 0);
        }

            
            {
                this$0 = ScreenCaptureController.this;
                super();
            }
    };
    final Runnable mCodecDrainedAction = new Runnable() {

        final ScreenCaptureController this$0;

        public final void run()
        {
            VideoUtils.logChatty("ScreenCaptureController", "running mCodecDrainedAction");
            VideoUtils.logChatty(ScreenCaptureController.this, 1);
        }

            
            {
                this$0 = ScreenCaptureController.this;
                super();
            }
    };
    public final VideoHandler mCodecHandler;
    public final HandlerThread mCodecThread = new HandlerThread("CodecThread", 0);
    final Context mContext;
    private final android.hardware.display.DisplayManager.DisplayListener mDisplayListener = new android.hardware.display.DisplayManager.DisplayListener() {

        final ScreenCaptureController this$0;

        public final void onDisplayAdded(int i)
        {
        }

        public final void onDisplayChanged(int i)
        {
        }

        public final void onDisplayRemoved(int i)
        {
            Preconditions.checkNotMainThread("DisplayListener onDisplayRemoved called on main thread");
            Display display;
            if (mVirtualDisplay != null)
            {
                if ((display = mVirtualDisplay.getDisplay()) != null && mIsVirtualDisplayActive && display.getDisplayId() == i)
                {
                    GamesLog.e("ScreenCaptureController", (new StringBuilder("Unexpectedly lost the virtual display: ")).append(i).toString());
                    notifyErrorStatus(9004);
                    return;
                }
            }
        }

            
            {
                this$0 = ScreenCaptureController.this;
                super();
            }
    };
    private final DisplayManager mDisplayManager;
    private final DisplayMetrics mDisplayMetrics = new DisplayMetrics();
    final com.google.android.gms.games.recorder.encode.MediaEncoder.ErrorCallback mEncoderErrorCallback = new com.google.android.gms.games.recorder.encode.MediaEncoder.ErrorCallback() {

        final ScreenCaptureController this$0;

        public final void onError$1d13998f(int i)
        {
            GamesLog.e("ScreenCaptureController", (new StringBuilder("Encoder error: ")).append(GamesStatusCodes.getStatusString(i)).toString());
            notifyErrorStatus(i);
        }

            
            {
                this$0 = ScreenCaptureController.this;
                super();
            }
    };
    private com.google.android.gms.games.recorder.encode.MediaEncoder.EndOfStreamCallback mEndOfStreamCallback;
    boolean mIsMicEnabled;
    boolean mIsVirtualDisplayActive;
    MediaMux mMediaMux;
    public final VideoHandler mMicHandler;
    public final HandlerThread mMicThread = new HandlerThread("MicThread", 0);
    boolean mNeedPartialResultCleanup;
    private final android.media.projection.MediaProjection.Callback mProjectionCallback = new android.media.projection.MediaProjection.Callback() {

        final ScreenCaptureController this$0;

        public final void onStop()
        {
            super.onStop();
            Preconditions.checkNotMainThread("Projection onStop callback called on main thread");
            if (mIsVirtualDisplayActive)
            {
                GamesLog.e("ScreenCaptureController", "Media projection stopped unexpectedly");
                notifyErrorStatus(9004);
            }
        }

            
            {
                this$0 = ScreenCaptureController.this;
                super();
            }
    };
    private boolean mReportedCodecError;
    VideoCapabilities mVideoCapabilities;
    MediaEncoder mVideoEncoder;
    VirtualDisplay mVirtualDisplay;

    public ScreenCaptureController(Context context, CaptureStateCallback capturestatecallback, VideoCapabilities videocapabilities)
    {
        mReportedCodecError = false;
        mEndOfStreamCallback = new com.google.android.gms.games.recorder.encode.MediaEncoder.EndOfStreamCallback() {

            private boolean mAudioEos;
            private boolean mVideoEos;
            final ScreenCaptureController this$0;

            public final void onEndOfStream(MediaEncoder mediaencoder)
            {
                VideoUtils.logChatty("ScreenCaptureController", "Calling EndOfStreamCallback#onEndOfStream");
                if (mediaencoder == mVideoEncoder)
                {
                    mVideoEos = true;
                }
                if (mediaencoder == mAudioEncoder)
                {
                    mAudioEos = true;
                }
                if (mVideoEos && mAudioEos)
                {
                    VideoUtils.logChatty("ScreenCaptureController", "EndOfStreamCallback#onEndOfStream - posting code drain to codec handler");
                    mCodecHandler.post("ScreenCaptureController", "mCodecDrainedAction", mCodecDrainedAction);
                }
            }

            
            {
                this$0 = ScreenCaptureController.this;
                super();
            }
        };
        mContext = context;
        mDisplayManager = (DisplayManager)mContext.getSystemService("display");
        mCaptureStateCallback = capturestatecallback;
        mVideoCapabilities = videocapabilities;
        mCodecThread.start();
        mCodecHandler = new VideoHandler(mCodecThread.getLooper(), "mCodecHandler");
        mMicThread.start();
        mMicHandler = new VideoHandler(mMicThread.getLooper(), "mMicHandler");
        mIsMicEnabled = mVideoCapabilities.mIsMicSupported;
    }

    private void stopAudioInput()
    {
        if (mAudioInput != null)
        {
            mAudioInput.stop();
        }
    }

    private boolean stopMuxer()
    {
        VideoUtils.logChatty("ScreenCaptureController", (new StringBuilder("Stopping muxer: ")).append(mMediaMux).toString());
        return mMediaMux != null && mMediaMux.stop();
    }

    public final boolean isReleased()
    {
        return mVideoEncoder == null && mAudioEncoder == null && mMediaMux == null && mAudioInput == null;
    }

    final void notifyErrorStatus(int i)
    {
        if (i == 0 || mReportedCodecError)
        {
            return;
        }
        boolean flag;
        if (i == 9005)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        mReportedCodecError = flag;
        resetAll();
        mCaptureStateCallback.onCaptureError(i);
    }

    final int prepareVirtualDisplay(int i)
    {
        mDisplayManager.registerDisplayListener(mDisplayListener, null);
        mDisplayManager.getDisplay(0).getRealMetrics(mDisplayMetrics);
        MediaFormat mediaformat;
        boolean flag;
        if (mDisplayMetrics.heightPixels > mDisplayMetrics.widthPixels)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        mediaformat = VideoEncodingProfiles.getInstance(mContext).getVideoFormat(i, flag);
        if (mediaformat == null)
        {
            GamesLog.e("ScreenCaptureController", "Video quality level is not supported");
            return 9004;
        }
        try
        {
            mVirtualDisplay = mDisplayManager.createVirtualDisplay("Screen Capture Virtual Display", mediaformat.getInteger("width"), mediaformat.getInteger("height"), mDisplayMetrics.densityDpi, null, 19, null, null);
        }
        catch (SecurityException securityexception)
        {
            GamesLog.e("ScreenCaptureController", "Not allowed to create a virtual display");
            return 9002;
        }
        if (mVirtualDisplay == null)
        {
            GamesLog.e("ScreenCaptureController", "Could not create virtual display");
            return 9004;
        } else
        {
            mIsVirtualDisplayActive = true;
            return 0;
        }
    }

    final void resetAll()
    {
        VideoUtils.logChatty("ScreenCaptureController", "calling resetAll");
        Preconditions.checkNotMainThread("Resetting capture called on main thread");
        stopCodecPipeline();
        stopMuxer();
        VideoUtils.logChatty("ScreenCaptureController", "calling cleanupPartialResults");
        if (mNeedPartialResultCleanup && mMediaMux != null)
        {
            mMediaMux.cleanupPartialResults();
        }
        if (mMediaMux != null)
        {
            stopMuxer();
            mMediaMux.release();
            mMediaMux = null;
        }
        VideoUtils.logChatty("ScreenCaptureController", "calling resetVideoEncoder");
        if (mVideoEncoder != null)
        {
            mVideoEncoder.setErrorCallback(null);
            mVideoEncoder.stop();
            mVideoEncoder.release();
            mVideoEncoder = null;
        }
        stopAudioInput();
        if (mAudioInput != null)
        {
            mAudioInput.release();
            mAudioInput = null;
        }
        if (mAudioEncoder != null)
        {
            mAudioEncoder.setErrorCallback(null);
            mAudioEncoder.stop();
            mAudioEncoder.release();
            mAudioEncoder = null;
        }
    }

    public final void setMicEnabled(boolean flag)
    {
        if (flag && mVideoCapabilities.mIsMicSupported)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        mIsMicEnabled = flag;
        if (mAudioInput != null)
        {
            mAudioInput.setIsEnabled(mIsMicEnabled);
        }
    }

    final void stopCodecPipeline()
    {
        VideoUtils.logChatty("ScreenCaptureController", "calling stopCodecPipeline");
        stopAudioInput();
        VideoUtils.logChatty("ScreenCaptureController", "calling signalEndOfStream");
        if (mVideoEncoder != null)
        {
            mVideoEncoder.signalEndOfStream(mEndOfStreamCallback);
        }
        if (mAudioEncoder != null)
        {
            mAudioEncoder.signalEndOfStream(mEndOfStreamCallback);
        }
        VideoUtils.logChatty("ScreenCaptureController", "calling resetVirtualDisplay");
        mIsVirtualDisplayActive = false;
        mDisplayManager.unregisterDisplayListener(mDisplayListener);
        if (mVirtualDisplay != null)
        {
            mVirtualDisplay.setSurface(null);
            mVirtualDisplay.release();
            mVirtualDisplay = null;
        }
    }


/*
    static void access$400(ScreenCaptureController screencapturecontroller, boolean flag)
    {
        VideoUtils.logChatty("ScreenCaptureController", "calling codecPipelineStopped");
        Preconditions.checkNotMainThread("Codec pipeline stopped called on main thread");
        StringBuilder stringbuilder = new StringBuilder("Codec pipeline stopped ");
        String s;
        if (flag)
        {
            s = "and drained ";
        } else
        {
            s = "without draining";
        }
        GamesLog.d("ScreenCaptureController", stringbuilder.append(s).append("completely").toString());
        VideoUtils.logChatty("ScreenCaptureController", "codecPipelineStopped removing codec handler callbacks");
        screencapturecontroller.mCodecHandler.removeCallbacks(screencapturecontroller.mCodecDrainedAction);
        screencapturecontroller.mCodecHandler.removeCallbacks(screencapturecontroller.mCodecDrainTimeoutAction);
        if (!screencapturecontroller.mNeedPartialResultCleanup)
        {
            GamesLog.e("ScreenCaptureController", "Re-entered codec pipeline stop handler.  Skipping");
            screencapturecontroller.notifyErrorStatus(9000);
            return;
        }
        if (screencapturecontroller.stopMuxer())
        {
            screencapturecontroller.mNeedPartialResultCleanup = false;
            GamesLog.d("ScreenCaptureController", "codecPipelineStopped - requesting final muxer result");
            screencapturecontroller.mMediaMux.requestFinalResult(screencapturecontroller.mContext, screencapturecontroller. new _cls9());
            return;
        } else
        {
            VideoUtils.logChatty("ScreenCaptureController", "codecPipelineStopped - muxer failed to stop");
            screencapturecontroller.resetAll();
            screencapturecontroller.mNeedPartialResultCleanup = false;
            screencapturecontroller.notifyErrorStatus(1);
            return;
        }
    }

*/

    // Unreferenced inner class com/google/android/gms/games/recorder/captors/ScreenCaptureController$10

/* anonymous class */
    public final class _cls10
        implements Runnable
    {

        final ScreenCaptureController this$0;

        public final void run()
        {
            resetAll();
        }

            public 
            {
                this$0 = ScreenCaptureController.this;
                super();
            }
    }


    // Unreferenced inner class com/google/android/gms/games/recorder/captors/ScreenCaptureController$11

/* anonymous class */
    final class _cls11
    {

        final ScreenCaptureController this$0;

            
            {
                this$0 = ScreenCaptureController.this;
                super();
            }
    }


    // Unreferenced inner class com/google/android/gms/games/recorder/captors/ScreenCaptureController$7

/* anonymous class */
    public final class _cls7
        implements Runnable
    {

        final ScreenCaptureController this$0;
        final int val$qualityLevel;
        final String val$streamKey;
        final Uri val$targetUri;

        public final void run()
        {
            boolean flag1 = true;
            boolean flag = false;
            ScreenCaptureController screencapturecontroller = ScreenCaptureController.this;
            int j = qualityLevel;
            Object obj = targetUri;
            Preconditions.checkNotMainThread("Start capturing called on main thread");
            screencapturecontroller.resetAll();
            screencapturecontroller.mNeedPartialResultCleanup = true;
            int i = screencapturecontroller.prepareVirtualDisplay(j);
            if (i != 0)
            {
                screencapturecontroller.notifyErrorStatus(i);
                return;
            }
            Preconditions.checkNotNull(obj);
            if (screencapturecontroller.mMediaMux != null)
            {
                flag1 = false;
            }
            Preconditions.checkState(flag1);
            screencapturecontroller.mMediaMux = MediaMuxFactory.createMediaMux$5cda557d$eaf4077(((Uri) (obj)), screencapturecontroller.mVideoCapabilities.mIsMicSupported);
            if (screencapturecontroller.mMediaMux == null)
            {
                i = 9005;
            } else
            {
                screencapturecontroller. new Object()     final class _cls11
    {

        final ScreenCaptureController this$0;

            
            {
                this$0 = ScreenCaptureController.this;
                super();
            }
    };
                i = 0;
            }
            if (i != 0)
            {
                screencapturecontroller.notifyErrorStatus(9005);
                return;
            }
            obj = screencapturecontroller.mMediaMux;
            VirtualDisplay virtualdisplay = screencapturecontroller.mVirtualDisplay;
            Preconditions.checkNotNull(obj);
            Preconditions.checkNotNull(virtualdisplay);
            screencapturecontroller.mVideoEncoder = VideoEncoder.newInstance(screencapturecontroller.mContext, j, ((MediaMux) (obj)), virtualdisplay);
            if (screencapturecontroller.mVideoEncoder == null)
            {
                GamesLog.e("ScreenCaptureController", "Could not create video encoder");
                i = 9005;
            } else
            {
                screencapturecontroller.mVideoEncoder.setErrorCallback(screencapturecontroller.mEncoderErrorCallback);
                i = 0;
            }
            if (i != 0)
            {
                screencapturecontroller.notifyErrorStatus(9005);
                return;
            }
            if (screencapturecontroller.mVideoCapabilities.mIsMicSupported)
            {
                screencapturecontroller.mAudioInput = MicInput.newInstance$669e2dbe(screencapturecontroller.mContext, screencapturecontroller.mMicHandler, screencapturecontroller.mCodecHandler);
                if (screencapturecontroller.mAudioInput == null)
                {
                    GamesLog.e("ScreenCaptureController", "Could not create audio input");
                    i = 9005;
                } else
                {
                    screencapturecontroller.mAudioInput.setIsEnabled(screencapturecontroller.mIsMicEnabled);
                    screencapturecontroller.mAudioEncoder = AudioEncoder.newInstance$49d0fefd(screencapturecontroller.mContext, screencapturecontroller.mAudioInput, screencapturecontroller.mMediaMux);
                    if (screencapturecontroller.mAudioEncoder == null)
                    {
                        GamesLog.e("ScreenCaptureController", "Could not create audio encoder");
                        i = 9005;
                    } else
                    {
                        screencapturecontroller.mAudioEncoder.setErrorCallback(screencapturecontroller.mEncoderErrorCallback);
                        i = 0;
                    }
                }
                if (i != 0)
                {
                    screencapturecontroller.notifyErrorStatus(9005);
                    return;
                }
            }
            Preconditions.checkNotNull(screencapturecontroller.mVideoEncoder);
            if (screencapturecontroller.mVideoCapabilities.mIsMicSupported)
            {
                Preconditions.checkNotNull(screencapturecontroller.mAudioEncoder);
                Preconditions.checkNotNull(screencapturecontroller.mAudioInput);
            }
            Preconditions.checkNotNull(screencapturecontroller.mMediaMux);
            Preconditions.checkNotNull(screencapturecontroller.mVirtualDisplay);
            if (!screencapturecontroller.mVideoEncoder.start())
            {
                i = 9005;
            } else
            {
                i = ((flag) ? 1 : 0);
                if (screencapturecontroller.mVideoCapabilities.mIsMicSupported)
                {
                    if (!screencapturecontroller.mAudioEncoder.start())
                    {
                        i = 9005;
                    } else
                    {
                        i = ((flag) ? 1 : 0);
                        if (!screencapturecontroller.mAudioInput.start())
                        {
                            i = 9005;
                        }
                    }
                }
            }
            if (i != 0)
            {
                screencapturecontroller.notifyErrorStatus(i);
                return;
            } else
            {
                screencapturecontroller.mCaptureStateCallback.onCaptureStarted();
                return;
            }
        }

            public 
            {
                this$0 = ScreenCaptureController.this;
                qualityLevel = i;
                targetUri = uri;
                streamKey = s;
                super();
            }
    }


    // Unreferenced inner class com/google/android/gms/games/recorder/captors/ScreenCaptureController$8

/* anonymous class */
    public final class _cls8
        implements Runnable
    {

        final ScreenCaptureController this$0;

        public final void run()
        {
            ScreenCaptureController screencapturecontroller = ScreenCaptureController.this;
            VideoUtils.logChatty("ScreenCaptureController", "calling doStopCapture");
            Preconditions.checkNotMainThread("Stop capturing called on main thread");
            screencapturecontroller.stopCodecPipeline();
            VideoUtils.logChatty("ScreenCaptureController", "doStopCapture - posting drain timeout to codec handler");
            screencapturecontroller.mCodecHandler.postDelayed("ScreenCaptureController", "mCodecDrainTimeoutAction", screencapturecontroller.mCodecDrainTimeoutAction, 250L);
        }

            public 
            {
                this$0 = ScreenCaptureController.this;
                super();
            }
    }

}
