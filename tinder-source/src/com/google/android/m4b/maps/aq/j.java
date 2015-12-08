// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aq;

import android.content.res.Resources;
import android.os.RemoteException;
import android.util.TypedValue;
import com.google.android.m4b.maps.aa.f;
import com.google.android.m4b.maps.ay.m;
import com.google.android.m4b.maps.bf.c;
import com.google.android.m4b.maps.bi.b;
import com.google.android.m4b.maps.bo.br;
import com.google.android.m4b.maps.bo.g;
import com.google.android.m4b.maps.bx.ab;
import com.google.android.m4b.maps.bx.ae;
import com.google.android.m4b.maps.bx.l;
import com.google.android.m4b.maps.cg.ag;
import com.google.android.m4b.maps.cg.cc;
import com.google.android.m4b.maps.cg.s;
import com.google.android.m4b.maps.cg.t;
import com.google.android.m4b.maps.cg.w;
import com.google.android.m4b.maps.cg.y;
import com.google.android.m4b.maps.da.d;
import com.google.android.m4b.maps.df.ai;
import com.google.android.m4b.maps.j.x;
import com.google.android.m4b.maps.model.GroundOverlayOptions;
import com.google.android.m4b.maps.model.LatLng;
import com.google.android.m4b.maps.model.LatLngBounds;
import com.google.android.m4b.maps.model.RuntimeRemoteException;
import com.google.android.m4b.maps.model.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.m4b.maps.aq:
//            l, m, v, b

