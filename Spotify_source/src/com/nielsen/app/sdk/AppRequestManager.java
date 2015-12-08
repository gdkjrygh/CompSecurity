// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nielsen.app.sdk;

import android.content.Context;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import org.apache.http.params.HttpParams;

// Referenced classes of package com.nielsen.app.sdk:
//            c

class AppRequestManager
{

    public static final int a = 2;
    public static final int b = 0;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    public static final int g = 0;
    public static final int h = 1;
    public static final int i = 2;
    public static final int j = 3;
    public static final int k = 4;
    public static final int m = 0;
    public static final int n = 1;
    public static final int o = 2;
    private static AppRequestManager t = null;
    Map l;
    HttpParams p;
    private int q;
    private ArrayList r;
    private ArrayList s;
    private Context u;

    private AppRequestManager(Context context, int i1)
    {
        l = new LinkedHashMap();
        p = null;
        q = 2;
        r = new ArrayList();
        s = new ArrayList();
        u = null;
        try
        {
            u = context;
            q = i1;
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            com.nielsen.app.sdk.c.a(context, true, 'E', "Could not instantiate request manager object", new Object[0]);
        }
    }

    static Context a(AppRequestManager apprequestmanager)
    {
        return apprequestmanager.u;
    }

    static AppRequestManager a()
    {
        return t;
    }

    public static AppRequestManager a(Context context, int i1)
    {
        com/nielsen/app/sdk/AppRequestManager;
        JVM INSTR monitorenter ;
        if (t == null)
        {
            t = new AppRequestManager(context, i1);
        }
        context = t;
        com/nielsen/app/sdk/AppRequestManager;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    static void a(AppRequestManager apprequestmanager, Runnable runnable)
    {
        apprequestmanager.b(runnable);
    }

    private void b()
    {
        this;
        JVM INSTR monitorenter ;
        if (!s.isEmpty() && r.size() < q)
        {
            Runnable runnable = (Runnable)s.get(0);
            s.remove(0);
            r.add(runnable);
            (new Thread(runnable)).start();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private void b(Runnable runnable)
    {
        this;
        JVM INSTR monitorenter ;
        r.remove(runnable);
        b();
        this;
        JVM INSTR monitorexit ;
        return;
        runnable;
        throw runnable;
    }

    public void a(Runnable runnable)
    {
        s.add(runnable);
        b();
    }

}
