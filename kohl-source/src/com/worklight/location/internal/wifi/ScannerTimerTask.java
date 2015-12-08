// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.internal.wifi;

import com.worklight.location.api.wifi.WLWifiError;
import com.worklight.location.api.wifi.WLWifiFailureCallback;
import java.util.TimerTask;

// Referenced classes of package com.worklight.location.internal.wifi:
//            WifiException, WifiScanner, IWifiScannerReceiver

final class ScannerTimerTask extends TimerTask
{

    private final WLWifiFailureCallback failure;
    private final IWifiScannerReceiver receiver;
    private final WifiScanner scanner;

    ScannerTimerTask(WifiScanner wifiscanner, WLWifiFailureCallback wlwififailurecallback, IWifiScannerReceiver iwifiscannerreceiver)
    {
        failure = wlwififailurecallback;
        receiver = iwifiscannerreceiver;
        scanner = wifiscanner;
    }

    public void run()
    {
        scanner.scan(receiver);
_L1:
        return;
        WifiException wifiexception;
        wifiexception;
        if (failure != null)
        {
            failure.execute(new WLWifiError(wifiexception.getErrorCode(), wifiexception.getMessage()));
            return;
        }
          goto _L1
    }
}
