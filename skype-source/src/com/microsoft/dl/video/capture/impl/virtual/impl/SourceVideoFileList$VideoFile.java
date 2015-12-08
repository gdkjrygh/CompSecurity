// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.dl.video.capture.impl.virtual.impl;

import com.microsoft.dl.video.capture.api.ImageFormat;
import com.microsoft.dl.video.capture.api.Resolution;
import java.io.File;

// Referenced classes of package com.microsoft.dl.video.capture.impl.virtual.impl:
//            SourceVideoFileList

public static class e
{

    private final String a;
    private final ImageFormat b;
    private final Resolution c;
    private final int d;
    private final File e;

    static String a(e e1)
    {
        return e1.a;
    }

    static ImageFormat b(a a1)
    {
        return a1.b;
    }

    static Resolution c(b b1)
    {
        return b1.c;
    }

    static int d(c c1)
    {
        return c1.d;
    }

    public final File getFile()
    {
        return e;
    }

    public final int getFps()
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

    public final String toString()
    {
        return e.getAbsolutePath();
    }

    public (String s, ImageFormat imageformat, Resolution resolution, int i, File file)
    {
        a = s;
        b = imageformat;
        c = resolution;
        d = i;
        e = file;
    }
}
