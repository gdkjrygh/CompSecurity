// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.device_id;

import android.content.Context;
import android.content.Intent;
import com.facebook.base.a.g;
import com.facebook.c.b;
import com.facebook.c.c;
import com.facebook.inject.t;

// Referenced classes of package com.facebook.device_id:
//            UniqueDeviceIdBroadcastSender

class k
    implements b
{

    k()
    {
    }

    public void a(Context context, Intent intent, c c)
    {
        com.facebook.debug.log.b.b(UniqueDeviceIdBroadcastSender.LocalBroadcastReceiver.a, "querying for device id");
        g.a(context);
        com.facebook.device_id.UniqueDeviceIdBroadcastSender.c((UniqueDeviceIdBroadcastSender)t.a(context).a(com/facebook/device_id/UniqueDeviceIdBroadcastSender));
    }
}
