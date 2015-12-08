// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.a.a.a.b;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Proxy;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.nuance.a.a.a.a.d.a.e;
import com.nuance.a.a.a.a.d.a.g;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.UUID;

public class d
    implements g
{

    private static final e a = com.nuance.a.a.a.a.d.a.d.a(com/nuance/a/a/a/b/d);
    private TelephonyManager b;
    private Context c;

    private d()
    {
        c = null;
    }

    private d(Context context)
    {
        c = null;
        c = context;
        b = (TelephonyManager)context.getSystemService("phone");
    }

    public static g a(Context context)
    {
        com/nuance/a/a/a/b/d;
        JVM INSTR monitorenter ;
        context = new d(context);
        com/nuance/a/a/a/b/d;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    private static SocketAddress a(String s, int i)
    {
        if (a.b())
        {
            (new StringBuilder("makeAddress -- address: ")).append(s).append(", port: ").append(i);
        }
        if (s == null || "".equals(s) || i <= 0)
        {
            a.b();
            return null;
        } else
        {
            return new InetSocketAddress(s, i);
        }
    }

    public static g g()
    {
        com/nuance/a/a/a/b/d;
        JVM INSTR monitorenter ;
        d d1 = new d();
        com/nuance/a/a/a/b/d;
        JVM INSTR monitorexit ;
        return d1;
        Exception exception;
        exception;
        throw exception;
    }

    public final String a()
    {
        Object obj = c.getSharedPreferences("nuance_sdk_pref", 0);
        String s1 = ((SharedPreferences) (obj)).getString("NUANCE_NMSP_UID", "");
        String s = s1;
        if (s1.length() == 0)
        {
            s = UUID.randomUUID().toString();
            s1 = s;
            if (s != null)
            {
                s1 = s.replaceAll("-", "");
            }
            obj = ((SharedPreferences) (obj)).edit();
            ((android.content.SharedPreferences.Editor) (obj)).putString("NUANCE_NMSP_UID", s1);
            s = s1;
            if (!((android.content.SharedPreferences.Editor) (obj)).commit())
            {
                a.b("Storing nuance sdk uid has failed");
                s = s1;
            }
        }
        s1 = s;
        if (s == null)
        {
            s1 = "";
        }
        return s1;
    }

    public final String b()
    {
        return Build.MODEL;
    }

    public final String c()
    {
        return Build.DEVICE;
    }

    public final String d()
    {
        return "Android";
    }

    public final String e()
    {
        return android.os.Build.VERSION.RELEASE;
    }

    public final SocketAddress f()
    {
        if (a.b())
        {
            (new StringBuilder("getProxyAddress Build.VERSION.SDK_INT: ")).append(android.os.Build.VERSION.SDK_INT);
        }
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            a.b();
            a.b();
            String s = System.getProperty("http.proxyHost");
            String s2 = System.getProperty("http.proxyPort");
            if (a.b())
            {
                (new StringBuilder("retrieved address: ")).append(s).append(", port: ").append(s2);
            }
            int i;
            if (s2 != null)
            {
                i = Integer.parseInt(s2);
            } else
            {
                i = -1;
            }
            return a(s, i);
        }
        if (c == null)
        {
            if (a.e())
            {
                a.b("the android context is needed to retrieve the proxy address from the device.");
            }
            throw new IllegalStateException("the android context is needed to retrieve the proxy address from the device.");
        }
        a.b();
        String s1 = Proxy.getHost(c);
        int j = Proxy.getPort(c);
        if (a.b())
        {
            (new StringBuilder("getProxyAddressLegacy proxyAddress[")).append(s1).append("] port[").append(j).append("]");
        }
        return a(s1, j);
    }

}
