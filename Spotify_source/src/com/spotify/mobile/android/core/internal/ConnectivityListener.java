// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.core.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;

// Referenced classes of package com.spotify.mobile.android.core.internal:
//            ConnectivitySetter

public class ConnectivityListener
{

    public static final int CONNECTION_TYPE_3G = 3;
    public static final int CONNECTION_TYPE_4G = 4;
    public static final int CONNECTION_TYPE_EDGE = 2;
    public static final int CONNECTION_TYPE_ETHERNET = 6;
    public static final int CONNECTION_TYPE_GPRS = 1;
    public static final int CONNECTION_TYPE_NONE = 0;
    public static final int CONNECTION_TYPE_UNKNOWN = -1;
    public static final int CONNECTION_TYPE_WLAN = 5;
    private Context mApplicationContext;
    private ConnectivityManager mConnectivityManager;
    private BroadcastReceiver mConnectivityReceiver;
    private final ConnectivitySetter mConnectivitySetter;
    private IntentFilter mIntentFilter;
    private TelephonyManager mTelephonyManager;

    public ConnectivityListener(ConnectivitySetter connectivitysetter, Context context)
    {
        mIntentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
        mConnectivityReceiver = new BroadcastReceiver() {

            final ConnectivityListener this$0;

            public void onReceive(Context context1, Intent intent)
            {
                if (mConnectivitySetter != null)
                {
                    mConnectivitySetter.setConnectivityType(getConnectionType(), isRoaming());
                }
            }

            
            {
                this$0 = ConnectivityListener.this;
                super();
            }
        };
        mApplicationContext = context;
        mConnectivitySetter = connectivitysetter;
        mTelephonyManager = (TelephonyManager)mApplicationContext.getSystemService("phone");
        mConnectivityManager = (ConnectivityManager)mApplicationContext.getSystemService("connectivity");
        mApplicationContext.registerReceiver(mConnectivityReceiver, mIntentFilter);
    }

    public void destroy()
    {
        if (mApplicationContext != null)
        {
            mApplicationContext.unregisterReceiver(mConnectivityReceiver);
        }
    }

    public int getConnectionType()
    {
        NetworkInfo networkinfo;
        byte byte0;
        byte0 = 3;
        networkinfo = mConnectivityManager.getActiveNetworkInfo();
        if (networkinfo != null && networkinfo.isConnected()) goto _L2; else goto _L1
_L1:
        byte0 = 0;
_L4:
        return byte0;
_L2:
        int i = networkinfo.getType();
        if (i == 0)
        {
            i = mTelephonyManager.getNetworkType();
            if (i >= 13)
            {
                return 4;
            }
            if (i >= 3)
            {
                continue; /* Loop/switch isn't completed */
            }
            if (i == 2)
            {
                return 2;
            }
            if (i == 1)
            {
                return 1;
            }
            break; /* Loop/switch isn't completed */
        }
        if (i == 6)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (i == 1)
        {
            return 5;
        }
        break; /* Loop/switch isn't completed */
        if (true) goto _L4; else goto _L3
_L3:
        return -1;
    }

    public boolean isRoaming()
    {
        return mTelephonyManager.isNetworkRoaming();
    }

    public void pushToSetter()
    {
        if (mConnectivitySetter != null)
        {
            mConnectivitySetter.setConnectivityType(getConnectionType(), isRoaming());
        }
    }

}
