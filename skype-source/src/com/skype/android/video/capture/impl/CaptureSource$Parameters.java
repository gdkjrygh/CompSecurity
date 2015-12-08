// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video.capture.impl;

import com.skype.android.platform.capture.FpsRange;
import com.skype.android.platform.capture.ImageFormat;
import com.skype.android.video.hw.format.Resolution;

// Referenced classes of package com.skype.android.video.capture.impl:
//            CaptureSource

private static class <init>
{

    public int angle;
    public Object display;
    public FpsRange fpsRange;
    public ImageFormat imageFormat;
    public Resolution resolution;

    public String toString()
    {
        return (new StringBuilder()).append(getClass().getSimpleName()).append(" [resolution=").append(resolution).append(", imageFormat=").append(imageFormat).append(", fpsRange=").append(fpsRange).append(", display=").append(display).append(", angle=").append(angle).append("]").toString();
    }

    private ()
    {
    }

    ( )
    {
        this();
    }
}
