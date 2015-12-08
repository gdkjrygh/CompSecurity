// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video.hw.codec.encoder.control;

import android.media.MediaFormat;
import com.skype.android.video.hw.format.VideoFormat;

interface VideoEncoderControl
{

    public abstract void doConfigureMediaFormat(MediaFormat mediaformat, VideoFormat videoformat);

    public abstract void markLtrFrame(int i)
        throws com.skype.android.video.hw.codec.encoder.AbstractVideoEncoder.APINotImplementedException;

    public abstract void setBaseLayerPID(int i)
        throws com.skype.android.video.hw.codec.encoder.AbstractVideoEncoder.APINotImplementedException;

    public abstract void setBitrate(int i);

    public abstract void setNumTempLayers(int i)
        throws com.skype.android.video.hw.codec.encoder.AbstractVideoEncoder.APINotImplementedException;

    public abstract void setQp(int i)
        throws com.skype.android.video.hw.codec.encoder.AbstractVideoEncoder.APINotImplementedException;

    public abstract void setRcFrameRate(float f)
        throws com.skype.android.video.hw.codec.encoder.AbstractVideoEncoder.APINotImplementedException;

    public abstract void suspend();

    public abstract void useLTRFrame(int i)
        throws com.skype.android.video.hw.codec.encoder.AbstractVideoEncoder.APINotImplementedException;
}
