// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video.hw.codec.encoder.camera.capture;

import com.skype.android.video.hw.format.Resolution;
import java.io.Serializable;

public class CapturerParameters
    implements Serializable
{

    private static final long serialVersionUID = 0xd15535954131c604L;
    public int cameraId;
    public Resolution cameraResolution;
    public float framerate;
    public boolean isPreEncodingRC;

    public CapturerParameters()
    {
        isPreEncodingRC = false;
    }

    public String toString()
    {
        return (new StringBuilder()).append(getClass().getSimpleName()).append(" [cameraId=").append(cameraId).append(", cameraResolution=").append(cameraResolution).append(", framerate=").append(framerate).append(", preEncodingRC").append(isPreEncodingRC).append("]").toString();
    }
}
