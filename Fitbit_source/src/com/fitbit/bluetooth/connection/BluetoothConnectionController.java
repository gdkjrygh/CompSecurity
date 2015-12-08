// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.bluetooth.connection;

import android.content.Intent;
import android.content.IntentFilter;
import com.fitbit.e.a;
import com.fitbit.galileo.bluetooth.GalileoTaskExecutor;
import com.fitbit.galileo.bluetooth.f;
import com.fitbit.galileo.tasks.i;
import com.fitbit.util.threading.c;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.fitbit.bluetooth.connection:
//            e, BluetoothConnectionServiceStatus

public class BluetoothConnectionController
{
    public static final class ConnectionConsumer extends Enum
    {

        public static final ConnectionConsumer a;
        public static final ConnectionConsumer b;
        public static final ConnectionConsumer c;
        public static final ConnectionConsumer d;
        public static final ConnectionConsumer e;
        private static final ConnectionConsumer f[];

        public static ConnectionConsumer valueOf(String s)
        {
            return (ConnectionConsumer)Enum.valueOf(com/fitbit/bluetooth/connection/BluetoothConnectionController$ConnectionConsumer, s);
        }

        public static ConnectionConsumer[] values()
        {
            return (ConnectionConsumer[])f.clone();
        }

        static 
        {
            a = new ConnectionConsumer("DEBUG", 0);
            b = new ConnectionConsumer("PROTOCOL", 1);
            c = new ConnectionConsumer("LIVEDATA", 2);
            d = new ConnectionConsumer("DNCS_CONNECTION", 3);
            e = new ConnectionConsumer("DNCS_PAIRING", 4);
            f = (new ConnectionConsumer[] {
                a, b, c, d, e
            });
        }

        private ConnectionConsumer(String s, int j)
        {
            super(s, j);
        }
    }

    private static class a
    {

        public static BluetoothConnectionController a = new BluetoothConnectionController();


        private a()
        {
        }
    }


    private static final String a = "BluetoothConnectionController";
    private c b;
    private final Set c = new HashSet();
    private final Object d = new Object();
    private GalileoTaskExecutor e;

    public BluetoothConnectionController()
    {
        b = new c() {

            final BluetoothConnectionController a;

            public void a(Intent intent)
            {
                if ("com.fitbit.bluetooth.connection.BluetoothConnectionServiceStatusController.ACTION_STATUS_CHANGED".equals(intent.getAction()) && !com.fitbit.bluetooth.connection.e.a((BluetoothConnectionServiceStatus)intent.getParcelableExtra("com.fitbit.bluetooth.connection.BluetoothConnectionServiceStatusController.EXTRA_NEW_STATUS")))
                {
                    synchronized (com.fitbit.bluetooth.connection.BluetoothConnectionController.a(a))
                    {
                        if (BluetoothConnectionController.b(a).size() > 0)
                        {
                            BluetoothConnectionController.b(a).clear();
                            com.fitbit.e.a.a("BluetoothConnectionController", "Clear all. Count = 0", new Object[0]);
                        }
                    }
                    return;
                } else
                {
                    return;
                }
                exception;
                intent;
                JVM INSTR monitorexit ;
                throw exception;
            }

            
            {
                a = BluetoothConnectionController.this;
                super();
            }
        };
        b.a(new IntentFilter("com.fitbit.bluetooth.connection.BluetoothConnectionServiceStatusController.ACTION_STATUS_CHANGED"));
    }

    public static BluetoothConnectionController a()
    {
        return com.fitbit.bluetooth.connection.a.a;
    }

    static Object a(BluetoothConnectionController bluetoothconnectioncontroller)
    {
        return bluetoothconnectioncontroller.d;
    }

    static Set b(BluetoothConnectionController bluetoothconnectioncontroller)
    {
        return bluetoothconnectioncontroller.c;
    }

    static GalileoTaskExecutor c(BluetoothConnectionController bluetoothconnectioncontroller)
    {
        return bluetoothconnectioncontroller.e;
    }

