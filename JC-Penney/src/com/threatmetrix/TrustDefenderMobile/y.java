// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.threatmetrix.TrustDefenderMobile;

import android.content.Context;
import android.util.Log;
import android.webkit.WebView;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

// Referenced classes of package com.threatmetrix.TrustDefenderMobile:
//            z

class y
{

    private static volatile WebView a = null;
    private static final Lock b = new ReentrantLock();
    private static Context c = null;
    private static final String d = com/threatmetrix/TrustDefenderMobile/y.getName();

    private y()
    {
    }

    public static WebView a(Context context)
    {
        if (c != null && c != context)
        {
            Log.e(d, "Mismatched context: Only application context should be used, and it should always be consistent between calls");
            return null;
        }
        if (a != null) goto _L2; else goto _L1
_L1:
        b.lock();
        if (a == null)
        {
            a = new WebView(context);
            c = context;
        }
        b.unlock();
_L4:
        return a;
        context;
        b.unlock();
        throw context;
_L2:
        context = d;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static boolean a()
    {
        WebView webview;
        b.lock();
        webview = a;
        boolean flag;
        if (webview != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b.unlock();
        return flag;
        Exception exception;
        exception;
        b.unlock();
        throw exception;
    }

    public static void b()
    {
        b.lock();
        if (a != null)
        {
            WebView webview = a;
            (new z()).execute(new WebView[] {
                webview
            });
        }
        a = null;
        b.unlock();
        return;
        Exception exception;
        exception;
        b.unlock();
        throw exception;
    }

}
