// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bluetooth.le.a;

import android.os.Looper;
import bluetooth.le.BluetoothLeScanCallbacks;
import bluetooth.le.b;
import bluetooth.le.external.ScanSettings;
import java.util.List;

public class d extends b
{

    public d(BluetoothLeScanCallbacks bluetoothlescancallbacks)
    {
        super(bluetoothlescancallbacks, null, Looper.getMainLooper());
    }

    public void a()
    {
        a.B_();
    }

    public void a(List list, ScanSettings scansettings)
    {
        a.A_();
        a.a(bluetooth.le.BluetoothLeScanCallbacks.ScanError.c);
        a.B_();
    }

    public void b(List list, ScanSettings scansettings)
    {
        a.A_();
        a.a(bluetooth.le.BluetoothLeScanCallbacks.ScanError.c);
        a.B_();
    }

    protected void d(List list, ScanSettings scansettings)
    {
        a.a(bluetooth.le.BluetoothLeScanCallbacks.ScanError.c);
        a.B_();
    }
}
