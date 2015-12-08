// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.pedometer;


// Referenced classes of package com.fitbit.pedometer:
//            HtcPedometerAdapter

private static final class  extends Enum
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
        return ()Enum.valueOf(com/fitbit/pedometer/HtcPedometerAdapter$RemoteServiceCommand, s);
    }

    public static [] values()
    {
        return ([])g.clone();
    }

    static 
    {
        a = new <init>("ENABLE", 0);
        b = new <init>("DISABLE", 1);
        c = new <init>("START_STREAM", 2);
        d = new <init>("STOP_STREAM", 3);
        e = new <init>("FLUSH", 4);
        f = new <init>("FLUSH_ALL", 5);
        g = (new g[] {
            a, b, c, d, e, f
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
