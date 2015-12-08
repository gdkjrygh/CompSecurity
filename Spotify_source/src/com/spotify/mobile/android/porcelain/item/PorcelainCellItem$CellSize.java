// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.porcelain.item;


public final class type extends Enum
{

    public static final c a;
    public static final c b;
    public static final c c;
    private static final c d[];
    public final int type;

    public static type valueOf(String s)
    {
        return (type)Enum.valueOf(com/spotify/mobile/android/porcelain/item/PorcelainCellItem$CellSize, s);
    }

    public static type[] values()
    {
        return (type[])d.clone();
    }

    static 
    {
        a = new <init>("SMALL", 0, 0x7f1100f4);
        b = new <init>("REGULAR", 1, 0x7f1100f3);
        c = new <init>("TALL", 2, 0x7f1100f5);
        d = (new d[] {
            a, b, c
        });
    }

    private (String s, int i, int j)
    {
        super(s, i);
        type = j;
    }
}
