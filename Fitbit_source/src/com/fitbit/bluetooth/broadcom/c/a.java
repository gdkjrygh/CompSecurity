// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.bluetooth.broadcom.c;

import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import com.fitbit.bluetooth.BluetoothErrorsHandler;
import com.fitbit.bluetooth.broadcom.gatt.b;
import com.fitbit.bluetooth.broadcom.gatt.g;
import com.fitbit.bluetooth.broadcom.gatt.i;
import com.fitbit.bluetooth.broadcom.gatt.j;
import com.fitbit.bluetooth.broadcom.gatt.s;
import com.fitbit.bluetooth.galileo.GalileoProfile;
import com.fitbit.bluetooth.galileo.c;
import com.fitbit.galileo.a.f;
import com.fitbit.util.z;
import java.util.Arrays;
import java.util.UUID;

public class a extends i
    implements GalileoProfile
{

    private static final String t = "BroadcomGalileoProfile";
    private com.fitbit.bluetooth.galileo.GalileoProfile.GalileoProfileListener u;

    public a()
    {
    }

    private s a(BluetoothDevice bluetoothdevice, UUID uuid)
    {
        Object obj = null;
        BluetoothDevice bluetoothdevice1 = obj;
        if (b_ != null)
        {
            bluetoothdevice1 = obj;
            if (bluetoothdevice != null)
            {
                bluetoothdevice = b_.a(bluetoothdevice, uuid);
                bluetoothdevice1 = bluetoothdevice;
                if (bluetoothdevice == null)
                {
                    com.fitbit.e.a.a("BroadcomGalileoProfile", (new StringBuilder()).append("Service not found! uuid: ").append(uuid).toString(), new Object[0]);
                    bluetoothdevice1 = bluetoothdevice;
                }
            }
        }
        return bluetoothdevice1;
    }

    private void a(UUID uuid)
    {
        com.fitbit.e.a.a("BroadcomGalileoProfile", "Notifications are enabled", new Object[0]);
        Intent intent = new Intent("com.fitbit.bluetooth.galileo.ACTION_NOTIFICATIONS_ENABLED");
        intent.putExtra("android.bluetooth.device.extra.UUID", uuid);
        z.a(intent);
    }

    private void a(UUID uuid, UUID uuid1, byte abyte0[], int k)
    {
        if (!j.l.equals(uuid))
        {
            com.fitbit.e.a.a("BroadcomGalileoProfile", "Unknown descriptor was written.", new Object[0]);
        } else
        {
            if (k != b.g)
            {
                com.fitbit.e.a.a("BroadcomGalileoProfile", "Descriptor was written with error status: [%s]", new Object[] {
                    Integer.valueOf(k)
                });
                if (b_ != null && b_.c() != null)
                {
                    BluetoothErrorsHandler.a().a(com.fitbit.bluetooth.BluetoothErrorsHandler.BluetoothError.b, b_.c());
                }
            }
            if (Arrays.equals(j.a, abyte0))
            {
                if (k == b.g)
                {
                    a(uuid1);
                    return;
                } else
                {
                    b(uuid1);
                    return;
                }
            }
            if (Arrays.equals(j.b, abyte0))
            {
                b(uuid1);
                return;
            }
        }
    }

    private void a(UUID uuid, byte abyte0[])
    {
        if (u == null)
        {
            break MISSING_BLOCK_LABEL_49;
        }
        if (!n.equals(uuid)) goto _L2; else goto _L1
_L1:
        u.c(abyte0);
_L4:
        return;
_L2:
        if (!s.equals(uuid)) goto _L4; else goto _L3
_L3:
        u.b(abyte0);
        return;
        com.fitbit.e.a.a("BroadcomGalileoProfile", "onCharacteristicChanged, Listener was null", new Object[0]);
        return;
    }

    private void a(byte abyte0[], int k)
    {
        if (u != null)
        {
            com.fitbit.bluetooth.galileo.GalileoProfile.GalileoProfileListener.Status status = com.fitbit.bluetooth.galileo.GalileoProfile.GalileoProfileListener.Status.a(k);
            u.b(abyte0, status);
        }
    }

    private void b(UUID uuid)
    {
        com.fitbit.e.a.a("BroadcomGalileoProfile", "Notifications are disabled", new Object[0]);
        Intent intent = new Intent("com.fitbit.bluetooth.galileo.ACTION_NOTIFICATIONS_DISABLED");
        intent.putExtra("android.bluetooth.device.extra.UUID", uuid);
        z.a(intent);
    }

    private void b(byte abyte0[], int k)
    {
        if (u != null)
        {
            com.fitbit.bluetooth.galileo.GalileoProfile.GalileoProfileListener.Status status = com.fitbit.bluetooth.galileo.GalileoProfile.GalileoProfileListener.Status.a(k);
            u.a(abyte0, status);
        }
    }

    private s e(BluetoothDevice bluetoothdevice)
    {
        Object obj1 = null;
        Object obj = obj1;
        if (b_ != null)
        {
            obj = obj1;
            if (bluetoothdevice != null)
            {
                s s1 = b_.a(bluetoothdevice, l);
                obj = s1;
                if (s1 == null)
                {
                    obj = com.fitbit.galileo.a.f.b(bluetoothdevice);
                    com.fitbit.e.a.a("BroadcomGalileoProfile", (new StringBuilder()).append("FitbitService not found! Trying alternate uuid: ").append(((String) (obj))).toString(), new Object[0]);
                    obj = UUID.fromString(String.format("adab%s-6e7d-4601-bda2-bffaa68956ba", new Object[] {
                        obj
                    }));
                    obj = b_.a(bluetoothdevice, ((UUID) (obj)));
                }
            }
        }
        return ((s) (obj));
    }

    private s f(BluetoothDevice bluetoothdevice)
    {
        return a(bluetoothdevice, r);
    }

    private g g(BluetoothDevice bluetoothdevice)
    {
        com.fitbit.e.a.a("BroadcomGalileoProfile", "Find secure characteristic on device %s", new Object[] {
            bluetoothdevice
        });
        bluetoothdevice = e(bluetoothdevice);
        if (bluetoothdevice == null)
        {
            com.fitbit.e.a.a("BroadcomGalileoProfile", "Unable to find secure characteristic: Fitbit Service is null.", new Object[0]);
            return null;
        }
        bluetoothdevice = bluetoothdevice.a(q);
        if (bluetoothdevice == null)
        {
            com.fitbit.e.a.a("BroadcomGalileoProfile", "Unable to find secure characteristic: Not found.", new Object[0]);
            return null;
        } else
        {
            com.fitbit.e.a.a("BroadcomGalileoProfile", "Secure characteristic found.", new Object[0]);
            return bluetoothdevice;
        }
    }

    protected void a()
    {
        z.a(new Intent("com.fitbit.bluetooth.galileo.ACTION_APP_REGISTERED"));
    }

    protected void a(BluetoothDevice bluetoothdevice)
    {
        Intent intent = new Intent("com.fitbit.bluetooth.galileo.ACTION_DEVICE_CONNECTED");
        intent.putExtra("android.bluetooth.device.extra.DEVICE", bluetoothdevice);
        z.a(intent);
    }

    protected void a(BluetoothDevice bluetoothdevice, int k, byte abyte0[])
    {
    }

    protected void a(bluetooth.le.external.a a1)
    {
        a(a1.a(), a1.b());
    }

    protected void a(bluetooth.le.external.a a1, int k)
    {
        a(a1.b(), k);
    }

    protected void a(bluetooth.le.external.b b1, int k)
    {
        a(b1.a(), b1.b(), b1.c(), k);
    }

    protected void a(g g1)
    {
        a(g1.c(), g1.h());
    }

    protected void a(g g1, int k)
    {
        a(g1.h(), k);
    }

    protected void a(j j1, int k)
    {
        a(j1.c(), j1.d().b().b(), j1.b(), k);
    }

    protected void b()
    {
        z.a(new Intent("com.fitbit.bluetooth.galileo.ACTION_APP_UNREGISTERED"));
    }

    protected void b(BluetoothDevice bluetoothdevice)
    {
        Intent intent = new Intent("com.fitbit.bluetooth.galileo.ACTION_DEVICE_DISCONNECTED");
        intent.putExtra("android.bluetooth.device.extra.DEVICE", bluetoothdevice);
        z.a(intent);
    }

    protected void b(bluetooth.le.external.a a1, int k)
    {
        b(a1.b(), k);
    }

    protected void b(g g1, int k)
    {
        b(g1.h(), k);
    }

    protected void c()
    {
        z.a(new Intent("com.fitbit.bluetooth.galileo.ACTION_PROFILE_CONNECTED"));
    }

    protected void c(BluetoothDevice bluetoothdevice)
    {
        Intent intent = new Intent("com.fitbit.bluetooth.galileo.ACTION_SERVICES_DISCOVERED");
        intent.putExtra("android.bluetooth.device.extra.DEVICE", bluetoothdevice);
        z.a(intent);
    }

    protected void d()
    {
        z.a(new Intent("com.fitbit.bluetooth.galileo.ACTION_PROFILE_DISCONNECTED"));
    }

    public boolean hasLiveDataService(BluetoothDevice bluetoothdevice)
    {
        boolean flag1 = false;
        this;
        JVM INSTR monitorenter ;
        bluetoothdevice = f(bluetoothdevice);
        com.fitbit.e.a.a("BroadcomGalileoProfile", "LiveDataService = %s", new Object[] {
            bluetoothdevice
        });
        if (bluetoothdevice != null) goto _L2; else goto _L1
_L1:
        boolean flag = flag1;
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        bluetoothdevice = bluetoothdevice.a(s);
        com.fitbit.e.a.a("BroadcomGalileoProfile", "LiveDataCharacteristic = %s", new Object[] {
            bluetoothdevice
        });
        flag = flag1;
        if (bluetoothdevice == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        bluetoothdevice = bluetoothdevice.a(j.l);
        com.fitbit.e.a.a("BroadcomGalileoProfile", "LiveDataDescriptor = %s", new Object[] {
            bluetoothdevice
        });
        flag = flag1;
        if (bluetoothdevice != null)
        {
            flag = true;
        }
        if (true) goto _L4; else goto _L3
_L3:
        bluetoothdevice;
        throw bluetoothdevice;
    }

    public boolean hasStatusCharacteristic(BluetoothDevice bluetoothdevice)
    {
        for (bluetoothdevice = e(bluetoothdevice); bluetoothdevice == null || bluetoothdevice.a(p) == null;)
        {
            return false;
        }

        return true;
    }

    public boolean isDncsSupported(BluetoothDevice bluetoothdevice)
    {
        return g(bluetoothdevice) != null;
    }

    public void makeCleanupAfterUnconfirmedDisconnect()
    {
        com.fitbit.e.a.a("BroadcomGalileoProfile", "makeCleanupAfterUnconfirmedDisconnect", new Object[0]);
        b_ = null;
        g();
    }

    public boolean readSecureCharacteristic(BluetoothDevice bluetoothdevice)
    {
        com.fitbit.e.a.a("BroadcomGalileoProfile", "Read secure characteristic on device %s", new Object[] {
            bluetoothdevice
        });
        bluetoothdevice = g(bluetoothdevice);
        if (bluetoothdevice == null)
        {
            com.fitbit.e.a.a("BroadcomGalileoProfile", "Unable to read secure characteristic: Secure Characteristic is null.", new Object[0]);
            return false;
        } else
        {
            return b_.b(bluetoothdevice);
        }
    }

    public boolean readStatusCharacteristic(BluetoothDevice bluetoothdevice)
    {
        s s1 = e(bluetoothdevice);
        if (s1 == null)
        {
            com.fitbit.e.a.a("BroadcomGalileoProfile", "Unable to read status: Unable to find FitbitService.", new Object[0]);
            return false;
        } else
        {
            return a(bluetoothdevice, s1.a(p));
        }
    }

    public boolean setFitbitNotificationsEnabled(BluetoothDevice bluetoothdevice, boolean flag)
    {
        boolean flag1 = false;
        this;
        JVM INSTR monitorenter ;
        s s1 = e(bluetoothdevice);
        if (s1 != null) goto _L2; else goto _L1
_L1:
        com.fitbit.e.a.a("BroadcomGalileoProfile", "Unable to configure Fitbit notifications: Unable to find FitbitService.", new Object[0]);
        flag = flag1;
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        flag = a(bluetoothdevice, s1, s1.a(n), flag);
        if (true) goto _L4; else goto _L3
_L3:
        bluetoothdevice;
        throw bluetoothdevice;
    }

    public void setListener(com.fitbit.bluetooth.galileo.GalileoProfile.GalileoProfileListener galileoprofilelistener)
    {
        this;
        JVM INSTR monitorenter ;
        u = galileoprofilelistener;
        this;
        JVM INSTR monitorexit ;
        return;
        galileoprofilelistener;
        throw galileoprofilelistener;
    }

    public boolean setLiveDataNotificationsEnabled(BluetoothDevice bluetoothdevice, boolean flag)
    {
        boolean flag1 = false;
        this;
        JVM INSTR monitorenter ;
        s s1 = f(bluetoothdevice);
        if (s1 != null) goto _L2; else goto _L1
_L1:
        com.fitbit.e.a.a("BroadcomGalileoProfile", "Unable to configure LiveData notifications: Unable to find LiveDataService.", new Object[0]);
        flag = flag1;
        if (!com.fitbit.bluetooth.galileo.c.a(bluetoothdevice))
        {
            break MISSING_BLOCK_LABEL_50;
        }
        BluetoothErrorsHandler.a().a(com.fitbit.bluetooth.BluetoothErrorsHandler.BluetoothError.c, bluetoothdevice);
        flag = flag1;
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        flag = a(bluetoothdevice, s1, s1.a(s), flag);
        if (true) goto _L4; else goto _L3
_L3:
        bluetoothdevice;
        throw bluetoothdevice;
    }

    public boolean writeValue(BluetoothDevice bluetoothdevice, byte abyte0[])
    {
        boolean flag = false;
        this;
        JVM INSTR monitorenter ;
        s s1;
        com.fitbit.e.a.a("BroadcomGalileoProfile", "Write value: %s", new Object[] {
            com.fitbit.galileo.a.c.a(abyte0)
        });
        s1 = e(bluetoothdevice);
        if (s1 != null) goto _L2; else goto _L1
_L1:
        com.fitbit.e.a.a("BroadcomGalileoProfile", "Unable to write value: Fitbit Service is null.", new Object[0]);
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        flag = a(bluetoothdevice, s1.a(o), abyte0);
        if (true) goto _L4; else goto _L3
_L3:
        bluetoothdevice;
        throw bluetoothdevice;
    }
}
