// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video.hw.codec.encoder.control;

import android.media.MediaCodec;
import android.media.MediaFormat;
import com.skype.android.video.hw.codec.OmxWrapper;
import com.skype.android.video.hw.format.VideoFormat;
import com.skype.android.video.hw.utils.DebugUtils;

// Referenced classes of package com.skype.android.video.hw.codec.encoder.control:
//            AbstractVideoEncoderControl

public final class VideoEncoderControlOmx extends AbstractVideoEncoderControl
{

    private final OmxWrapper omxWrapper;

    public VideoEncoderControlOmx(MediaCodec mediacodec, OmxWrapper omxwrapper)
    {
        super(mediacodec, omxwrapper);
        omxWrapper = omxwrapper;
    }

    public final void doConfigureMediaFormat(MediaFormat mediaformat, VideoFormat videoformat)
    {
        super.doConfigureMediaFormat(mediaformat, videoformat);
    }

    public final void markLtrFrame(int i)
        throws com.skype.android.video.hw.codec.encoder.AbstractVideoEncoder.APINotImplementedException
    {
        if (!omxWrapper.isNodeIdKnown())
        {
            throw new com.skype.android.video.hw.codec.encoder.AbstractVideoEncoder.APINotImplementedException((new StringBuilder()).append(getClass().getSimpleName()).append('#').append(DebugUtils.getMethodName()).toString(), "(node ID is knot known)");
        } else
        {
            omxWrapper.markLtrFrame(i);
            return;
        }
    }

    public final void setBaseLayerPID(int i)
        throws com.skype.android.video.hw.codec.encoder.AbstractVideoEncoder.APINotImplementedException
    {
        if (!omxWrapper.isNodeIdKnown())
        {
            throw new com.skype.android.video.hw.codec.encoder.AbstractVideoEncoder.APINotImplementedException((new StringBuilder()).append(getClass().getSimpleName()).append('#').append(DebugUtils.getMethodName()).toString(), "(node ID is knot known)");
        } else
        {
            omxWrapper.setBaseLayerPID(i);
            return;
        }
    }

    public final void setNumTempLayers(int i)
        throws com.skype.android.video.hw.codec.encoder.AbstractVideoEncoder.APINotImplementedException
    {
        if (!omxWrapper.isNodeIdKnown())
        {
            throw new com.skype.android.video.hw.codec.encoder.AbstractVideoEncoder.APINotImplementedException((new StringBuilder()).append(getClass().getSimpleName()).append('#').append(DebugUtils.getMethodName()).toString(), "(node ID is knot known)");
        } else
        {
            omxWrapper.setNumTempLayers(i);
            return;
        }
    }

    public final void setQp(int i)
        throws com.skype.android.video.hw.codec.encoder.AbstractVideoEncoder.APINotImplementedException
    {
        if (!omxWrapper.isNodeIdKnown())
        {
            throw new com.skype.android.video.hw.codec.encoder.AbstractVideoEncoder.APINotImplementedException((new StringBuilder()).append(getClass().getSimpleName()).append('#').append(DebugUtils.getMethodName()).toString(), "(node ID is knot known)");
        } else
        {
            omxWrapper.setQp(i);
            return;
        }
    }

    public final void setRcFrameRate(float f)
        throws com.skype.android.video.hw.codec.encoder.AbstractVideoEncoder.APINotImplementedException
    {
        if (!omxWrapper.isNodeIdKnown())
        {
            throw new com.skype.android.video.hw.codec.encoder.AbstractVideoEncoder.APINotImplementedException((new StringBuilder()).append(getClass().getSimpleName()).append('#').append(DebugUtils.getMethodName()).toString(), "(node ID is knot known)");
        } else
        {
            omxWrapper.setRcFrameRate(f);
            return;
        }
    }

    public final void useLTRFrame(int i)
        throws com.skype.android.video.hw.codec.encoder.AbstractVideoEncoder.APINotImplementedException
    {
        if (!omxWrapper.isNodeIdKnown())
        {
            throw new com.skype.android.video.hw.codec.encoder.AbstractVideoEncoder.APINotImplementedException((new StringBuilder()).append(getClass().getSimpleName()).append('#').append(DebugUtils.getMethodName()).toString(), "(node ID is knot known)");
        } else
        {
            omxWrapper.useLTRFrame(i);
            return;
        }
    }
}
