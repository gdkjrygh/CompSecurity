// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bluetooth.le.a.a;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.os.Looper;
import bluetooth.BluetoothAddress;
import bluetooth.le.BluetoothLeScanCallbacks;
import bluetooth.le.external.ScanFilter;
import bluetooth.le.external.ScanResult;
import bluetooth.le.external.ScanSettings;
import bluetooth.le.external.e;
import com.fitbit.f.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class b extends bluetooth.le.b
{
    private static class a extends ScanCallback
        implements BluetoothLeScanCallbacks
    {

        private final BluetoothLeScanCallbacks a;

        private static ScanResult a(android.bluetooth.le.ScanResult scanresult)
        {
            return new ScanResult(scanresult.getDevice(), e.a(scanresult.getScanRecord()), scanresult.getRssi(), scanresult.getTimestampNanos());
        }

        public void A_()
        {
            com.fitbit.f.a.a("LollipopScanner", "onScanStarted.");
            a.A_();
        }

        public void B_()
        {
            com.fitbit.f.a.a("LollipopScanner", "onScanEnded.");
            a.B_();
        }

        public void a(bluetooth.le.BluetoothLeScanCallbacks.ScanError scanerror)
        {
            com.fitbit.f.a.e("LollipopScanner", (new StringBuilder()).append("onError: ").append(scanerror).toString());
            a.a(scanerror);
        }

        public void a(List list)
        {
            com.fitbit.f.a.c("LollipopScanner", "onResults.");
            a.a(list);
        }

        public void onBatchScanResults(List list)
        {
            ArrayList arraylist = new ArrayList();
            list = list.iterator();
            do
            {
                if (!list.hasNext())
                {
                    break;
                }
                ScanResult scanresult = a((android.bluetooth.le.ScanResult)list.next());
                if (scanresult.e())
                {
                    arraylist.add(scanresult);
                }
            } while (true);
            com.fitbit.f.a.c("LollipopScanner", (new StringBuilder()).append("onBatchScanResults result: ").append(arraylist).toString());
            a.a(arraylist);
            a.B_();
        }

        public void onScanFailed(int i)
        {
            com.fitbit.f.a.e("LollipopScanner", (new StringBuilder()).append("onScanFailed: ").append(i).toString());
            i;
            JVM INSTR tableswitch 1 4: default 56
        //                       1 66
        //                       2 81
        //                       3 111
        //                       4 96;
               goto _L1 _L2 _L3 _L4 _L5
_L1:
            a.B_();
            return;
_L2:
            a.a(bluetooth.le.BluetoothLeScanCallbacks.ScanError.a);
            continue; /* Loop/switch isn't completed */
_L3:
            a.a(bluetooth.le.BluetoothLeScanCallbacks.ScanError.b);
            continue; /* Loop/switch isn't completed */
_L5:
            a.a(bluetooth.le.BluetoothLeScanCallbacks.ScanError.c);
            continue; /* Loop/switch isn't completed */
_L4:
            a.a(bluetooth.le.BluetoothLeScanCallbacks.ScanError.d);
            if (true) goto _L1; else goto _L6
_L6:
        }

        public void onScanResult(int i, android.bluetooth.le.ScanResult scanresult)
        {
            com.fitbit.f.a.c("LollipopScanner", (new StringBuilder()).append("onScanResult result: ").append(scanresult).toString());
            scanresult = a(scanresult);
            if (!scanresult.e())
            {
                return;
            } else
            {
                a.a(Collections.singletonList(scanresult));
                return;
            }
        }

        public a(BluetoothLeScanCallbacks bluetoothlescancallbacks)
        {
            a = bluetoothlescancallbacks;
        }
    }


    private static final String b = "LollipopScanner";
    private final BluetoothAdapter c;
    private final a d;

    public b(BluetoothLeScanCallbacks bluetoothlescancallbacks, BluetoothAdapter bluetoothadapter, bluetooth.le.a.a a1, Looper looper)
    {
        super(bluetoothlescancallbacks, a1, looper);
        c = bluetoothadapter;
        d = new a(bluetoothlescancallbacks);
    }

    private static android.bluetooth.le.ScanSettings a(ScanSettings scansettings)
    {
        return (new android.bluetooth.le.ScanSettings.Builder()).setReportDelay(scansettings.e()).setScanMode(scansettings.a()).build();
    }

    private static bluetooth.le.external.ScanFilter.a a(BluetoothAddress bluetoothaddress)
    {
        bluetooth.le.external.ScanFilter.a a1 = new bluetooth.le.external.ScanFilter.a();
        a1.b(bluetoothaddress.a());
        return a1;
    }

    private static List a(List list)
    {
        ArrayList arraylist = new ArrayList();
        android.bluetooth.le.ScanFilter.Builder builder;
        for (list = list.iterator(); list.hasNext(); arraylist.add(builder.build()))
        {
            ScanFilter scanfilter = (ScanFilter)list.next();
            builder = (new android.bluetooth.le.ScanFilter.Builder()).setDeviceAddress(scanfilter.d()).setDeviceName(scanfilter.a()).setManufacturerData(scanfilter.h(), scanfilter.i(), scanfilter.j()).setServiceUuid(scanfilter.b(), scanfilter.c());
            if (scanfilter.g() != null)
            {
                builder.setServiceData(scanfilter.g(), scanfilter.e(), scanfilter.f());
            }
        }

        return arraylist;
    }

    public void a()
    {
        b();
        BluetoothLeScanner bluetoothlescanner = c.getBluetoothLeScanner();
        if (bluetoothlescanner == null)
        {
            com.fitbit.f.a.e("LollipopScanner", (new StringBuilder()).append("startScanForDevices failed, scanner not found! BT enabled: ").append(c.isEnabled()).toString());
            if (!c.isEnabled())
            {
                d.a(bluetooth.le.BluetoothLeScanCallbacks.ScanError.b);
            } else
            {
                d.a(bluetooth.le.BluetoothLeScanCallbacks.ScanError.d);
            }
            d.B_();
            return;
        }
        com.fitbit.f.a.c("LollipopScanner", String.format("Calling %s.stopScan(%s)", new Object[] {
            bluetoothlescanner, d
        }));
        if (c.isEnabled())
        {
            bluetoothlescanner.stopScan(d);
        } else
        {
            d.a(bluetooth.le.BluetoothLeScanCallbacks.ScanError.b);
        }
        d.B_();
    }

    public void a(List list, ScanSettings scansettings)
    {
        d.A_();
        a(list, ((bluetooth.le.a.a.a) (new bluetooth.le.c(this, list, scansettings, d))), scansettings);
    }

    protected void d(List list, ScanSettings scansettings)
    {
        BluetoothLeScanner bluetoothlescanner = c.getBluetoothLeScanner();
        if (bluetoothlescanner == null)
        {
            com.fitbit.f.a.e("LollipopScanner", (new StringBuilder()).append("startScanForDevices failed, scanner not found! BT enabled: ").append(c.isEnabled()).toString());
            if (!c.isEnabled())
            {
                d.a(bluetooth.le.BluetoothLeScanCallbacks.ScanError.b);
            } else
            {
                d.a(bluetooth.le.BluetoothLeScanCallbacks.ScanError.d);
            }
            d.B_();
        } else
        {
            com.fitbit.f.a.c("LollipopScanner", String.format("Calling %s.startScan(%s)", new Object[] {
                bluetoothlescanner, d
            }));
            if (c.isEnabled())
            {
                bluetoothlescanner.startScan(a(list), a(scansettings), d);
                if (scansettings.d() > 0L)
                {
                    a(scansettings.d());
                    return;
                }
            } else
            {
                d.a(bluetooth.le.BluetoothLeScanCallbacks.ScanError.b);
                d.B_();
                return;
            }
        }
    }
}
