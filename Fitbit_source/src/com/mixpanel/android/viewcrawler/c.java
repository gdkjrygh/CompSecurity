// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.viewcrawler;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.mixpanel.android.viewcrawler:
//            h, l

class c extends h
{
    private static class a
        implements android.view.ViewTreeObserver.OnGlobalLayoutListener, Runnable
    {

        private volatile boolean a;
        private boolean b;
        private final WeakReference c;
        private final l d;
        private final Handler e;

        private void b()
        {
            if (b)
            {
                Object obj = (View)c.get();
                if (obj != null)
                {
                    obj = ((View) (obj)).getViewTreeObserver();
                    if (((ViewTreeObserver) (obj)).isAlive())
                    {
                        ((ViewTreeObserver) (obj)).removeGlobalOnLayoutListener(this);
                    }
                }
                d.a();
            }
            b = false;
        }

        public void a()
        {
            a = true;
            e.post(this);
        }

        public void onGlobalLayout()
        {
            run();
        }

        public void run()
        {
            if (!b)
            {
                return;
            }
            View view = (View)c.get();
            if (view == null || a)
            {
                b();
                return;
            } else
            {
                d.b(view);
                e.removeCallbacks(this);
                e.postDelayed(this, 1000L);
                return;
            }
        }

        public a(View view, l l1, Handler handler)
        {
            d = l1;
            c = new WeakReference(view);
            e = handler;
            b = true;
            a = false;
            view = view.getViewTreeObserver();
            if (view.isAlive())
            {
                view.addOnGlobalLayoutListener(this);
            }
            run();
        }
    }


    private static final String d = "MixpanelAPI.EditState";
    private final Handler a = new Handler(Looper.getMainLooper());
    private final Map b = new HashMap();
    private final Set c = new HashSet();

    public c()
    {
    }

    private void a(View view, List list)
    {
        Set set = c;
        set;
        JVM INSTR monitorenter ;
        int j = list.size();
        int i = 0;
_L2:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        a a1 = new a(view, (l)list.get(i), a);
        c.add(a1);
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        set;
        JVM INSTR monitorexit ;
        return;
        view;
        set;
        JVM INSTR monitorexit ;
        throw view;
    }

    static void a(c c1)
    {
        c1.d();
    }

    private void c()
    {
        if (Thread.currentThread() == a.getLooper().getThread())
        {
            d();
            return;
        } else
        {
            a.post(new Runnable() {

                final c a;

                public void run()
                {
                    c.a(a);
                }

            
            {
                a = c.this;
                super();
            }
            });
            return;
        }
    }

    private void d()
    {
        Iterator iterator = a().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Activity activity = (Activity)iterator.next();
            Object obj = activity.getClass().getCanonicalName();
            View view = activity.getWindow().getDecorView().getRootView();
            List list;
            synchronized (b)
            {
                obj = (List)b.get(obj);
                list = (List)b.get(null);
            }
            if (obj != null)
            {
                a(view, ((List) (obj)));
            }
            if (list != null)
            {
                a(view, list);
            }
        } while (true);
        break MISSING_BLOCK_LABEL_121;
        exception;
        map;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void a(Activity activity)
    {
        super.b(activity);
        c();
    }

    public void a(Object obj)
    {
        b((Activity)obj);
    }

    public void a(Map map)
    {
        Set set = c;
        set;
        JVM INSTR monitorenter ;
        for (Iterator iterator = c.iterator(); iterator.hasNext(); ((a)iterator.next()).a()) { }
        break MISSING_BLOCK_LABEL_46;
        map;
        set;
        JVM INSTR monitorexit ;
        throw map;
        c.clear();
        set;
        JVM INSTR monitorexit ;
        synchronized (b)
        {
            b.clear();
            b.putAll(map);
        }
        c();
        return;
        map;
        map1;
        JVM INSTR monitorexit ;
        throw map;
    }

    public void b(Activity activity)
    {
        super.a(activity);
    }

    public void b(Object obj)
    {
        a((Activity)obj);
    }
}
