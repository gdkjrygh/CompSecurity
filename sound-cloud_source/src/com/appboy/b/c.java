// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.b;


public final class c extends Enum
{

    public static final c a;
    public static final c b;
    public static final c c;
    public static final c d;
    public static final c e;
    public static final c f;
    private static final c g[];

    private c(String s, int i)
    {
        super(s, i);
    }

    public static c valueOf(String s)
    {
        return (c)Enum.valueOf(com/appboy/b/c, s);
    }

    public static c[] values()
    {
        return (c[])g.clone();
    }

    static 
    {
        a = new c("REQUIRED_FIELD_MISSING", 0);
        b = new c("BAD_INPUT", 1);
        c = new c("NO_DEVICE_IDENTIFIER", 2);
        d = new c("INVALID_API_KEY", 3);
        e = new c("RESPONSE_PARSE_ERROR", 4);
        f = new c("UNRECOGNIZED_ERROR", 5);
        g = (new c[] {
            a, b, c, d, e, f
        });
    }
}
