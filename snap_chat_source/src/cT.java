// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class cT
{
    public static final class a
    {

        public double a;
        public double b;

        private a()
        {
        }

        a(byte byte0)
        {
            this();
        }
    }


    private static int l = 0;
    cV a;
    public boolean b;
    final String c;
    public final a d = new a((byte)0);
    final a e = new a((byte)0);
    final a f = new a((byte)0);
    double g;
    public double h;
    boolean i;
    cR j;
    double k;
    private double m;
    private double n;
    private final cP o;

    cT(cP cp)
    {
        i = true;
        m = 0.0050000000000000001D;
        n = 0.0050000000000000001D;
        j = new cR();
        k = 0.0D;
        if (cp == null)
        {
            throw new IllegalArgumentException("Spring cannot be created outside of a BaseSpringSystem");
        } else
        {
            o = cp;
            cp = new StringBuilder("spring:");
            int i1 = l;
            l = i1 + 1;
            c = cp.append(i1).toString();
            a(cV.c);
            return;
        }
    }

    public final cT a(double d1)
    {
        g = d1;
        d.a = d1;
        for (Iterator iterator = j.iterator(); iterator.hasNext(); ((cX)iterator.next()).a(this)) { }
        return this;
    }

    public final cT a(cV cv)
    {
        if (cv == null)
        {
            throw new IllegalArgumentException("springConfig is required");
        } else
        {
            a = cv;
            return this;
        }
    }

    public final cT a(cX cx)
    {
        if (cx == null)
        {
            throw new IllegalArgumentException("newListener is required");
        } else
        {
            j.a(cx);
            return this;
        }
    }

    public final void a()
    {
        j.a();
        cP cp = o;
        if (this == null)
        {
            throw new IllegalArgumentException("spring is required");
        } else
        {
            cp.b.remove(this);
            cp.a.remove(c);
            return;
        }
    }

    public final cT b(double d1)
    {
        if (h != d1 || !b()) goto _L2; else goto _L1
_L1:
        return this;
_L2:
        Object obj;
        cT ct;
        g = d.a;
        h = d1;
        obj = o;
        String s = c;
        ct = (cT)((cP) (obj)).a.get(s);
        if (ct == null)
        {
            throw new IllegalArgumentException((new StringBuilder("springId ")).append(s).append(" does not reference a registered spring").toString());
        }
        obj;
        JVM INSTR monitorenter ;
        ((cP) (obj)).b.add(ct);
        if (((cP) (obj)).d)
        {
            obj.d = false;
            ((cP) (obj)).c.a();
        }
        obj;
        JVM INSTR monitorexit ;
        obj = j.iterator();
        while (((Iterator) (obj)).hasNext()) 
        {
            ((Iterator) (obj)).next();
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

    public final cT c(double d1)
    {
        d.b = d1;
        return this;
    }

}
