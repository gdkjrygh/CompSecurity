// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.internal.wifi.nativeImpl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import com.worklight.location.api.wifi.WLWifiAccessPoint;
import com.worklight.location.internal.wifi.IWifiScannerReceiver;
import com.worklight.location.internal.wifi.WifiException;
import com.worklight.location.internal.wifi.WifiInternalAccessPoint;
import com.worklight.location.internal.wifi.WifiScanner;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class AndroidWifiScanner
    implements WifiScanner
{

    private final Context context;
    private final WifiManager wifiManager;

    public AndroidWifiScanner(Context context1)
    {
        if (context1 == null)
        {
            throw new IllegalArgumentException("context is null");
        } else
        {
            context = context1;
            wifiManager = (WifiManager)context1.getSystemService("wifi");
            return;
        }
    }

    private WifiInternalAccessPoint getCurrentSsid()
    {
        WifiInfo wifiinfo;
        if (((ConnectivityManager)context.getSystemService("connectivity")).getNetworkInfo(1).isConnected())
        {
            if ((wifiinfo = wifiManager.getConnectionInfo()) != null && !wifiinfo.getSSID().equals(""))
            {
                String s1 = wifiinfo.getSSID();
                String s = s1;
                if (s1.indexOf("\"") == 0)
                {
                    s = s1.substring(1, s1.length() - 1);
                }
                return new WifiInternalAccessPoint(s, wifiinfo.getBSSID(), 100, true);
            }
        }
        return null;
    }

    private static int getStrength(int i)
    {
        int j = 100;
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            j = WifiManager.calculateSignalLevel(i, 101);
        } else
        {
            if (i <= -100)
            {
                return 0;
            }
            if (i < -55)
            {
                float f = 45;
                float f1 = 100;
                return (int)(((float)(i + 100) * f1) / f);
            }
        }
        return j;
    }

    private static int getStrength(ScanResult scanresult)
    {
        if (scanresult.getClass() != android/net/wifi/ScanResult)
        {
            return scanresult.level;
        } else
        {
            return getStrength(scanresult.level);
        }
    }

    private static boolean isEmulator()
    {
        return Build.PRODUCT.equals("sdk_x86") || Build.PRODUCT.equals("google_sdk") || Build.PRODUCT.equals("sdk");
    }

    private Collection resultToAccessPoints(Iterable iterable)
    {
        WifiInternalAccessPoint wifiinternalaccesspoint = getCurrentSsid();
        ArrayList arraylist = new ArrayList();
        iterable = iterable.iterator();
        while (iterable.hasNext()) 
        {
            ScanResult scanresult = (ScanResult)iterable.next();
            boolean flag;
            if (wifiinternalaccesspoint != null && wifiinternalaccesspoint.getSSID().equals(scanresult.SSID) && wifiinternalaccesspoint.getMAC().equals(scanresult.BSSID))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            arraylist.add(new WifiInternalAccessPoint(scanresult.SSID, scanresult.BSSID, getStrength(scanresult), flag));
        }
        return arraylist;
    }

    public void scan(final IWifiScannerReceiver r)
        throws WifiException
    {
        if (r == null)
        {
            throw new IllegalArgumentException("r is null");
        }
        try
        {
            context.registerReceiver(new BroadcastReceiver() {

                final AndroidWifiScanner this$0;
                final IWifiScannerReceiver val$r;

                public void onReceive(Context context1, Intent intent)
                {
                    context1.unregisterReceiver(this);
                    context1 = wifiManager.getScanResults();
                    long l1 = System.currentTimeMillis();
                    long l = l1;
                    try
                    {
                        if (!context1.isEmpty())
                        {
                            l = ((ScanResult)context1.iterator().next()).timestamp;
                        }
                    }
                    // Misplaced declaration of an exception variable
                    catch (Intent intent)
                    {
                        l = l1;
                    }
                    r.onScanResults(resultToAccessPoints(context1), l);
                }

            
            {
                this$0 = AndroidWifiScanner.this;
                r = iwifiscannerreceiver;
                super();
            }
            }, new IntentFilter("android.net.wifi.SCAN_RESULTS"));
            if (!wifiManager.isWifiEnabled())
            {
                throw new WifiException(com.worklight.location.api.wifi.WLWifiError.WLWifiErrorCodes.DISABLED);
            }
        }
        // Misplaced declaration of an exception variable
        catch (final IWifiScannerReceiver r)
        {
            throw new WifiException(com.worklight.location.api.wifi.WLWifiError.WLWifiErrorCodes.PERMISSION);
        }
        if (!wifiManager.startScan())
        {
            throw new WifiException(com.worklight.location.api.wifi.WLWifiError.WLWifiErrorCodes.FAILED_START_SCAN);
        } else
        {
            return;
        }
    }


}