public final class j
    implements com.google.android.m4b.maps.aq.l, com.google.android.m4b.maps.cg.y.a
{

    final ae a;
    public final y b;
    private float c;
    private final w d;
    private final com.google.android.m4b.maps.aq.m e;

    j(y y1, w w1, ae ae1, com.google.android.m4b.maps.aq.m m1)
    {
        b = y1;
        d = w1;
        e = m1;
        a = ae1;
        a(-1);
    }

    public final void a()
    {
        synchronized (e)
        {
            e.a(this);
        }
        e.b();
        return;
        exception;
        m1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void a(int i)
    {
        if ((i & 2) != 0)
        {
            synchronized (e)
            {
                c = b.e();
                e.c();
            }
            return;
        } else
        {
            return;
        }
        exception;
        m1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void a(long l1)
    {
        ((l) (a)).f.m = l1;
    }

    public final void a(com.google.android.m4b.maps.ac.a a1)
    {
        a.a(new br(a1));
        e.b();
    }

    public final void a(b b1, com.google.android.m4b.maps.bm.d d1)
    {
        this;
        JVM INSTR monitorenter ;
        if (b.g())
        {
            break MISSING_BLOCK_LABEL_15;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        this;
        JVM INSTR monitorexit ;
        a.a(b1, d1);
        return;
        b1;
        this;
        JVM INSTR monitorexit ;
        throw b1;
    }

    public final void a(com.google.android.m4b.maps.bm.d d1)
    {
        a.a(d1);
    }

    public final void a(com.google.android.m4b.maps.bm.d d1, b b1, ab ab)
    {
        this;
        JVM INSTR monitorenter ;
        if (b.g())
        {
            break MISSING_BLOCK_LABEL_15;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        this;
        JVM INSTR monitorexit ;
        a.a(d1, b1, ab);
        return;
        d1;
        this;
        JVM INSTR monitorexit ;
        throw d1;
    }

    public final void a(com.google.android.m4b.maps.bm.d d1, com.google.android.m4b.maps.bx.j j1)
    {
        a.a(d1, j1);
    }

    public final void a(boolean flag)
    {
        a.a(flag);
    }

    public final boolean a(g g1, b b1)
    {
        this;
        JVM INSTR monitorenter ;
        if (b.g())
        {
            break MISSING_BLOCK_LABEL_16;
        }
        this;
        JVM INSTR monitorexit ;
        return false;
        this;
        JVM INSTR monitorexit ;
        List list;
        list = a.a(g1, b1, this);
        if (list.isEmpty())
        {
            return false;
        }
        break MISSING_BLOCK_LABEL_47;
        g1;
        this;
        JVM INSTR monitorexit ;
        throw g1;
        com.google.android.m4b.maps.aq.m m1 = e;
        ArrayList arraylist = new ArrayList();
        if (b.i())
        {
            arraylist.addAll(list);
        }
        Iterator iterator = com.google.android.m4b.maps.aa.f.a(m1.b).iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj = (com.google.android.m4b.maps.aq.l)iterator.next();
            if ((obj instanceof j) && obj != this)
            {
                obj = (j)obj;
                List list1 = ((j) (obj)).a.a(g1, b1, ((j) (obj)));
                list.addAll(list1);
                if (((j) (obj)).b.i())
                {
                    arraylist.addAll(list1);
                }
            }
        } while (true);
        if (!arraylist.isEmpty() && m1.d != null)
        {
            w w1 = m1.d;
            float f2 = TypedValue.applyDimension(1, 52F, m1.a.getResources().getDisplayMetrics());
            float f1 = b1.a(f2, b1.b(g1));
            f2 = b1.a(f2, b1.b(g1));
            b1 = new g((int)((float)g1.a + f1), (int)((float)g1.b - f2));
            Object obj1 = new g((int)((float)g1.a - f1), (int)(f2 + (float)g1.b));
            g1 = com.google.android.m4b.maps.aq.b.a(b1);
            b1 = com.google.android.m4b.maps.aq.b.a(((g) (obj1)));
            obj1 = LatLngBounds.a();
            ((com.google.android.m4b.maps.model.LatLngBounds.a) (obj1)).a(g1);
            ((com.google.android.m4b.maps.model.LatLngBounds.a) (obj1)).a(b1);
            int i;
            boolean flag;
            if (!Double.isNaN(((com.google.android.m4b.maps.model.LatLngBounds.a) (obj1)).c))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            x.a(flag, "no included points");
            g1 = new LatLngBounds(new LatLng(((com.google.android.m4b.maps.model.LatLngBounds.a) (obj1)).a, ((com.google.android.m4b.maps.model.LatLngBounds.a) (obj1)).c), new LatLng(((com.google.android.m4b.maps.model.LatLngBounds.a) (obj1)).b, ((com.google.android.m4b.maps.model.LatLngBounds.a) (obj1)).d));
            if (w1.i != null)
            {
                w1.b();
            }
            w1.i = arraylist;
            if (w1.i.size() > 1)
            {
                i = com.google.android.m4b.maps.h.e.maps_circle_active_grouped;
            } else
            {
                i = com.google.android.m4b.maps.h.e.maps_circle_active;
            }
            b1 = new GroundOverlayOptions();
            b1.b = new a(com.google.android.m4b.maps.da.d.a(new com.google.android.m4b.maps.cg.bl.e(w1.b, i, (byte)0)));
            if (((GroundOverlayOptions) (b1)).c == null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            obj1 = String.valueOf(((GroundOverlayOptions) (b1)).c);
            x.a(flag, (new StringBuilder(String.valueOf(obj1).length() + 46)).append("Position has already been set using position: ").append(((String) (obj1))).toString());
            b1.f = g1;
            b1.h = 3.402823E+38F;
            w1.h = new cc(b1, w1.d, w1.e, w1.f, w1.g, w1.b);
            g1 = w1.c.a(w1.h);
            w1.h.a = g1;
        }
        if (m1.c != null)
        {
            g1 = com.google.android.m4b.maps.aa.f.b(list.size());
            for (b1 = list.iterator(); b1.hasNext(); g1.add((t)b1.next())) { }
            try
            {
                m1.c.a(g1);
            }
            // Misplaced declaration of an exception variable
            catch (g g1)
            {
                throw new RuntimeRemoteException(g1);
            }
        }
        g1 = new s(list, new m._cls2(m1, arraylist, list), m1.e);
        ((s) (g1)).a.c(g1);
        return true;
    }

    public final void b()
    {
        a.l_();
    }

    public final void b(int i)
    {
        a.a(i);
    }

    public final boolean c()
    {
        return a.e();
    }

    public final void d()
    {
        this;
        JVM INSTR monitorenter ;
        t t1 = d.j;
        if (t1 == null)
        {
            break MISSING_BLOCK_LABEL_32;
        }
        if (t1.a == b)
        {
            d.b();
        }
        a.a(null);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final String e()
    {
        return b.c;
    }

    public final float f()
    {
        return c;
    }
}
