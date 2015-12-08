// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.stripe.net;


public final class  extends Enum
{

    private static final DELETE $VALUES[];
    public static final DELETE DELETE;
    public static final DELETE GET;
    public static final DELETE POST;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/stripe/net/APIResource$RequestMethod, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        GET = new <init>("GET", 0);
        POST = new <init>("POST", 1);
        DELETE = new <init>("DELETE", 2);
        $VALUES = (new .VALUES[] {
            GET, POST, DELETE
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
