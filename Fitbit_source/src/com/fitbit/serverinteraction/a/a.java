// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.serverinteraction.a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v4.content.LocalBroadcastManager;
import com.fitbit.ApplicationForegroundController;
import com.fitbit.FitBitApplication;
import com.fitbit.mixpanel.MixPanelTrackingHelper;
import com.fitbit.savedstate.BackgroundRequestSavedState;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.fitbit.serverinteraction.a:
//            b

public class a
    implements b
{

    public static final int a = 40;
    public static final long b = 0x927c0L;
    private static final String c = "BackgroundCountOfRequestsFilter";
    private static final com.fitbit.savedstate.BackgroundRequestSavedState.FilterTypes d;
    private BroadcastReceiver e;
    private List f;
    private int g;
    private long h;

    public a()
    {
        e = new BroadcastReceiver() {

            final a a;

            public void onReceive(Context context, Intent intent)
            {
                a.a(a).clear();
                com.fitbit.e.a.a(a.d(), "Go to foreground", new Object[0]);
            }

            
            {
                a = a.this;
                super();
            }
        };
        f = new LinkedList();
        h = 0L;
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction("com.fitbit.ApplicationForegroundController.APP_PROBABLY_SWITCHED_TO_FOREGROUND");
        LocalBroadcastManager.getInstance(FitBitApplication.a()).registerReceiver(e, intentfilter);
    }

    static List a(a a1)
    {
        return a1.f;
    }

    private String d(HttpURLConnection httpurlconnection)
    {
        httpurlconnection = httpurlconnection.getURL();
        if (httpurlconnection != null)
        {
            if ((httpurlconnection = httpurlconnection.getPath()) != null && httpurlconnection.length() != 0)
            {
                return httpurlconnection.replaceAll("/[0-9]+/user/-/", "").replaceAll("/[0-9]+/", "").replaceAll("\\.json", "").replaceAll("\\.xml", "");
            }
        }
        return "Unknown";
    }

    protected void a(List list, int i)
    {
        MixPanelTrackingHelper.a(list, i, b());
    }

    public boolean a()
    {
        return !ApplicationForegroundController.a().b();
    }

    public boolean a(int i)
    {
        return !ApplicationForegroundController.a().b() && ApplicationForegroundController.a().a(i);
    }

    public boolean a(HttpURLConnection httpurlconnection)
    {
        boolean flag1 = true;
        this;
        JVM INSTR monitorenter ;
        if (!b(httpurlconnection)) goto _L2; else goto _L1
_L1:
        int i;
        int j;
        i = c();
        long l = b();
        long l1 = (new Date()).getTime();
        if (l1 - h > l)
        {
            f.clear();
            g = 0;
            h = l1;
            com.fitbit.e.a.a(d(), "Reset interval", new Object[0]);
        }
        if (f.size() <= i)
        {
            if (c(httpurlconnection))
            {
                g = g + 1;
            }
            f.add(d(httpurlconnection));
            if (f.size() == i)
            {
                a(f, g);
            }
        }
        com.fitbit.e.a.a(d(), String.format("Checked background request %s %s", new Object[] {
            httpurlconnection.getRequestMethod(), httpurlconnection.getURL().toString()
        }), new Object[0]);
        j = f.size();
        boolean flag;
        if (j <= i)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        flag = flag1;
        if (!a())
        {
            continue; /* Loop/switch isn't completed */
        }
        com.fitbit.e.a.a(d(), String.format("Unchecked background request %s %s", new Object[] {
            httpurlconnection.getRequestMethod(), httpurlconnection.getURL().toString()
        }), new Object[0]);
        flag = flag1;
        if (true) goto _L4; else goto _L3
_L3:
        httpurlconnection;
        throw httpurlconnection;
    }

    public long b()
    {
        return BackgroundRequestSavedState.a(e(), g());
    }

    public boolean b(HttpURLConnection httpurlconnection)
    {
        return a(BackgroundRequestSavedState.h());
    }

    public int c()
    {
        return BackgroundRequestSavedState.a(e(), f());
    }

    protected boolean c(HttpURLConnection httpurlconnection)
    {
        return Pattern.compile(".*devices/client/tracker/data/sync\\.json.*").matcher(httpurlconnection.getURL().toString()).find();
    }

    protected String d()
    {
        return (new StringBuilder()).append("BackgroundCountOfRequestsFilter").append(e().toString()).toString();
    }

    protected com.fitbit.savedstate.BackgroundRequestSavedState.FilterTypes e()
    {
        return d;
    }

    protected int f()
    {
        return 40;
    }

    protected long g()
    {
        return 0x927c0L;
    }

    static 
    {
        d = com.fitbit.savedstate.BackgroundRequestSavedState.FilterTypes.a;
    }
}
