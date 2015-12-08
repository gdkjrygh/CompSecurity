// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.internal.wifi;

import com.worklight.location.api.wifi.WLWifiAcquisitionPolicy;
import com.worklight.location.api.wifi.WLWifiFailureCallback;
import java.util.List;
import java.util.Timer;

// Referenced classes of package com.worklight.location.internal.wifi:
//            WifiScannerReceiver, ScannerTimerTask, MultiWifiScannerReceiver, WifiScanner, 
//            WifiInternalCallback

public class WifiAcquisitor
{

    private WifiScannerReceiver intervalReceiver;
    private final WifiScanner scanner;
    private Timer timer;

    public WifiAcquisitor(WifiScanner wifiscanner)
    {
        if (wifiscanner == null)
        {
            throw new IllegalArgumentException("scanner is null");
        } else
        {
            scanner = wifiscanner;
            return;
        }
    }

    private static void checkParams(WLWifiAcquisitionPolicy wlwifiacquisitionpolicy)
    {
        if (wlwifiacquisitionpolicy != null)
        {
            if ((wlwifiacquisitionpolicy = wlwifiacquisitionpolicy.getAccessPointFilters()) == null || wlwifiacquisitionpolicy.isEmpty())
            {
                throw new IllegalArgumentException("policy has no access points defined");
            }
        }
    }

    private void scanWifi(WifiInternalCallback wifiinternalcallback, WLWifiFailureCallback wlwififailurecallback, WLWifiAcquisitionPolicy wlwifiacquisitionpolicy)
    {
        timer = new Timer("WifiAcquistion Timer");
        intervalReceiver = new WifiScannerReceiver(wifiinternalcallback, wlwifiacquisitionpolicy);
        timer.schedule(new ScannerTimerTask(scanner, wlwififailurecallback, intervalReceiver), wlwifiacquisitionpolicy.getInterval(), wlwifiacquisitionpolicy.getInterval());
    }

    public void acquireLocation(WifiInternalCallback wifiinternalcallback, WLWifiFailureCallback wlwififailurecallback, WLWifiAcquisitionPolicy wlwifiacquisitionpolicy)
    {
        checkParams(wlwifiacquisitionpolicy);
        wifiinternalcallback = new WifiScannerReceiver(wifiinternalcallback, wlwifiacquisitionpolicy);
        if (intervalReceiver != null)
        {
            wifiinternalcallback = new MultiWifiScannerReceiver(intervalReceiver, wifiinternalcallback);
        }
        (new Timer("Acquire Wifi Position timer")).schedule(new ScannerTimerTask(scanner, wlwififailurecallback, wifiinternalcallback), 0L);
    }

    public void startAcquisition(WifiInternalCallback wifiinternalcallback, WLWifiFailureCallback wlwififailurecallback, WLWifiAcquisitionPolicy wlwifiacquisitionpolicy)
    {
        if (wlwifiacquisitionpolicy == null)
        {
            throw new IllegalArgumentException("policy is null");
        } else
        {
            stopAcquisition();
            checkParams(wlwifiacquisitionpolicy);
            scanWifi(wifiinternalcallback, wlwififailurecallback, wlwifiacquisitionpolicy);
            return;
        }
    }

    public boolean stopAcquisition()
    {
        if (timer != null)
        {
            timer.cancel();
            timer.purge();
            timer = null;
            intervalReceiver = null;
            return true;
        } else
        {
            return false;
        }
    }
}
