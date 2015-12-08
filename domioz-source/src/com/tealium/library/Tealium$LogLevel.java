// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tealium.library;


public final class h extends Enum
{

    public static final g a;
    public static final g b;
    public static final g c;
    public static final g d;
    public static final g e;
    public static final g f;
    public static final g g;
    private static final g i[];
    private final int h;

    public static h valueOf(String s)
    {
        return (h)Enum.valueOf(com/tealium/library/Tealium$LogLevel, s);
    }

    public static h[] values()
    {
        return (h[])i.clone();
    }

    final int a()
    {
        return h;
    }

    static 
    {
        a = new <init>("VERBOSE", 0, 0);
        b = new <init>("DEBUG", 1, 1);
        c = new <init>("INFO", 2, 2);
        d = new <init>("WARN", 3, 3);
        e = new <init>("ERROR", 4, 4);
        f = new <init>("ASSERT", 5, 5);
        g = new <init>("SILENT", 6, 6);
        i = (new i[] {
            a, b, c, d, e, f, g
        });
    }

    private (String s, int j, int k)
    {
        super(s, j);
        h = k;
    }
}
