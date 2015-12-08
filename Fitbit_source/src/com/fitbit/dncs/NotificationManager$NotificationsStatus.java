// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.dncs;


// Referenced classes of package com.fitbit.dncs:
//            NotificationManager

public static final class  extends Enum
{

    public static final d a;
    public static final d b;
    public static final d c;
    public static final d d;
    private static final d e[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/fitbit/dncs/NotificationManager$NotificationsStatus, s);
    }

    public static [] values()
    {
        return ([])e.clone();
    }

    public boolean a()
    {
        return this != a;
    }

    public boolean b()
    {
        return this == c || this == d;
    }

    static 
    {
        a = new <init>("NOT_SUPPORTED", 0);
        b = new <init>("NOT_BONDED", 1);
        c = new <init>("BONDED", 2);
        d = new <init>("ENABLED", 3);
        e = (new e[] {
            a, b, c, d
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
