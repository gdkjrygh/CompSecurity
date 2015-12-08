// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.pedometer.service;

import android.content.Intent;

// Referenced classes of package com.fitbit.pedometer.service:
//            PedometerService

static final class  extends Enum
{

    public static final f a;
    public static final f b;
    public static final f c;
    public static final f d;
    public static final f e;
    public static final f f;
    private static final f g[];

    public static  b(Intent intent)
    {
        if (!intent.hasExtra("com.fitbit.pedometer.service.PedometerService.EXTRA_PEDOMETER_SERVICE_COMMAND"))
        {
            return c;
        } else
        {
            return values()[intent.getIntExtra("com.fitbit.pedometer.service.PedometerService.EXTRA_PEDOMETER_SERVICE_COMMAND", -1)];
        }
    }

    public static values valueOf(String s)
    {
        return (values)Enum.valueOf(com/fitbit/pedometer/service/PedometerService$PedometerServiceCommand, s);
    }

    public static values[] values()
    {
        return (values[])g.clone();
    }

    public void a(Intent intent)
    {
        intent.putExtra("com.fitbit.pedometer.service.PedometerService.EXTRA_PEDOMETER_SERVICE_COMMAND", ordinal());
    }

    static 
    {
        a = new <init>("START_STEP_COUNTING", 0);
        b = new <init>("STOP_STEP_COUNTING", 1);
        c = new <init>("FLUSH", 2);
        d = new <init>("FLUSH_ALL", 3);
        e = new <init>("START_LIVE_DATA", 4);
        f = new <init>("STOP_LIVE_DATA", 5);
        g = (new g[] {
            a, b, c, d, e, f
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
