// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.bluetooth.broadcom.gatt;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothProfile;
import com.fitbit.FitBitApplication;
import com.fitbit.analytics.google.ga.AnalyticsContainer;
import com.fitbit.analytics.google.ga.d;
import com.fitbit.bluetooth.BluetoothErrorsHandler;
import com.fitbit.bluetooth.Manufacturer;
import com.fitbit.bluetooth.g;
import com.fitbit.bluetooth.k;
import com.fitbit.bluetooth.n;
import com.fitbit.config.BuildType;
import com.fitbit.galileo.a.c;
import com.fitbit.savedstate.TrackerSyncPreferencesSavedState;
import com.fitbit.util.b.a;
import com.fitbit.util.g.b;

// Referenced classes of package com.fitbit.bluetooth.broadcom.gatt:
//            m, b, n, c, 
//            g, j, e, s

public abstract class i extends m
{
    private class a extends bluetooth.le.a.b
    {

        final i a;

        public void a(BluetoothGatt bluetoothgatt, int l)
        {
            com.fitbit.e.a.a(com.fitbit.bluetooth.broadcom.gatt.i.a(a), "Connection state changed. New state: %s.", new Object[] {
                com.fitbit.bluetooth.broadcom.a.b(l)
            });
            switch (l)
            {
            case 1: // '\001'
            default:
                return;

            case 2: // '\002'
                a.a(bluetoothgatt.getDevice());
                return;

            case 0: // '\0'
                a.b(bluetoothgatt.getDevice());
                return;
            }
        }

        public void a(bluetooth.le.a.b.a a1)
        {
            com.fitbit.e.a.a(com.fitbit.bluetooth.broadcom.gatt.i.a(a), (new StringBuilder()).append("onCharacteristicChanged status: ").append(a1.c).toString(), new Object[0]);
            a.a((bluetooth.le.external.a)a1.b);
        }

        public void b(BluetoothGatt bluetoothgatt)
        {
            com.fitbit.e.a.a(com.fitbit.bluetooth.broadcom.gatt.i.a(a), "Services are discovered on device.", new Object[0]);
            BluetoothErrorsHandler.a().b(com.fitbit.bluetooth.BluetoothErrorsHandler.BluetoothError.a, bluetoothgatt.getDevice());
            a.c(bluetoothgatt.getDevice());
        }

        public void b(BluetoothGatt bluetoothgatt, int l)
        {
            com.fitbit.e.a.a(com.fitbit.bluetooth.broadcom.gatt.i.a(a), "Connection state changed failed. Error: %s. State: %s", new Object[] {
                com.fitbit.bluetooth.broadcom.a.a(l), Integer.valueOf((new com.fitbit.bluetooth.broadcom.gatt.b(bluetoothgatt)).b(bluetoothgatt.getDevice()))
            });
            if (com.fitbit.config.b.a == BuildType.c)
            {
                FitBitApplication.a().c().a(0x7f11000b).a("bluetooth_error", "state_change_error", Integer.toString(l), 0);
            }
            a.b(bluetoothgatt.getDevice());
        }

        public void b(bluetooth.le.a.b.a a1)
        {
            com.fitbit.e.a.a(com.fitbit.bluetooth.broadcom.gatt.i.a(a), (new StringBuilder()).append("onCharacteristicRead status: ").append(a1.c).toString(), new Object[0]);
            if (com.fitbit.config.b.a == BuildType.c && a1.c != 0)
            {
                FitBitApplication.a().c().a(0x7f11000b).a("bluetooth_error", "characteristic_read_error", Integer.toString(a1.c), 0);
            }
            a.b((bluetooth.le.external.a)a1.b, a1.c);
        }

        public void c(BluetoothGatt bluetoothgatt, int l)
        {
        }

        public void c(bluetooth.le.a.b.a a1)
        {
            com.fitbit.e.a.d(com.fitbit.bluetooth.broadcom.gatt.i.a(a), (new StringBuilder()).append("onCharacteristicWrite status: ").append(a1.c).toString(), new Object[0]);
            if (com.fitbit.config.b.a == BuildType.c && a1.c != 0)
            {
                FitBitApplication.a().c().a(0x7f11000b).a("bluetooth_error", "characteristic_write_error", Integer.toString(a1.c), 0);
            }
            a.a((bluetooth.le.external.a)a1.b, a1.c);
        }

