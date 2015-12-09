// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bluetooth.le.a;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattService;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelUuid;
import android.os.SystemClock;
import android.util.Log;
import bluetooth.le.external.ScanFilter;
import bluetooth.le.external.ScanResult;
import bluetooth.le.external.ScanSettings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

// Referenced classes of package bluetooth.le.a:
//            b

public class bluetooth.le.a.a extends bluetooth.le.a.b
{
    public static interface a
    {

        public abstract void a(List list);
    }

    private static final class b
        implements Runnable
    {

        final bluetooth.le.a.a a;

        public void run()
        {
            com.fitbit.f.a.e("ConnectedDevicesScanner", "Scan timeout!");
            a.b();
        }

        public b(bluetooth.le.a.a a1)
        {
            a = a1;
        }
    }


    private static final String a = "ConnectedDevicesScanner";
    private final BluetoothManager c;
    private final Context d;
    private a e;
    private List f;
    private List g;
    private List h;
    private ScanSettings i;
    private boolean j;
    private BluetoothGatt k;
    private Runnable l;

    public bluetooth.le.a.a(Context context, BluetoothManager bluetoothmanager, Looper looper)
    {
        super(looper);
        l = new Runnable() {

            final bluetooth.le.a.a a;

            public void run()
            {
                bluetooth.le.a.a.a(a);
            }

            
            {
                a = bluetooth.le.a.a.this;
                super();
            }
        };
        d = context.getApplicationContext();
        c = bluetoothmanager;
    }

    private void a(long l1)
    {
        b.removeCallbacksAndMessages(null);
        b.postDelayed(new b(this), l1);
    }

    static void a(bluetooth.le.a.a a1)
    {
        a1.e();
    }

    private static boolean a(ParcelUuid parceluuid, ParcelUuid parceluuid1, List list)
    {
        if (parceluuid == null)
        {
            return true;
        }
        if (list == null)
        {
            return false;
        }
        for (Iterator iterator = list.iterator(); iterator.hasNext();)
        {
            BluetoothGattService bluetoothgattservice = (BluetoothGattService)iterator.next();
            if (parceluuid1 == null)
            {
                list = null;
            } else
            {
                list = parceluuid1.getUuid();
            }
            if (a(parceluuid.getUuid(), ((UUID) (list)), bluetoothgattservice.getUuid()))
            {
                return true;
            }
        }

        return false;
    }

    private static boolean a(UUID uuid, UUID uuid1, UUID uuid2)
    {
        boolean flag1 = false;
        boolean flag;
        if (uuid1 == null)
        {
            flag = uuid.equals(uuid2);
        } else
        {
            flag = flag1;
            if ((uuid.getLeastSignificantBits() & uuid1.getLeastSignificantBits()) == (uuid2.getLeastSignificantBits() & uuid1.getLeastSignificantBits()))
            {
                flag = flag1;
                if ((uuid.getMostSignificantBits() & uuid1.getMostSignificantBits()) == (uuid2.getMostSignificantBits() & uuid1.getMostSignificantBits()))
                {
                    return true;
                }
            }
        }
        return flag;
    }

    private void c()
    {
        b.removeCallbacksAndMessages(null);
    }

    private boolean c(BluetoothGatt bluetoothgatt)
    {
        return !bluetoothgatt.getServices().isEmpty();
    }

