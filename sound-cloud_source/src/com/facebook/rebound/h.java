// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.rebound;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

// Referenced classes of package com.facebook.rebound:
//            j, l, e, m

public final class h
{
    private static final class a
    {

        public double a;
        double b;

        private a()
        {
        }

        a(byte byte0)
        {
            this();
        }
    }


    private static int l = 0;
    j a;
    boolean b;
    final String c;
    public final a d = new a((byte)0);
    final a e = new a((byte)0);
    final a f = new a((byte)0);
    double g;
    public double h;
    boolean i;
    CopyOnWriteArraySet j;
    double k;
    private double m;
    private double n;
    private final e o;

    h(e e1)
    {
        i = true;
        m = 0.0050000000000000001D;
        n = 0.0050000000000000001D;
        j = new CopyOnWriteArraySet();
        k = 0.0D;
        if (e1 == null)
        {
            throw new IllegalArgumentException("Spring cannot be created outside of a BaseSpringSystem");
        } else
        {
            o = e1;
            e1 = new StringBuilder("spring:");
            int i1 = l;
            l = i1 + 1;
            c = e1.append(i1).toString();
            a(j.c);
            return;
        }
    }

    public final h a(double d1)
    {
        g = d1;
        d.a = d1;
        for (Iterator iterator = j.iterator(); iterator.hasNext(); ((l)iterator.next()).onSpringUpdate(this)) { }
        return this;
    }

    public final h a(j j1)
    {
        if (j1 == null)
        {
            throw new IllegalArgumentException("springConfig is required");
        } else
        {
            a = j1;
            return this;
        }
    }

    public final h a(l l1)
    {
        if (l1 == null)
        {
            throw new IllegalArgumentException("newListener is required");
        } else
        {
            j.add(l1);
            return this;
        }
    }

    public final void a()
    {
        j.clear();
        e e1 = o;
        if (this == null)
        {
            throw new IllegalArgumentException("spring is required");
        } else
        {
            e1.b.remove(this);
            e1.a.remove(c);
            return;
        }
    }

    public final h b(double d1)
    {
        if (h != d1 || !b()) goto _L2; else goto _L1
_L1:
        return this;
_L2:
        Object obj;
        h h1;
        g = d.a;
        h = d1;
        obj = o;
        String s = c;
        h1 = (h)((e) (obj)).a.get(s);
        if (h1 == null)
        {
            throw new IllegalArgumentException((new StringBuilder("springId ")).append(s).append(" does not reference a registered spring").toString());
        }
        obj;
        JVM INSTR monitorenter ;
        ((e) (obj)).b.add(h1);
        if (((e) (obj)).d)
        {
            obj.d = false;
            ((e) (obj)).c.a();
        }
        obj;
        JVM INSTR monitorexit ;
        obj = j.iterator();
        while (((Iterator) (obj)).hasNext()) 
        {
            ((l)((Iterator) (obj)).next()).onSpringEndStateChange(this);
        }
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final boolean b()
    {
        if (Math.abs(d.b) <= m)
        {
            a a1 = d;
            if (Math.abs(h - a1.a) <= n)
            {
                return true;
            }
        }
        return false;
    }

    public final h c()
    {
        j.clear();
        return this;
    }

}
