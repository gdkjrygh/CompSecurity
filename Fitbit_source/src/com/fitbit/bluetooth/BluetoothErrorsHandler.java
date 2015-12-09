// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.bluetooth;

import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import android.content.IntentFilter;
import com.fitbit.bluetooth.connection.e;
import com.fitbit.config.BuildType;
import com.fitbit.config.b;
import com.fitbit.data.domain.device.Device;
import com.fitbit.e.a;
import com.fitbit.galileo.a.f;
import com.fitbit.savedstate.TrackerSyncPreferencesSavedState;
import com.fitbit.util.p;
import com.fitbit.util.threading.c;
import com.fitbit.util.z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.fitbit.bluetooth:
//            g, e, n, k

public final class BluetoothErrorsHandler
{
    public static final class BluetoothError extends Enum
    {

        public static final BluetoothError a;
        public static final BluetoothError b;
        public static final BluetoothError c;
        private static final BluetoothError d[];

        public static BluetoothError valueOf(String s)
        {
            return (BluetoothError)Enum.valueOf(com/fitbit/bluetooth/BluetoothErrorsHandler$BluetoothError, s);
        }

        public static BluetoothError[] values()
        {
            return (BluetoothError[])d.clone();
        }

        static 
        {
            a = new BluetoothError("SERVICES_DISCOVERY_ERROR", 0);
            b = new BluetoothError("ENABLE_NOTIFICATIONS_ERROR", 1);
            c = new BluetoothError("INCONSISTENT_SERVICES_ERROR", 2);
            d = (new BluetoothError[] {
                a, b, c
            });
        }

        private BluetoothError(String s, int i)
        {
            super(s, i);
        }
    }

    private static class a
    {

        private static BluetoothErrorsHandler a = new BluetoothErrorsHandler();

        static BluetoothErrorsHandler a()
        {
            return a;
        }


        private a()
        {
        }
    }


    public static final String a = "com.fitbit.bluetooth.BluetoothErrorsHandler.ACTION_BLUETOOTH_ERRORS_CHANGED";
    private static final String b = "BluetoothErrorsHandler";
    private final Map c;
    private final EnumSet d;
    private boolean e;
    private final c f;
    private final com.fitbit.bluetooth.e g;
    private final c h;

