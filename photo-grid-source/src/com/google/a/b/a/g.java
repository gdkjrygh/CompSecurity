// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b.a;

import com.google.a.aa;
import com.google.a.ad;
import com.google.a.d.a;
import com.google.a.d.e;
import com.google.a.u;
import com.google.a.x;
import com.google.a.z;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.a.b.a:
//            h

public final class g extends a
{

    private static final Reader a = new h();
    private static final Object b = new Object();
    private final List c = new ArrayList();

    public g(x x)
    {
        super(a);
        c.add(x);
    }

    private void a(e e1)
    {
        if (f() != e1)
        {
            throw new IllegalStateException((new StringBuilder("Expected ")).append(e1).append(" but was ").append(f()).toString());
        } else
        {
            return;
        }
    }

    private Object q()
    {
        return c.get(c.size() - 1);
    }

    private Object r()
    {
        return c.remove(c.size() - 1);
    }

    public final void a()
    {
        a(e.a);
        u u1 = (u)q();
        c.add(u1.iterator());
    }

    public final void b()
    {
        a(e.b);
        r();
        r();
    }

    public final void c()
    {
        a(e.c);
        aa aa1 = (aa)q();
        c.add(aa1.a().iterator());
    }

    public final void close()
    {
        c.clear();
        c.add(b);
    }

    public final void d()
    {
        a(e.d);
        r();
        r();
    }

    public final boolean e()
    {
        e e1 = f();
        return e1 != e.d && e1 != e.b;
    }

    public final e f()
    {
        Object obj;
        do
        {
            if (c.isEmpty())
            {
                return e.j;
            }
            obj = q();
            if (!(obj instanceof Iterator))
            {
                break;
            }
            boolean flag = c.get(c.size() - 2) instanceof aa;
            obj = (Iterator)obj;
            if (((Iterator) (obj)).hasNext())
            {
                if (flag)
                {
                    return e.e;
                }
                c.add(((Iterator) (obj)).next());
            } else
            if (flag)
            {
                return e.d;
            } else
            {
                return e.b;
            }
        } while (true);
        if (obj instanceof aa)
        {
            return e.c;
        }
        if (obj instanceof u)
        {
            return e.a;
        }
        if (obj instanceof ad)
        {
            obj = (ad)obj;
            if (((ad) (obj)).m())
            {
                return e.f;
            }
            if (((ad) (obj)).a())
            {
                return e.h;
            }
            if (((ad) (obj)).l())
            {
                return e.g;
            } else
            {
                throw new AssertionError();
            }
        }
        if (obj instanceof z)
        {
            return e.i;
        }
        if (obj == b)
        {
            throw new IllegalStateException("JsonReader is closed");
        } else
        {
            throw new AssertionError();
        }
    }

    public final String g()
    {
        a(e.e);
        java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator)q()).next();
        c.add(entry.getValue());
        return (String)entry.getKey();
    }

    public final String h()
    {
        e e1 = f();
        if (e1 != e.f && e1 != e.g)
        {
            throw new IllegalStateException((new StringBuilder("Expected ")).append(e.f).append(" but was ").append(e1).toString());
        } else
        {
            return ((ad)r()).c();
        }
    }

    public final boolean i()
    {
        a(e.h);
        return ((ad)r()).h();
    }

    public final void j()
    {
        a(e.i);
        r();
    }

    public final double k()
    {
        e e1 = f();
        if (e1 != e.g && e1 != e.f)
        {
            throw new IllegalStateException((new StringBuilder("Expected ")).append(e.g).append(" but was ").append(e1).toString());
        }
        double d1 = ((ad)q()).d();
        if (!p() && (Double.isNaN(d1) || Double.isInfinite(d1)))
        {
            throw new NumberFormatException((new StringBuilder("JSON forbids NaN and infinities: ")).append(d1).toString());
        } else
        {
            r();
            return d1;
        }
    }

    public final long l()
    {
        e e1 = f();
        if (e1 != e.g && e1 != e.f)
        {
            throw new IllegalStateException((new StringBuilder("Expected ")).append(e.g).append(" but was ").append(e1).toString());
        } else
        {
            long l1 = ((ad)q()).f();
            r();
            return l1;
        }
    }

    public final int m()
    {
        e e1 = f();
        if (e1 != e.g && e1 != e.f)
        {
            throw new IllegalStateException((new StringBuilder("Expected ")).append(e.g).append(" but was ").append(e1).toString());
        } else
        {
            int i1 = ((ad)q()).g();
            r();
            return i1;
        }
    }

    public final void n()
    {
        if (f() == e.e)
        {
            g();
            return;
        } else
        {
            r();
            return;
        }
    }

    public final void o()
    {
        a(e.e);
        java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator)q()).next();
        c.add(entry.getValue());
        c.add(new ad((String)entry.getKey()));
    }

    public final String toString()
    {
        return getClass().getSimpleName();
    }

}