        public void d(BluetoothGatt bluetoothgatt, int l)
        {
            com.fitbit.e.a.a(com.fitbit.bluetooth.broadcom.gatt.i.a(a), "Services failed to discover on device status: %s", new Object[] {
                Integer.valueOf(l)
            });
            if (com.fitbit.config.b.a == BuildType.c)
            {
                FitBitApplication.a().c().a(0x7f11000b).a("bluetooth_error", "service_discovery_error", Integer.toString(l), 0);
            }
            if (n.a().a() == Manufacturer.e)
            {
                BluetoothErrorsHandler.a().a(com.fitbit.bluetooth.BluetoothErrorsHandler.BluetoothError.a, bluetoothgatt.getDevice());
            }
        }

        public void e(bluetooth.le.a.b.a a1)
        {
            com.fitbit.e.a.a(com.fitbit.bluetooth.broadcom.gatt.i.a(a), "On descriptor write: Status: %s", new Object[] {
                com.fitbit.bluetooth.broadcom.a.a(a1.c)
            });
            if (com.fitbit.config.b.a == BuildType.c && a1.c != 0)
            {
                FitBitApplication.a().c().a(0x7f11000b).a("bluetooth_error", "descriptor_write_error", Integer.toString(a1.c), 0);
            }
            if (((bluetooth.le.external.b)a1.b).b() == null)
            {
                com.fitbit.e.a.a(com.fitbit.bluetooth.broadcom.gatt.i.a(a), "Unable to process callback: serviceUuid is null.", new Object[0]);
                return;
            } else
            {
                a.a((bluetooth.le.external.b)a1.b, a1.c);
                return;
            }
        }

        private a()
        {
            a = i.this;
            super();
        }

    }


    protected com.fitbit.bluetooth.broadcom.gatt.b b_;
    protected a c_;
    private final String d = getClass().getSimpleName();
    protected e d_;

    protected i()
    {
        d_ = new e() {

            final i b;

            public void a(int l)
            {
                this;
                JVM INSTR monitorenter ;
                com.fitbit.e.a.a(com.fitbit.bluetooth.broadcom.gatt.i.a(b), "Application is registered with status = %s", new Object[] {
                    com.fitbit.bluetooth.broadcom.a.a(l)
                });
                if (l != com.fitbit.bluetooth.broadcom.gatt.b.g) goto _L2; else goto _L1
_L1:
                b.a();
_L4:
                this;
                JVM INSTR monitorexit ;
                return;
_L2:
                com.fitbit.e.a.a(com.fitbit.bluetooth.broadcom.gatt.i.a(b), "Unable to register application.", new Object[0]);
                b.unregisterApplication();
                if (true) goto _L4; else goto _L3
_L3:
                Exception exception;
                exception;
                throw exception;
            }

            public void a(BluetoothDevice bluetoothdevice, int l)
            {
                com.fitbit.e.a.a(com.fitbit.bluetooth.broadcom.gatt.i.a(b), "Services are discovered on device: %s. Status: %s", new Object[] {
                    bluetoothdevice, com.fitbit.bluetooth.broadcom.a.a(l)
                });
                if (l != com.fitbit.bluetooth.broadcom.gatt.b.g)
                {
                    com.fitbit.e.a.a(com.fitbit.bluetooth.broadcom.gatt.i.a(b), "Services are discovered with error status.", new Object[0]);
                    if (n.a().a() == Manufacturer.e)
                    {
                        BluetoothErrorsHandler.a().a(com.fitbit.bluetooth.BluetoothErrorsHandler.BluetoothError.a, bluetoothdevice);
                    }
                    return;
                } else
                {
                    BluetoothErrorsHandler.a().b(com.fitbit.bluetooth.BluetoothErrorsHandler.BluetoothError.a, bluetoothdevice);
                    b.c(bluetoothdevice);
                    return;
                }
            }

            public void a(BluetoothDevice bluetoothdevice, int l, int i1)
            {
                com.fitbit.e.a.a(com.fitbit.bluetooth.broadcom.gatt.i.a(b), "Connection state changed. Device: %s. Status: %s. New state: %s", new Object[] {
                    bluetoothdevice, com.fitbit.bluetooth.broadcom.a.a(l), com.fitbit.bluetooth.broadcom.a.b(i1)
                });
                switch (i1)
                {
                case 1: // '\001'
                default:
                    return;

                case 2: // '\002'
                    b.a(bluetoothdevice);
                    return;

                case 0: // '\0'
                    b.b(bluetoothdevice);
                    return;
                }
            }

            public void a(BluetoothDevice bluetoothdevice, int l, byte abyte0[])
            {
                b.a(bluetoothdevice, l, abyte0);
            }

            public void a(com.fitbit.bluetooth.broadcom.gatt.g g1)
            {
                com.fitbit.e.a.a(com.fitbit.bluetooth.broadcom.gatt.i.a(b), "On characteristic changed: %s: new value = %s", new Object[] {
                    g1, com.fitbit.galileo.a.c.a(g1.h())
                });
                if (g1.b() == null)
                {
                    com.fitbit.e.a.a(com.fitbit.bluetooth.broadcom.gatt.i.a(b), "Unable to process callback: service is null.", new Object[0]);
                    return;
                } else
                {
                    b.a(g1);
                    return;
                }
            }

            public void a(com.fitbit.bluetooth.broadcom.gatt.g g1, int l)
            {
                b.b(g1, l);
            }

            public void a(j j1, int l)
            {
            }

            public void b(BluetoothDevice bluetoothdevice, int l)
            {
            }

            public void b(BluetoothDevice bluetoothdevice, int l, int i1)
            {
            }

            public void b(com.fitbit.bluetooth.broadcom.gatt.g g1, int l)
            {
                b.a(g1, l);
            }

            public void b(j j1, int l)
            {
                com.fitbit.e.a.a(com.fitbit.bluetooth.broadcom.gatt.i.a(b), "On descriptor write: %s. Status: %s", new Object[] {
                    j1, com.fitbit.bluetooth.broadcom.a.a(l)
                });
                com.fitbit.bluetooth.broadcom.gatt.g g1 = j1.d();
                if (g1 == null)
                {
                    com.fitbit.e.a.a(com.fitbit.bluetooth.broadcom.gatt.i.a(b), "Unable to process callback: characteristic is null.", new Object[0]);
                    return;
                }
                if (g1.b() == null)
                {
                    com.fitbit.e.a.a(com.fitbit.bluetooth.broadcom.gatt.i.a(b), "Unable to process callback: service is null.", new Object[0]);
                    return;
                } else
                {
                    b.a(j1, l);
                    return;
                }
            }

            
            {
                b = i.this;
                super();
            }
        };
        if (com.fitbit.util.b.a.a(18))
        {
            c_ = new a();
        }
    }

