// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bx;


public final class i extends Enum
{

    public static final i a;
    public static final i b;
    public static final i c;
    public static final i d;
    public static final i e;
    public static final i f;
    public static final i g;
    public static final int i = values().length;
    private static final i j[];
    final int h;

    private i(String s, int k, int l)
    {
        super(s, k);
        h = l;
    }

    public static i valueOf(String s)
    {
        return (i)Enum.valueOf(com/google/android/m4b/maps/bx/i, s);
    }

    public static i[] values()
    {
        return (i[])j.clone();
    }

    static 
    {
        a = new i("NORMAL", 0, 1);
        b = new i("HYBRID", 1, 2);
        c = new i("NIGHT", 2, 3);
        d = new i("TERRAIN", 3, 4);
        e = new i("RASTER_ONLY", 4, 5);
        f = new i("NONE", 5, 6);
        g = new i("AMBIENT", 6, 7);
        j = (new i[] {
            a, b, c, d, e, f, g
        });
    }
}
