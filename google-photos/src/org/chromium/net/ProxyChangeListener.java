// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.net;

import android.content.Context;
import android.content.IntentFilter;
import qyc;
import qyd;

public class ProxyChangeListener
{

    private static boolean a = true;
    private long b;
    private Context c;
    private qyd d;

    private ProxyChangeListener(Context context)
    {
        c = context;
    }

    public static void a(ProxyChangeListener proxychangelistener, qyc qyc1)
    {
label0:
        {
            if (a && proxychangelistener.b != 0L)
            {
                if (qyc1 == null)
                {
                    break label0;
                }
                proxychangelistener.nativeProxySettingsChangedTo(proxychangelistener.b, qyc1.a, qyc1.b, qyc1.c, qyc1.d);
            }
            return;
        }
        proxychangelistener.nativeProxySettingsChanged(proxychangelistener.b);
    }

    public static ProxyChangeListener create(Context context)
    {
        return new ProxyChangeListener(context);
    }

    public static String getProperty(String s)
    {
        return System.getProperty(s);
    }

    private native void nativeProxySettingsChanged(long l);

    private native void nativeProxySettingsChangedTo(long l, String s, int i, String s1, String as[]);

    public void start(long l)
    {
        b = l;
        if (d == null)
        {
            IntentFilter intentfilter = new IntentFilter();
            intentfilter.addAction("android.intent.action.PROXY_CHANGE");
            d = new qyd(this);
            c.getApplicationContext().registerReceiver(d, intentfilter);
        }
    }

    public void stop()
    {
        b = 0L;
        if (d != null)
        {
            c.unregisterReceiver(d);
            d = null;
        }
    }

}
