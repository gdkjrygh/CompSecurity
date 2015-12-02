// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.push.mqtt;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.facebook.base.broadcast.q;
import com.google.common.a.fi;
import com.google.common.base.Objects;

// Referenced classes of package com.facebook.push.mqtt:
//            ca, cj

class ce extends q
{

    final fi a;
    final ca b;

    ce(ca ca1, Context context, IntentFilter intentfilter, fi fi1)
    {
        b = ca1;
        a = fi1;
        super(context, intentfilter);
    }

    public void a(Context context, Intent intent)
    {
        if (ca.a.equals(intent.getAction()))
        {
            ca.c(b);
        } else
        {
            if (a.contains(intent.getAction()))
            {
                ca.a(b);
                return;
            }
            if (Objects.equal("com.facebook.push.mqtt.ACTION_CHANNEL_STATE_CHANGED", intent.getAction()))
            {
                context = cj.fromValue(intent.getIntExtra("event", -1));
                ca.a(b, context);
                return;
            }
        }
    }
}
