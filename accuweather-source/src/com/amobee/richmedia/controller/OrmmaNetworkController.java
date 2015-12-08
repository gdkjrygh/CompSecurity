// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.richmedia.controller;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.amobee.adsdk.Log;
import com.amobee.richmedia.controller.util.OrmmaNetworkBroadcastReceiver;
import com.amobee.richmedia.view.AmobeeView;

// Referenced classes of package com.amobee.richmedia.controller:
//            OrmmaController

public class OrmmaNetworkController extends OrmmaController
{

    private static int $SWITCH_TABLE$android$net$NetworkInfo$State[];
    private static final String LOG_TAG = "AmobeeViewNetworkController";
    private OrmmaNetworkBroadcastReceiver mBroadCastReceiver;
    private ConnectivityManager mConnectivityManager;
    private IntentFilter mFilter;
    private int mNetworkListenerCount;

    static int[] $SWITCH_TABLE$android$net$NetworkInfo$State()
    {
        int ai[] = $SWITCH_TABLE$android$net$NetworkInfo$State;
        if (ai != null)
        {
            return ai;
        }
        ai = new int[android.net.NetworkInfo.State.values().length];
        try
        {
            ai[android.net.NetworkInfo.State.CONNECTED.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            ai[android.net.NetworkInfo.State.CONNECTING.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            ai[android.net.NetworkInfo.State.DISCONNECTED.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            ai[android.net.NetworkInfo.State.DISCONNECTING.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            ai[android.net.NetworkInfo.State.SUSPENDED.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            ai[android.net.NetworkInfo.State.UNKNOWN.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror) { }
        $SWITCH_TABLE$android$net$NetworkInfo$State = ai;
        return ai;
    }

    public OrmmaNetworkController(AmobeeView amobeeview, Context context)
    {
        super(amobeeview, context);
        mConnectivityManager = (ConnectivityManager)context.getSystemService("connectivity");
    }

    public String getNetwork()
    {
        Object obj;
        NetworkInfo networkinfo;
        obj = "unknown";
        try
        {
            networkinfo = mConnectivityManager.getActiveNetworkInfo();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return "unknown";
        }
        if (networkinfo != null) goto _L2; else goto _L1
_L1:
        obj = "offline";
_L4:
        Log.d("AmobeeViewNetworkController", (new StringBuilder("getNetwork: ")).append(((String) (obj))).toString());
        return ((String) (obj));
_L2:
        switch ($SWITCH_TABLE$android$net$NetworkInfo$State()[networkinfo.getState().ordinal()])
        {
        case 4: // '\004'
        case 5: // '\005'
        default:
            int i = networkinfo.getType();
            if (i == 0)
            {
                obj = "cell";
            } else
            if (i == 1)
            {
                obj = "wifi";
            }
            break;

        case 6: // '\006'
            obj = "unknown";
            break;

        case 3: // '\003'
            obj = "offline";
            break;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void onConnectionChanged()
    {
        String s = (new StringBuilder("window.ormmaview.fireChangeEvent({ network: '")).append(getNetwork()).append("'});").toString();
        mOrmmaView.injectJavaScriptRichMedia(s);
    }

    public void startNetworkListener()
    {
        if (mNetworkListenerCount == 0)
        {
            mBroadCastReceiver = new OrmmaNetworkBroadcastReceiver(this);
            mFilter = new IntentFilter();
            mFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        }
        mNetworkListenerCount = mNetworkListenerCount + 1;
        mContext.registerReceiver(mBroadCastReceiver, mFilter);
    }

    public void stopAllListeners()
    {
        mNetworkListenerCount = 0;
        try
        {
            mContext.unregisterReceiver(mBroadCastReceiver);
            return;
        }
        catch (Exception exception)
        {
            return;
        }
    }

    public void stopNetworkListener()
    {
        mNetworkListenerCount = mNetworkListenerCount - 1;
        if (mNetworkListenerCount == 0)
        {
            mContext.unregisterReceiver(mBroadCastReceiver);
            mBroadCastReceiver = null;
            mFilter = null;
        }
    }
}
