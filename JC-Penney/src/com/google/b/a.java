// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b;


public final class a extends Enum
{

    public static final a a;
    public static final a b;
    public static final a c;
    public static final a d;
    public static final a e;
    public static final a f;
    public static final a g;
    public static final a h;
    public static final a i;
    public static final a j;
    public static final a k;
    public static final a l;
    public static final a m;
    public static final a n;
    public static final a o;
    public static final a p;
    public static final a q;
    private static final a r[];

    private a(String s, int i1)
    {
        super(s, i1);
    }

    public static a valueOf(String s)
    {
        return (a)Enum.valueOf(com/google/b/a, s);
    }

    public static a[] values()
    {
        return (a[])r.clone();
    }

    static 
    {
        a = new a("AZTEC", 0);
        b = new a("CODABAR", 1);
        c = new a("CODE_39", 2);
        d = new a("CODE_93", 3);
        e = new a("CODE_128", 4);
        f = new a("DATA_MATRIX", 5);
        g = new a("EAN_8", 6);
        h = new a("EAN_13", 7);
        i = new a("ITF", 8);
        j = new a("MAXICODE", 9);
        k = new a("PDF_417", 10);
        l = new a("QR_CODE", 11);
        m = new a("RSS_14", 12);
        n = new a("RSS_EXPANDED", 13);
        o = new a("UPC_A", 14);
        p = new a("UPC_E", 15);
        q = new a("UPC_EAN_EXTENSION", 16);
        r = (new a[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m, n, o, p, q
        });
    }
}
