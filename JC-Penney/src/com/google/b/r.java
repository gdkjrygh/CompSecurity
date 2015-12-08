// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b;


public final class r extends Enum
{

    public static final r a;
    public static final r b;
    public static final r c;
    public static final r d;
    public static final r e;
    public static final r f;
    public static final r g;
    public static final r h;
    public static final r i;
    public static final r j;
    public static final r k;
    private static final r l[];

    private r(String s, int i1)
    {
        super(s, i1);
    }

    public static r valueOf(String s)
    {
        return (r)Enum.valueOf(com/google/b/r, s);
    }

    public static r[] values()
    {
        return (r[])l.clone();
    }

    static 
    {
        a = new r("OTHER", 0);
        b = new r("ORIENTATION", 1);
        c = new r("BYTE_SEGMENTS", 2);
        d = new r("ERROR_CORRECTION_LEVEL", 3);
        e = new r("ISSUE_NUMBER", 4);
        f = new r("SUGGESTED_PRICE", 5);
        g = new r("POSSIBLE_COUNTRY", 6);
        h = new r("UPC_EAN_EXTENSION", 7);
        i = new r("PDF417_EXTRA_METADATA", 8);
        j = new r("STRUCTURED_APPEND_SEQUENCE", 9);
        k = new r("STRUCTURED_APPEND_PARITY", 10);
        l = (new r[] {
            a, b, c, d, e, f, g, h, i, j, 
            k
        });
    }
}
