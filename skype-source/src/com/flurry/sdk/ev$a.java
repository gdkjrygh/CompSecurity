// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;


// Referenced classes of package com.flurry.sdk:
//            ev

public static final class d extends Enum
{

    public static final c a;
    public static final c b;
    public static final c c;
    private static final c e[];
    private int d;

    public static d valueOf(String s)
    {
        return (d)Enum.valueOf(com/flurry/sdk/ev$a, s);
    }

    public static Of[] values()
    {
        return (Of[])e.clone();
    }

    public final int a()
    {
        return d;
    }

    static 
    {
        a = new <init>("NONE_OR_UNKNOWN", 0, 0);
        b = new <init>("WIFI", 1, 1);
        c = new <init>("CELL", 2, 2);
        e = (new e[] {
            a, b, c
        });
    }

    private (String s, int i, int j)
    {
        super(s, i);
        d = j;
    }
}
