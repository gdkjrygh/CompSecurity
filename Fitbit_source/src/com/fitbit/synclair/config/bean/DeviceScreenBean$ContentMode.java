// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.synclair.config.bean;


// Referenced classes of package com.fitbit.synclair.config.bean:
//            DeviceScreenBean

public static final class  extends Enum
{

    public static final d a;
    public static final d b;
    public static final d c;
    public static final nit> d;
    private static final d e[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/fitbit/synclair/config/bean/DeviceScreenBean$ContentMode, s);
    }

    public static [] values()
    {
        return ([])e.clone();
    }

    static 
    {
        a = new <init>("NONE", 0);
        b = new <init>("FILL", 1);
        c = new <init>("FIT", 2);
        d = new <init>("FIT_WITH_STATS", 3);
        e = (new e[] {
            a, b, c, d
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
