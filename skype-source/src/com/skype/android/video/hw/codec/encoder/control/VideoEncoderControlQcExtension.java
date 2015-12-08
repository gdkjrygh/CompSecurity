// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video.hw.codec.encoder.control;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import com.skype.android.video.hw.format.H264Level;
import com.skype.android.video.hw.format.H264Profile;
import com.skype.android.video.hw.format.Resolution;
import com.skype.android.video.hw.format.VideoFormat;
import com.skype.android.video.hw.utils.Log;

// Referenced classes of package com.skype.android.video.hw.codec.encoder.control:
//            AbstractVideoEncoderControl

public final class VideoEncoderControlQcExtension extends AbstractVideoEncoderControl
{

    private final MediaCodec mediaCodec;
    private final Bundle setBaseLayerPID = new Bundle();
    private final Bundle setMarkLtrFrame = new Bundle();
    private final Bundle setQpRequest = new Bundle();
    private final Bundle setTempLayers = new Bundle();
    private final Bundle setUseLtrFrame = new Bundle();

    public VideoEncoderControlQcExtension(MediaCodec mediacodec)
    {
        super(mediacodec, null);
        mediaCodec = mediacodec;
    }

    public final void doConfigureMediaFormat(MediaFormat mediaformat, VideoFormat videoformat)
    {
        int i = 0;
        super.doConfigureMediaFormat(mediaformat, videoformat);
        mediaformat.setInteger("vt-low-latency", 1);
        mediaformat.setInteger("vt-avc-level", videoformat.getLevel().getOmxValue().intValue());
        mediaformat.setInteger("vt-use-extended-profile", 1);
        mediaformat.setInteger("vt-extension-profile", videoformat.getProfile().getOmxValue().intValue());
        mediaformat.setInteger("vt-sequence-hdr-with-idr", 1);
        mediaformat.setInteger("vt-ratecontrol", 0);
        int j = Math.min(Math.max(videoformat.getMinNumSlices(), 1), 15);
        j = (((videoformat.getResolution().getWidth() + 15 >> 4) * (videoformat.getResolution().getHeight() + 15 >> 4) + j) - 1) / j;
        if (j > 1)
        {
            mediaformat.setInteger("vt-slice-hdr-spacing", j);
            mediaformat.setInteger("vt-slice-control-mode", 1);
        } else
        {
            mediaformat.setInteger("vt-slice-control-mode", 0);
        }
        if (videoformat.getSvcAlways())
        {
            i = Math.min(Math.max(videoformat.getNumLayers(), 1), 2);
        }
        if (i > 0)
        {
            mediaformat.setInteger("vt-video-hierar-type", 1);
            mediaformat.setInteger("vt-max-temporal-layer-count", i);
        }
        mediaformat.setInteger("vt-num-ltr-frames", Math.min(Math.max(videoformat.getRefCount(), 1), 3) - 1);
    }

    public final void markLtrFrame(int i)
        throws com.skype.android.video.hw.codec.encoder.AbstractVideoEncoder.APINotImplementedException
    {
        setMarkLtrFrame.putInt("vt-config-mark-ltr", i);
        if (Log.isLoggable("SLIQ", 4))
        {
            Log.i("SLIQ", (new StringBuilder()).append(getClass().getSimpleName()).append(": Setting ").append(i).append(" on ").append(mediaCodec).toString());
        }
        mediaCodec.setParameters(setMarkLtrFrame);
    }

    public final void setBaseLayerPID(int i)
        throws com.skype.android.video.hw.codec.encoder.AbstractVideoEncoder.APINotImplementedException
    {
        setBaseLayerPID.putInt("vt-config-base-layer-pid", i);
        if (Log.isLoggable("SLIQ", 4))
        {
            Log.i("SLIQ", (new StringBuilder()).append(getClass().getSimpleName()).append(": Setting ").append(i).append(" on ").append(mediaCodec).toString());
        }
        mediaCodec.setParameters(setBaseLayerPID);
    }

    public final void setNumTempLayers(int i)
        throws com.skype.android.video.hw.codec.encoder.AbstractVideoEncoder.APINotImplementedException
    {
        setTempLayers.putInt("vt-config-temporal-layer-count", i);
        if (Log.isLoggable("SLIQ", 4))
        {
            Log.i("SLIQ", (new StringBuilder()).append(getClass().getSimpleName()).append(": Setting ").append(i).append(" on ").append(mediaCodec).toString());
        }
        mediaCodec.setParameters(setTempLayers);
    }

    public final void setQp(int i)
        throws com.skype.android.video.hw.codec.encoder.AbstractVideoEncoder.APINotImplementedException
    {
        setQpRequest.putInt("vt-config-frame-qp", i);
        if (Log.isLoggable("SLIQ", 4))
        {
            Log.i("SLIQ", (new StringBuilder()).append(getClass().getSimpleName()).append(": Setting ").append(setQpRequest).append(" on ").append(mediaCodec).toString());
        }
        mediaCodec.setParameters(setQpRequest);
    }

    public final void setRcFrameRate(float f)
        throws com.skype.android.video.hw.codec.encoder.AbstractVideoEncoder.APINotImplementedException
    {
    }

    public final void useLTRFrame(int i)
        throws com.skype.android.video.hw.codec.encoder.AbstractVideoEncoder.APINotImplementedException
    {
        setUseLtrFrame.putInt("vt-config-use-ltr", i);
        if (Log.isLoggable("SLIQ", 4))
        {
            Log.i("SLIQ", (new StringBuilder()).append(getClass().getSimpleName()).append(": Setting ").append(i).append(" on ").append(mediaCodec).toString());
        }
        mediaCodec.setParameters(setUseLtrFrame);
    }
}
