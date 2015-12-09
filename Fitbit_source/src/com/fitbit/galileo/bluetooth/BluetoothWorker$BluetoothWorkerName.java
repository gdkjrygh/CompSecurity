// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.galileo.bluetooth;


// Referenced classes of package com.fitbit.galileo.bluetooth:
//            BluetoothWorker

public static final class type extends Enum
{

    public static final g a;
    public static final g b;
    public static final g c;
    public static final g d;
    public static final g e;
    public static final g f;
    public static final g g;
    private static final g h[];
    private final g type;

    public static type valueOf(String s)
    {
        return (type)Enum.valueOf(com/fitbit/galileo/bluetooth/BluetoothWorker$BluetoothWorkerName, s);
    }

    public static type[] values()
    {
        return (type[])h.clone();
    }

    public e_3B_.clone a()
    {
        return type;
    }

    public boolean b()
    {
        return type == a;
    }

    public boolean c()
    {
        return type == b;
    }

    static 
    {
        a = new <init>("TRACKER_SYNC", 0, b);
        b = new <init>("TRACKER_PAIR", 1, b);
        c = new <init>("TRACKER_FIRMWARE_UPDATE", 2, b);
        d = new <init>("LIVE_DATA", 3, a);
        e = new <init>("DNCS_CONNECT", 4, b);
        f = new <init>("DNCS_PAIR", 5, b);
        g = new <init>("DNCS_UNPAIR", 6, b);
        h = (new h[] {
            a, b, c, d, e, f, g
        });
    }

    private (String s, int i,  )
    {
        super(s, i);
        type = ;
    }
}
