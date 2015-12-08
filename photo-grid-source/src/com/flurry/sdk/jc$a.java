// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;


final class > extends Enum
{

    public static final f a;
    public static final f b;
    public static final f c;
    public static final f d;
    public static final f e;
    public static final f f;
    private static final f g[];

    public static > valueOf(String s)
    {
        return (>)Enum.valueOf(com/flurry/sdk/jc$a, s);
    }

    public static Of[] values()
    {
        return (Of[])g.clone();
    }

    static 
    {
        a = new <init>("NONE", 0);
        b = new <init>("ADVERTISING", 1);
        c = new <init>("DEVICE", 2);
        d = new <init>("HASHED_IMEI", 3);
        e = new <init>("REPORTED_IDS", 4);
        f = new <init>("FINISHED", 5);
        g = (new g[] {
            a, b, c, d, e, f
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
