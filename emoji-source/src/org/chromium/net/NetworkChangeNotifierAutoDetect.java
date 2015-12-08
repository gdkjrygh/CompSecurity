// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.net;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.util.Log;
import org.chromium.base.ApplicationStatus;

public class NetworkChangeNotifierAutoDetect extends BroadcastReceiver
    implements org.chromium.base.ApplicationStatus.ApplicationStateListener
{
    static class ConnectivityManagerDelegate
    {

        private final ConnectivityManager mConnectivityManager;

        boolean activeNetworkExists()
        {
            return mConnectivityManager.getActiveNetworkInfo() != null;
        }

        int getNetworkSubtype()
        {
            return mConnectivityManager.getActiveNetworkInfo().getSubtype();
        }

        int getNetworkType()
        {
            return mConnectivityManager.getActiveNetworkInfo().getType();
        }

        boolean isConnected()
        {
            return mConnectivityManager.getActiveNetworkInfo().isConnected();
        }

        ConnectivityManagerDelegate()
        {
            mConnectivityManager = null;
        }

        ConnectivityManagerDelegate(Context context)
        {
            mConnectivityManager = (ConnectivityManager)context.getSystemService("connectivity");
        }
    }

    private static class NetworkConnectivityIntentFilter extends IntentFilter
    {

        NetworkConnectivityIntentFilter()
        {
            addAction("android.net.conn.CONNECTIVITY_CHANGE");
        }
    }

    public static interface Observer
    {

        public abstract void onConnectionTypeChanged(int i);
    }

    static class WifiManagerDelegate
    {

        private final WifiManager mWifiManager;

        String getWifiSSID()
        {
            Object obj = mWifiManager.getConnectionInfo();
            if (obj == null)
            {
                obj = "";
            } else
            {
                String s = ((WifiInfo) (obj)).getSSID();
                obj = s;
                if (s == null)
                {
                    return "";
                }
            }
            return ((String) (obj));
        }

        WifiManagerDelegate()
        {
            mWifiManager = null;
        }

        WifiManagerDelegate(Context context)
        {
            mWifiManager = (WifiManager)context.getSystemService("wifi");
        }
    }


    private static final String TAG = "NetworkChangeNotifierAutoDetect";
    private int mConnectionType;
    private ConnectivityManagerDelegate mConnectivityManagerDelegate;
    private final Context mContext;
    private final NetworkConnectivityIntentFilter mIntentFilter = new NetworkConnectivityIntentFilter();
    private final Observer mObserver;
    private boolean mRegistered;
    private WifiManagerDelegate mWifiManagerDelegate;
    private String mWifiSSID;

    public NetworkChangeNotifierAutoDetect(Observer observer, Context context)
    {
        mObserver = observer;
        mContext = context.getApplicationContext();
        mConnectivityManagerDelegate = new ConnectivityManagerDelegate(context);
        mWifiManagerDelegate = new WifiManagerDelegate(context);
        mConnectionType = getCurrentConnectionType();
        mWifiSSID = getCurrentWifiSSID();
        ApplicationStatus.registerApplicationStateListener(this);
    }

    private void connectionTypeChanged()
    {
        int i = getCurrentConnectionType();
        String s = getCurrentWifiSSID();
        if (i == mConnectionType && s.equals(mWifiSSID))
        {
            return;
        } else
        {
            mConnectionType = i;
            mWifiSSID = s;
            Log.d("NetworkChangeNotifierAutoDetect", (new StringBuilder()).append("Network connectivity changed, type is: ").append(mConnectionType).toString());
            mObserver.onConnectionTypeChanged(i);
            return;
        }
    }

    private String getCurrentWifiSSID()
    {
        if (getCurrentConnectionType() != 2)
        {
            return "";
        } else
        {
            return mWifiManagerDelegate.getWifiSSID();
        }
    }

    private void registerReceiver()
    {
        if (!mRegistered)
        {
            mRegistered = true;
            mContext.registerReceiver(this, mIntentFilter);
        }
    }

    private void unregisterReceiver()
    {
        if (mRegistered)
        {
            mRegistered = false;
            mContext.unregisterReceiver(this);
        }
    }

    public void destroy()
    {
        unregisterReceiver();
    }

    public int getCurrentConnectionType()
    {
        byte byte1 = 5;
        if (mConnectivityManagerDelegate.activeNetworkExists() && mConnectivityManagerDelegate.isConnected()) goto _L2; else goto _L1
_L1:
        byte byte0 = 6;
_L4:
        return byte0;
_L2:
        byte0 = byte1;
        switch (mConnectivityManagerDelegate.getNetworkType())
        {
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 8: // '\b'
        default:
            return 0;

        case 6: // '\006'
            continue; /* Loop/switch isn't completed */

        case 9: // '\t'
            return 1;

        case 1: // '\001'
            return 2;

        case 7: // '\007'
            return 7;

        case 0: // '\0'
            byte0 = byte1;
            break;
        }
        switch (mConnectivityManagerDelegate.getNetworkSubtype())
        {
        default:
            return 0;

        case 1: // '\001'
        case 2: // '\002'
        case 4: // '\004'
        case 7: // '\007'
        case 11: // '\013'
            return 3;

        case 3: // '\003'
        case 5: // '\005'
        case 6: // '\006'
        case 8: // '\b'
        case 9: // '\t'
        case 10: // '\n'
        case 12: // '\f'
        case 14: // '\016'
        case 15: // '\017'
            return 4;

        case 13: // '\r'
            break;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void onApplicationStateChange(int i)
    {
        if (i == 1)
        {
            connectionTypeChanged();
            registerReceiver();
        } else
        if (i == 2)
        {
            unregisterReceiver();
            return;
        }
    }

    public void onReceive(Context context, Intent intent)
    {
        connectionTypeChanged();
    }

    void setConnectivityManagerDelegateForTests(ConnectivityManagerDelegate connectivitymanagerdelegate)
    {
        mConnectivityManagerDelegate = connectivitymanagerdelegate;
    }

    void setWifiManagerDelegateForTests(WifiManagerDelegate wifimanagerdelegate)
    {
        mWifiManagerDelegate = wifimanagerdelegate;
    }
}
