// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.galileo.tasks.subtasks;

import android.content.Intent;
import android.content.IntentFilter;
import com.fitbit.bluetooth.connection.BluetoothConnectionServiceStatus;
import com.fitbit.bluetooth.connection.e;
import com.fitbit.e.a;
import com.fitbit.util.threading.c;

// Referenced classes of package com.fitbit.galileo.tasks.subtasks:
//            o

public class g extends o
{

    private static final String a = "DisconnectTrackerSubTask";
    private c b;

    public g()
    {
        b = new c(com.fitbit.util.threading.FitbitHandlerThread.ThreadName.d) {

            final g a;

            public void a(Intent intent)
            {
                if ("com.fitbit.bluetooth.connection.BluetoothConnectionServiceStatusController.ACTION_STATUS_CHANGED".equals(intent.getAction()) && !com.fitbit.bluetooth.connection.e.a((BluetoothConnectionServiceStatus)intent.getParcelableExtra("com.fitbit.bluetooth.connection.BluetoothConnectionServiceStatusController.EXTRA_NEW_STATUS")))
                {
                    a.a(true);
                }
            }

            
            {
                a = g.this;
                super(threadname);
            }
        };
    }

    protected void b()
    {
        Object obj = new IntentFilter();
        ((IntentFilter) (obj)).addAction("com.fitbit.bluetooth.connection.BluetoothConnectionServiceStatusController.ACTION_STATUS_CHANGED");
        b.a(((IntentFilter) (obj)));
        if (!com.fitbit.bluetooth.connection.e.b())
        {
            a(true);
            return;
        }
        obj = com.fitbit.bluetooth.connection.c.a();
        if (obj == null)
        {
            com.fitbit.e.a.a("DisconnectTrackerSubTask", "Unable to start BluetoothConnectionService in order to disconnect tracker: disconnect or connect is in progress. Waiting for connection state change...", new Object[0]);
            r();
            return;
        }
        if (a(((java.util.UUID) (obj))))
        {
            r();
            return;
        } else
        {
            a(false);
            return;
        }
    }

    protected void c()
    {
        b.d();
        s();
    }

    protected void d()
    {
        r();
    }

    public String e()
    {
        return "DisconnectTrackerSubTask";
    }

    protected long f()
    {
        return 20000L;
    }

    protected void g()
    {
        if (!i())
        {
            com.fitbit.e.a.a("DisconnectTrackerSubTask", "Timeout expired. Sub task will be finished", new Object[0]);
            a(false);
        }
    }
}
