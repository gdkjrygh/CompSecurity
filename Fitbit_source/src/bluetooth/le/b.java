// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bluetooth.le;

import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import bluetooth.le.a.a;
import bluetooth.le.a.d;
import bluetooth.le.external.ScanFilter;
import bluetooth.le.external.ScanSettings;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

// Referenced classes of package bluetooth.le:
//            BluetoothLeScanCallbacks

public abstract class bluetooth.le.b
{
    private static final class a
        implements android.os.Handler.Callback, BluetoothLeScanCallbacks
    {

        private final Handler a;
        private final int b = 0;
        private final int c = 1;
        private final int d = 2;
        private final int e = 3;
        private final BluetoothLeScanCallbacks f;

        public void A_()
        {
            com.fitbit.f.a.c("BluetoothLeScanner", "onScanStarted.");
            a.sendMessage(a.obtainMessage(2));
        }

        public void B_()
        {
            com.fitbit.f.a.a("BluetoothLeScanner", "onScanEnded.");
            a.sendMessage(a.obtainMessage(3));
        }

        public void a(BluetoothLeScanCallbacks.ScanError scanerror)
        {
            com.fitbit.f.a.c("BluetoothLeScanner", "onError.");
            a.sendMessage(a.obtainMessage(1, scanerror));
        }

        public void a(List list)
        {
            com.fitbit.f.a.c("BluetoothLeScanner", "onResults.");
            a.sendMessage(a.obtainMessage(0, list));
        }

        public boolean handleMessage(Message message)
        {
            com.fitbit.f.a.c("BluetoothLeScanner", (new StringBuilder()).append("handleMessage: ").append(message.what).toString());
            switch (message.what)
            {
            default:
                return false;

            case 0: // '\0'
                message = ((Message) (message.obj));
                if (message == null)
                {
                    f.a(bluetooth.le.BluetoothLeScanCallbacks.ScanError.d);
                } else
                {
                    f.a((List)message);
                }
                return true;

            case 1: // '\001'
                f.a((BluetoothLeScanCallbacks.ScanError)message.obj);
                return true;

            case 2: // '\002'
                f.A_();
                return true;

            case 3: // '\003'
                f.B_();
                return true;
            }
        }

        public a(Looper looper, BluetoothLeScanCallbacks bluetoothlescancallbacks)
        {
            a = new Handler(looper, this);
            f = bluetoothlescancallbacks;
        }
    }

    private static final class b
        implements Runnable
    {

        final bluetooth.le.b a;

        public void run()
        {
            com.fitbit.f.a.a("BluetoothLeScanner", "Scan timeout!");
            a.a();
        }

        public b(bluetooth.le.b b1)
        {
            a = b1;
        }
    }

    protected static class c
        implements bluetooth.le.a.a.a
    {

        public final bluetooth.le.b a;
        public final List b;
        public final ScanSettings c;
        public final BluetoothLeScanCallbacks d;

        private boolean b(List list)
        {
            if (!b.isEmpty() && !list.isEmpty()) goto _L2; else goto _L1
_L1:
            return false;
_L2:
            TreeSet treeset;
            treeset = new TreeSet();
            Iterator iterator = b.iterator();
label0:
            do
            {
label1:
                {
                    if (!iterator.hasNext())
                    {
                        break label1;
                    }
                    ScanFilter scanfilter = (ScanFilter)iterator.next();
                    if (scanfilter.d() == null || TextUtils.isEmpty(scanfilter.d()))
                    {
                        break label0;
                    }
                    treeset.add(scanfilter.d());
                }
            } while (true);
            if (true) goto _L1; else goto _L3
_L3:
            boolean flag;
            if (treeset.size() == list.size())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            return flag;
        }

        public void a(List list)
        {
            com.fitbit.f.a.c("BluetoothLeScanner", (new StringBuilder()).append("onDevicesScanned count: ").append(list.size()).toString());
            ArrayList arraylist = new ArrayList();
            if (!list.isEmpty())
            {
                d.a(list);
            }
            if (b(arraylist))
            {
                com.fitbit.f.a.c("BluetoothLeScanner", "Connected devices scan finished enough results found");
                d.B_();
                return;
            } else
            {
                com.fitbit.f.a.c("BluetoothLeScanner", "Connected devices scan did not find device");
                a.d(b, c);
                return;
            }
        }

        public c(bluetooth.le.b b1, List list, ScanSettings scansettings, BluetoothLeScanCallbacks bluetoothlescancallbacks)
        {
            a = b1;
            c = scansettings;
            b = list;
            d = bluetoothlescancallbacks;
        }
    }


    private static final String b = "BluetoothLeScanner";
    protected final BluetoothLeScanCallbacks a;
    private final bluetooth.le.a.a c;
    private final Handler d;

    protected bluetooth.le.b(BluetoothLeScanCallbacks bluetoothlescancallbacks, bluetooth.le.a.a a1, Looper looper)
    {
        c = a1;
        a = bluetoothlescancallbacks;
        d = new Handler(looper);
    }

    public static bluetooth.le.b a(Context context, BluetoothLeScanCallbacks bluetoothlescancallbacks)
    {
        return a(context, bluetoothlescancallbacks, Looper.myLooper());
    }

    public static bluetooth.le.b a(Context context, BluetoothLeScanCallbacks bluetoothlescancallbacks, Looper looper)
    {
        bluetoothlescancallbacks = new a(looper, bluetoothlescancallbacks);
        BluetoothManager bluetoothmanager = (BluetoothManager)context.getSystemService("bluetooth");
        android.bluetooth.BluetoothAdapter bluetoothadapter = bluetoothmanager.getAdapter();
        if (bluetoothadapter == null)
        {
            return new d(bluetoothlescancallbacks);
        }
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            return new bluetooth.le.a.a.b(bluetoothlescancallbacks, bluetoothadapter, new bluetooth.le.a.a(context, bluetoothmanager, looper), looper);
        } else
        {
            return new bluetooth.le.a.a.a(bluetoothlescancallbacks, bluetoothadapter, new bluetooth.le.a.a(context, bluetoothmanager, looper), looper);
        }
    }

    public abstract void a();

    protected void a(long l)
    {
        d.removeCallbacksAndMessages(null);
        d.postDelayed(new b(this), l);
    }

    protected void a(List list, bluetooth.le.a.a.a a1, ScanSettings scansettings)
    {
        if (c.a())
        {
            com.fitbit.f.a.e("BluetoothLeScanner", "Scanning for connected devices already started!");
            a.a(bluetooth.le.BluetoothLeScanCallbacks.ScanError.a);
            return;
        } else
        {
            c.a(list, a1, scansettings);
            return;
        }
    }

    public abstract void a(List list, ScanSettings scansettings);

    protected void b()
    {
        d.removeCallbacksAndMessages(null);
    }

    public void b(List list, ScanSettings scansettings)
    {
        a.A_();
        a(list, new bluetooth.le.a.a.a() {

            final bluetooth.le.b a;

            public void a(List list1)
            {
                a.a.a(list1);
                a.a.B_();
            }

            
            {
                a = bluetooth.le.b.this;
                super();
            }
        }, scansettings);
    }

    public void c(List list, ScanSettings scansettings)
    {
        a.A_();
        d(list, scansettings);
    }

    protected abstract void d(List list, ScanSettings scansettings);
}
