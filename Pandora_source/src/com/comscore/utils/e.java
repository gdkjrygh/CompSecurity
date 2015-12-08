// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.telephony.TelephonyManager;
import org.apache.http.client.HttpClient;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpParams;

// Referenced classes of package com.comscore.utils:
//            l, c

public class e
{

    private static HttpClient a = null;

    public static String a(Context context)
    {
        if (l.a(context, "android.permission.ACCESS_WIFI_STATE").booleanValue() && ((ConnectivityManager)context.getSystemService("connectivity")).getNetworkInfo(1).isConnected())
        {
            context = ((WifiManager)context.getSystemService("wifi")).getConnectionInfo();
            if (context != null)
            {
                return context.getSSID();
            }
        }
        return null;
    }

    public static HttpClient a()
    {
        if (a == null)
        {
            a = c();
        }
        return a;
    }

    public static boolean b()
    {
        return "sdk".equals(Build.PRODUCT);
    }

    public static boolean b(Context context)
    {
        if (l.a(context, "android.permission.ACCESS_NETWORK_STATE").booleanValue())
        {
            context = ((ConnectivityManager)context.getSystemService("connectivity")).getNetworkInfo(1);
            return context != null && context.isConnected();
        } else
        {
            return false;
        }
    }

    private static HttpClient c()
    {
        Object obj;
        try
        {
            obj = SSLSocketFactory.getSocketFactory();
            ((SSLSocketFactory) (obj)).setHostnameVerifier(SSLSocketFactory.STRICT_HOSTNAME_VERIFIER);
            BasicHttpParams basichttpparams = new BasicHttpParams();
            basichttpparams.setBooleanParameter("http.protocol.expect-continue", false);
            SchemeRegistry schemeregistry = new SchemeRegistry();
            schemeregistry.register(new Scheme("http", PlainSocketFactory.getSocketFactory(), 80));
            schemeregistry.register(new Scheme("https", ((org.apache.http.conn.scheme.SocketFactory) (obj)), 443));
            obj = new DefaultHttpClient(new ThreadSafeClientConnManager(basichttpparams, schemeregistry), basichttpparams);
        }
        catch (Exception exception)
        {
            com.comscore.utils.c.b("comScore", exception.getMessage());
            return new DefaultHttpClient();
        }
        return ((HttpClient) (obj));
    }

    public static boolean c(Context context)
    {
        if (l.a(context, "android.permission.ACCESS_NETWORK_STATE").booleanValue())
        {
            context = ((ConnectivityManager)context.getSystemService("connectivity")).getNetworkInfo(0);
            return context != null && context.isConnected();
        } else
        {
            return false;
        }
    }

    public static boolean d(Context context)
    {
        if (l.a(context, "android.permission.ACCESS_NETWORK_STATE").booleanValue() && android.os.Build.VERSION.SDK_INT >= 13)
        {
            context = ((ConnectivityManager)context.getSystemService("connectivity")).getNetworkInfo(9);
            return context != null && context.isConnected();
        } else
        {
            return false;
        }
    }

    public static boolean e(Context context)
    {
        if (l.a(context, "android.permission.ACCESS_NETWORK_STATE").booleanValue() && android.os.Build.VERSION.SDK_INT >= 13)
        {
            context = ((ConnectivityManager)context.getSystemService("connectivity")).getNetworkInfo(7);
            return context != null && context.isConnected();
        } else
        {
            return false;
        }
    }

    public static boolean f(Context context)
    {
        if (l.a(context, "android.permission.READ_PHONE_STATE").booleanValue())
        {
            context = (TelephonyManager)context.getSystemService("phone");
            return context.getDataActivity() == 3 || context.getDataActivity() == 1 || context.getDataActivity() == 2;
        } else
        {
            return false;
        }
    }

}