    private BluetoothErrorsHandler()
    {
        c = new HashMap();
        d = EnumSet.allOf(com/fitbit/bluetooth/BluetoothErrorsHandler$BluetoothError);
        e = true;
        f = new c() {

            final BluetoothErrorsHandler a;

            public void a(Intent intent)
            {
label0:
                {
                    if ("com.fitbit.bluetooth.BluetoothUtils.ACTION_BLUETOOTH_RESET_RESPONSE".equals(intent.getAction()))
                    {
                        if (!intent.getBooleanExtra("com.fitbit.bluetooth.BluetoothUtils.EXTRA_BLUETOOTH_RESET_RESPONSE", false))
                        {
                            break label0;
                        }
                        com.fitbit.e.a.a("BluetoothErrorsHandler", "Processing positive response", new Object[0]);
                        com.fitbit.bluetooth.BluetoothErrorsHandler.a(a).c();
                        if (!com.fitbit.bluetooth.n.a().d())
                        {
                            com.fitbit.e.a.a("BluetoothErrorsHandler", "Unable to disable Bluetooth.", new Object[0]);
                            com.fitbit.bluetooth.BluetoothErrorsHandler.a(a).d();
                            com.fitbit.bluetooth.BluetoothErrorsHandler.b(a);
                        }
                    }
                    return;
                }
                com.fitbit.e.a.a("BluetoothErrorsHandler", "Processing negative response", new Object[0]);
                com.fitbit.bluetooth.BluetoothErrorsHandler.b(a);
            }

            
            {
                a = BluetoothErrorsHandler.this;
                super();
            }
        };
        g = new com.fitbit.bluetooth.e(true) {

            final BluetoothErrorsHandler a;

            protected void a()
            {
                com.fitbit.e.a.a("BluetoothErrorsHandler", "Bluetooth is disabled. Trying to enable...", new Object[0]);
                if (!com.fitbit.bluetooth.n.a().e())
                {
                    com.fitbit.e.a.a("BluetoothErrorsHandler", "Unable to enable Bluetooth.", new Object[0]);
                    com.fitbit.bluetooth.BluetoothErrorsHandler.b(a);
                    d();
                }
            }

            protected void b()
            {
                Object obj = new ArrayList();
                BluetoothErrorsHandler bluetootherrorshandler = a;
                bluetootherrorshandler;
                JVM INSTR monitorenter ;
                Object obj1 = com.fitbit.bluetooth.BluetoothErrorsHandler.c(a).keySet();
                if (obj1 == null)
                {
                    break MISSING_BLOCK_LABEL_87;
                }
                obj1 = ((Set) (obj1)).iterator();
_L2:
                Device device;
                do
                {
                    if (!((Iterator) (obj1)).hasNext())
                    {
                        break MISSING_BLOCK_LABEL_87;
                    }
                    device = p.c(com.fitbit.galileo.a.f.c((String)((Iterator) (obj1)).next()));
                } while (device == null);
                ((List) (obj)).add(device);
                if (true) goto _L2; else goto _L1
_L1:
                obj;
                bluetootherrorshandler;
                JVM INSTR monitorexit ;
                throw obj;
                com.fitbit.bluetooth.BluetoothErrorsHandler.b(a);
                bluetootherrorshandler;
                JVM INSTR monitorexit ;
                com.fitbit.e.a.a("BluetoothErrorsHandler", "Bluetooth is enabled.", new Object[0]);
                d();
                if (!((List) (obj)).isEmpty())
                {
                    if (((List) (obj)).size() == 1)
                    {
                        com.fitbit.multipledevice.a.a().a(((Device)((List) (obj)).get(0)).c(), com.fitbit.serverinteraction.SynclairApi.SyncTrigger.a, false);
                        return;
                    } else
                    {
                        com.fitbit.multipledevice.a.a().a(com.fitbit.serverinteraction.SynclairApi.SyncTrigger.a, false);
                        return;
                    }
                } else
                {
                    com.fitbit.e.a.a("BluetoothErrorsHandler", "Unable to start force sync: no devices", new Object[0]);
                    return;
                }
            }

            
            {
                a = BluetoothErrorsHandler.this;
                super(flag);
            }
        };
        h = new c() {

            final BluetoothErrorsHandler a;

            protected void a(Intent intent)
            {
                if ("com.fitbit.bluetooth.connection.BluetoothConnectionService.ACTION_DISCONNECTED".equals(intent.getAction()) && !com.fitbit.bluetooth.connection.e.b())
                {
                    BluetoothErrorsHandler.d(a);
                }
            }

            
            {
                a = BluetoothErrorsHandler.this;
                super();
            }
        };
        f.a(new IntentFilter("com.fitbit.bluetooth.BluetoothUtils.ACTION_BLUETOOTH_RESET_RESPONSE"));
        d.addAll(Arrays.asList(BluetoothError.values()));
    }


    public static BluetoothErrorsHandler a()
    {
        return com.fitbit.bluetooth.a.a();
    }

    static com.fitbit.bluetooth.e a(BluetoothErrorsHandler bluetootherrorshandler)
    {
        return bluetootherrorshandler.g;
    }

    static void b(BluetoothErrorsHandler bluetootherrorshandler)
    {
        bluetootherrorshandler.d();
    }

    static Map c(BluetoothErrorsHandler bluetootherrorshandler)
    {
        return bluetootherrorshandler.c;
    }

    private void c()
    {
        z.a(new Intent("com.fitbit.bluetooth.BluetoothErrorsHandler.ACTION_BLUETOOTH_ERRORS_CHANGED"));
    }

