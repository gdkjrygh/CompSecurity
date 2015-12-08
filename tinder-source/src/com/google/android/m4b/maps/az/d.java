// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.az;

import android.util.Log;
import com.google.android.m4b.maps.aa.ae;
import com.google.android.m4b.maps.aa.f;
import com.google.android.m4b.maps.ak.a;
import com.google.android.m4b.maps.ay.ab;
import com.google.android.m4b.maps.bo.ac;
import com.google.android.m4b.maps.bw.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.m4b.maps.az:
//            c, a, k, j

public final class d
    implements c
{
    public static interface a
    {

        public abstract c a();

        public abstract c a(String s);
    }


    private final Object b = new Object();
    private boolean c;
    private boolean d;
    private volatile c e;
    private volatile c f;
    private final List g = new ArrayList();
    private final a h = new a() {

        private d a;

        public final c a()
        {
            return new k();
        }

        public final c a(String s)
        {
            return new j(s);
        }

            
            {
                a = d.this;
                super();
            }
    };
    private final g i;

    public d(g g1)
    {
        c = true;
        i = g1;
        a();
    }

    private boolean a()
    {
label0:
        {
            synchronized (b)
            {
                if (!d)
                {
                    break label0;
                }
            }
            return true;
        }
        if (!c || !i.b()) goto _L2; else goto _L1
_L1:
        c = false;
        boolean flag = true;
_L4:
        obj;
        JVM INSTR monitorexit ;
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        if (ab.a("CompositeBuildingBoundProvider", 3))
        {
            Log.d("CompositeBuildingBoundProvider", (new StringBuilder(71)).append("Creating providers with baseTiles = true and supplemental list = true").toString());
        }
        obj = h.a();
        f = h.a("/new.building.list");
        e = ((c) (obj));
        obj = b;
        obj;
        JVM INSTR monitorenter ;
        d = true;
        for (Iterator iterator = g.iterator(); iterator.hasNext(); c((c.a)iterator.next())) { }
        break MISSING_BLOCK_LABEL_167;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        exception1;
        obj;
        JVM INSTR monitorexit ;
        throw exception1;
        g.clear();
        obj;
        JVM INSTR monitorexit ;
        return true;
_L2:
        flag = false;
        if (true) goto _L4; else goto _L3
_L3:
        return false;
    }

    private void c(c.a a1)
    {
        if (f != null)
        {
            f.a(a1);
        }
        if (e != null)
        {
            e.a(a1);
        }
    }

    public final Collection a(ac ac)
    {
        if (!a())
        {
            return com.google.android.m4b.maps.az.c.a;
        }
        Object obj = ae.e();
        Object obj1 = ae.e();
        if (f != null)
        {
            obj = f.a(ac);
        }
        if (e != null)
        {
            obj1 = e.a(ac);
        }
        if (obj == com.google.android.m4b.maps.az.c.a || obj1 == com.google.android.m4b.maps.az.c.a)
        {
            return com.google.android.m4b.maps.az.c.a;
        }
        if (((Collection) (obj)).isEmpty() && ((Collection) (obj1)).isEmpty())
        {
            return ae.e();
        }
        ac = new HashSet();
        for (Iterator iterator = ((Collection) (obj)).iterator(); iterator.hasNext(); ac.add(((com.google.android.m4b.maps.az.a)iterator.next()).a)) { }
        obj = com.google.android.m4b.maps.aa.f.a(((Iterable) (obj)));
        obj1 = ((Collection) (obj1)).iterator();
        do
        {
            if (!((Iterator) (obj1)).hasNext())
            {
                break;
            }
            com.google.android.m4b.maps.az.a a1 = (com.google.android.m4b.maps.az.a)((Iterator) (obj1)).next();
            if (!ac.contains(a1.a))
            {
                ((Collection) (obj)).add(a1);
            }
        } while (true);
        return ((Collection) (obj));
    }

    public final void a(c.a a1)
    {
label0:
        {
            a();
            synchronized (b)
            {
                if (d)
                {
                    break label0;
                }
                g.add(a1);
            }
            return;
        }
        obj;
        JVM INSTR monitorexit ;
        c(a1);
        return;
        a1;
        obj;
        JVM INSTR monitorexit ;
        throw a1;
    }

    public final boolean a(com.google.android.m4b.maps.ak.a a1)
    {
        boolean flag = false;
        boolean flag1 = false;
        if (a())
        {
            if (f != null)
            {
                flag = f.a(a1);
            }
            flag1 = flag;
            if (!flag)
            {
                flag1 = flag;
                if (e != null)
                {
                    return e.a(a1);
                }
            }
        }
        return flag1;
    }

    public final void b(c.a a1)
    {
label0:
        {
            a();
            synchronized (b)
            {
                if (d)
                {
                    break label0;
                }
                g.remove(a1);
            }
            return;
        }
        obj;
        JVM INSTR monitorexit ;
        if (f != null)
        {
            f.b(a1);
        }
        if (e != null)
        {
            e.b(a1);
            return;
        } else
        {
            return;
        }
        a1;
        obj;
        JVM INSTR monitorexit ;
        throw a1;
    }
}
