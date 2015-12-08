// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.internal.wifi.nativeImpl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import com.worklight.location.internal.wifi.IWifiScannerReceiver;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.worklight.location.internal.wifi.nativeImpl:
//            AndroidWifiScanner

class val.r extends BroadcastReceiver
{

    final AndroidWifiScanner this$0;
    final IWifiScannerReceiver val$r;

    public void onReceive(Context context, Intent intent)
    {
        context.unregisterReceiver(this);
        context = AndroidWifiScanner.access$000(AndroidWifiScanner.this).getScanResults();
        long l1 = System.currentTimeMillis();
        long l = l1;
        try
        {
            if (!context.isEmpty())
            {
                l = ((ScanResult)context.iterator().next()).timestamp;
            }
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            l = l1;
        }
        val$r.onScanResults(AndroidWifiScanner.access$100(AndroidWifiScanner.this, context), l);
    }

    ()
    {
        this$0 = final_androidwifiscanner;
        val$r = IWifiScannerReceiver.this;
        super();
    }
}
