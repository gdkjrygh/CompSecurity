// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.rt;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;

// Referenced classes of package com.skype.rt:
//            WiFiNetworkStatus, ConnectivityChangeReceiver

public class RootToolsHandler
{

    private static final boolean DBG = false;
    private static final String TAG = "rt::";
    private static Object m_this = Integer.valueOf(0);
    private Context m_context;

    private RootToolsHandler(Context context)
    {
        m_context = context;
    }

    public static Object createHandler(Object obj)
    {
        obj = new RootToolsHandler((Context)obj);
        m_this = obj;
        return obj;
    }

    public static void dropHandler()
    {
        m_this = null;
    }

    public static native void initiateCreateRootToolsHandler(Object obj);

    public static void mainCreateRootToolsHandler(Object obj)
    {
        initiateCreateRootToolsHandler(obj);
    }

    public int activeConnectionType()
    {
        NetworkInfo networkinfo = ((ConnectivityManager)m_context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (networkinfo == null)
        {
            return -100;
        }
        int i;
        if (networkinfo.isConnected())
        {
            i = 1;
        } else
        {
            i = 0;
        }
        return i + (networkinfo.getType() << 8) + (networkinfo.getSubtype() << 16);
    }

    public native void callbackListInterfaces(int i, int j, int ai[]);

    public WiFiNetworkStatus getWiFiNetworkStatus()
    {
        Object obj = (WifiManager)m_context.getSystemService("wifi");
        if (((WifiManager) (obj)).isWifiEnabled())
        {
            obj = ((WifiManager) (obj)).getConnectionInfo();
            return new WiFiNetworkStatus(true, ((WifiInfo) (obj)).getMacAddress(), ((WifiInfo) (obj)).getSSID(), ((WifiInfo) (obj)).getBSSID());
        } else
        {
            return new WiFiNetworkStatus(false, "", "", "");
        }
    }

    public void listInterfaces(int i)
    {
        Object obj = (ConnectivityManager)m_context.getSystemService("connectivity");
        NetworkInfo anetworkinfo[] = ((ConnectivityManager) (obj)).getAllNetworkInfo();
        int i1 = anetworkinfo.length;
        obj = ((ConnectivityManager) (obj)).getActiveNetworkInfo();
        int k = 0;
        int ai[] = new int[i1 * 3 + 1];
        ai[0] = i1;
        int j = 0;
        while (j < i1) 
        {
            NetworkInfo networkinfo = anetworkinfo[j];
            int l;
            if (networkinfo.isConnected())
            {
                l = 1;
            } else
            {
                l = 0;
            }
            ai[j * 3 + 1] = l;
            ai[j * 3 + 2] = networkinfo.getType();
            ai[j * 3 + 3] = networkinfo.getSubtype();
            l = k;
            if (obj != null)
            {
                l = k;
                if (k == 0)
                {
                    l = k;
                    if (networkinfo.isConnected())
                    {
                        l = k;
                        if (networkinfo.getType() == ((NetworkInfo) (obj)).getType())
                        {
                            l = k;
                            if (networkinfo.getSubtype() == ((NetworkInfo) (obj)).getSubtype())
                            {
                                k = j * 3 + 1;
                                ai[k] = ai[k] | 0x100;
                                l = 1;
                            }
                        }
                    }
                }
            }
            j++;
            k = l;
        }
        callbackListInterfaces(i, i1, ai);
    }

    public Object registerConnectivityChangeReceiver(int i)
    {
        ConnectivityChangeReceiver connectivitychangereceiver = new ConnectivityChangeReceiver(i);
        m_context.registerReceiver(connectivitychangereceiver, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        return connectivitychangereceiver;
    }

    public void unregisterConnectivityChangeReceiver(Object obj)
    {
        m_context.unregisterReceiver((ConnectivityChangeReceiver)obj);
    }

}
