// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.devicecollector;


public final class  extends Enum
{

    public static final f a;
    public static final f b;
    public static final f c;
    public static final f d;
    public static final f e;
    public static final f f;
    private static final f g[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/devicecollector/DeviceCollector$ErrorCode, s);
    }

    public static [] values()
    {
        return ([])g.clone();
    }

    static 
    {
        a = new <init>("NO_NETWORK", 0);
        b = new <init>("INVALID_URL", 1);
        c = new <init>("INVALID_MERCHANT", 2);
        d = new <init>("INVALID_SESSION", 3);
        e = new <init>("MERCHANT_CANCELLED", 4);
        f = new <init>("RUNTIME_FAILURE", 5);
        g = (new g[] {
            a, b, c, d, e, f
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
