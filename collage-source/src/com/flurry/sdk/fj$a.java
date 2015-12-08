// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;


// Referenced classes of package com.flurry.sdk:
//            fj

public static final class e extends Enum
{

    public static final d a;
    public static final d b;
    public static final d c;
    public static final d d;
    private static final d f[];
    private int e;

    public static e valueOf(String s)
    {
        return (e)Enum.valueOf(com/flurry/sdk/fj$a, s);
    }

    public static Of[] values()
    {
        return (Of[])f.clone();
    }

    public int a()
    {
        return e;
    }

    static 
    {
        a = new <init>("NONE_OR_UNKNOWN", 0, 0);
        b = new <init>("NETWORK_AVAILABLE", 1, 1);
        c = new <init>("WIFI", 2, 2);
        d = new <init>("CELL", 3, 3);
        f = (new f[] {
            a, b, c, d
        });
    }

    private (String s, int i, int j)
    {
        super(s, i);
        e = j;
    }
}