    private void c()
    {
        if (e == null)
        {
            com.fitbit.e.a.a("BluetoothConnectionController", "Disconnecting...", new Object[0]);
            e = new GalileoTaskExecutor(new i(), com.fitbit.galileo.bluetooth.i.a(), null) {

                final BluetoothConnectionController a;

                protected void a()
                {
                    synchronized (com.fitbit.bluetooth.connection.BluetoothConnectionController.a(a))
                    {
                        if (com.fitbit.bluetooth.connection.BluetoothConnectionController.c(a) == this)
                        {
                            com.fitbit.e.a.a("BluetoothConnectionController", "Disconnection task completed", new Object[0]);
                        }
                    }
                    return;
                    exception;
                    obj;
                    JVM INSTR monitorexit ;
                    throw exception;
                }

                protected void b()
                {
                    synchronized (com.fitbit.bluetooth.connection.BluetoothConnectionController.a(a))
                    {
                        if (com.fitbit.bluetooth.connection.BluetoothConnectionController.c(a) == this)
                        {
                            com.fitbit.e.a.a("BluetoothConnectionController", "Disconnection task cancelled", new Object[0]);
                        }
                    }
                    return;
                    exception;
                    obj;
                    JVM INSTR monitorexit ;
                    throw exception;
                }

                protected void c()
                {
                    synchronized (com.fitbit.bluetooth.connection.BluetoothConnectionController.a(a))
                    {
                        if (com.fitbit.bluetooth.connection.BluetoothConnectionController.c(a) == this)
                        {
                            com.fitbit.e.a.a("BluetoothConnectionController", "Disconnection task failed", new Object[0]);
                        }
                    }
                    return;
                    exception;
                    obj;
                    JVM INSTR monitorexit ;
                    throw exception;
                }

                protected void d()
                {
                    synchronized (com.fitbit.bluetooth.connection.BluetoothConnectionController.a(a))
                    {
                        if (com.fitbit.bluetooth.connection.BluetoothConnectionController.c(a) == this)
                        {
                            BluetoothConnectionController.d(a);
                        }
                    }
                    return;
                    exception;
                    obj;
                    JVM INSTR monitorexit ;
                    throw exception;
                }

            
            {
                a = BluetoothConnectionController.this;
                super(f, a1, threadname);
            }
            };
            if (!e.g())
            {
                com.fitbit.e.a.d("BluetoothConnectionController", "Could not start disconnection task", new Object[0]);
                d();
            }
        }
    }

    private void d()
    {
        e = null;
    }

    static void d(BluetoothConnectionController bluetoothconnectioncontroller)
    {
        bluetoothconnectioncontroller.d();
    }

    public boolean a(ConnectionConsumer connectionconsumer)
    {
label0:
        {
            if (connectionconsumer == null)
            {
                break MISSING_BLOCK_LABEL_115;
            }
            synchronized (d)
            {
                if (!com.fitbit.bluetooth.connection.e.b())
                {
                    break label0;
                }
                if (e != null)
                {
                    com.fitbit.e.a.a("BluetoothConnectionController", "Cancelling disconnection task", new Object[0]);
                    e.a(true);
                    d();
                }
                if (!c.contains(connectionconsumer))
                {
                    c.add(connectionconsumer);
                    com.fitbit.e.a.a("BluetoothConnectionController", "Registered: %s. Count = %s", new Object[] {
                        connectionconsumer, Integer.valueOf(c.size())
                    });
                }
            }
            return true;
        }
        obj;
        JVM INSTR monitorexit ;
        break MISSING_BLOCK_LABEL_115;
        connectionconsumer;
        obj;
        JVM INSTR monitorexit ;
        throw connectionconsumer;
        return false;
    }

    public void b(ConnectionConsumer connectionconsumer)
    {
        if (connectionconsumer != null)
        {
            synchronized (d)
            {
                if (c.contains(connectionconsumer))
                {
                    c.remove(connectionconsumer);
                    com.fitbit.e.a.a("BluetoothConnectionController", "Unregistered: %s. Count = %s", new Object[] {
                        connectionconsumer, Integer.valueOf(c.size())
                    });
                    if (c.size() == 0)
                    {
                        c();
                    }
                }
            }
            return;
        } else
        {
            return;
        }
        connectionconsumer;
        obj;
        JVM INSTR monitorexit ;
        throw connectionconsumer;
    }

    public boolean b()
    {
        Object obj = d;
        obj;
        JVM INSTR monitorenter ;
        Exception exception;
        boolean flag;
        if (c.size() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj;
        JVM INSTR monitorexit ;
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
