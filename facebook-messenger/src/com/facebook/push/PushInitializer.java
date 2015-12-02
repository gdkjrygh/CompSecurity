// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.push;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import com.facebook.auth.a.a;
import com.facebook.base.c;
import com.facebook.debug.log.b;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.facebook.push:
//            f

public class PushInitializer extends a
    implements c
{

    private static Class a = com/facebook/push/PushInitializer;
    private final Context b;
    private final AlarmManager c;
    private final Handler d = new Handler();
    private final Set e;
    private boolean f;

    public PushInitializer(Context context, AlarmManager alarmmanager, Set set)
    {
        b = context;
        c = alarmmanager;
        e = set;
    }

    static void a(PushInitializer pushinitializer)
    {
        pushinitializer.j();
    }

    static boolean a(PushInitializer pushinitializer, boolean flag)
    {
        pushinitializer.f = flag;
        return flag;
    }

    static Handler b(PushInitializer pushinitializer)
    {
        return pushinitializer.d;
    }

    private void j()
    {
        for (Iterator iterator = e.iterator(); iterator.hasNext(); ((f)iterator.next()).b()) { }
        l();
    }

    private void k()
    {
        for (Iterator iterator = e.iterator(); iterator.hasNext(); ((f)iterator.next()).c()) { }
    }

    private void l()
    {
        if (f)
        {
            return;
        } else
        {
            Object obj = new Intent(b, com/facebook/push/PushInitializer$LocalBroadcastReceiver);
            ((Intent) (obj)).setAction("com.facebook.orca.push.ACTION_ALARM");
            obj = PendingIntent.getBroadcast(b, -1, ((Intent) (obj)), 0);
            long l1 = System.currentTimeMillis();
            c.set(1, l1 + 0x5265c00L, ((PendingIntent) (obj)));
            f = true;
            return;
        }
    }

    public void a()
    {
        com.facebook.debug.log.b.b(a, "PushInitializer.init");
        j();
    }

    public void d()
    {
        k();
    }

    public void i()
    {
        com.facebook.debug.log.b.b(a, "PushInitializer.onLogin");
        for (Iterator iterator = e.iterator(); iterator.hasNext(); ((f)iterator.next()).a()) { }
    }

}
