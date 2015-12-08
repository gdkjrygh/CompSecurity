// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.livedata;

import android.os.Handler;
import com.fitbit.e.a;
import com.fitbit.galileo.service.e;
import com.fitbit.util.threading.FitbitHandlerThread;

class d
{

    private static final String a = "BluetoothLiveDataScheduler";
    private static final long b = 10000L;
    private int c;
    private final Handler d = FitbitHandlerThread.a();
    private final Runnable e = new Runnable() {

        final d a;

        public void run()
        {
            com.fitbit.e.a.a("BluetoothLiveDataScheduler", "Timer fired", new Object[0]);
            com.fitbit.multipledevice.a.a().h();
        }

            
            {
                a = d.this;
                super();
            }
    };

    d()
    {
        c = 0;
    }

    private void e()
    {
        d.removeCallbacks(e);
    }

    public void a()
    {
        d();
    }

    public void a(long l)
    {
        com.fitbit.e.a.a("BluetoothLiveDataScheduler", "scheduleLiveData(%s)", new Object[] {
            Long.valueOf(l)
        });
        e();
        d.postDelayed(e, l);
    }

    public void b()
    {
        e();
        d();
    }

    public void c()
    {
        e();
        c = c + 1;
        long l = (new e(2, 0x124f80L)).a(c, 10000L);
        com.fitbit.e.a.a("BluetoothLiveDataScheduler", "Scheduled live-data retry[%s] after %s seconds", new Object[] {
            Integer.valueOf(c), Long.valueOf(l / 1000L)
        });
        a(l);
    }

    public void d()
    {
        c = 0;
    }
}
