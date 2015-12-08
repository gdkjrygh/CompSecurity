// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.bluetooth;


// Referenced classes of package com.fitbit.bluetooth:
//            BluetoothErrorsHandler

public static final class  extends Enum
{

    public static final c a;
    public static final c b;
    public static final c c;
    private static final c d[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/fitbit/bluetooth/BluetoothErrorsHandler$BluetoothError, s);
    }

    public static [] values()
    {
        return ([])d.clone();
    }

    static 
    {
        a = new <init>("SERVICES_DISCOVERY_ERROR", 0);
        b = new <init>("ENABLE_NOTIFICATIONS_ERROR", 1);
        c = new <init>("INCONSISTENT_SERVICES_ERROR", 2);
        d = (new d[] {
            a, b, c
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
