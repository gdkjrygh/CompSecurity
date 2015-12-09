// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing;


public final class BarcodeFormat extends Enum
{

    public static final BarcodeFormat a;
    public static final BarcodeFormat b;
    public static final BarcodeFormat c;
    public static final BarcodeFormat d;
    public static final BarcodeFormat e;
    public static final BarcodeFormat f;
    public static final BarcodeFormat g;
    public static final BarcodeFormat h;
    public static final BarcodeFormat i;
    public static final BarcodeFormat j;
    public static final BarcodeFormat k;
    public static final BarcodeFormat l;
    public static final BarcodeFormat m;
    public static final BarcodeFormat n;
    public static final BarcodeFormat o;
    public static final BarcodeFormat p;
    public static final BarcodeFormat q;
    private static final BarcodeFormat r[];

    private BarcodeFormat(String s, int i1)
    {
        super(s, i1);
    }

    public static BarcodeFormat valueOf(String s)
    {
        return (BarcodeFormat)Enum.valueOf(com/google/zxing/BarcodeFormat, s);
    }

    public static BarcodeFormat[] values()
    {
        return (BarcodeFormat[])r.clone();
    }

    static 
    {
        a = new BarcodeFormat("AZTEC", 0);
        b = new BarcodeFormat("CODABAR", 1);
        c = new BarcodeFormat("CODE_39", 2);
        d = new BarcodeFormat("CODE_93", 3);
        e = new BarcodeFormat("CODE_128", 4);
        f = new BarcodeFormat("DATA_MATRIX", 5);
        g = new BarcodeFormat("EAN_8", 6);
        h = new BarcodeFormat("EAN_13", 7);
        i = new BarcodeFormat("ITF", 8);
        j = new BarcodeFormat("MAXICODE", 9);
        k = new BarcodeFormat("PDF_417", 10);
        l = new BarcodeFormat("QR_CODE", 11);
        m = new BarcodeFormat("RSS_14", 12);
        n = new BarcodeFormat("RSS_EXPANDED", 13);
        o = new BarcodeFormat("UPC_A", 14);
        p = new BarcodeFormat("UPC_E", 15);
        q = new BarcodeFormat("UPC_EAN_EXTENSION", 16);
        r = (new BarcodeFormat[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m, n, o, p, q
        });
    }
}
