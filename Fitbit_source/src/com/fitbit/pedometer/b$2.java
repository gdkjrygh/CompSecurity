// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.pedometer;

import com.fitbit.e.a;
import java.util.Collections;
import java.util.Date;

// Referenced classes of package com.fitbit.pedometer:
//            b, f, j, g

class a
    implements Runnable
{

    final long a;
    final b b;

    public void run()
    {
        long l = com.fitbit.pedometer.b.a(b).c();
        Date date = new Date();
        long l1 = date.getTime();
        if (com.fitbit.pedometer.b.a(a, l, l1))
        {
            com.fitbit.e.a.e("GooglePedometerAdapter", String.format("Skipped step with timestamp: %s [%d]\nLast complete minute timestamp: %s [%d]\nNow timestamp: %s [%d]", new Object[] {
                new Date(a), Long.valueOf(a), new Date(l), Long.valueOf(l), date, Long.valueOf(l1)
            }), new Object[0]);
        } else
        {
            j j1 = new j(a);
            com.fitbit.pedometer.b.a(b).a(j1);
            if (com.fitbit.pedometer.b.b(b) && b.a != null && com.fitbit.pedometer.b.c(b) != null)
            {
                com.fitbit.pedometer.b.c(b).a(Collections.singletonList(j1));
                b.a.a(com.fitbit.pedometer.b.c(b).a(), com.fitbit.pedometer.b.c(b).b(), com.fitbit.pedometer.b.c(b).c());
                return;
            }
        }
    }

    (b b1, long l)
    {
        b = b1;
        a = l;
        super();
    }
}
