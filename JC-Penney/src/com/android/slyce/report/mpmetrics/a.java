// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.report.mpmetrics;

import android.content.Context;
import android.os.Message;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

// Referenced classes of package com.android.slyce.report.mpmetrics:
//            c, ab, ac, ba, 
//            b, o

class a
{

    private static int d = 0;
    private static int e = 1;
    private static int f = 2;
    private static int g = 5;
    private static int h = 12;
    private static int i = 13;
    private static final Map j = new HashMap();
    private final c a = new c(this);
    private final Context b;
    private final ab c;

    a(Context context)
    {
        b = context;
        c = c(context);
    }

    static Context a(a a1)
    {
        return a1.b;
    }

    public static a a(Context context)
    {
        Map map = j;
        map;
        JVM INSTR monitorenter ;
        Context context1;
        context1 = context.getApplicationContext();
        if (j.containsKey(context1))
        {
            break MISSING_BLOCK_LABEL_47;
        }
        context = new a(context1);
        j.put(context1, context);
_L2:
        return context;
        context = (a)j.get(context1);
        if (true) goto _L2; else goto _L1
_L1:
        context;
        map;
        JVM INSTR monitorexit ;
        throw context;
    }

    static void a(a a1, String s)
    {
        a1.a(s);
    }

    static void a(a a1, String s, Throwable throwable)
    {
        a1.a(s, throwable);
    }

    private void a(String s)
    {
        if (ab.a)
        {
            Log.v("MixpanelAPI.AnalyticsMessages", (new StringBuilder()).append(s).append(" (Thread ").append(Thread.currentThread().getId()).append(")").toString());
        }
    }

    private void a(String s, Throwable throwable)
    {
        if (ab.a)
        {
            Log.v("MixpanelAPI.AnalyticsMessages", (new StringBuilder()).append(s).append(" (Thread ").append(Thread.currentThread().getId()).append(")").toString(), throwable);
        }
    }

    static ab b(a a1)
    {
        return a1.c;
    }

    static int c()
    {
        return d;
    }

    static int d()
    {
        return e;
    }

    static int e()
    {
        return f;
    }

    static int f()
    {
        return h;
    }

    static int g()
    {
        return i;
    }

    static int h()
    {
        return g;
    }

    public void a()
    {
        Message message = Message.obtain();
        message.what = f;
        a.a(message);
    }

    public void a(b b1)
    {
        Message message = Message.obtain();
        message.what = e;
        message.obj = b1;
        a.a(message);
    }

    public void a(o o)
    {
        Message message = Message.obtain();
        message.what = h;
        message.obj = o;
        a.a(message);
    }

    public void a(JSONObject jsonobject)
    {
        Message message = Message.obtain();
        message.what = d;
        message.obj = jsonobject;
        a.a(message);
    }

    protected ac b(Context context)
    {
        return new ac(context);
    }

    protected ba b()
    {
        return new ba();
    }

    protected ab c(Context context)
    {
        return ab.a(context);
    }

}
