// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.device_id;

import com.facebook.debug.log.b;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.facebook.device_id:
//            h, UniqueDeviceIdBroadcastSender, l, i, 
//            a

class j
    implements h
{

    final UniqueDeviceIdBroadcastSender a;

    j(UniqueDeviceIdBroadcastSender uniquedeviceidbroadcastsender)
    {
        a = uniquedeviceidbroadcastsender;
        super();
    }

    public void a(i k)
    {
        i i1 = UniqueDeviceIdBroadcastSender.a(a).d();
        if (i1.b() > k.b())
        {
            b.d(UniqueDeviceIdBroadcastSender.a(), (new StringBuilder()).append("device id Changed from: ").append(i1).append("to: ").append(k).toString());
            UniqueDeviceIdBroadcastSender.a(a).a(k);
            for (Iterator iterator = com.facebook.device_id.UniqueDeviceIdBroadcastSender.b(a).iterator(); iterator.hasNext(); ((a)iterator.next()).a(i1, k)) { }
        }
    }
}
