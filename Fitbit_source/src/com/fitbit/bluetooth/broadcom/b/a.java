// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.bluetooth.broadcom.b;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGattServer;
import android.content.Intent;
import com.fitbit.FitBitApplication;
import com.fitbit.analytics.google.ga.AnalyticsContainer;
import com.fitbit.analytics.google.ga.d;
import com.fitbit.bluetooth.b.b;
import com.fitbit.bluetooth.broadcom.gatt.j;
import com.fitbit.bluetooth.broadcom.gatt.q;
import com.fitbit.bluetooth.broadcom.gatt.s;
import com.fitbit.bluetooth.g;
import com.fitbit.dncs.Notification;
import com.fitbit.dncs.domain.EventID;
import com.fitbit.galileo.a.c;
import com.fitbit.util.z;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

// Referenced classes of package com.fitbit.bluetooth.broadcom.b:
//            b, d, c, f, 
//            g

public final class a extends q
    implements b
{

    private static final String l = "BroadcomNotificationCenterProfile";

    public a()
    {
    }

    protected void a()
    {
        com.fitbit.e.a.a("BroadcomNotificationCenterProfile", "onAppRegistered.", new Object[0]);
    }

    protected void a(BluetoothDevice bluetoothdevice)
    {
        com.fitbit.e.a.a("BroadcomNotificationCenterProfile", "onDeviceConnected.", new Object[0]);
        Intent intent = new Intent("com.fitbit.bluetooth.dncs.ACTION_DEVICE_CONNECTED");
        intent.putExtra("android.bluetooth.device.extra.DEVICE", bluetoothdevice);
        z.a(intent);
    }

    protected void a(BluetoothDevice bluetoothdevice, int i, com.fitbit.bluetooth.broadcom.gatt.g g1, boolean flag, boolean flag1, int k, byte abyte0[])
    {
        com.fitbit.e.a.a("BroadcomNotificationCenterProfile", "onCharacteristicWriteRequest: requestId(%s) characteristic(%s) preparedWrite(%s) responseNeeded(%s) offset(%s) value(%s)", new Object[] {
            Integer.valueOf(i), g1, Boolean.valueOf(flag), Boolean.valueOf(flag1), Integer.valueOf(k), abyte0
        });
        if (!g.g())
        {
            com.fitbit.e.a.a("BroadcomNotificationCenterProfile", "Unable to process characteristic write request: Bluetooth is turned off.", new Object[0]);
            return;
        }
        if (a_ == null)
        {
            com.fitbit.e.a.a("BroadcomNotificationCenterProfile", "Unable to process characteristic write request: bluetoothGattServer is null.", new Object[0]);
            return;
        }
        if (g1 == null || bluetoothdevice == null)
        {
            com.fitbit.e.a.a("BroadcomNotificationCenterProfile", "Unable to process characteristic write request: characteristic or device is null.", new Object[0]);
            return;
        }
        if (!b.a.equals(g1.c()))
        {
            com.fitbit.e.a.a("BroadcomNotificationCenterProfile", "Unable to process characteristic write request: unknown characteristic.", new Object[0]);
            return;
        }
        g1 = g1.b();
        if (g1 == null)
        {
            com.fitbit.e.a.a("BroadcomNotificationCenterProfile", "Unable to process characteristic write request: service is null.", new Object[0]);
            return;
        }
        g1 = g1.a(d.a);
        if (g1 == null)
        {
            com.fitbit.e.a.a("BroadcomNotificationCenterProfile", "Unable to process characteristic write request: dataSourceCaharactristic is null.", new Object[0]);
            return;
        }
        if (flag1 && !a_.sendResponse(bluetoothdevice, i, com.fitbit.bluetooth.broadcom.gatt.b.g, k, abyte0))
        {
            com.fitbit.e.a.a("BroadcomNotificationCenterProfile", "Unable to send response.", new Object[0]);
        }
        abyte0 = com.fitbit.bluetooth.broadcom.b.b.a(abyte0);
        Iterator iterator = com.fitbit.bluetooth.broadcom.b.c.a(abyte0.G_()).iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            byte abyte1[] = (byte[])iterator.next();
            g1.b(abyte1);
            com.fitbit.e.a.a("BroadcomNotificationCenterProfile", "Notify characteristic changed: value = %s", new Object[] {
                com.fitbit.galileo.a.c.a(abyte1)
            });
            if (!a_.notifyCharacteristicChanged(bluetoothdevice, g1.a(), false))
            {
                com.fitbit.e.a.a("BroadcomNotificationCenterProfile", "Unable to notify characteristic.", new Object[0]);
            }
        } while (true);
        abyte0.H_();
    }

    protected void a(BluetoothDevice bluetoothdevice, int i, j j1, boolean flag, boolean flag1, int k, byte abyte0[])
    {
        com.fitbit.e.a.a("BroadcomNotificationCenterProfile", "onDescriptorWriteRequest: requestId(%s) descriptor(%s) preparedWrite(%s) responseNeeded(%s) offset(%s) value(%s)", new Object[] {
            Integer.valueOf(i), j1, Boolean.valueOf(flag), Boolean.valueOf(flag1), Integer.valueOf(k), abyte0
        });
        if (!g.g())
        {
            com.fitbit.e.a.a("BroadcomNotificationCenterProfile", "Unable to process descriptor write request: Bluetooth is turned off.", new Object[0]);
        } else
        {
            if (a_ == null)
            {
                com.fitbit.e.a.a("BroadcomNotificationCenterProfile", "Unable to process descriptor write request: bluetoothGattServer is null.", new Object[0]);
                return;
            }
            if (j1 == null || bluetoothdevice == null)
            {
                com.fitbit.e.a.a("BroadcomNotificationCenterProfile", "Unable to process descriptor write request: descriptor or device is null.", new Object[0]);
                return;
            }
            j1.a(abyte0);
            if (flag1)
            {
                try
                {
                    if (!a_.sendResponse(bluetoothdevice, i, com.fitbit.bluetooth.broadcom.gatt.b.g, k, abyte0))
                    {
                        com.fitbit.e.a.a("BroadcomNotificationCenterProfile", "Unable to send response.", new Object[0]);
                    }
                }
                // Misplaced declaration of an exception variable
                catch (j j1)
                {
                    FitBitApplication.a().c().a(0x7f11000b).b("google_bt_crash");
                    com.fitbit.e.a.e("BroadcomNotificationCenterProfile", "Unable to send response.", j1, new Object[0]);
                }
            }
            if (c(bluetoothdevice))
            {
                j1 = new Intent("com.fitbit.bluetooth.dncs.ACTION_DEVICE_SUBSCRIBED");
                j1.putExtra("android.bluetooth.device.extra.DEVICE", bluetoothdevice);
                z.a(j1);
                return;
            }
        }
    }

    public boolean a(BluetoothDevice bluetoothdevice, Notification notification, EventID eventid, byte byte0)
    {
        com.fitbit.e.a.a("BroadcomNotificationCenterProfile", "sendNotification: notification(%s) eventId(%s) categoryCount(%s)", new Object[] {
            notification, eventid, Byte.valueOf(byte0)
        });
        if (!g.g())
        {
            com.fitbit.e.a.a("BroadcomNotificationCenterProfile", "Unable to send notification: Bluetooth is turned off.", new Object[0]);
            return false;
        }
        if (a_ == null)
        {
            com.fitbit.e.a.a("BroadcomNotificationCenterProfile", "Unable to send notification: bluetoothGattServer is null.", new Object[0]);
            return false;
        }
        Object obj = new s(a_.getService(f.a));
        if (obj == null)
        {
            com.fitbit.e.a.a("BroadcomNotificationCenterProfile", "Unable to send notification: service is null.", new Object[0]);
            return false;
        }
        obj = ((s) (obj)).a(g.a);
        if (obj == null)
        {
            com.fitbit.e.a.a("BroadcomNotificationCenterProfile", "Unable to send notification: notification source characteristic is null.", new Object[0]);
            return false;
        } else
        {
            ((com.fitbit.bluetooth.broadcom.gatt.g) (obj)).b(com.fitbit.dncs.a.j.a(notification, eventid, byte0));
            return a_.notifyCharacteristicChanged(bluetoothdevice, ((com.fitbit.bluetooth.broadcom.gatt.g) (obj)).a(), false);
        }
    }

    protected void b()
    {
        com.fitbit.e.a.a("BroadcomNotificationCenterProfile", "onAppUnregistered.", new Object[0]);
    }

    protected void b(BluetoothDevice bluetoothdevice)
    {
        com.fitbit.e.a.a("BroadcomNotificationCenterProfile", "onDeviceDisconnected.", new Object[0]);
        Intent intent = new Intent("com.fitbit.bluetooth.dncs.ACTION_DEVICE_DISCONNECTED");
        intent.putExtra("android.bluetooth.device.extra.DEVICE", bluetoothdevice);
        z.a(intent);
    }

    public boolean c(BluetoothDevice bluetoothdevice)
    {
        com.fitbit.e.a.a("BroadcomNotificationCenterProfile", "subscribedToNotifications.", new Object[0]);
        if (a_ != null)
        {
            Object obj = new s(a_.getService(f.a));
            if (obj == null)
            {
                com.fitbit.e.a.a("BroadcomNotificationCenterProfile", "Unable to subscribedToNotifications: notificationsService is null.", new Object[0]);
                return false;
            }
            bluetoothdevice = ((s) (obj)).a(d.a);
            if (bluetoothdevice == null)
            {
                com.fitbit.e.a.a("BroadcomNotificationCenterProfile", "Unable to subscribedToNotifications: dataSourceCharacteristic is null.", new Object[0]);
                return false;
            }
            bluetoothdevice = bluetoothdevice.a(j.l);
            if (bluetoothdevice == null)
            {
                com.fitbit.e.a.a("BroadcomNotificationCenterProfile", "Unable to subscribedToNotifications: dataSourceDescriptor is null.", new Object[0]);
                return false;
            }
            obj = ((s) (obj)).a(g.a);
            if (obj == null)
            {
                com.fitbit.e.a.a("BroadcomNotificationCenterProfile", "Unable to subscribedToNotifications: notificationSourceCharacteristic is null.", new Object[0]);
                return false;
            }
            obj = ((com.fitbit.bluetooth.broadcom.gatt.g) (obj)).a(j.l);
            if (obj == null)
            {
                com.fitbit.e.a.a("BroadcomNotificationCenterProfile", "Unable to subscribedToNotifications: notificationSourceDescriptor is null.", new Object[0]);
                return false;
            }
            boolean flag = Arrays.equals(bluetoothdevice.b(), j.a);
            boolean flag1 = Arrays.equals(((j) (obj)).b(), j.a);
            if (flag && flag1)
            {
                return true;
            }
        }
        return false;
    }

    public boolean connectProfile()
    {
        com.fitbit.e.a.a("BroadcomNotificationCenterProfile", "connectProfile.", new Object[0]);
        return false;
    }

    public boolean unregisterApplication()
    {
        com.fitbit.e.a.a("BroadcomNotificationCenterProfile", "unregisterApplication.", new Object[0]);
        return false;
    }
}
