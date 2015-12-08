// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;


public final class > extends Enum
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
        return (>)Enum.valueOf(com/flurry/sdk/kl$a, s);
    }

    public static Of[] values()
    {
        return (Of[])g.clone();
    }

    public final String toString()
    {
        switch (a[ordinal()])
        {
        default:
            return null;

        case 1: // '\001'
            return "POST";

        case 2: // '\002'
            return "PUT";

        case 3: // '\003'
            return "DELETE";

        case 4: // '\004'
            return "HEAD";

        case 5: // '\005'
            return "GET";
        }
    }

    static 
    {
        a = new <init>("kUnknown", 0);
        b = new <init>("kGet", 1);
        c = new <init>("kPost", 2);
        d = new <init>("kPut", 3);
        e = new <init>("kDelete", 4);
        f = new <init>("kHead", 5);
        g = (new g[] {
            a, b, c, d, e, f
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
