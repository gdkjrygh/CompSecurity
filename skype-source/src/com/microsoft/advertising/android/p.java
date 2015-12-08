// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.advertising.android;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.microsoft.advertising.android:
//            OrientationChangeEventManager, bu, by, bv, 
//            af, k, g

public final class p
{
    public static interface a
        extends Iterable
    {

        public abstract void a(Object obj);

        public abstract Iterator iterator();
    }

    public static final class b extends WeakHashMap
        implements a, Iterable
    {

        public final void a(Object obj)
        {
            this;
            JVM INSTR monitorenter ;
            super.put(obj, Boolean.TRUE);
            this;
            JVM INSTR monitorexit ;
            return;
            obj;
            throw obj;
        }

        public final Iterator iterator()
        {
            this;
            JVM INSTR monitorenter ;
            Iterator iterator1 = (new ArrayList(super.keySet())).iterator();
            this;
            JVM INSTR monitorexit ;
            return iterator1;
            Exception exception;
            exception;
            throw exception;
        }

        public final int size()
        {
            this;
            JVM INSTR monitorenter ;
            int i1 = super.size();
            this;
            JVM INSTR monitorexit ;
            return i1;
            Exception exception;
            exception;
            throw exception;
        }

        public b()
        {
        }
    }


    private static final p a = new p();
    private ExecutorService b;
    private Context c;
    private Handler d;
    private OrientationChangeEventManager e;
    private volatile String f;
    private final AtomicInteger g = new AtomicInteger(0);
    private k h;
    private a i;
    private volatile int j;
    private String k;
    private String l;
    private String m;
    private String n;
    private bu o;
    private String p;

    protected p()
    {
        b = Executors.newFixedThreadPool(7);
        c = null;
        d = null;
        e = null;
        f = null;
        h = null;
        i = new b();
        j = 0;
        k = "";
        l = "";
        m = "";
        n = "";
        p = "";
        d = new Handler(Looper.getMainLooper());
        l = System.getProperty("http.agent");
        m = (new StringBuilder("AndroidClientSDK/4.4.40715.7 (")).append(k).append(")").toString();
    }

    public static p a()
    {
        return a;
    }

    private void b(Context context)
    {
        if (j > 0)
        {
            return;
        } else
        {
            c = context.getApplicationContext();
            e = new OrientationChangeEventManager(c);
            DisplayMetrics displaymetrics = new DisplayMetrics();
            ((WindowManager)context.getSystemService("window")).getDefaultDisplay().getMetrics(displaymetrics);
            o = new bu(displaymetrics, context);
            p = by.a((new StringBuilder("salt")).append(android.provider.Settings.Secure.getString(context.getContentResolver(), "android_id")).toString());
            bv.a().a(c);
            j = j + 1;
            return;
        }
    }

    public static bv k()
    {
        return bv.a();
    }

    public final void a(Context context)
    {
        af.b();
        if (j >= 2)
        {
            return;
        }
        if (j <= 0)
        {
            b(context);
        }
        k = (new WebView(context)).getSettings().getUserAgentString();
        n = (new StringBuilder("AndroidClientSDK/4.4.40715.7 (")).append(k).append(")").toString();
        j = 2;
    }

    public final void a(g g1, Context context)
    {
        i.a(g1);
        if (context != null)
        {
            b(context);
        }
    }

    public final boolean a(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            return false;
        }
        this;
        JVM INSTR monitorenter ;
        if (f != null)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        f = s;
        this;
        JVM INSTR monitorexit ;
        return true;
        boolean flag = f.equals(s);
        this;
        JVM INSTR monitorexit ;
        return flag;
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
    }

    public final Context b()
    {
        af.a(new Object[] {
            c
        });
        return c;
    }

    public final boolean c()
    {
        return j > 0;
    }

    public final String d()
    {
        return f;
    }

    public final k e()
    {
        if (TextUtils.isEmpty(f))
        {
            return null;
        }
        if (h == null)
        {
            h = new k(f, b);
        }
        return h;
    }

    public final String f()
    {
        return p;
    }

    public final String g()
    {
        boolean flag;
        if (j >= 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        af.a(flag);
        return k;
    }

    public final int h()
    {
        return g.get();
    }

    public final void i()
    {
        g.incrementAndGet();
    }

    public final String j()
    {
        if (n == null)
        {
            return m;
        } else
        {
            return n;
        }
    }

    public final OrientationChangeEventManager l()
    {
        return e;
    }

    public final bu m()
    {
        return o;
    }

    public final ExecutorService n()
    {
        return b;
    }

    public final a o()
    {
        return i;
    }

}
