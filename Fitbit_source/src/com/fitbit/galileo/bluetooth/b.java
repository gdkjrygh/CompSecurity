// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.galileo.bluetooth;

import android.content.Intent;
import com.fitbit.e.a;
import com.fitbit.util.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.fitbit.galileo.bluetooth:
//            BluetoothWorker

public class com.fitbit.galileo.bluetooth.b
{
    private static class a
    {

        public static com.fitbit.galileo.bluetooth.b a = new com.fitbit.galileo.bluetooth.b();


        private a()
        {
        }
    }

    public static class b
    {

        public static BluetoothWorker.BluetoothWorkerName a(Intent intent)
        {
            intent = intent.getSerializableExtra("com.fitbit.galileo.tasks.BluetoothWorkersManager.EXTRA_WORKER_NAME");
            if (intent instanceof BluetoothWorker.BluetoothWorkerName)
            {
                return (BluetoothWorker.BluetoothWorkerName)intent;
            } else
            {
                return null;
            }
        }

        public b()
        {
        }
    }


    public static final String a = "com.fitbit.galileo.tasks.BluetoothWorkersManager.ACTION_WORKER_STARTED";
    public static final String b = "com.fitbit.galileo.tasks.BluetoothWorkersManager.ACTION_WORKER_STOPPED";
    public static final String c = "com.fitbit.galileo.tasks.BluetoothWorkersManager.EXTRA_WORKER_NAME";
    private static final String d = "BluetoothWorkersManager";
    private final List e;

    private com.fitbit.galileo.bluetooth.b()
    {
        e = new ArrayList();
    }


    public static com.fitbit.galileo.bluetooth.b a()
    {
        return com.fitbit.galileo.bluetooth.a.a;
    }

    private void a(BluetoothWorker.BluetoothWorkerName bluetoothworkername)
    {
        Intent intent = new Intent("com.fitbit.galileo.tasks.BluetoothWorkersManager.ACTION_WORKER_STARTED");
        intent.putExtra("com.fitbit.galileo.tasks.BluetoothWorkersManager.EXTRA_WORKER_NAME", bluetoothworkername);
        z.a(intent);
    }

    private void b(BluetoothWorker.BluetoothWorkerName bluetoothworkername)
    {
        Intent intent = new Intent("com.fitbit.galileo.tasks.BluetoothWorkersManager.ACTION_WORKER_STOPPED");
        intent.putExtra("com.fitbit.galileo.tasks.BluetoothWorkersManager.EXTRA_WORKER_NAME", bluetoothworkername);
        z.a(intent);
    }

    private void d()
    {
        List list = e;
        list;
        JVM INSTR monitorenter ;
        int i = 0;
_L2:
        if (i < e.size())
        {
            BluetoothWorker bluetoothworker = (BluetoothWorker)e.get(i);
            if (bluetoothworker.e())
            {
                b(bluetoothworker);
                continue; /* Loop/switch isn't completed */
            }
            break MISSING_BLOCK_LABEL_63;
        }
        list;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        list;
        JVM INSTR monitorexit ;
        throw exception;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public boolean a(BluetoothWorker bluetoothworker)
    {
        com.fitbit.e.a.a("BluetoothWorkersManager", "Starting worker %s", new Object[] {
            bluetoothworker
        });
        if (bluetoothworker == null)
        {
            return false;
        }
        List list = e;
        list;
        JVM INSTR monitorenter ;
        BluetoothWorker.BluetoothWorkerName bluetoothworkername;
        Iterator iterator;
        bluetoothworkername = bluetoothworker.c();
        iterator = e.iterator();
_L2:
        BluetoothWorker bluetoothworker1;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_150;
        }
        bluetoothworker1 = (BluetoothWorker)iterator.next();
        if (bluetoothworker1 != bluetoothworker)
        {
            break MISSING_BLOCK_LABEL_91;
        }
        com.fitbit.e.a.a("BluetoothWorkersManager", "Worker %s is already started", new Object[] {
            bluetoothworker
        });
        list;
        JVM INSTR monitorexit ;
        return true;
        if (bluetoothworker1.c() != bluetoothworkername)
        {
            continue; /* Loop/switch isn't completed */
        }
        com.fitbit.e.a.a("BluetoothWorkersManager", "Error: Worker with name %s is already exists.", new Object[] {
            bluetoothworkername
        });
        list;
        JVM INSTR monitorexit ;
        return false;
        if (!bluetoothworker1.f()) goto _L2; else goto _L1
_L1:
        com.fitbit.e.a.a("BluetoothWorkersManager", "Error: The exclusive worker with name %s is running", new Object[] {
            bluetoothworker1.c()
        });
        list;
        JVM INSTR monitorexit ;
        return false;
        if (bluetoothworker.f())
        {
            d();
        }
        e.add(bluetoothworker);
        bluetoothworker.a();
        com.fitbit.e.a.a("BluetoothWorkersManager", "Worker %s was started", new Object[] {
            bluetoothworker
        });
        a(bluetoothworkername);
        list;
        JVM INSTR monitorexit ;
        return true;
        bluetoothworker;
        list;
        JVM INSTR monitorexit ;
        throw bluetoothworker;
    }

    public boolean b()
    {
        return c() != null;
    }

    public boolean b(BluetoothWorker bluetoothworker)
    {
        com.fitbit.e.a.a("BluetoothWorkersManager", "Stopping worker %s ...", new Object[] {
            bluetoothworker
        });
        List list = e;
        list;
        JVM INSTR monitorenter ;
        if (!e.remove(bluetoothworker))
        {
            break MISSING_BLOCK_LABEL_66;
        }
        com.fitbit.e.a.a("BluetoothWorkersManager", "Worker %s was stopped", new Object[] {
            bluetoothworker
        });
        bluetoothworker.b();
        b(bluetoothworker.c());
        return true;
        list;
        JVM INSTR monitorexit ;
        return false;
        bluetoothworker;
        list;
        JVM INSTR monitorexit ;
        throw bluetoothworker;
    }

    public BluetoothWorker.BluetoothWorkerName c()
    {
label0:
        {
            Object obj;
            synchronized (e)
            {
                obj = e.iterator();
                BluetoothWorker bluetoothworker;
                do
                {
                    if (!((Iterator) (obj)).hasNext())
                    {
                        break label0;
                    }
                    bluetoothworker = (BluetoothWorker)((Iterator) (obj)).next();
                } while (!bluetoothworker.f());
                obj = bluetoothworker.c();
            }
            return ((BluetoothWorker.BluetoothWorkerName) (obj));
        }
        list;
        JVM INSTR monitorexit ;
        return null;
        exception;
        list;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
