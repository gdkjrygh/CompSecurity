// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.devicecollector;


public final class postField extends Enum
{

    public static final n a;
    public static final n b;
    public static final n c;
    public static final n d;
    public static final n e;
    public static final n f;
    public static final n g;
    public static final n h;
    public static final n i;
    public static final n j;
    public static final n k;
    public static final n l;
    public static final n m;
    public static final n n;
    private static final n o[];
    private String postField;

    public static postField valueOf(String s)
    {
        return (postField)Enum.valueOf(com/devicecollector/DataCollection$PostElement, s);
    }

    public static postField[] values()
    {
        return (postField[])o.clone();
    }

    public String a()
    {
        return postField;
    }

    static 
    {
        a = new <init>("LATITUDE", 0, "lat");
        b = new <init>("LONGITUDE", 1, "lon");
        c = new <init>("GEO_DATE", 2, "ltm");
        d = new <init>("GEO_PROVIDER", 3, "lpv");
        e = new <init>("OLD_DEVICE_COOKIE", 4, "odc");
        f = new <init>("DEVICE_COOKIE", 5, "dc");
        g = new <init>("USER_COOKIE", 6, "uc");
        h = new <init>("OS_VERSION", 7, "os");
        i = new <init>("SDK_VERSION", 8, "sv");
        j = new <init>("SDK_TYPE", 9, "st");
        k = new <init>("MOBILE_MODEL", 10, "mdl");
        l = new <init>("ERROR_LIST", 11, "err");
        m = new <init>("MERCHANT_ID", 12, "m");
        n = new <init>("SESSION_ID", 13, "s");
        o = (new o[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m, n
        });
    }

    private (String s, int i1, String s1)
    {
        super(s, i1);
        postField = s1;
    }
}