    private void d()
    {
        Iterator iterator = f.iterator();
_L4:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        BluetoothDevice bluetoothdevice = (BluetoothDevice)iterator.next();
        if (g.isEmpty()) goto _L4; else goto _L3
_L3:
        boolean flag;
        boolean flag1;
        Iterator iterator1 = g.iterator();
        flag = false;
        flag1 = false;
        do
        {
            if (!iterator1.hasNext())
            {
                break;
            }
            ScanFilter scanfilter = (ScanFilter)iterator1.next();
            if (scanfilter.d() != null)
            {
                flag1 = true;
            }
            if (scanfilter.a() != null)
            {
                flag = true;
            }
        } while (true);
        if (!flag1 && !flag) goto _L4; else goto _L5
_L5:
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_261;
        }
        Iterator iterator2 = g.iterator();
        ScanFilter scanfilter1;
        do
        {
            if (!iterator2.hasNext())
            {
                break MISSING_BLOCK_LABEL_261;
            }
            scanfilter1 = (ScanFilter)iterator2.next();
        } while (scanfilter1.d() == null || !scanfilter1.d().equals(bluetoothdevice.getAddress()));
        flag1 = true;
_L12:
        if (!flag || flag1) goto _L7; else goto _L6
_L6:
        Iterator iterator3 = g.iterator();
_L10:
        if (!iterator3.hasNext()) goto _L7; else goto _L8
_L8:
        ScanFilter scanfilter2 = (ScanFilter)iterator3.next();
        if (scanfilter2.a() == null || !scanfilter2.a().equals(bluetoothdevice.getName())) goto _L10; else goto _L9
_L9:
        flag = true;
_L11:
        if (!flag)
        {
            iterator.remove();
        }
          goto _L4
_L2:
        return;
_L7:
        flag = flag1;
          goto _L11
        flag1 = false;
          goto _L12
    }

    private void d(BluetoothGatt bluetoothgatt)
    {
        try
        {
            bluetoothgatt.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (BluetoothGatt bluetoothgatt)
        {
            com.fitbit.f.a.e("ConnectedDevicesScanner", (new StringBuilder()).append("gatt.close failed! ").append(Log.getStackTraceString(bluetoothgatt)).toString());
        }
    }

    private void e()
    {
        c();
        if (f.isEmpty()) goto _L2; else goto _L1
_L1:
        BluetoothDevice bluetoothdevice = (BluetoothDevice)f.remove(0);
        com.fitbit.f.a.c("ConnectedDevicesScanner", String.format("Calling connectGatt.", new Object[0]));
        if (i.d() > 0L)
        {
            a(i.d());
        }
        k = bluetoothdevice.connectGatt(d, false, this);
        if (k != null) goto _L4; else goto _L3
_L3:
        com.fitbit.f.a.e("ConnectedDevicesScanner", "DiscoverServices remote exception!");
        b.post(l);
_L6:
        return;
_L4:
        if (c(k))
        {
            b(k);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (j)
        {
            b();
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void a(BluetoothGatt bluetoothgatt, int i1)
    {
        com.fitbit.f.a.c("ConnectedDevicesScanner", (new StringBuilder()).append("onConnectionStateChange state: ").append(i1).toString());
        if (i1 == 2)
        {
            if (!c(bluetoothgatt))
            {
                if (!bluetoothgatt.discoverServices())
                {
                    d(bluetoothgatt);
                    e();
                }
                return;
            } else
            {
                b(bluetoothgatt);
                return;
            }
        } else
        {
            d(bluetoothgatt);
            e();
            return;
        }
    }

    public void a(List list, a a1, ScanSettings scansettings)
    {
        com.fitbit.f.a.c("ConnectedDevicesScanner", String.format("Calling scan(%s).", new Object[] {
            a1
        }));
        j = true;
        h = new ArrayList();
        g = list;
        f = Collections.emptyList();
        e = a1;
        i = scansettings;
        f = c.getConnectedDevices(7);
        d();
        e();
    }

    public boolean a()
    {
        return j;
    }

    public void b()
    {
        if (k != null)
        {
            d(k);
        }
        j = false;
        e.a(h);
    }

    public void b(BluetoothGatt bluetoothgatt)
    {
        boolean flag1;
        boolean flag2;
        flag2 = true;
        com.fitbit.f.a.c("ConnectedDevicesScanner", "onServicesDiscovered.");
        flag1 = flag2;
        if (g.isEmpty()) goto _L2; else goto _L1
_L1:
        boolean flag;
        Iterator iterator = g.iterator();
        flag = false;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            if (((ScanFilter)iterator.next()).b() != null)
            {
                flag = true;
            }
        } while (true);
        flag1 = flag2;
        if (!flag) goto _L2; else goto _L3
_L3:
        Iterator iterator1 = g.iterator();
_L7:
        if (!iterator1.hasNext()) goto _L5; else goto _L4
_L4:
        ScanFilter scanfilter = (ScanFilter)iterator1.next();
        if (scanfilter.b() == null || !a(scanfilter.b(), scanfilter.c(), bluetoothgatt.getServices())) goto _L7; else goto _L6
_L6:
        flag1 = flag2;
_L2:
        if (!flag1 || !bluetoothgatt.readRemoteRssi())
        {
            d(bluetoothgatt);
            e();
        }
        return;
_L5:
        flag1 = false;
        if (true) goto _L2; else goto _L8
_L8:
    }

    public void b(BluetoothGatt bluetoothgatt, int i1)
    {
        com.fitbit.f.a.e("ConnectedDevicesScanner", (new StringBuilder()).append("onConnectionStateChangedInError: ").append(i1).toString());
        d(bluetoothgatt);
        e();
    }

    public void c(BluetoothGatt bluetoothgatt, int i1)
    {
    }

    public void d(BluetoothGatt bluetoothgatt, int i1)
    {
        com.fitbit.f.a.e("ConnectedDevicesScanner", (new StringBuilder()).append("onServicesDiscoveredFailed: ").append(i1).toString());
        d(bluetoothgatt);
        e();
    }

    public void g(b.a a1)
    {
        com.fitbit.f.a.c("ConnectedDevicesScanner", "onRssiRead.");
        h.add(new ScanResult(a1.a.getDevice(), null, ((Integer)a1.b).intValue(), SystemClock.elapsedRealtimeNanos()));
        d(a1.a);
        e();
    }
}
