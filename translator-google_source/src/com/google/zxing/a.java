// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing;

import java.util.Hashtable;

public final class a
{

    public static final a a = new a("QR_CODE");
    public static final a b = new a("DATAMATRIX");
    public static final a c = new a("UPC_E");
    public static final a d = new a("UPC_A");
    public static final a e = new a("EAN_8");
    public static final a f = new a("EAN_13");
    public static final a g = new a("CODE_128");
    public static final a h = new a("CODE_39");
    public static final a i = new a("ITF");
    public static final a j = new a("RSS14");
    public static final a k = new a("PDF417");
    private static final Hashtable m = new Hashtable();
    public final String l;

    private a(String s)
    {
        l = s;
        m.put(s, this);
    }

    public final String toString()
    {
        return l;
    }

}
