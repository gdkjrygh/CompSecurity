// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.device_id;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.facebook.auth.a.a;
import com.facebook.auth.protocol.AuthenticationResult;
import com.facebook.debug.log.b;
import java.util.Random;
import java.util.Set;

// Referenced classes of package com.facebook.device_id:
//            g, j, l, i

public class UniqueDeviceIdBroadcastSender extends a
{

    private static final Class a = com/facebook/device_id/UniqueDeviceIdBroadcastSender;
    private final l b;
    private final com.facebook.common.time.a c;
    private final Context d;
    private final AlarmManager e;
    private final javax.inject.a f;
    private final Set g;

    public UniqueDeviceIdBroadcastSender(l l1, com.facebook.common.time.a a1, Context context, AlarmManager alarmmanager, javax.inject.a a2, Set set)
    {
        b = l1;
        c = a1;
        d = context;
        e = alarmmanager;
        f = a2;
        g = set;
    }

    static l a(UniqueDeviceIdBroadcastSender uniquedeviceidbroadcastsender)
    {
        return uniquedeviceidbroadcastsender.b;
    }

    static Class a()
    {
        return a;
    }

    static Set b(UniqueDeviceIdBroadcastSender uniquedeviceidbroadcastsender)
    {
        return uniquedeviceidbroadcastsender.g;
    }

    static void c(UniqueDeviceIdBroadcastSender uniquedeviceidbroadcastsender)
    {
        uniquedeviceidbroadcastsender.i();
    }

    private void i()
    {
        com.facebook.debug.log.b.b(a, "querying other apps for unique id");
        Intent intent = new Intent();
        intent.setAction("com.facebook.GET_UNIQUE_ID");
        g g1 = (g)f.b();
        g1.a(new j(this));
        d.sendOrderedBroadcast(intent, "com.facebook.receiver.permission.ACCESS", g1, null, 1, null, null);
    }

    private long j()
    {
        Random random = new Random(c.a());
        return (long)(random.nextInt(12) - 6) * 0x36ee80L + (long)(random.nextInt(60) - 30) * 60000L;
    }

    public void a(AuthenticationResult authenticationresult)
    {
        authenticationresult = b.d();
        if (authenticationresult != null && c.a() - authenticationresult.b() > 0xa4cb800L)
        {
            return;
        } else
        {
            i();
            authenticationresult = new Intent(d, com/facebook/device_id/UniqueDeviceIdBroadcastSender$LocalBroadcastReceiver);
            authenticationresult.setAction("com.facebook.GET_UNIQUE_ID");
            authenticationresult = PendingIntent.getBroadcast(d, -1, authenticationresult, 0);
            long l1 = c.a();
            long l2 = j();
            e.set(1, l1 + 0x5265c00L + l2, authenticationresult);
            return;
        }
    }

}
