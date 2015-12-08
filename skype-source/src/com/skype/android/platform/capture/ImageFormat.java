// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.platform.capture;


public final class ImageFormat extends Enum
{

    public static final ImageFormat a;
    public static final ImageFormat b;
    private static final ImageFormat f[];
    private final String c;
    private final int d;
    private final int e = 12;

    private ImageFormat(String s, int i, String s1)
    {
        super(s, i);
        c = s1;
        d = a(s1);
    }

    private static int a(String s)
    {
        int j = 0;
        for (int i = 3; i >= 0; i--)
        {
            j = j << 8 | s.charAt(i);
        }

        return j;
    }

    public static ImageFormat valueOf(String s)
    {
        return (ImageFormat)Enum.valueOf(com/skype/android/platform/capture/ImageFormat, s);
    }

    public static ImageFormat[] values()
    {
        return (ImageFormat[])f.clone();
    }

    public final int a()
    {
        return d;
    }

    public final int b()
    {
        return e;
    }

    public final String toString()
    {
        return c;
    }

    static 
    {
        a = new ImageFormat("YV12", 0, "YV12");
        b = new ImageFormat("NV21", 1, "NV21");
        f = (new ImageFormat[] {
            a, b
        });
    }
}
