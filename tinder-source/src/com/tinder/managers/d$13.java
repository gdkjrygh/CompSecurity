// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.managers;

import android.os.AsyncTask;
import com.facebook.login.d;

// Referenced classes of package com.tinder.managers:
//            d, ManagerApp

final class t> extends AsyncTask
{

    final com.tinder.managers.d a;

    private static transient Void a()
    {
        com.tinder.managers.ManagerApp.d().j();
        d.a();
        d.b();
        return null;
    }

    protected final Object doInBackground(Object aobj[])
    {
        return a();
    }

    protected final void onPostExecute(Object obj)
    {
        a.a(false);
        d.b(false);
    }

    protected final void onPreExecute()
    {
        d.b(true);
    }

    erApp(com.tinder.managers.d d1)
    {
        a = d1;
        super();
    }
}
