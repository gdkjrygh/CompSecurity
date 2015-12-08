// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bt;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.RemoteException;
import com.google.android.m4b.maps.ay.ab;
import com.google.android.m4b.maps.cg.aa;
import com.google.android.m4b.maps.cg.ac;
import com.google.android.m4b.maps.cg.ag;
import com.google.android.m4b.maps.cg.ai;
import com.google.android.m4b.maps.cg.bd;
import com.google.android.m4b.maps.cg.cc;
import com.google.android.m4b.maps.cg.w;
import com.google.android.m4b.maps.cg.y;
import com.google.android.m4b.maps.df.v;
import com.google.android.m4b.maps.df.z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

// Referenced classes of package com.google.android.m4b.maps.bt:
//            e, j, l, k, 
//            d

public final class h
    implements com.google.android.m4b.maps.cg.ac.a, ag
{
    final class a
        implements Comparator
    {

        private h a;

        public final int compare(Object obj, Object obj1)
        {
            obj = (l)obj;
            obj1 = (l)obj1;
            return Float.compare(((l) (obj)).b(), ((l) (obj1)).b());
        }

        a()
        {
            a = h.this;
            super();
        }
    }


    final List a = new ArrayList();
    final List b = new ArrayList();
    final List c = new ArrayList();
    final d d;
    aa e;
    float f;
    float g;
    float h;
    float i;
    private a j;
    private final ScheduledExecutorService k;

    public h(d d1, ScheduledExecutorService scheduledexecutorservice)
    {
        j = new a();
        d = d1;
        k = scheduledexecutorservice;
    }

    public final com.google.android.m4b.maps.cg.aa.a a(aa aa1)
    {
        return new e(aa1, this);
    }

    public final aa a()
    {
        if (c.size() == 1)
        {
            return (aa)c.get(0);
        } else
        {
            return null;
        }
    }

    public final com.google.android.m4b.maps.cg.ai.a a(ai ai, boolean flag)
    {
        return new j(ai, flag, this);
    }

    public final com.google.android.m4b.maps.cg.bd.a a(bd bd)
    {
        ab.a(5, "Tile Overlays are not supported in Lite Mode");
        return null;
    }

    public final com.google.android.m4b.maps.cg.cc.a a(cc cc)
    {
        ab.a(5, "Ground Overlays are not supported in Lite Mode");
        return null;
    }

    public final com.google.android.m4b.maps.cg.y.a a(y y)
    {
        ab.a(5, "Maps Engine Layers are not supported in Lite Mode");
        return null;
    }

    public final void a(Canvas canvas, k k1)
    {
        Collections.sort(a, j);
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((l)iterator.next()).a(canvas, k1)) { }
        Iterator iterator1 = b.iterator();
        do
        {
            if (!iterator1.hasNext())
            {
                break;
            }
            e e1 = (e)iterator1.next();
            Bitmap bitmap1 = e1.a.f();
            int i1 = (int)(e1.a.g() * (float)bitmap1.getWidth());
            int j1 = (int)(e1.a.h() * (float)bitmap1.getHeight());
            Point point = k1.a(e1.a.e());
            e1.c = new Point(point.x - i1, point.y - j1);
            int l1 = point.x;
            int i2 = bitmap1.getWidth();
            int j2 = point.y;
            e1.d = new Point((i2 - i1) + l1, (bitmap1.getHeight() - j1) + j2);
            if (bitmap1 != null && e1.a.u())
            {
                e1.b.setAlpha((int)(255F * e1.a.B()));
                canvas.drawBitmap(bitmap1, e1.c.x, e1.c.y, e1.b);
            }
        } while (true);
        c.clear();
        if (k1 != null)
        {
            k1 = new Rect(0, 0, k1.f, k1.g);
            Iterator iterator2 = b.iterator();
            do
            {
                if (!iterator2.hasNext())
                {
                    break;
                }
                e e2 = (e)iterator2.next();
                if (Rect.intersects(k1, e2.g()))
                {
                    c.add(e2.a);
                }
            } while (true);
        }
        if (e != null)
        {
            Object obj = e;
            Bitmap bitmap = ((aa) (obj)).f();
            Rect rect = ((aa) (obj)).D();
            try
            {
                k1 = ((aa) (obj)).a.k.a(((com.google.android.m4b.maps.model.internal.k) (obj)), canvas.getWidth(), canvas.getHeight());
            }
            // Misplaced declaration of an exception variable
            catch (k k1)
            {
                k1.printStackTrace();
                k1 = null;
            }
            if (k1 != null)
            {
                h = k1.getWidth();
                i = k1.getHeight();
                float f1 = ((aa) (obj)).i();
                float f2 = ((aa) (obj)).k();
                obj = new Paint();
                float f3 = rect.left;
                f = (f1 * (float)bitmap.getWidth() + f3) - h / 2.0F;
                g = ((float)rect.top + f2 * (float)bitmap.getHeight()) - i;
                canvas.drawBitmap(k1, f, g, ((Paint) (obj)));
            }
        }
    }

    final void a(e e1)
    {
        if (e == e1.a)
        {
            e = null;
        }
        d.invalidate();
    }

    public final void a(w w)
    {
    }

    public final void a(com.google.android.m4b.maps.df.ai ai)
    {
    }

    public final void a(z z)
    {
    }

    public final boolean b()
    {
        return c.size() > 1;
    }

    public final List c()
    {
        return c;
    }
}
