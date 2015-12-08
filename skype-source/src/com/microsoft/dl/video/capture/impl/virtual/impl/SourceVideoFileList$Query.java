// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.dl.video.capture.impl.virtual.impl;

import com.microsoft.dl.video.capture.api.FpsRange;
import com.microsoft.dl.video.capture.api.ImageFormat;
import com.microsoft.dl.video.capture.api.Resolution;

// Referenced classes of package com.microsoft.dl.video.capture.impl.virtual.impl:
//            SourceVideoFileList

public static class 
{

    private String a;
    private ImageFormat b;
    private Resolution c;
    private FpsRange d;

    static String a( )
    {
        return .a;
    }

    static ImageFormat b(a a1)
    {
        return a1.b;
    }

    static Resolution c(b b1)
    {
        return b1.c;
    }

    static FpsRange d(c c1)
    {
        return c1.d;
    }

    public final FpsRange getFpsRange()
    {
        return d;
    }

    public final ImageFormat getImageFormat()
    {
        return b;
    }

    public final String getName()
    {
        return a;
    }

    public final Resolution getResolution()
    {
        return c;
    }

    public final void setFpsRange(FpsRange fpsrange)
    {
        d = fpsrange;
    }

    public final void setImageFormat(ImageFormat imageformat)
    {
        b = imageformat;
    }

    public final void setName(String s)
    {
        a = s;
    }

    public final void setResolution(Resolution resolution)
    {
        c = resolution;
    }

    public final String toString()
    {
        return (new StringBuilder()).append(getClass().getSimpleName()).append(" [name=").append(a).append(", imageFormat=").append(b).append(", resolution=").append(c).append(", fpsRange=").append(d).append("]").toString();
    }

    public ()
    {
    }
}
