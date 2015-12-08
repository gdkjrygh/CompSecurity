// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.a.a;


public final class a
{

    public static final a a = new a("ADDRESSBOOK");
    public static final a b = new a("EMAIL_ADDRESS");
    public static final a c = new a("PRODUCT");
    public static final a d = new a("URI");
    public static final a e = new a("TEXT");
    public static final a f = new a("ANDROID_INTENT");
    public static final a g = new a("GEO");
    public static final a h = new a("TEL");
    public static final a i = new a("SMS");
    public static final a j = new a("CALENDAR");
    public static final a k = new a("WIFI");
    public static final a l = new a("NDEF_SMART_POSTER");
    public static final a m = new a("MOBILETAG_RICH_WEB");
    public static final a n = new a("ISBN");
    private final String o;

    private a(String s)
    {
        o = s;
    }

    public final String toString()
    {
        return o;
    }

}
