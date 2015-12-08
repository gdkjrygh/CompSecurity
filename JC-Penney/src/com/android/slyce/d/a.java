// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.d;


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
    public static final a r;
    private static final a t[];
    private final String s;

    private a(String s1, int i1, String s2)
    {
        super(s1, i1);
        s = s2;
    }

    public static a valueOf(String s1)
    {
        return (a)Enum.valueOf(com/android/slyce/d/a, s1);
    }

    public static a[] values()
    {
        return (a[])t.clone();
    }

    public String a()
    {
        return s;
    }

    static 
    {
        a = new a("SFBarcodeTypeNone", 0, "None");
        b = new a("SFBarcodeTypeAztec", 1, "AZTEC");
        c = new a("SFBarcodeTypeCodabar", 2, "CODABAR");
        d = new a("SFBarcodeTypeCode39", 3, "CODE_39");
        e = new a("SFBarcodeTypeCode93", 4, "CODE_93");
        f = new a("SFBarcodeTypeCode128", 5, "CODE_128");
        g = new a("SFBarcodeTypeDataMatrix", 6, "DATA_MATRIX");
        h = new a("SFBarcodeTypeEan8", 7, "EAN_8");
        i = new a("SFBarcodeTypeEan13", 8, "EAN_13");
        j = new a("SFBarcodeTypeITF", 9, "ITF");
        k = new a("SFBarcodeTypeMaxiCode", 10, "MAXICODE");
        l = new a("SFBarcodeTypePDF417", 11, "PDF_417");
        m = new a("SFBarcodeTypeQRCode", 12, "QR_CODE");
        n = new a("SFBarcodeTypeRSS14", 13, "RSS_14");
        o = new a("SFBarcodeTypeRSSExpanded", 14, "RSS_EXPANDED");
        p = new a("SFBarcodeTypeUPCA", 15, "UPC_A");
        q = new a("SFBarcodeTypeUPCE", 16, "UPC_E");
        r = new a("SFBarcodeTypeUPCEANExtension", 17, "UPC_EAN_EXTENSION");
        t = (new a[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m, n, o, p, q, r
        });
    }
}
