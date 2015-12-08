// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video.hw.codec.encoder.control;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import com.skype.android.video.hw.codec.OmxWrapper;
import com.skype.android.video.hw.format.ColorFormat;
import com.skype.android.video.hw.format.H264Level;
import com.skype.android.video.hw.format.H264Profile;
import com.skype.android.video.hw.format.VideoFormat;
import com.skype.android.video.hw.utils.Log;

// Referenced classes of package com.skype.android.video.hw.codec.encoder.control:
//            VideoEncoderControl

public abstract class AbstractVideoEncoderControl
    implements VideoEncoderControl
{

    private final MediaCodec mediaCodec;
    private final Bundle setBitrateRequest = new Bundle();
    private final Bundle suspendRequest = new Bundle();
    private final Bundle syncFrameRequest = new Bundle();

    public AbstractVideoEncoderControl(MediaCodec mediacodec, OmxWrapper omxwrapper)
    {
        mediaCodec = mediacodec;
    }

    public void doConfigureMediaFormat(MediaFormat mediaformat, VideoFormat videoformat)
    {
        mediaformat.setInteger("color-format", videoformat.getColorFormat().getOmxValue().intValue());
        if (videoformat.getBitrate() > 0)
        {
            mediaformat.setInteger("bitrate", videoformat.getBitrate());
        } else
        {
            if (Log.isLoggable("SLIQ", 5))
            {
                Log.i("SLIQ", (new StringBuilder()).append(getClass().getSimpleName()).append(": Bad init bitrate ").append(videoformat.getBitrate()).append("bps. Setting default bitrate 500000bps on ").append(mediaCodec).append(" to prevent crash").toString());
            }
            mediaformat.setInteger("bitrate", 0x7a120);
        }
        if (videoformat.getFrameRate() >= 0)
        {
            mediaformat.setInteger("frame-rate", videoformat.getFrameRate());
        }
        if (videoformat.getiFrameInterval() >= 0)
        {
            mediaformat.setInteger("i-frame-interval", videoformat.getiFrameInterval());
        }
        if (videoformat.getProfile() == H264Profile.HIGH)
        {
            mediaformat.setInteger("profile", H264Profile.HIGH.getOmxValue().intValue());
        } else
        {
            mediaformat.setInteger("profile", H264Profile.BASELINE.getOmxValue().intValue());
        }
        mediaformat.setInteger("level", videoformat.getLevel().getOmxValue().intValue());
    }

    public void requestSyncFrame()
    {
        syncFrameRequest.putInt("request-sync", 0);
        mediaCodec.setParameters(syncFrameRequest);
    }

    public void setBitrate(int i)
    {
        setBitrateRequest.putInt("video-bitrate", i);
        mediaCodec.setParameters(setBitrateRequest);
    }

    public void suspend()
    {
        suspendRequest.putInt("drop-input-frames", 1);
        mediaCodec.setParameters(suspendRequest);
    }
}
