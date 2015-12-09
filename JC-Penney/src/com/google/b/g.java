// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b;


public final class g extends Enum
{

    public static final g a;
    public static final g b;
    public static final g c;
    public static final g d;
    public static final g e;
    public static final g f;
    public static final g g;
    public static final g h;
    public static final g i;
    public static final g j;
    private static final g k[];

    private g(String s, int l)
    {
        super(s, l);
    }

    public static g valueOf(String s)
    {
        return (g)Enum.valueOf(com/google/b/g, s);
    }

    public static g[] values()
    {
        return (g[])k.clone();
    }

    static 
    {
        a = new g("ERROR_CORRECTION", 0);
        b = new g("CHARACTER_SET", 1);
        c = new g("DATA_MATRIX_SHAPE", 2);
        d = new g("MIN_SIZE", 3);
        e = new g("MAX_SIZE", 4);
        f = new g("MARGIN", 5);
        g = new g("PDF417_COMPACT", 6);
        h = new g("PDF417_COMPACTION", 7);
        i = new g("PDF417_DIMENSIONS", 8);
        j = new g("AZTEC_LAYERS", 9);
        k = (new g[] {
            a, b, c, d, e, f, g, h, i, j
        });
    }
}
