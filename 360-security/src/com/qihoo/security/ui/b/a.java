// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.b;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.support.v4.content.g;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import com.qihoo.security.SecurityApplication;
import com.qihoo.security.locale.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class com.qihoo.security.ui.b.a
{
    private static class a
    {

        float a;

        private a()
        {
        }

    }

    private final class b extends android.support.v4.c.f
    {

        final com.qihoo.security.ui.b.a a;

        protected Drawable a(Integer integer)
        {
            return com.qihoo.security.ui.b.a.a(a).getResources().getDrawable(integer.intValue());
        }

        protected Object b(Object obj)
        {
            return a((Integer)obj);
        }

        b()
        {
            a = com.qihoo.security.ui.b.a.this;
            super(10);
        }
    }

    class c
        implements Runnable
    {

        d a;
        CountDownLatch b;
        f c;
        String d;
        final com.qihoo.security.ui.b.a e;

        private f a(d d1)
        {
            f f1;
            View view;
            SparseArray sparsearray;
            int k;
            int l;
            int i1;
            try
            {
                f1 = new f();
                view = com.qihoo.security.ui.b.a.c(e).inflate(d1.b, null);
                f1.b = view;
                d1 = d1.c;
            }
            // Misplaced declaration of an exception variable
            catch (d d1)
            {
                return null;
            }
            if (d1 == null) goto _L2; else goto _L1
_L1:
            sparsearray = new SparseArray();
            f1.c = sparsearray;
            l = d1.length;
            k = 0;
_L3:
            if (k >= l)
            {
                break; /* Loop/switch isn't completed */
            }
            i1 = d1[k];
            sparsearray.put(i1, view.findViewById(i1));
            k++;
            if (true) goto _L3; else goto _L2
_L2:
            d = com.qihoo.security.locale.d.a().f();
            return f1;
        }

        public f a()
        {
            try
            {
                b.await();
            }
            catch (InterruptedException interruptedexception) { }
            return c;
        }

        public void run()
        {
            c = a(a);
            b.countDown();
        }

        c(d d1)
        {
            e = com.qihoo.security.ui.b.a.this;
            super();
            b = new CountDownLatch(1);
            a = d1;
        }
    }

    static class d
    {

        boolean a;
        int b;
        int c[];

        d(int k, int ai[], boolean flag)
        {
            b = k;
            c = ai;
            a = flag;
        }
    }

    class e
        implements Runnable
    {

        int a[];
        final com.qihoo.security.ui.b.a b;

        public void run()
        {
            Resources resources;
            int ai[];
            int k;
            int l;
            int i1;
            try
            {
                resources = com.qihoo.security.ui.b.a.a(b).getResources();
                ai = a;
                l = ai.length;
            }
            catch (Exception exception)
            {
                break; /* Loop/switch isn't completed */
            }
            k = 0;
_L2:
            if (k >= l)
            {
                break; /* Loop/switch isn't completed */
            }
            i1 = ai[k];
            com.qihoo.security.ui.b.a.b(b).a(Integer.valueOf(i1), resources.getDrawable(i1));
            k++;
            continue; /* Loop/switch isn't completed */
            if (true) goto _L2; else goto _L1
_L1:
        }

        e(int ai[])
        {
            b = com.qihoo.security.ui.b.a.this;
            super();
            a = ai;
        }
    }

    public static class f
    {

        public View b;
        public SparseArray c;

        public View a(int k)
        {
            if (c != null)
            {
                View view = (View)c.get(k);
                if (view != null)
                {
                    return view;
                }
            }
            return b.findViewById(k);
        }

        public f()
        {
        }
    }


    public static final Executor a = Executors.newFixedThreadPool(2);
    private static com.qihoo.security.ui.b.a h;
    private final LayoutInflater b;
    private b c;
    private final SparseArray d = new SparseArray();
    private final Handler e = new Handler();
    private final BroadcastReceiver f = new BroadcastReceiver() {

        final com.qihoo.security.ui.b.a a;

        public void onReceive(Context context1, Intent intent)
        {
            if (intent != null)
            {
                context1 = intent.getAction();
                if ("com.qihoo.security.REBOOT_MAIN_SCREEN".equals(context1))
                {
                    a.a("locale changed");
                    return;
                }
                if ("android.intent.action.LOCALE_CHANGED".equals(context1))
                {
                    a.a("system locale changed");
                    return;
                }
            }
        }

            
            {
                a = com.qihoo.security.ui.b.a.this;
                super();
            }
    };
    private final a g = new a();
    private final Context i;
    private final SparseArray j = new SparseArray();

    private com.qihoo.security.ui.b.a(Context context)
    {
        c = new b();
        i = context.getApplicationContext();
        b = LayoutInflater.from(i);
        context = i.getResources().getConfiguration();
        if (context != null)
        {
            g.a = ((Configuration) (context)).fontScale;
        }
        b();
    }

    static Context a(com.qihoo.security.ui.b.a a1)
    {
        return a1.i;
    }

    private c a(d d1)
    {
        ArrayList arraylist1 = (ArrayList)d.get(d1.b);
        ArrayList arraylist = arraylist1;
        if (arraylist1 == null)
        {
            arraylist = new ArrayList();
            d.put(d1.b, arraylist);
        }
        d1 = new c(d1);
        arraylist.add(d1);
        e.postDelayed(new Runnable(d1) {

            final c a;
            final com.qihoo.security.ui.b.a b;

            public void run()
            {
                com.qihoo.security.ui.b.a.a.execute(a);
            }

            
            {
                b = com.qihoo.security.ui.b.a.this;
                a = c1;
                super();
            }
        }, 1000L);
        return d1;
    }

    public static com.qihoo.security.ui.b.a a()
    {
        com/qihoo/security/ui/b/a;
        JVM INSTR monitorenter ;
        com.qihoo.security.ui.b.a a1;
        if (h == null)
        {
            h = new com.qihoo.security.ui.b.a(SecurityApplication.a());
        }
        a1 = h;
        com/qihoo/security/ui/b/a;
        JVM INSTR monitorexit ;
        return a1;
        Exception exception;
        exception;
        throw exception;
    }

    static b b(com.qihoo.security.ui.b.a a1)
    {
        return a1.c;
    }

    private c b(int k, int ai[], boolean flag)
    {
        ArrayList arraylist1 = (ArrayList)d.get(k);
        ArrayList arraylist = arraylist1;
        if (arraylist1 == null)
        {
            arraylist = new ArrayList();
            d.put(k, arraylist);
        }
        ai = new c(new d(k, ai, flag));
        arraylist.add(ai);
        a.execute(ai);
        return ai;
    }

    private void b()
    {
        Object obj = android.support.v4.content.g.a(i);
        IntentFilter intentfilter = new IntentFilter("com.qihoo.security.FINISH_MAIN_SCREEN");
        intentfilter.addAction("com.qihoo.security.REBOOT_MAIN_SCREEN");
        ((g) (obj)).a(f, intentfilter);
        obj = new IntentFilter("android.intent.action.LOCALE_CHANGED");
        i.registerReceiver(f, ((IntentFilter) (obj)));
    }

    static LayoutInflater c(com.qihoo.security.ui.b.a a1)
    {
        return a1.b;
    }

    public Drawable a(int k)
    {
        return (Drawable)c.a(Integer.valueOf(k));
    }

    public void a(int k, int ai[], boolean flag)
    {
        SparseArray sparsearray = d;
        sparsearray;
        JVM INSTR monitorenter ;
        ArrayList arraylist = (ArrayList)d.get(k);
        if (arraylist != null) goto _L2; else goto _L1
_L1:
        arraylist = new ArrayList();
        d.put(k, arraylist);
        b(k, ai, flag);
_L4:
        sparsearray;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (!arraylist.isEmpty() && flag) goto _L4; else goto _L3
_L3:
        b(k, ai, flag);
          goto _L4
        ai;
        sparsearray;
        JVM INSTR monitorexit ;
        throw ai;
    }

    public void a(Configuration configuration)
    {
        if (g.a != configuration.fontScale)
        {
            a("font scale");
            g.a = configuration.fontScale;
        }
    }

    public void a(String s)
    {
        s = d;
        s;
        JVM INSTR monitorenter ;
        Object obj;
        int l;
        obj = new ArrayList();
        l = d.size();
        int k = 0;
_L5:
        if (k >= l) goto _L2; else goto _L1
_L1:
        Object obj1 = (ArrayList)d.valueAt(k);
        if (obj1 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        e.removeCallbacksAndMessages(null);
        obj1 = ((ArrayList) (obj1)).iterator();
_L4:
        d d1;
        do
        {
            if (!((Iterator) (obj1)).hasNext())
            {
                continue; /* Loop/switch isn't completed */
            }
            d1 = ((c)((Iterator) (obj1)).next()).a;
        } while (d1 == null);
        if (!d1.a) goto _L4; else goto _L3
_L3:
        ((ArrayList) (obj)).add(d1);
          goto _L4
        obj;
        s;
        JVM INSTR monitorexit ;
        throw obj;
          goto _L5
_L2:
        d.clear();
        for (obj = ((ArrayList) (obj)).iterator(); ((Iterator) (obj)).hasNext(); a((d)((Iterator) (obj)).next())) { }
        s;
        JVM INSTR monitorexit ;
    }

    public void a(int ai[])
    {
        if (ai == null || ai.length == 0)
        {
            return;
        } else
        {
            a.execute(new e(ai));
            return;
        }
    }

    public f b(int k)
    {
        Object obj = d;
        obj;
        JVM INSTR monitorenter ;
        Object obj1 = (ArrayList)d.get(k);
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_30;
        }
        if (!((ArrayList) (obj1)).isEmpty())
        {
            break MISSING_BLOCK_LABEL_34;
        }
        obj;
        JVM INSTR monitorexit ;
        return null;
        obj1 = (c)((ArrayList) (obj1)).remove(0);
        d d1 = ((c) (obj1)).a;
        if (d1.a)
        {
            a(d1);
        }
        obj;
        JVM INSTR monitorexit ;
        Exception exception;
        String s;
        boolean flag;
        try
        {
            obj = ((c) (obj1)).a();
            s = com.qihoo.security.locale.d.a().f();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return null;
        }
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_110;
        }
        flag = s.equals(((c) (obj1)).d);
        if (!flag)
        {
            return null;
        }
        break MISSING_BLOCK_LABEL_110;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        return ((f) (obj));
    }

}
