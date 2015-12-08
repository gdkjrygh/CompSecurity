// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bluetooth.le.a.a;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.os.Looper;
import bluetooth.le.BluetoothLeScanCallbacks;
import bluetooth.le.b;
import bluetooth.le.external.ScanFilter;
import bluetooth.le.external.ScanResult;
import bluetooth.le.external.ScanSettings;
import bluetooth.le.external.e;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class bluetooth.le.a.a.a extends b
{
    private static class a
        implements android.bluetooth.BluetoothAdapter.LeScanCallback, BluetoothLeScanCallbacks
    {

        private final BluetoothLeScanCallbacks a;
        private final List b;

        public void A_()
        {
            com.fitbit.f.a.c("JellyBeanScanner", "onScanStarted");
            a.A_();
        }

        public void B_()
        {
            com.fitbit.f.a.a("JellyBeanScanner", "onScanEnded");
            a.B_();
        }

        public void a(bluetooth.le.BluetoothLeScanCallbacks.ScanError scanerror)
        {
            com.fitbit.f.a.e("JellyBeanScanner", (new StringBuilder()).append("onError: ").append(scanerror).toString());
            a.a(scanerror);
        }

        public void a(List list)
        {
            com.fitbit.f.a.c("JellyBeanScanner", "onResults.");
            a.a(list);
        }

        public void onLeScan(BluetoothDevice bluetoothdevice, int i, byte abyte0[])
        {
            bluetoothdevice = new ScanResult(bluetoothdevice, bluetooth.le.external.e.a(abyte0), i, System.nanoTime());
            com.fitbit.f.a.c("JellyBeanScanner", (new StringBuilder()).append("onLeScan result: ").append(bluetoothdevice).toString());
            if (bluetoothdevice.e()) goto _L2; else goto _L1
_L1:
            return;
_L2:
            if (b == null || b.isEmpty())
            {
                break MISSING_BLOCK_LABEL_117;
            }
            abyte0 = b.iterator();
_L5:
            if (!abyte0.hasNext()) goto _L1; else goto _L3
_L3:
            if (!((ScanFilter)abyte0.next()).a(bluetoothdevice)) goto _L5; else goto _L4
_L4:
            a.a(Collections.singletonList(bluetoothdevice));
            return;
            a.a(Collections.singletonList(bluetoothdevice));
            return;
        }

        public a(BluetoothLeScanCallbacks bluetoothlescancallbacks, List list)
        {
            a = bluetoothlescancallbacks;
            b = list;
        }
    }


    private static final String b = "JellyBeanScanner";
    private final BluetoothAdapter c;
    private a d;
    private boolean e;

    public bluetooth.le.a.a.a(BluetoothLeScanCallbacks bluetoothlescancallbacks, BluetoothAdapter bluetoothadapter, bluetooth.le.a.a a1, Looper looper)
    {
        super(bluetoothlescancallbacks, a1, looper);
        c = bluetoothadapter;
    }

    public void a()
    {
        b();
        if (e)
        {
            com.fitbit.f.a.c("JellyBeanScanner", String.format("Calling %s.stopScan(%s)", new Object[] {
                c, d
            }));
            e = false;
            try
            {
                c.stopLeScan(d);
            }
            catch (Exception exception)
            {
                com.fitbit.f.a.a("JellyBeanScanner", "stopLeScan failed!", exception);
            }
            d.B_();
        }
    }

    public void a(List list, ScanSettings scansettings)
    {
        d = new a(a, list);
        d.A_();
        a(list, ((bluetooth.le.a.a) (new bluetooth.le.b.c(this, list, scansettings, d))), scansettings);
    }

    protected void d(List list, ScanSettings scansettings)
    {
        com.fitbit.f.a.c("JellyBeanScanner", String.format("Calling %s.startScan(%s)", new Object[] {
            c, d
        }));
        if (e)
        {
            com.fitbit.f.a.e("JellyBeanScanner", "Scanning for devices already started!");
            d.a(bluetooth.le.BluetoothLeScanCallbacks.ScanError.a);
            a();
        } else
        {
            e = true;
            d = new a(a, list);
            if (!c.startLeScan(d))
            {
                com.fitbit.f.a.e("JellyBeanScanner", "startLeScan returned Internal Stack Error");
                d.a(bluetooth.le.BluetoothLeScanCallbacks.ScanError.d);
                a();
                return;
            }
            if (scansettings.d() > 0L)
            {
                a(scansettings.d());
                return;
            }
        }
    }
}
