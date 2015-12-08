// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.stuff;


public final class sizeRes extends Enum
{

    public static final c a;
    public static final c b;
    public static final c c;
    private static final c d[];
    public final int marginRes;
    public final int sizeRes;

    public static sizeRes valueOf(String s)
    {
        return (sizeRes)Enum.valueOf(com/spotify/mobile/android/ui/stuff/BadgesFactory$BadgeSize, s);
    }

    public static sizeRes[] values()
    {
        return (sizeRes[])d.clone();
    }

    static 
    {
        a = new <init>("SMALL", 0, 0x7f0c008a, 0x7f0c0089);
        b = new <init>("MEDIUM", 1, 0x7f0c0088, 0x7f0c0087);
        c = new <init>("LARGE", 2, 0x7f0c0086, 0x7f0c0085);
        d = (new d[] {
            a, b, c
        });
    }

    private A(String s, int i, int j, int k)
    {
        super(s, i);
        marginRes = k;
        sizeRes = j;
    }
}
