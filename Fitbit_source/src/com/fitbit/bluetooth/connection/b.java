// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.bluetooth.connection;

import android.content.IntentFilter;
import com.fitbit.e.a;
import com.fitbit.util.threading.c;
import java.util.UUID;

public abstract class b
{

    private static final String a = "BluetoothConnectionServiceActionStartListener";
    private UUID b;
    private c c;

    public b()
    {
    }

    static c a(b b1)
    {
        return b1.c;
    }

    static UUID b(b b1)
    {
        return b1.b;
    }

    public void a()
    {
        this;
        JVM INSTR monitorenter ;
        if (c != null)
        {
            com.fitbit.e.a.a("BluetoothConnectionServiceActionStartListener", "Stop listening for UUID: %s", new Object[] {
                b
            });
            c.d();
            c = null;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void a(UUID uuid, com.fitbit.util.threading.FitbitHandlerThread.ThreadName threadname)
    {
        this;
        JVM INSTR monitorenter ;
        if (uuid == null)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        a();
        b = uuid;
        com.fitbit.e.a.a("BluetoothConnectionServiceActionStartListener", "Start listening for UUID: %s", new Object[] {
            uuid
        });
        c = new _cls1(threadname);
        uuid = new IntentFilter();
        uuid.addAction("com.fitbit.bluetooth.connection.BluetoothConnectionService.ACTION_STARTED");
        c.a(uuid);
        this;
        JVM INSTR monitorexit ;
        return;
        uuid;
        throw uuid;
    }

    protected abstract void a(boolean flag);

    public boolean b()
    {
        this;
        JVM INSTR monitorenter ;
        c c1 = c;
        boolean flag;
        if (c1 != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public UUID c()
    {
        this;
        JVM INSTR monitorenter ;
        UUID uuid = b;
        this;
        JVM INSTR monitorexit ;
        return uuid;
        Exception exception;
        exception;
        throw exception;
    }

    /* member class not found */
    class _cls1 {}

}
