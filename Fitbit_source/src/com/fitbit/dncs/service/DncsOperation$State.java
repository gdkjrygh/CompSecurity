// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.dncs.service;


// Referenced classes of package com.fitbit.dncs.service:
//            DncsOperation

public static final class  extends Enum
{

    public static final d a;
    public static final d b;
    public static final d c;
    public static final d d;
    private static final d e[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/fitbit/dncs/service/DncsOperation$State, s);
    }

    public static [] values()
    {
        return ([])e.clone();
    }

    public boolean a()
    {
        return ordinal() > a.ordinal();
    }

    public boolean b()
    {
        return ordinal() > a.ordinal() && ordinal() < c.ordinal();
    }

    public boolean c()
    {
        return ordinal() >= c.ordinal();
    }

    public boolean d()
    {
        return this == c;
    }

    public boolean e()
    {
        return this == d;
    }

    static 
    {
        a = new <init>("STATE_NOT_STARTED", 0);
        b = new <init>("STATE_EXECUTING", 1);
        c = new <init>("STATE_COMPLETED", 2);
        d = new <init>("STATE_FAILED", 3);
        e = (new e[] {
            a, b, c, d
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
