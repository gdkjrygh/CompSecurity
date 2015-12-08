// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video.capture.impl;

import android.view.SurfaceHolder;
import com.skype.android.platform.capture.ImageFormat;

// Referenced classes of package com.skype.android.video.capture.impl:
//            Capturer

public static class 
{

    public int angle;
    public int cameraId;
    public SurfaceHolder display;
    public ImageFormat fourcc;
    public int fpsMax;
    public int fpsMin;
    public int height;
    public int width;

    public final String toString()
    {
        return (new StringBuilder("CaptureSourceParameters [ cameraId=")).append(cameraId).append(", width=").append(width).append(", height=").append(height).append(", angle=").append(angle).append(", fpsMin=").append(fpsMin).append(", fpsMax=").append(fpsMax).append(", fourcc=").append(fourcc).append(", display=").append(display).append("]").toString();
    }

    public ()
    {
    }
}
