// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.dncs;

import com.fitbit.e.a;
import com.fitbit.galileo.bluetooth.f;

// Referenced classes of package com.fitbit.dncs:
//            NotificationManager

private class b
    implements b
{

    final NotificationManager a;
    private final int b;

    static int a(b b1)
    {
        return b1.b;
    }

    public f a()
    {
        com.fitbit.e.a.a("NotificationManager", "Creating GalileoTimeoutTask: %s", new Object[] {
            Integer.valueOf(b)
        });
    /* block-local class not found */
    class _cls1 {}

        return new _cls1(20000L);
    }

    public void a(_cls1 _pcls1, f f1)
    {
        com.fitbit.dncs.a(_pcls1, NotificationManager.b(a, b));
    }

    public boolean b(b b1, f f1)
    {
        com.fitbit.dncs.a(b1, NotificationManager.b(a, b));
        return true;
    }

    public _cls1(NotificationManager notificationmanager, int i)
    {
        a = notificationmanager;
        super();
        b = i;
    }
}
