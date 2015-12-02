// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.hardware;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.common.a.ik;
import com.google.common.base.Preconditions;
import java.util.Map;

// Referenced classes of package com.facebook.common.hardware:
//            a, v, w, x, 
//            y, c, d

public class u
    implements a
{

    private final Context a;
    private final Map b = ik.c();
    private final BroadcastReceiver c = new v(this);
    private final BroadcastReceiver d = new w(this);
    private final BroadcastReceiver e = new x(this);
    private final BroadcastReceiver f = new y(this);

    public u(Context context)
    {
        a = (Context)Preconditions.checkNotNull(context);
    }

    static Map a(u u1)
    {
        return u1.b;
    }

    private Intent d()
    {
        IntentFilter intentfilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        return a.registerReceiver(null, intentfilter);
    }

    public float a()
    {
        Intent intent = d();
        if (intent != null)
        {
            int i = intent.getIntExtra("level", -1);
            int j = intent.getIntExtra("scale", -1);
            if (i >= 0 && j >= 0)
            {
                return (float)i / (float)j;
            }
        }
        return -1F;
    }

    public c b()
    {
        Intent intent = d();
        if (intent == null)
        {
            return c.UNKNOWN;
        }
        switch (intent.getIntExtra("status", 1))
        {
        default:
            return c.UNKNOWN;

        case 5: // '\005'
            return c.FULL;

        case 2: // '\002'
            switch (intent.getIntExtra("plugged", -1))
            {
            default:
                return c.UNKNOWN;

            case 1: // '\001'
                return c.CHARGING_AC;

            case 2: // '\002'
                return c.CHARGING_USB;
            }

        case 3: // '\003'
            return c.DISCHARGING;

        case 4: // '\004'
            return c.NOT_CHARGING;
        }
    }

    public d c()
    {
        Intent intent = d();
        if (intent == null)
        {
            return d.UNKNOWN;
        }
        switch (intent.getIntExtra("health", 1))
        {
        default:
            return d.UNKNOWN;

        case 7: // '\007'
            return d.COLD;

        case 4: // '\004'
            return d.DEAD;

        case 2: // '\002'
            return d.GOOD;

        case 3: // '\003'
            return d.OVERHEAT;

        case 5: // '\005'
            return d.OVER_VOLTAGE;

        case 6: // '\006'
            return d.UNSPECIFIED_FAILURE;
        }
    }
}