    static String a(i l)
    {
        return l.d;
    }

    private boolean h()
    {
        boolean flag = false;
        this;
        JVM INSTR monitorenter ;
        com.fitbit.e.a.a(d, "Refresh device cache", new Object[0]);
        if (b_.p != null) goto _L2; else goto _L1
_L1:
        com.fitbit.e.a.a(d, "Unable to refresh device cache: bluetoothGatt is null.", new Object[0]);
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        com.fitbit.util.g.b.b b1;
        if (n.a().a() != Manufacturer.e)
        {
            break MISSING_BLOCK_LABEL_141;
        }
        b1 = com.fitbit.util.g.b.a(b_.p, n.s, new Object[0]);
        if (b1 == null)
        {
            flag = true;
            continue; /* Loop/switch isn't completed */
        }
        if (b1.c instanceof Boolean)
        {
            flag = ((Boolean)b1.c).booleanValue();
            continue; /* Loop/switch isn't completed */
        }
        com.fitbit.e.a.a(d, String.format("Result of refreshing cache was ambiguous, result=%s, assuming worked", new Object[] {
            b1.c
        }), new Object[0]);
        flag = true;
        continue; /* Loop/switch isn't completed */
        flag = true;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    protected final void a(int l)
    {
        this;
        JVM INSTR monitorenter ;
        if (l != com.fitbit.bluetooth.broadcom.gatt.c.a) goto _L2; else goto _L1
_L1:
        com.fitbit.e.a.a(d, "Bluetooth GATT Client Profile (%s) is disconnected.", new Object[] {
            Integer.valueOf(l)
        });
        b_ = null;
        d();
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        com.fitbit.e.a.a(d, "Unexpected Bluetooth Profile (%s) is disconnected.", new Object[] {
            Integer.valueOf(l)
        });
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    protected final void a(int l, BluetoothProfile bluetoothprofile)
    {
        this;
        JVM INSTR monitorenter ;
        if (l != com.fitbit.bluetooth.broadcom.gatt.c.a) goto _L2; else goto _L1
_L1:
        com.fitbit.e.a.a(d, "Bluetooth GATT Client Profile (%s) is connected.", new Object[] {
            Integer.valueOf(l)
        });
        if (bluetoothprofile == null)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        b_ = new com.fitbit.bluetooth.broadcom.gatt.b(bluetoothprofile);
        c();
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        com.fitbit.e.a.a(d, "Unexpected Bluetooth Profile (%s) is connected.", new Object[] {
            Integer.valueOf(l)
        });
        if (true) goto _L4; else goto _L3
_L3:
        bluetoothprofile;
        throw bluetoothprofile;
    }

    protected abstract void a(BluetoothDevice bluetoothdevice, int l, byte abyte0[]);

    protected abstract void a(bluetooth.le.external.a a1);

    protected abstract void a(bluetooth.le.external.a a1, int l);

    protected abstract void a(bluetooth.le.external.b b1, int l);

    protected abstract void a(com.fitbit.bluetooth.broadcom.gatt.g g1);

    protected abstract void a(com.fitbit.bluetooth.broadcom.gatt.g g1, int l);

    protected abstract void a(j j1, int l);

    public final boolean a(BluetoothDevice bluetoothdevice, com.fitbit.bluetooth.broadcom.gatt.g g1)
    {
        boolean flag = false;
        this;
        JVM INSTR monitorenter ;
        com.fitbit.e.a.a(d, "Read characteristic %s", new Object[] {
            g1
        });
        if (g.g()) goto _L2; else goto _L1
_L1:
        com.fitbit.e.a.a(d, "Unable to read characteristic: Bluetooth is turned off.", new Object[0]);
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        if (b_ != null && g1 != null)
        {
            break MISSING_BLOCK_LABEL_76;
        }
        com.fitbit.e.a.a(d, "Unable to read characteristic: bluetoothGatt or characteristic is null.", new Object[0]);
        continue; /* Loop/switch isn't completed */
        bluetoothdevice;
        throw bluetoothdevice;
        if (b_.b(bluetoothdevice) != 2)
        {
            com.fitbit.e.a.a(d, "Unable to read characteristic: device is not connected", new Object[0]);
            continue; /* Loop/switch isn't completed */
        }
        if (!b_.b(g1))
        {
            com.fitbit.e.a.a(d, "Unable to read characteristic: invocation error", new Object[0]);
            continue; /* Loop/switch isn't completed */
        }
        flag = true;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final boolean a(BluetoothDevice bluetoothdevice, com.fitbit.bluetooth.broadcom.gatt.g g1, byte abyte0[])
    {
        boolean flag = false;
        this;
        JVM INSTR monitorenter ;
        com.fitbit.e.a.a(d, "Write to characteristic %s value: %s", new Object[] {
            g1, com.fitbit.galileo.a.c.a(abyte0)
        });
        if (g.g()) goto _L2; else goto _L1
_L1:
        com.fitbit.e.a.a(d, "Unable to write value: Bluetooth is turned off.", new Object[0]);
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        if (b_ != null && g1 != null)
        {
            break MISSING_BLOCK_LABEL_85;
        }
        com.fitbit.e.a.a(d, "Unable to write value: bluetoothGatt or characteristic is null.", new Object[0]);
        continue; /* Loop/switch isn't completed */
        bluetoothdevice;
        throw bluetoothdevice;
        if (b_.b(bluetoothdevice) != 2)
        {
            com.fitbit.e.a.a(d, "Unable to write value: device is not connected", new Object[0]);
            continue; /* Loop/switch isn't completed */
        }
        if (!g1.b(abyte0))
        {
            com.fitbit.e.a.a(d, "Unable to write value: Unable to set value of characteristic.", new Object[0]);
            continue; /* Loop/switch isn't completed */
        }
        if (!b_.a(g1))
        {
            com.fitbit.e.a.a(d, "Unable to write value: Unable to write characteristic.", new Object[0]);
            continue; /* Loop/switch isn't completed */
        }
        flag = true;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final boolean a(BluetoothDevice bluetoothdevice, s s, com.fitbit.bluetooth.broadcom.gatt.g g1, boolean flag)
    {
        boolean flag1 = false;
        this;
        JVM INSTR monitorenter ;
        String s1;
        if (flag)
        {
            s1 = "enable";
        } else
        {
            s1 = "disable";
        }
        com.fitbit.e.a.a(d, "Set notifications %sd: service[%s], characteristic[%s]", new Object[] {
            s1, s, g1
        });
        if (g.g()) goto _L2; else goto _L1
_L1:
        com.fitbit.e.a.a(d, "Unable to %s notifications: Bluetooth is turned off.", new Object[] {
            s1
        });
        flag = flag1;
_L5:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        if (b_ != null && bluetoothdevice != null && s != null && g1 != null)
        {
            break MISSING_BLOCK_LABEL_129;
        }
        com.fitbit.e.a.a(d, "Unable to %s notifications: bluetoothGatt, device, service or characteristic is null.", new Object[] {
            s1
        });
        flag = flag1;
        continue; /* Loop/switch isn't completed */
        bluetoothdevice;
        throw bluetoothdevice;
        if (b_.b(bluetoothdevice) == 2)
        {
            break MISSING_BLOCK_LABEL_166;
        }
        com.fitbit.e.a.a(d, "Unable to %s notifications: device is not connected", new Object[] {
            s1
        });
        flag = flag1;
        continue; /* Loop/switch isn't completed */
        s = g1.a(j.l);
        if (s != null)
        {
            break MISSING_BLOCK_LABEL_203;
        }
        com.fitbit.e.a.a(d, "Unable to %s notifications: Unable to get Client Configuration Descriptor.", new Object[] {
            s1
        });
        flag = flag1;
        continue; /* Loop/switch isn't completed */
        if (b_.a(g1, flag))
        {
            break MISSING_BLOCK_LABEL_241;
        }
        com.fitbit.e.a.a(d, "Unable to %s notifications: Unable to set characteristic notification.", new Object[] {
            s1
        });
        flag = flag1;
        continue; /* Loop/switch isn't completed */
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_283;
        }
        bluetoothdevice = com.fitbit.bluetooth.broadcom.gatt.j.a;
_L3:
        if (s.a(bluetoothdevice))
        {
            break MISSING_BLOCK_LABEL_290;
        }
        com.fitbit.e.a.a(d, "Unable to %s notifications: Unable to set value of configuration descriptor.", new Object[] {
            s1
        });
        flag = flag1;
        continue; /* Loop/switch isn't completed */
        bluetoothdevice = com.fitbit.bluetooth.broadcom.gatt.j.b;
          goto _L3
        if (b_.a(s))
        {
            break MISSING_BLOCK_LABEL_326;
        }
        com.fitbit.e.a.a(d, "Unable to %s notifications: Unable to write configuration descriptor.", new Object[] {
            s1
        });
        flag = flag1;
        continue; /* Loop/switch isn't completed */
        flag = true;
        if (true) goto _L5; else goto _L4
_L4:
    }

    protected abstract void b(bluetooth.le.external.a a1, int l);

    protected abstract void b(com.fitbit.bluetooth.broadcom.gatt.g g1, int l);

    protected abstract void c();

    protected abstract void c(BluetoothDevice bluetoothdevice);

    public final boolean cancelConnection(BluetoothDevice bluetoothdevice)
    {
        boolean flag = false;
        this;
        JVM INSTR monitorenter ;
        com.fitbit.e.a.a(d, "Disconnecting from the device: %s", new Object[] {
            bluetoothdevice
        });
        if (g.g()) goto _L2; else goto _L1
_L1:
        com.fitbit.e.a.a(d, "Unable to disconnect: Bluetooth is turned off.", new Object[0]);
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        if (b_ != null && bluetoothdevice != null)
        {
            break MISSING_BLOCK_LABEL_76;
        }
        com.fitbit.e.a.a(d, "Unable to disconnect: bluetoothGatt or device is null", new Object[0]);
        continue; /* Loop/switch isn't completed */
        bluetoothdevice;
        throw bluetoothdevice;
        if (b_.b(bluetoothdevice) == 0)
        {
            com.fitbit.e.a.a(d, "Unable to disconnect: device is already disconnected", new Object[0]);
            continue; /* Loop/switch isn't completed */
        }
        b_.a(bluetoothdevice);
        flag = true;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final boolean connect(BluetoothDevice bluetoothdevice)
    {
        boolean flag = true;
        boolean flag1 = false;
        this;
        JVM INSTR monitorenter ;
        com.fitbit.e.a.a(d, "Connecting to the device: %s", new Object[] {
            bluetoothdevice
        });
        if (bluetoothdevice != null) goto _L2; else goto _L1
_L1:
        com.fitbit.e.a.a(d, "Unable to connect: device is null", new Object[0]);
        flag = flag1;
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        if (g.g())
        {
            break MISSING_BLOCK_LABEL_78;
        }
        com.fitbit.e.a.a(d, "Unable to connect: Bluetooth is turned off.", new Object[0]);
        flag = flag1;
        continue; /* Loop/switch isn't completed */
        bluetoothdevice;
        throw bluetoothdevice;
        if (b_ != null)
        {
            break MISSING_BLOCK_LABEL_138;
        }
        if (n.a().a() != Manufacturer.e)
        {
            break MISSING_BLOCK_LABEL_119;
        }
        b_ = com.fitbit.bluetooth.broadcom.gatt.b.a(bluetoothdevice, false, this);
        if (b_ == null)
        {
            flag = false;
        }
        continue; /* Loop/switch isn't completed */
        com.fitbit.e.a.a(d, "Unable to connect: bluetoothGatt or device is null", new Object[0]);
        flag = flag1;
        continue; /* Loop/switch isn't completed */
        if (b_.a(bluetoothdevice, false))
        {
            break MISSING_BLOCK_LABEL_169;
        }
        com.fitbit.e.a.a(d, "Unable to connect.", new Object[0]);
        flag = flag1;
        continue; /* Loop/switch isn't completed */
        flag = true;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public boolean connectProfile()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = b(com.fitbit.bluetooth.broadcom.gatt.c.a);
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    protected abstract void d();

    public final boolean d(BluetoothDevice bluetoothdevice)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag;
        boolean flag1;
        flag1 = false;
        flag = flag1;
        int l;
        if (b_ == null)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        l = b_.b(bluetoothdevice);
        flag = flag1;
        if (l == 2)
        {
            flag = true;
        }
        this;
        JVM INSTR monitorexit ;
        return flag;
        bluetoothdevice;
        throw bluetoothdevice;
    }

    public boolean disconnectProfile()
    {
        boolean flag = false;
        this;
        JVM INSTR monitorenter ;
        com.fitbit.e.a.a(d, "Disconnecting profile...", new Object[0]);
        if (g.g()) goto _L2; else goto _L1
_L1:
        com.fitbit.e.a.a(d, "Unable to disconnect profile: Bluetooth is turned off.", new Object[0]);
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        if (b_ != null)
        {
            b_.b();
        }
        flag = c(com.fitbit.bluetooth.broadcom.gatt.c.a);
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public final boolean discoverServices(BluetoothDevice bluetoothdevice)
    {
        boolean flag = false;
        this;
        JVM INSTR monitorenter ;
        com.fitbit.e.a.a(d, "Discovering services on device %s", new Object[] {
            bluetoothdevice
        });
        if (g.g()) goto _L2; else goto _L1
_L1:
        com.fitbit.e.a.a(d, "Unable to discover services: Bluetooth is turned off.", new Object[0]);
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        if (b_ != null && bluetoothdevice != null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        com.fitbit.e.a.a(d, "Unable to discover services: bluetoothGatt or device is null", new Object[0]);
        continue; /* Loop/switch isn't completed */
        bluetoothdevice;
        throw bluetoothdevice;
        if (b_.b(bluetoothdevice) != 2)
        {
            com.fitbit.e.a.a(d, "Unable to discover services: device is not connected", new Object[0]);
            continue; /* Loop/switch isn't completed */
        }
        String s = bluetoothdevice.getAddress();
        if (TrackerSyncPreferencesSavedState.c(s))
        {
            h();
            TrackerSyncPreferencesSavedState.b(s, false);
        }
        if (!b_.c(bluetoothdevice))
        {
            com.fitbit.e.a.a(d, "Unable to start services discovery.", new Object[0]);
            continue; /* Loop/switch isn't completed */
        }
        flag = true;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final boolean e()
    {
        boolean flag = true;
        this;
        JVM INSTR monitorenter ;
        com.fitbit.e.a.a(d, "Start scan.", new Object[0]);
        if (g.g()) goto _L2; else goto _L1
_L1:
        com.fitbit.e.a.a(d, "Unable to start scan: Bluetooth is turned off.", new Object[0]);
        flag = false;
_L8:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        if (n.a().a() != Manufacturer.e) goto _L4; else goto _L3
_L3:
        com.fitbit.util.g.b.b b1;
        com.fitbit.e.a.a(d, "Invoking startScan with callback %s", new Object[] {
            d_.a
        });
        b1 = com.fitbit.util.g.b.a(BluetoothAdapter.getDefaultAdapter(), n.x, new Object[] {
            d_.a
        });
_L6:
        if (b1.c != null)
        {
            flag = ((Boolean)b1.c).booleanValue();
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (b_ != null)
        {
            break MISSING_BLOCK_LABEL_153;
        }
        com.fitbit.e.a.a(d, "Unable to start scan: bluetoothGatt is null.", new Object[0]);
        flag = false;
        continue; /* Loop/switch isn't completed */
        b1 = com.fitbit.util.g.b.a(b_.p, n.x, new Object[0]);
        if (true) goto _L6; else goto _L5
_L5:
        Exception exception;
        exception;
        throw exception;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public final boolean f()
    {
        boolean flag = true;
        this;
        JVM INSTR monitorenter ;
        if (n.a().a() != Manufacturer.e) goto _L2; else goto _L1
_L1:
        com.fitbit.util.g.b.b b1;
        com.fitbit.e.a.a(d, "Invoking stopScan with callback %s", new Object[] {
            d_.a
        });
        b1 = com.fitbit.util.g.b.a(BluetoothAdapter.getDefaultAdapter(), n.y, new Object[] {
            d_.a
        });
_L5:
        Object obj = b1.c;
        if (obj != null) goto _L4; else goto _L3
_L3:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        if (b_ != null)
        {
            break MISSING_BLOCK_LABEL_105;
        }
        com.fitbit.e.a.a(d, "Unable to stop scan: bluetoothGatt is null.", new Object[0]);
        flag = false;
          goto _L3
        b1 = com.fitbit.util.g.b.a(b_.p, n.y, new Object[0]);
          goto _L5
_L4:
        flag = ((Boolean)b1.c).booleanValue();
          goto _L3
        Exception exception;
        exception;
        throw exception;
          goto _L5
    }

    public volatile void onServiceConnected(int l, BluetoothProfile bluetoothprofile)
    {
        super.onServiceConnected(l, bluetoothprofile);
    }

    public volatile void onServiceDisconnected(int l)
    {
        super.onServiceDisconnected(l);
    }

    public final boolean registerApplication()
    {
        boolean flag = false;
        this;
        JVM INSTR monitorenter ;
        com.fitbit.e.a.a(d, "Registering application...", new Object[0]);
        if (g.g()) goto _L2; else goto _L1
_L1:
        com.fitbit.e.a.a(d, "Unable to register application: Bluetooth is turned off.", new Object[0]);
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        if (n.a().a() != Manufacturer.e)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        a();
        flag = true;
        continue; /* Loop/switch isn't completed */
        if (b_ == null)
        {
            com.fitbit.e.a.a(d, "Unable to register application: bluetoothGatt is null.", new Object[0]);
            continue; /* Loop/switch isn't completed */
        }
        break MISSING_BLOCK_LABEL_94;
        Exception exception;
        exception;
        throw exception;
        if (!b_.a(this))
        {
            com.fitbit.e.a.a(d, "Unable to register application.", new Object[0]);
            unregisterApplication();
            continue; /* Loop/switch isn't completed */
        }
        flag = true;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final boolean unregisterApplication()
    {
        boolean flag = false;
        this;
        JVM INSTR monitorenter ;
        com.fitbit.e.a.a(d, "Unregistering application...", new Object[0]);
        if (g.g()) goto _L2; else goto _L1
_L1:
        com.fitbit.e.a.a(d, "Unable to unregister application: Bluetooth is turned off.", new Object[0]);
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        if (n.a().a() != Manufacturer.e)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        b();
        flag = true;
        continue; /* Loop/switch isn't completed */
        if (b_ == null)
        {
            com.fitbit.e.a.a(d, "Unable to unregister application: bluetoothGatt is null.", new Object[0]);
            continue; /* Loop/switch isn't completed */
        }
        break MISSING_BLOCK_LABEL_94;
        Exception exception;
        exception;
        throw exception;
        b_.a();
        b();
        flag = true;
        if (true) goto _L4; else goto _L3
_L3:
    }
}
