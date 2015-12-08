// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.runtrack.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.LruCache;
import android.view.View;
import com.fitbit.e.a;
import com.fitbit.maps.FitbitMapFragment;
import com.fitbit.maps.LatLng;
import com.fitbit.maps.LatLngBounds;
import com.fitbit.maps.PolylineOptions;
import com.fitbit.maps.e;
import com.fitbit.maps.h;
import com.fitbit.maps.v;
import com.fitbit.runtrack.data.b;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class m
    implements com.fitbit.maps.h.g, com.fitbit.maps.h.m
{

    private final View a;
    private final String b = "ThumbnailMaker";
    private final h c;
    private final b d;
    private final Queue e = new LinkedList();
    private final Executor f;
    private final int g;
    private final LruCache h = new _cls1(0x3d0900);
    private final int i = 10000;
    private final int j = 4;

    public m(FitbitMapFragment fitbitmapfragment, b b1, int k)
    {
        a = fitbitmapfragment.getView();
        c = fitbitmapfragment.b();
        g = k;
        d = b1;
        f = new ThreadPoolExecutor(0, 1, 100L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
    }

    private static File a(Context context, String s)
    {
        return new File(context.getCacheDir(), String.format("exercise_%s.png", new Object[] {
            s
        }));
    }

    private void a(d d1)
    {
    /* block-local class not found */
    class d {}

        com.fitbit.e.a.a("ThumbnailMaker", "Setup new Map for %s", new Object[] {
            d1.b.getAbsolutePath()
        });
    /* block-local class not found */
    class a {}

        (new a(d, this)).execute(new d[] {
            d1
        });
    }

    public void a()
    {
        com.fitbit.e.a.a("ThumbnailMaker", "Map Loading taking a snapshot", new Object[0]);
        c.a(null);
        c.a(this);
    }

    public void a(Context context, com.fitbit.data.domain.b b1, String s, b b2)
    {
        context = new d(b2, b1, a(context, s));
        s = (Bitmap)h.get(((d) (context)).b.getName());
        if (s != null)
        {
            com.fitbit.e.a.a("ThumbnailMaker", "Cache hit for request %s", new Object[] {
                ((d) (context)).b.getName()
            });
    /* block-local class not found */
    class b {}

            b2.a(s, b1);
            return;
        } else
        {
    /* block-local class not found */
    class c {}

            (new c()).execute(new d[] {
                context
            });
            return;
        }
    }

    public void a(Bitmap bitmap)
    {
        d d1 = (d)e.poll();
        h.put(d1.b.getName(), bitmap);
        b b1 = d1.a();
        if (b1 != null)
        {
            b1.a(bitmap, d1.a);
        }
        com.fitbit.e.a.a("ThumbnailMaker", "Snap shot taken, requests is empty ? %s", new Object[] {
            Boolean.valueOf(e.isEmpty())
        });
    /* block-local class not found */
    class e {}

        f.execute(new e(bitmap, d1.b));
        if (!e.isEmpty())
        {
            a((d)e.peek());
        }
    }

    public void a(d d1, Bitmap bitmap)
    {
        b b1 = d1.a();
        if (bitmap == null) goto _L2; else goto _L1
_L1:
        h.put(d1.b.getName(), bitmap);
        if (b1 != null) goto _L4; else goto _L3
_L3:
        return;
_L4:
        com.fitbit.e.a.a("ThumbnailMaker", "Loaded Map from Disk %s", new Object[] {
            d1.b.getAbsolutePath()
        });
        b1.a(bitmap, d1.a);
        return;
_L2:
        e.add(d1);
        if (e.size() == 1)
        {
            a(d1);
            return;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    void a(d d1, List list)
    {
        if (list.isEmpty() || c == null)
        {
            e.poll();
            if (!e.isEmpty())
            {
                a((d)e.peek());
            }
            return;
        }
        d1 = c.m();
        d1.i(false);
        d1.c(false);
        d1.h(false);
        d1.e(false);
        d1.g(false);
        d1.a(false);
        d1.f(false);
        c.c(false);
        c.b(false);
        c.d(false);
        c.a(h.a);
        c.a(false);
        c.e();
        d1 = new PolylineOptions();
        d1.b(true);
        com.fitbit.maps.LatLngBounds.a a1 = LatLngBounds.b();
        for (Iterator iterator = list.iterator(); iterator.hasNext(); a1.a((LatLng)iterator.next())) { }
        d1.a(list);
        d1.a(g);
        c.a(d1);
        d1 = a1.a();
        int k = (int)((double)Math.min(a.getMeasuredHeight(), a.getMeasuredWidth()) * 0.10000000000000001D);
        c.a(com.fitbit.maps.e.a(d1, k));
        c.a(this);
    }

    /* member class not found */
    class _cls1 {}

}
