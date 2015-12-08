// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.os.AsyncTask;
import android.os.SystemClock;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.jcp.b.a;

// Referenced classes of package com.jcp.fragments:
//            gw, gx

class hc extends AsyncTask
{

    final gw a;
    private CookieManager b;
    private CookieSyncManager c;

    private hc(gw gw1)
    {
        a = gw1;
        super();
    }

    hc(gw gw1, gx gx)
    {
        this(gw1);
    }

    protected transient Boolean a(Void avoid[])
    {
        SystemClock.sleep(1000L);
        return Boolean.valueOf(false);
    }

    protected void a(Boolean boolean1)
    {
        a.a(b);
        gw.b(a);
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((Void[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((Boolean)obj);
    }

    protected void onPreExecute()
    {
        c = CookieSyncManager.createInstance(a.i());
        b = CookieManager.getInstance();
        b.setAcceptCookie(true);
        b.removeAllCookie();
        com.jcp.b.a.a(a.i(), 0x7f070276);
        super.onPreExecute();
    }
}
