// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.crop;


final class m extends Enum
{

    public static final m a;
    public static final m b;
    public static final m c;
    public static final m d;
    public static final m e;
    public static final m f;
    public static final m g;
    public static final m h;
    public static final m i;
    public static final m j;
    public static final m k;
    public static final m l;
    private static final m m[];

    private m(String s, int i1)
    {
        super(s, i1);
    }

    public static m valueOf(String s)
    {
        return (m)Enum.valueOf(com/roidapp/imagelib/crop/m, s);
    }

    public static m[] values()
    {
        return (m[])m.clone();
    }

    static 
    {
        a = new m("CROP_RATIOFREE", 0);
        b = new m("CROP_1_1", 1);
        c = new m("CROP_2_3", 2);
        d = new m("CROP_3_2", 3);
        e = new m("CROP_3_4", 4);
        f = new m("CROP_3_5", 5);
        g = new m("CROP_4_3", 6);
        h = new m("CROP_5_3", 7);
        i = new m("CROP_5_7", 8);
        j = new m("CROP_7_5", 9);
        k = new m("CROP_9_16", 10);
        l = new m("CROP_16_9", 11);
        m = (new m[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l
        });
    }
}
