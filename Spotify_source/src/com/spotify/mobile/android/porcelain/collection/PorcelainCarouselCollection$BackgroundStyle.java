// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.porcelain.collection;


public final class a extends Enum
{

    public static final b a;
    public static final b b;
    private static final b c[];

    public static a valueOf(String s)
    {
        return (a)Enum.valueOf(com/spotify/mobile/android/porcelain/collection/PorcelainCarouselCollection$BackgroundStyle, s);
    }

    public static a[] values()
    {
        return (a[])c.clone();
    }

    static 
    {
        a = new <init>("STRETCH_BLUR", 0);
        b = new <init>("NONE", 1);
        c = (new c[] {
            a, b
        });
    }

    private a(String s, int i)
    {
        super(s, i);
    }
}
