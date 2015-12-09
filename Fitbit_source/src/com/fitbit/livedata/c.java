// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.livedata;

import android.content.Intent;
import android.content.IntentFilter;
import com.fitbit.bluetooth.BluetoothErrorsHandler;
import com.fitbit.bluetooth.connection.BluetoothConnectionServiceStatus;
import com.fitbit.bluetooth.connection.e;
import com.fitbit.dncs.service.b;
import com.fitbit.e.a;

// Referenced classes of package com.fitbit.livedata:
//            f, g, LiveDataSource, d, 
//            a, LiveDataState

public class c
    implements f, g
{

    public static final LiveDataSource a;
    private static final String b = "BluetoothLiveDataManager";
    private static final long c = 2000L;
    private static final long d = 2000L;
    private final d e = new d();
    private final com.fitbit.livedata.a f = new com.fitbit.livedata.a();
    private final g g;
    private final com.fitbit.util.threading.c h = new com.fitbit.util.threading.c() {

        final c a;

        public void a(Intent intent)
        {
            intent = intent.getAction();
            if ("com.fitbit.ApplicationForegroundController.APP_PROBABLY_SWITCHED_TO_BACKGROUND".equals(intent))
            {
                com.fitbit.e.a.a("BluetoothLiveDataManager", "Application switched to background. Stop streaming...", new Object[0]);
                a.b();
            } else
            if ("com.fitbit.ApplicationForegroundController.APP_PROBABLY_SWITCHED_TO_FOREGROUND".equals(intent))
            {
                com.fitbit.e.a.a("BluetoothLiveDataManager", "Application switched to foreground. Scheduling start...", new Object[0]);
                com.fitbit.livedata.c.a(a).c(false);
                com.fitbit.livedata.c.b(a).a(2000L);
                return;
            }
        }

            
            {
                a = c.this;
                super();
            }
    };
    private com.fitbit.util.threading.c i;
    private com.fitbit.util.threading.c j;

    public c(g g1)
    {
        i = new com.fitbit.util.threading.c() {

            final c a;

            protected void a(Intent intent)
            {
                String s = intent.getAction();
                if (!"com.fitbit.galileo.tasks.BluetoothWorkersManager.ACTION_WORKER_STOPPED".equals(s)) goto _L2; else goto _L1
_L1:
                intent = com.fitbit.galileo.bluetooth.b.b.a(intent);
                if (intent != null && intent.c())
                {
                    com.fitbit.e.a.a("BluetoothLiveDataManager", "Exclusive Bluetooth worker finished. Start streaming...", new Object[0]);
                    a.a();
                }
_L4:
                return;
_L2:
                if (!"com.fitbit.dncs.service.ACTION_DNCS_PAIRING_STATE_CHANGED".equals(s))
                {
                    continue; /* Loop/switch isn't completed */
                }
                if (!com.fitbit.dncs.service.b.a().d()) goto _L4; else goto _L3
_L3:
                com.fitbit.e.a.a("BluetoothLiveDataManager", "Dncs pairing finished. Scheduling start...", new Object[0]);
                com.fitbit.livedata.c.b(a).a(2000L);
                return;
                if (!"com.fitbit.bluetooth.BluetoothErrorsHandler.ACTION_BLUETOOTH_ERRORS_CHANGED".equals(s) || BluetoothErrorsHandler.a().b()) goto _L4; else goto _L5
_L5:
                com.fitbit.e.a.a("BluetoothLiveDataManager", "Bluetooth errors handled. Scheduling start...", new Object[0]);
                com.fitbit.livedata.c.b(a).a(2000L);
                return;
            }

            
            {
                a = c.this;
                super();
            }
        };
        j = new com.fitbit.util.threading.c() {

            final c a;

            protected void a(Intent intent)
            {
                if (!"com.fitbit.bluetooth.connection.BluetoothConnectionServiceStatusController.ACTION_STATUS_CHANGED".equals(intent.getAction())) goto _L2; else goto _L1
_L1:
                BluetoothConnectionServiceStatus bluetoothconnectionservicestatus;
                bluetoothconnectionservicestatus = (BluetoothConnectionServiceStatus)intent.getParcelableExtra("com.fitbit.bluetooth.connection.BluetoothConnectionServiceStatusController.EXTRA_OLD_STATUS");
                intent = (BluetoothConnectionServiceStatus)intent.getParcelableExtra("com.fitbit.bluetooth.connection.BluetoothConnectionServiceStatusController.EXTRA_NEW_STATUS");
                if (!com.fitbit.livedata.c.a(a).b().a()) goto _L4; else goto _L3
_L3:
                if (intent.c()) goto _L6; else goto _L5
_L5:
                com.fitbit.e.a.a("BluetoothLiveDataManager", "Device is disconnected. Scheduling retry...", new Object[0]);
                com.fitbit.livedata.c.a(a).b(true);
                com.fitbit.livedata.c.b(a).c();
_L4:
                if (!com.fitbit.bluetooth.connection.e.a(bluetoothconnectionservicestatus) && com.fitbit.bluetooth.connection.e.a(intent))
                {
                    com.fitbit.e.a.a("BluetoothLiveDataManager", "Device connected. Registering...", new Object[0]);
                    com.fitbit.livedata.c.a(a).a(false, intent);
                }
_L2:
                return;
_L6:
                if (intent.c() && !intent.e() && com.fitbit.livedata.c.a(a).b().a())
                {
                    com.fitbit.e.a.a("BluetoothLiveDataManager", "Device is connected but LiveData notifications are not enabled. Authenticating tracker...", new Object[0]);
                    if (!a.a(true))
                    {
                        com.fitbit.livedata.c.a(a).b(false);
                    }
                }
                if (true) goto _L4; else goto _L7
_L7:
            }

            
            {
                a = c.this;
                super();
            }
        };
        g = g1;
        f.a(this);
    }

    static com.fitbit.livedata.a a(c c1)
    {
        return c1.f;
    }

    static d b(c c1)
    {
        return c1.e;
    }

    public boolean a()
    {
        return a(false);
    }

    public boolean a(boolean flag)
    {
        return f.a(flag);
    }

    public boolean b()
    {
        return f.a();
    }

    public LiveDataSource c()
    {
        return a;
    }

    public LiveDataState d()
    {
        return f.b();
    }

    public void e()
    {
        this;
        JVM INSTR monitorenter ;
        com.fitbit.e.a.a("BluetoothLiveDataManager", "enable()", new Object[0]);
        e.a();
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction("com.fitbit.galileo.tasks.BluetoothWorkersManager.ACTION_WORKER_STOPPED");
        intentfilter.addAction("com.fitbit.dncs.service.ACTION_DNCS_PAIRING_STATE_CHANGED");
        intentfilter.addAction("com.fitbit.bluetooth.BluetoothErrorsHandler.ACTION_BLUETOOTH_ERRORS_CHANGED");
        i.a(intentfilter);
        j.a(new IntentFilter("com.fitbit.bluetooth.connection.BluetoothConnectionServiceStatusController.ACTION_STATUS_CHANGED"));
        intentfilter = new IntentFilter("com.fitbit.ApplicationForegroundController.APP_PROBABLY_SWITCHED_TO_BACKGROUND");
        intentfilter.addAction("com.fitbit.ApplicationForegroundController.APP_PROBABLY_SWITCHED_TO_FOREGROUND");
        h.a(intentfilter);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void f()
    {
        this;
        JVM INSTR monitorenter ;
        com.fitbit.e.a.a("BluetoothLiveDataManager", "disable()", new Object[0]);
        e.b();
        i.d();
        h.d();
        j.d();
        f.b(true);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void g()
    {
        if (g != null)
        {
            g.g();
        }
    }

    public void h()
    {
        e.d();
        if (g != null)
        {
            g.h();
        }
    }

    public void i()
    {
        if (g != null)
        {
            g.i();
        }
    }

    public void j()
    {
        if (g != null)
        {
            g.j();
        }
    }

    public void k()
    {
        e.c();
        if (g != null)
        {
            g.k();
        }
    }

    static 
    {
        a = com.fitbit.livedata.LiveDataSource.a;
    }
}
