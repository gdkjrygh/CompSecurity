// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.view.video.support;


public final class f extends Enum
{

    public static final f a;
    public static final f b;
    private static final f c[];

    private f(String s, int i)
    {
        super(s, i);
    }

    public static f valueOf(String s)
    {
        return (f)Enum.valueOf(com/facebook/ads/internal/view/video/support/f, s);
    }

    public static f[] values()
    {
        return (f[])c.clone();
    }

    static 
    {
        a = new f("TEXTURE_VIEW", 0);
        b = new f("VIDEO_VIEW", 1);
        c = (new f[] {
            a, b
        });
    }
}
