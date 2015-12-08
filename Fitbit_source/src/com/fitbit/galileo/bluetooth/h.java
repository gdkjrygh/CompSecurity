// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.galileo.bluetooth;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.ParcelUuid;
import com.fitbit.e.a;
import com.fitbit.util.threading.c;
import java.util.UUID;

public abstract class h extends c
{

    private static final String a = "GalileoTaskResultReceiver";

    public h()
    {
    }

    public h(com.fitbit.util.threading.FitbitHandlerThread.ThreadName threadname)
    {
        super(threadname);
    }

    public void a()
    {
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction("com.fitbit.galileo.bluetooth.GalileoTaskManager.ACTION_TASK_STARTED");
        intentfilter.addAction("com.fitbit.galileo.bluetooth.GalileoTaskManager.ACTION_TASK_COMPLETED");
        intentfilter.addAction("com.fitbit.galileo.bluetooth.GalileoTaskManager.ACTION_TASK_CANCELED");
        intentfilter.addAction("com.fitbit.galileo.bluetooth.GalileoTaskManager.ACTION_TASK_FAILED");
        intentfilter.addAction("com.fitbit.galileo.bluetooth.GalileoTaskManager.ACTION_TASK_SUSPENDED");
        super.a(intentfilter);
    }

    public void a(Intent intent)
    {
        String s = intent.getAction();
        Object obj = (ParcelUuid)intent.getParcelableExtra("com.fitbit.galileo.bluetooth.GalileoTaskManager.EXTRA_TASK_UUID");
        if (obj != null)
        {
            obj = ((ParcelUuid) (obj)).getUuid();
        } else
        {
            obj = null;
        }
        com.fitbit.e.a.a("GalileoTaskResultReceiver", "Received broadcast %s", new Object[] {
            intent
        });
        if (obj != null)
        {
            if ("com.fitbit.galileo.bluetooth.GalileoTaskManager.ACTION_TASK_STARTED".equals(s))
            {
                a(((UUID) (obj)));
            } else
            {
                if ("com.fitbit.galileo.bluetooth.GalileoTaskManager.ACTION_TASK_COMPLETED".equals(s))
                {
                    c(((UUID) (obj)));
                    return;
                }
                if ("com.fitbit.galileo.bluetooth.GalileoTaskManager.ACTION_TASK_CANCELED".equals(s))
                {
                    d(((UUID) (obj)));
                    return;
                }
                if ("com.fitbit.galileo.bluetooth.GalileoTaskManager.ACTION_TASK_FAILED".equals(s))
                {
                    b(((UUID) (obj)));
                    return;
                }
                if ("com.fitbit.galileo.bluetooth.GalileoTaskManager.ACTION_TASK_SUSPENDED".equals(s))
                {
                    e(((UUID) (obj)));
                    return;
                }
            }
        }
    }

    protected abstract void a(UUID uuid);

    protected abstract void b(UUID uuid);

    protected abstract void c(UUID uuid);

    protected abstract void d(UUID uuid);

    protected void e(UUID uuid)
    {
    }
}
