// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.util.HashMap;

// Referenced classes of package b.a:
//            ou, pq, ni, nc, 
//            oo, nr, ot

public final class nh
    implements ou, pq, Comparable
{

    private static final HashMap a = new HashMap(1000);
    private static final ni b = new ni((byte)0);
    private final int c;
    private final ou d;
    private final nc e;

    private nh(int l, ou ou1, nc nc1)
    {
        if (l < 0)
        {
            throw new IllegalArgumentException("reg < 0");
        }
        if (ou1 == null)
        {
            throw new NullPointerException("type == null");
        } else
        {
            c = l;
            d = ou1;
            e = nc1;
            return;
        }
    }

    private nh(int l, ou ou1, nc nc1, byte byte0)
    {
        this(l, ou1, nc1);
    }

    static int a(int l, ou ou1, nc nc1)
    {
        return d(l, ou1, nc1);
    }

    public static nh a(int l, ou ou1)
    {
        return b(l, ou1, null);
    }

    private String a(boolean flag)
    {
        StringBuffer stringbuffer = new StringBuffer(40);
        stringbuffer.append(k());
        stringbuffer.append(":");
        if (e != null)
        {
            stringbuffer.append(e.toString());
        }
        ot ot1 = d.b();
        stringbuffer.append(ot1);
        if (ot1 != d)
        {
            stringbuffer.append("=");
            if (flag && (d instanceof oo))
            {
                stringbuffer.append(((oo)d).f());
            } else
            if (flag && (d instanceof nr))
            {
                stringbuffer.append(d.h_());
            } else
            {
                stringbuffer.append(d);
            }
        }
        return stringbuffer.toString();
    }

    static boolean a(nh nh1, int l, ou ou1, nc nc1)
    {
        return nh1.c(l, ou1, nc1);
    }

    private static nh b(int l, ou ou1, nc nc1)
    {
        HashMap hashmap = a;
        hashmap;
        JVM INSTR monitorenter ;
        ni ni1 = b;
        ni1.a = l;
        ni1.b = ou1;
        ni1.c = nc1;
        ou1 = (nh)a.get(b);
        if (ou1 == null)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        hashmap;
        JVM INSTR monitorexit ;
        return ou1;
        ou1 = b;
        ou1 = new nh(((ni) (ou1)).a, ((ni) (ou1)).b, ((ni) (ou1)).c, (byte)0);
        a.put(ou1, ou1);
        hashmap;
        JVM INSTR monitorexit ;
        return ou1;
        ou1;
        throw ou1;
    }

    private boolean c(int l, ou ou1, nc nc1)
    {
        return c == l && d.equals(ou1) && (e == nc1 || e != null && e.equals(nc1));
    }

    private static int d(int l, ou ou1, nc nc1)
    {
        int i1;
        if (nc1 != null)
        {
            i1 = nc1.hashCode();
        } else
        {
            i1 = 0;
        }
        return (i1 * 31 + ou1.hashCode()) * 31 + l;
    }

    public final nh a(int l)
    {
        if (c == l)
        {
            return this;
        } else
        {
            return b(l, d, e);
        }
    }

    public final nh a(ou ou1)
    {
        return b(c, ou1, e);
    }

    public final boolean a(nh nh1)
    {
        while (!b(nh1) || c != nh1.c) 
        {
            return false;
        }
        return true;
    }

    public final nh b(int l)
    {
        if (l == 0)
        {
            return this;
        } else
        {
            return a(c + l);
        }
    }

    public final ot b()
    {
        return d.b();
    }

    public final boolean b(nh nh1)
    {
        while (nh1 == null || !d.b().equals(nh1.d.b()) || e != nh1.e && (e == null || !e.equals(nh1.e))) 
        {
            return false;
        }
        return true;
    }

    public final int c()
    {
        return d.c();
    }

    public final int c(nh nh1)
    {
        if (c >= nh1.c)
        {
            if (c > nh1.c)
            {
                return 1;
            }
            int l = d.b().a(nh1.d.b());
            if (l != 0)
            {
                return l;
            }
            if (e == null)
            {
                if (nh1.e == null)
                {
                    return 0;
                }
            } else
            if (nh1.e == null)
            {
                return 1;
            } else
            {
                return e.a(nh1.e);
            }
        }
        return -1;
    }

    public final int compareTo(Object obj)
    {
        return c((nh)obj);
    }

    public final int d()
    {
        return d.d();
    }

    public final int e()
    {
        return c;
    }

    public final boolean equals(Object obj)
    {
        if (!(obj instanceof nh))
        {
            if (obj instanceof ni)
            {
                obj = (ni)obj;
                return c(((ni) (obj)).a, ((ni) (obj)).b, ((ni) (obj)).c);
            } else
            {
                return false;
            }
        } else
        {
            obj = (nh)obj;
            return c(((nh) (obj)).c, ((nh) (obj)).d, ((nh) (obj)).e);
        }
    }

    public final ou f()
    {
        return d;
    }

    public final nc g()
    {
        return e;
    }

    public final int h()
    {
        return c + i();
    }

    public final String h_()
    {
        return a(true);
    }

    public final int hashCode()
    {
        return d(c, d, e);
    }

    public final int i()
    {
        return d.b().f();
    }

    public final boolean j()
    {
        return d.b().g();
    }

    public final String k()
    {
        int l = c;
        return (new StringBuilder("v")).append(l).toString();
    }

    public final String toString()
    {
        return a(false);
    }

}
