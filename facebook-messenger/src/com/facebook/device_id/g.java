// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.device_id;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.common.time.a;
import com.facebook.debug.log.b;

// Referenced classes of package com.facebook.device_id:
//            i, h, l

class g extends BroadcastReceiver
{

    private static final Class a = com/facebook/device_id/g;
    private final a b;
    private volatile h c;

    public g(a a1)
    {
        b = a1;
    }

    public void a(h h1)
    {
        c = h1;
    }

    public void onReceive(Context context, Intent intent)
    {
        com.facebook.debug.log.b.d(a, "getting the id response");
        context = getResultData();
        long l1 = getResultExtras(true).getLong("device_id_generated_timestamp_ms");
        if (getResultCode() == -1 && context != null)
        {
            context = new i(context, l1);
            com.facebook.debug.log.b.b(a, (new StringBuilder()).append("response: ").append(context).toString());
        } else
        {
            context = com.facebook.device_id.l.a(b);
            com.facebook.debug.log.b.b(a, (new StringBuilder()).append("generating new id: ").append(context).toString());
        }
        if (c != null)
        {
            c.a(context);
        }
    }

}
