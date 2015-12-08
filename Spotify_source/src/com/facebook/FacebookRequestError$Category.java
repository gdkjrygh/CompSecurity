// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;


public final class  extends Enum
{

    public static final h a;
    public static final h b;
    public static final h c;
    public static final h d;
    public static final h e;
    public static final h f;
    public static final h g;
    public static final h h;
    private static final h i[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/facebook/FacebookRequestError$Category, s);
    }

    public static [] values()
    {
        return ([])i.clone();
    }

    static 
    {
        a = new <init>("AUTHENTICATION_RETRY", 0);
        b = new <init>("AUTHENTICATION_REOPEN_SESSION", 1);
        c = new <init>("PERMISSION", 2);
        d = new <init>("SERVER", 3);
        e = new <init>("THROTTLING", 4);
        f = new <init>("OTHER", 5);
        g = new <init>("BAD_REQUEST", 6);
        h = new <init>("CLIENT", 7);
        i = (new i[] {
            a, b, c, d, e, f, g, h
        });
    }

    private (String s, int j)
    {
        super(s, j);
    }
}
