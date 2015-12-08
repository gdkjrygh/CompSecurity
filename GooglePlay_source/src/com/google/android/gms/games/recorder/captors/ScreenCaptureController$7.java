// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.recorder.captors;

import android.net.Uri;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.recorder.encode.AudioEncoder;
import com.google.android.gms.games.recorder.encode.AudioInput;
import com.google.android.gms.games.recorder.encode.MediaEncoder;
import com.google.android.gms.games.recorder.encode.MicInput;
import com.google.android.gms.games.recorder.encode.VideoEncoder;
import com.google.android.gms.games.recorder.util.VideoCapabilities;

// Referenced classes of package com.google.android.gms.games.recorder.captors:
//            ScreenCaptureController, MediaMuxFactory

public final class val.streamKey
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
        int j = val$qualityLevel;
        Object obj = val$targetUri;
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
            new (screencapturecontroller);
            i = 0;
        }
        if (i != 0)
        {
            screencapturecontroller.notifyErrorStatus(9005);
            return;
        }
        obj = screencapturecontroller.mMediaMux;
        android.hardware.display.VirtualDisplay virtualdisplay = screencapturecontroller.mVirtualDisplay;
        Preconditions.checkNotNull(obj);
        Preconditions.checkNotNull(virtualdisplay);
        screencapturecontroller.mVideoEncoder = VideoEncoder.newInstance(screencapturecontroller.mContext, j, ((com.google.android.gms.games.recorder.encode.MediaMux) (obj)), virtualdisplay);
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

    public ptureStateCallback()
    {
        this$0 = final_screencapturecontroller;
        val$qualityLevel = i;
        val$targetUri = uri;
        val$streamKey = String.this;
        super();
    }
}
