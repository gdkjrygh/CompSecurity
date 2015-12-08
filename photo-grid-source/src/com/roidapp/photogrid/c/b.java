// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.c;


public final class b extends Enum
{

    public static final b a;
    public static final b b;
    public static final b c;
    public static final b d;
    public static final b e;
    private static final b g[];
    private String f;

    private b(String s, int i, String s1)
    {
        super(s, i);
        f = s1;
    }

    public static b valueOf(String s)
    {
        return (b)Enum.valueOf(com/roidapp/photogrid/c/b, s);
    }

    public static b[] values()
    {
        return (b[])g.clone();
    }

    public final String a()
    {
        return f;
    }

    static 
    {
        a = new b("ERROR_NETWORK", 0, "network");
        b = new b("ERROR_CHECK", 1, "check");
        c = new b("ERROR_DOWNLOAD", 2, "download");
        d = new b("ERROR_MD5", 3, "md5");
        e = new b("ERROR_USB", 4, "usb");
        g = (new b[] {
            a, b, c, d, e
        });
    }
}
