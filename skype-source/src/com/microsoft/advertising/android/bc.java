// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.advertising.android;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.microsoft.advertising.android:
//            az, AdWebView, ac, av, 
//            ad, an, NetworkEventManager

public final class bc extends az
    implements NetworkEventManager.a
{

    private static int g[];
    private final ConnectivityManager c;
    private final Hashtable d = new Hashtable();
    private final ad e;
    private String f;

    public bc(AdWebView adwebview, ad ad1)
    {
        super(adwebview);
        f = "unknown";
        c = (ConnectivityManager)adwebview.getContext().getSystemService("connectivity");
        e = ad1;
    }

    private void a(String s, String s1)
    {
        try
        {
            if (!ac.a(s, null))
            {
                throw new Exception("URL access prohibited");
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            av.c("response", s.getMessage());
            a.c("response", "Could not read uri content");
            return;
        }
        if (!TextUtils.isEmpty(s1) && s1.equalsIgnoreCase("ignore"))
        {
            e.a(s);
            return;
        }
        e.a(s, new br.a(s1, s) {

            final bc a;
            private final String b;
            private final String c;

            public final void a(String s2)
            {
label0:
                {
                    if (!TextUtils.isEmpty(b) && b.equalsIgnoreCase("proxy"))
                    {
                        if (!s2.equalsIgnoreCase("exception"))
                        {
                            break label0;
                        }
                        a.a.c("response", "Could not read uri content");
                    }
                    return;
                }
                a.a.k().a(c, s2);
            }

            
            {
                a = bc.this;
                b = s;
                c = s1;
                super();
            }
        });
        return;
    }

    private boolean f()
    {
        NetworkInfo networkinfo = c.getActiveNetworkInfo();
        return networkinfo != null && networkinfo.isConnected();
    }

    private static int[] g()
    {
        int ai[] = g;
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
        g = ai;
        return ai;
    }

    public final void a()
    {
        String s = b();
        if (f.compareToIgnoreCase(s) != 0)
        {
            av.b("NETWORK", (new StringBuilder("Network state : ")).append(s).toString());
            f = s;
            a.k().d(b());
        }
        if (!f())
        {
            break MISSING_BLOCK_LABEL_142;
        }
        Hashtable hashtable = d;
        hashtable;
        JVM INSTR monitorenter ;
        Iterator iterator = d.entrySet().iterator();
_L2:
        if (iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_102;
        }
        d.clear();
        return;
        java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
        a((String)entry.getKey(), (String)entry.getValue());
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        hashtable;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void a(String s, Map map)
    {
        String s1;
label0:
        {
            if (s.equalsIgnoreCase("request"))
            {
                s = (String)map.get("uri");
                s1 = (String)map.get("display");
                a.a("request", String.format("uri=%s;display=%s", new Object[] {
                    s, s1
                }));
                if (!f())
                {
                    break label0;
                }
                a(s, s1);
            }
            return;
        }
        synchronized (d)
        {
            d.put(s, s1);
        }
        return;
        s;
        map;
        JVM INSTR monitorexit ;
        throw s;
    }

    public final String b()
    {
        NetworkInfo networkinfo = c.getActiveNetworkInfo();
        if (networkinfo == null)
        {
            return "offline";
        }
        int i;
        switch (g()[networkinfo.getState().ordinal()])
        {
        case 4: // '\004'
        case 5: // '\005'
        default:
            i = networkinfo.getType();
            if (i == 0)
            {
                return "cell";
            }
            break;

        case 6: // '\006'
            return "unknown";

        case 3: // '\003'
            return "offline";
        }
        if (i == 1)
        {
            return "wifi";
        } else
        {
            return "unknown";
        }
    }

    public final void c()
    {
        NetworkEventManager.a(b).b(this);
    }

    public final void d()
    {
        NetworkEventManager.a(b).b(this);
    }

    public final void e()
    {
        NetworkEventManager.a(b).a(this);
        String s = b();
        if (f.compareToIgnoreCase(s) != 0)
        {
            f = s;
        }
    }
}
