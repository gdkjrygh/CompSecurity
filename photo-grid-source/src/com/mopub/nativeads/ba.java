// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.nativeads;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import com.mopub.common.logging.MoPubLog;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

// Referenced classes of package com.mopub.nativeads:
//            bd, be, bb, bc, 
//            bf

final class ba
{

    android.view.ViewTreeObserver.OnPreDrawListener a;
    final WeakReference b;
    private final ArrayList c;
    private long d;
    private final Map e;
    private final bd f;
    private bf g;
    private final be h;
    private final Handler i;
    private boolean j;

    public ba(Context context)
    {
        this(context, ((Map) (new WeakHashMap(10))), new bd(), new Handler());
    }

    private ba(Context context, Map map, bd bd1, Handler handler)
    {
        d = 0L;
        e = map;
        f = bd1;
        i = handler;
        h = new be(this);
        c = new ArrayList(50);
        context = ((Activity)context).getWindow().getDecorView();
        b = new WeakReference(context);
        context = context.getViewTreeObserver();
        if (!context.isAlive())
        {
            MoPubLog.w("Visibility Tracker was unable to track views because the root view tree observer was not alive");
            return;
        } else
        {
            a = new bb(this);
            context.addOnPreDrawListener(a);
            return;
        }
    }

    static boolean a(ba ba1)
    {
        ba1.j = false;
        return false;
    }

    static Map b(ba ba1)
    {
        return ba1.e;
    }

    static bd c(ba ba1)
    {
        return ba1.f;
    }

    static bf d(ba ba1)
    {
        return ba1.g;
    }

    final void a()
    {
        e.clear();
        i.removeMessages(0);
        j = false;
    }

    final void a(View view)
    {
        e.remove(view);
    }

    final void a(View view, int k)
    {
        bc bc2 = (bc)e.get(view);
        bc bc1 = bc2;
        if (bc2 == null)
        {
            bc1 = new bc();
            e.put(view, bc1);
            c();
        }
        bc1.a = k;
        bc1.b = d;
        d = d + 1L;
        if (d % 50L == 0L)
        {
            long l = d;
            view = e.entrySet().iterator();
            do
            {
                if (!view.hasNext())
                {
                    break;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry)view.next();
                if (((bc)entry.getValue()).b < l - 50L)
                {
                    c.add(entry.getKey());
                }
            } while (true);
            for (view = c.iterator(); view.hasNext(); a((View)view.next())) { }
            c.clear();
        }
    }

    final void a(bf bf)
    {
        g = bf;
    }

    final void b()
    {
        a();
        Object obj = (View)b.get();
        if (obj != null && a != null)
        {
            obj = ((View) (obj)).getViewTreeObserver();
            if (((ViewTreeObserver) (obj)).isAlive())
            {
                ((ViewTreeObserver) (obj)).removeOnPreDrawListener(a);
            }
            a = null;
        }
        g = null;
    }

    final void c()
    {
        if (j)
        {
            return;
        } else
        {
            j = true;
            i.postDelayed(h, 100L);
            return;
        }
    }
}
