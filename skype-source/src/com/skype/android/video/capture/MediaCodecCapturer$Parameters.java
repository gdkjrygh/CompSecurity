// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video.capture;

import com.skype.android.video.hw.format.Resolution;

// Referenced classes of package com.skype.android.video.capture:
//            MediaCodecCapturer

private static class <init>
{

    public int cameraId;
    public float framerate;
    public boolean isPreEncodingRC;
    public Resolution resolution;

    public String toString()
    {
        return (new StringBuilder()).append(getClass().getSimpleName()).append(" [cameraId=").append(cameraId).append(", resolution=").append(resolution).append(", framerate=").append(framerate).append(", isPreEncodingRC").append(isPreEncodingRC).append("]").toString();
    }

    private ()
    {
    }

    ( )
    {
        this();
    }
}
