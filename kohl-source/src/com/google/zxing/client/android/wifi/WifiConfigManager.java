// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.android.wifi;

import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiManager;
import android.os.AsyncTask;
import android.util.Log;
import com.google.zxing.client.result.WifiParsedResult;
import java.util.BitSet;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.google.zxing.client.android.wifi:
//            NetworkType

public final class WifiConfigManager extends AsyncTask
{

    private static final Pattern HEX_DIGITS = Pattern.compile("[0-9A-Fa-f]+");
    private static final String TAG = com/google/zxing/client/android/wifi/WifiConfigManager.getSimpleName();
    private final WifiManager wifiManager;

    public WifiConfigManager(WifiManager wifimanager)
    {
        wifiManager = wifimanager;
    }

    private static WifiConfiguration changeNetworkCommon(WifiParsedResult wifiparsedresult)
    {
        WifiConfiguration wificonfiguration = new WifiConfiguration();
        wificonfiguration.allowedAuthAlgorithms.clear();
        wificonfiguration.allowedGroupCiphers.clear();
        wificonfiguration.allowedKeyManagement.clear();
        wificonfiguration.allowedPairwiseCiphers.clear();
        wificonfiguration.allowedProtocols.clear();
        wificonfiguration.SSID = quoteNonHex(wifiparsedresult.getSsid(), new int[0]);
        wificonfiguration.hiddenSSID = wifiparsedresult.isHidden();
        return wificonfiguration;
    }

    private static void changeNetworkUnEncrypted(WifiManager wifimanager, WifiParsedResult wifiparsedresult)
    {
        wifiparsedresult = changeNetworkCommon(wifiparsedresult);
        ((WifiConfiguration) (wifiparsedresult)).allowedKeyManagement.set(0);
        updateNetwork(wifimanager, wifiparsedresult);
    }

    private static void changeNetworkWEP(WifiManager wifimanager, WifiParsedResult wifiparsedresult)
    {
        WifiConfiguration wificonfiguration = changeNetworkCommon(wifiparsedresult);
        wificonfiguration.wepKeys[0] = quoteNonHex(wifiparsedresult.getPassword(), new int[] {
            10, 26, 58
        });
        wificonfiguration.wepTxKeyIndex = 0;
        wificonfiguration.allowedAuthAlgorithms.set(1);
        wificonfiguration.allowedKeyManagement.set(0);
        wificonfiguration.allowedGroupCiphers.set(2);
        wificonfiguration.allowedGroupCiphers.set(3);
        wificonfiguration.allowedGroupCiphers.set(0);
        wificonfiguration.allowedGroupCiphers.set(1);
        updateNetwork(wifimanager, wificonfiguration);
    }

    private static void changeNetworkWPA(WifiManager wifimanager, WifiParsedResult wifiparsedresult)
    {
        WifiConfiguration wificonfiguration = changeNetworkCommon(wifiparsedresult);
        wificonfiguration.preSharedKey = quoteNonHex(wifiparsedresult.getPassword(), new int[] {
            64
        });
        wificonfiguration.allowedAuthAlgorithms.set(0);
        wificonfiguration.allowedProtocols.set(0);
        wificonfiguration.allowedProtocols.set(1);
        wificonfiguration.allowedKeyManagement.set(1);
        wificonfiguration.allowedKeyManagement.set(2);
        wificonfiguration.allowedPairwiseCiphers.set(1);
        wificonfiguration.allowedPairwiseCiphers.set(2);
        wificonfiguration.allowedGroupCiphers.set(2);
        wificonfiguration.allowedGroupCiphers.set(3);
        updateNetwork(wifimanager, wificonfiguration);
    }

    private static String convertToQuotedString(String s)
    {
        if (s != null && !s.isEmpty()) goto _L2; else goto _L1
_L1:
        String s1 = null;
_L4:
        return s1;
_L2:
        if (s.charAt(0) != '"')
        {
            break; /* Loop/switch isn't completed */
        }
        s1 = s;
        if (s.charAt(s.length() - 1) == '"') goto _L4; else goto _L3
_L3:
        return (new StringBuilder()).append('"').append(s).append('"').toString();
    }

    private static Integer findNetworkInExistingConfig(WifiManager wifimanager, String s)
    {
        for (wifimanager = wifimanager.getConfiguredNetworks().iterator(); wifimanager.hasNext();)
        {
            WifiConfiguration wificonfiguration = (WifiConfiguration)wifimanager.next();
            if (wificonfiguration.SSID.equals(s))
            {
                return Integer.valueOf(wificonfiguration.networkId);
            }
        }

        return null;
    }