    private void d()
    {
        boolean flag = false;
        this;
        JVM INSTR monitorenter ;
        com.fitbit.e.a.a("BluetoothErrorsHandler", "Clear errors", new Object[0]);
        if (!c.isEmpty())
        {
            flag = true;
        }
        c.clear();
        g();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        c();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    static void d(BluetoothErrorsHandler bluetootherrorshandler)
    {
        bluetootherrorshandler.h();
    }

    private boolean e()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = c.isEmpty();
        if (!flag)
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

    private void f()
    {
        this;
        JVM INSTR monitorenter ;
        h.a(new IntentFilter("com.fitbit.bluetooth.connection.BluetoothConnectionService.ACTION_DISCONNECTED"));
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private void g()
    {
        this;
        JVM INSTR monitorenter ;
        h.d();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private void h()
    {
        this;
        JVM INSTR monitorenter ;
        if (!e || !e()) goto _L2; else goto _L1
_L1:
        com.fitbit.e.a.a("BluetoothErrorsHandler", "Sending request to disable bluetooth", new Object[0]);
        g();
        if (com.fitbit.bluetooth.g.g()) goto _L4; else goto _L3
_L3:
        com.fitbit.e.a.a("BluetoothErrorsHandler", "Bluetooth is not enabled", new Object[0]);
        d();
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
_L4:
        if (!com.fitbit.bluetooth.g.a())
        {
            com.fitbit.e.a.a("BluetoothErrorsHandler", "Request to disable bluetooth was not sent", new Object[0]);
            d();
        }
        if (true) goto _L2; else goto _L5
_L5:
        Exception exception;
        exception;
        throw exception;
    }

    public void a(BluetoothError bluetootherror, BluetoothDevice bluetoothdevice)
    {
        this;
        JVM INSTR monitorenter ;
        if (bluetoothdevice != null && bluetootherror != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        String s;
        s = bluetoothdevice.getAddress();
        if (!b.a.a())
        {
            break MISSING_BLOCK_LABEL_85;
        }
        com.fitbit.e.a.a("BluetoothErrorsHandler", "Add bluetooth error: %s[%s]", new Object[] {
            bluetootherror, s
        });
_L3:
        TrackerSyncPreferencesSavedState.b(s, true);
        if (d.contains(bluetootherror))
        {
            break MISSING_BLOCK_LABEL_103;
        }
        com.fitbit.e.a.a("BluetoothErrorsHandler", "Bluetooth error is ignored: %s", new Object[] {
            bluetootherror
        });
          goto _L1
        bluetootherror;
        throw bluetootherror;
        com.fitbit.e.a.a("BluetoothErrorsHandler", "Add bluetooth error: %s", new Object[] {
            bluetootherror
        });
          goto _L3
        bluetoothdevice = (EnumSet)c.get(s);
        if (bluetoothdevice != null) goto _L5; else goto _L4
_L4:
        bluetootherror = EnumSet.of(bluetootherror);
_L6:
        c.put(s, bluetootherror);
        if (!b.a.a())
        {
            break MISSING_BLOCK_LABEL_194;
        }
        com.fitbit.e.a.a("BluetoothErrorsHandler", "Errors: %s", new Object[] {
            c
        });
_L7:
        if (e)
        {
            f();
        }
        c();
          goto _L1
_L5:
        bluetoothdevice.add(bluetootherror);
        bluetootherror = bluetoothdevice;
          goto _L6
        com.fitbit.e.a.a("BluetoothErrorsHandler", "Errors: %s", new Object[] {
            c.values()
        });
          goto _L7
    }

    public void a(EnumSet enumset)
    {
        this;
        JVM INSTR monitorenter ;
        d.clear();
        d.addAll(enumset);
        this;
        JVM INSTR monitorexit ;
        return;
        enumset;
        throw enumset;
    }

    public void a(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        if (e == flag) goto _L2; else goto _L1
_L1:
        com.fitbit.e.a.a("BluetoothErrorsHandler", "setIsUserInteractionAllowed: %s", new Object[] {
            Boolean.valueOf(flag)
        });
        e = flag;
        if (!e)
        {
            break MISSING_BLOCK_LABEL_72;
        }
        if (!e()) goto _L2; else goto _L3
_L3:
        if (!com.fitbit.bluetooth.connection.e.b()) goto _L5; else goto _L4
_L4:
        f();
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
_L5:
        h();
          goto _L2
        Exception exception;
        exception;
        throw exception;
        g();
          goto _L2
    }

    public void b(BluetoothError bluetootherror, BluetoothDevice bluetoothdevice)
    {
        this;
        JVM INSTR monitorenter ;
        if (bluetoothdevice != null && bluetootherror != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        EnumSet enumset;
        bluetoothdevice = bluetoothdevice.getAddress();
        enumset = (EnumSet)c.get(bluetoothdevice);
        if (enumset == null) goto _L1; else goto _L3
_L3:
        if (!enumset.contains(bluetootherror)) goto _L1; else goto _L4
_L4:
        com.fitbit.e.a.a("BluetoothErrorsHandler", String.format("Reset bluetooth error: %s[%s]", new Object[] {
            bluetootherror, bluetoothdevice
        }), new Object[0]);
        enumset.remove(bluetootherror);
        if (!enumset.isEmpty()) goto _L6; else goto _L5
_L5:
        c.remove(bluetoothdevice);
_L7:
        if (!b.a.a())
        {
            break MISSING_BLOCK_LABEL_159;
        }
        com.fitbit.e.a.a("BluetoothErrorsHandler", "Errors: %s", new Object[] {
            c
        });
_L8:
        if (!e())
        {
            g();
        }
        c();
          goto _L1
        bluetootherror;
        throw bluetootherror;
_L6:
        c.put(bluetoothdevice, enumset);
          goto _L7
        com.fitbit.e.a.a("BluetoothErrorsHandler", "Errors: %s", new Object[] {
            c.values()
        });
          goto _L8
    }

    public boolean b()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = a().e();
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }
}
