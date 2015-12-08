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
//            u

class ab extends AsyncTask
{

    final u a;
    private CookieManager b;
    private CookieSyncManager c;

    protected ab(u u1, CookieManager cookiemanager)
    {
        a = u1;
        super();
        b = cookiemanager;
    }

    protected transient Boolean a(Void avoid[])
    {
        SystemClock.sleep(1000L);
        return Boolean.valueOf(false);
    }

    protected void a(Boolean boolean1)
    {
        a.b(b);
        c.sync();
        u.d(a);
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
        com.jcp.b.a.a(a.i(), 0x7f070276);
        c = CookieSyncManager.createInstance(a.i());
        b.removeAllCookie();
        super.onPreExecute();
    }
}