    private static transient boolean isHexOfLength(CharSequence charsequence, int ai[])
    {
        boolean flag1 = true;
        if (charsequence != null && HEX_DIGITS.matcher(charsequence).matches()) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (ai.length != 0)
        {
            int j = ai.length;
            int i = 0;
label0:
            do
            {
label1:
                {
                    if (i >= j)
                    {
                        break label1;
                    }
                    int k = ai[i];
                    flag = flag1;
                    if (charsequence.length() == k)
                    {
                        break label0;
                    }
                    i++;
                }
            } while (true);
        }
        if (true) goto _L4; else goto _L3
_L3:
        return false;
    }

    private static transient String quoteNonHex(String s, int ai[])
    {
        if (isHexOfLength(s, ai))
        {
            return s;
        } else
        {
            return convertToQuotedString(s);
        }
    }

    private static void updateNetwork(WifiManager wifimanager, WifiConfiguration wificonfiguration)
    {
        Integer integer = findNetworkInExistingConfig(wifimanager, wificonfiguration.SSID);
        if (integer != null)
        {
            Log.i(TAG, (new StringBuilder()).append("Removing old configuration for network ").append(wificonfiguration.SSID).toString());
            wifimanager.removeNetwork(integer.intValue());
            wifimanager.saveConfiguration();
        }
        int i = wifimanager.addNetwork(wificonfiguration);
        if (i >= 0)
        {
            if (wifimanager.enableNetwork(i, true))
            {
                Log.i(TAG, (new StringBuilder()).append("Associating to network ").append(wificonfiguration.SSID).toString());
                wifimanager.saveConfiguration();
                return;
            } else
            {
                Log.w(TAG, (new StringBuilder()).append("Failed to enable network ").append(wificonfiguration.SSID).toString());
                return;
            }
        } else
        {
            Log.w(TAG, (new StringBuilder()).append("Unable to add network ").append(wificonfiguration.SSID).toString());
            return;
        }
    }

    protected transient Object doInBackground(WifiParsedResult awifiparsedresult[])
    {
        awifiparsedresult = awifiparsedresult[0];
        if (wifiManager.isWifiEnabled()) goto _L2; else goto _L1
_L1:
        Log.i(TAG, "Enabling wi-fi...");
        if (!wifiManager.setWifiEnabled(true)) goto _L4; else goto _L3
_L3:
        int i;
        Log.i(TAG, "Wi-fi enabled");
        i = 0;
_L12:
        if (wifiManager.isWifiEnabled()) goto _L2; else goto _L5
_L5:
        if (i < 10) goto _L7; else goto _L6
_L6:
        Log.i(TAG, "Took too long to enable wi-fi, quitting");
_L9:
        return null;
_L4:
        Log.w(TAG, "Wi-fi could not be enabled!");
        return null;
_L7:
        Log.i(TAG, "Still waiting for wi-fi to enable...");
        String s;
        NetworkType networktype;
        try
        {
            Thread.sleep(1000L);
        }
        catch (InterruptedException interruptedexception) { }
        i++;
        continue; /* Loop/switch isn't completed */
_L2:
        s = awifiparsedresult.getNetworkEncryption();
        try
        {
            networktype = NetworkType.forIntentValue(s);
        }
        // Misplaced declaration of an exception variable
        catch (WifiParsedResult awifiparsedresult[])
        {
            Log.w(TAG, (new StringBuilder()).append("Bad network type; see NetworkType values: ").append(s).toString());
            return null;
        }
        if (networktype == NetworkType.NO_PASSWORD)
        {
            changeNetworkUnEncrypted(wifiManager, awifiparsedresult);
            return null;
        }
        s = awifiparsedresult.getPassword();
        if (s == null || s.isEmpty()) goto _L9; else goto _L8
_L8:
        if (networktype == NetworkType.WEP)
        {
            changeNetworkWEP(wifiManager, awifiparsedresult);
            return null;
        }
        if (networktype != NetworkType.WPA) goto _L9; else goto _L10
_L10:
        changeNetworkWPA(wifiManager, awifiparsedresult);
        return null;
        if (true) goto _L12; else goto _L11
_L11:
    }

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((WifiParsedResult[])aobj);
    }

}
