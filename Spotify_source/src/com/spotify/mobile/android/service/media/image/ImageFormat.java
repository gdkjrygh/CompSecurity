// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.service.media.image;


public final class ImageFormat extends Enum
{

    public static final ImageFormat a;
    public static final ImageFormat b;
    private static final ImageFormat c[];

    private ImageFormat(String s, int i)
    {
        super(s, i);
    }

    public static ImageFormat valueOf(String s)
    {
        return (ImageFormat)Enum.valueOf(com/spotify/mobile/android/service/media/image/ImageFormat, s);
    }

    public static ImageFormat[] values()
    {
        return (ImageFormat[])c.clone();
    }

    static 
    {
        a = new ImageFormat("PNG", 0);
        b = new ImageFormat("JPEG", 1);
        c = (new ImageFormat[] {
            a, b
        });
    }
}
