// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.access;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.SupplicantState;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.SystemClock;
import android.text.TextUtils;
import com.skype.AccessSession;
import com.skype.AccessSessionImpl;
import com.skype.SkyLib;
import com.skype.android.util.CheckedBroadcastReceiver;
import java.util.Iterator;
import java.util.logging.Logger;

final class a extends CheckedBroadcastReceiver
{

    private static final String ACTIONS[] = {
        "android.net.conn.CONNECTIVITY_CHANGE"
    };
    private static final long WIFI_CONNECTION_STABILIZATION_TIMEOUT = 60000L;
    private static final Logger log = Logger.getLogger("ConnectionReceiver");
    private String lastBssid;
    private long lastNotifyRealTime;
    private String lastSsid;
    private SkyLib lib;
    private AccessSession session;

    public a(SkyLib skylib)
    {
        super(ACTIONS);
        lib = skylib;
    }

    private static byte[] macBytes(String s)
    {
        Object obj = null;
        if (TextUtils.isEmpty(s)) goto _L2; else goto _L1
_L1:
        byte abyte0[] = new byte[6];
        obj = new android.text.TextUtils.SimpleStringSplitter(':');
        int i;
        int j;
        if (s.indexOf('.') != -1)
        {
            ((android.text.TextUtils.StringSplitter) (obj)).setString(s.replace('.', ':'));
        } else
        {
            ((android.text.TextUtils.StringSplitter) (obj)).setString(s);
        }
        s = ((android.text.TextUtils.StringSplitter) (obj)).iterator();
        i = 0;
_L5:
        obj = abyte0;
        if (!s.hasNext()) goto _L2; else goto _L3
_L3:
        obj = (String)s.next();
        if (i >= 6) goto _L5; else goto _L4
_L4:
        j = i + 1;
        abyte0[i] = (byte)Integer.parseInt(((String) (obj)), 16);
        i = j;
          goto _L5
        s;
_L7:
        obj = null;
_L2:
        s = ((String) (obj));
        if (obj == null)
        {
            s = new byte[0];
        }
        return s;
        s;
        if (true) goto _L7; else goto _L6
_L6:
    }

    private static String stripQuotes(String s)
    {
        String s1;
        if (s == null)
        {
            s1 = null;
        } else
        {
            s1 = s;
            if (s.length() >= 2)
            {
                s1 = s;
                if (s.charAt(0) == '"')
                {
                    s1 = s;
                    if (s.charAt(s.length() - 1) == '"')
                    {
                        return s.substring(1, s.length() - 1);
                    }
                }
            }
        }
        return s1;
    }

    public final void notifyNetworkChanged(String s, String s1, String s2, String s3)
    {
        String s4 = s;
        if (s == null)
        {
            s4 = "";
        }
        s = s3;
        if (s3 == null)
        {
            s = "";
        }
        session = new AccessSessionImpl();
        if (!lib.createAccessSession(session))
        {
            session = null;
        }
        if (session != null)
        {
            log.info((new StringBuilder("session.notifyNetworkChanged(")).append(s4).append(", ").append(s1).append(", ").append(s2).append(", ").append(s).append(")").toString());
            session.notifyWifiChanged(macBytes(s1), s4, macBytes(s2), s);
            return;
        } else
        {
            log.info("AccessSession not available");
            return;
        }
    }

    public final void onReceiveFiltered(Context context, Intent intent, int i)
    {
        Object obj = null;
        Object obj1 = null;
        Object obj2 = null;
        NetworkInfo networkinfo = ((ConnectivityManager)context.getSystemService("connectivity")).getNetworkInfo(1);
        WifiInfo wifiinfo = ((WifiManager)context.getSystemService("wifi")).getConnectionInfo();
        if (networkinfo != null)
        {
            log.info((new StringBuilder("notifyAccessNetwork: WiFi state: ")).append(networkinfo.getState()).toString());
        }
        if (wifiinfo != null)
        {
            log.info((new StringBuilder("notifyAccessNetwork: WiFi supplicant state: ")).append(wifiinfo.getSupplicantState()).toString());
        }
        if (networkinfo == null && wifiinfo == null)
        {
            log.info("notifyAccessNetwork: No network available");
        }
        String s = obj;
        intent = obj1;
        context = obj2;
        if (networkinfo != null)
        {
            s = obj;
            intent = obj1;
            context = obj2;
            if (networkinfo.isConnected())
            {
                s = obj;
                intent = obj1;
                context = obj2;
                if (wifiinfo != null)
                {
                    s = obj;
                    intent = obj1;
                    context = obj2;
                    if (wifiinfo.getSupplicantState() == SupplicantState.COMPLETED)
                    {
                        intent = wifiinfo.getBSSID();
                        s = wifiinfo.getSSID();
                        context = wifiinfo.getMacAddress();
                        log.info((new StringBuilder("notifyNetworkChanged: AP MAC: ")).append(intent).append(" SSID: ").append(s).append(" Device MAC: ").append(context).append(" state: ").append(wifiinfo.getSupplicantState()).toString());
                    }
                }
            }
        }
        long l = SystemClock.elapsedRealtime();
        if (!TextUtils.equals(lastSsid, s) || !TextUtils.equals(lastBssid, intent) || 60000L > l - lastNotifyRealTime || 0L == lastNotifyRealTime)
        {
            notifyNetworkChanged(stripQuotes(s), intent, context, null);
            lastSsid = s;
            lastBssid = intent;
            lastNotifyRealTime = l;
            return;
        } else
        {
            log.info("connectivity event ignored");
            return;
        }
    }

}
