// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.b.a;

import com.google.b.ac;
import com.google.b.d.a;
import com.google.b.d.c;
import com.google.b.t;
import com.google.b.w;
import com.google.b.y;
import com.google.b.z;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.b.b.a:
//            i

public final class h extends a
{

    private static final Reader a = new i();
    private static final Object b = new Object();
    private final List c = new ArrayList();

    public h(w w)
    {
        super(a);
        c.add(w);
    }

    private void a(c c1)
    {
        if (f() != c1)
        {
            throw new IllegalStateException((new StringBuilder("Expected ")).append(c1).append(" but was ").append(f()).toString());
        } else
        {
            return;
        }
    }

    private Object r()
    {
        return c.get(c.size() - 1);
    }

    private Object s()
    {
        return c.remove(c.size() - 1);
    }

    public final void a()
    {
        a(c.a);
        t t1 = (t)r();
        c.add(t1.iterator());
    }

    public final void b()
    {
        a(c.b);
        s();
        s();
    }

    public final void c()
    {
        a(c.c);
        z z1 = (z)r();
        c.add(z1.a().iterator());
    }

    public final void close()
    {
        c.clear();
        c.add(b);
    }

    public final void d()
    {
        a(c.d);
        s();
        s();
    }

    public final boolean e()
    {
        c c1 = f();
        return c1 != c.d && c1 != c.b;
    }

    public final c f()
    {
        Object obj;
        do
        {
            if (c.isEmpty())
            {
                return c.j;
            }
            obj = r();
            if (!(obj instanceof Iterator))
            {
                break;
            }
            boolean flag = c.get(c.size() - 2) instanceof z;
            obj = (Iterator)obj;
            if (((Iterator) (obj)).hasNext())
            {
                if (flag)
                {
                    return c.e;
                }
                c.add(((Iterator) (obj)).next());
            } else
            if (flag)
            {
                return c.d;
            } else
            {
                return c.b;
            }
        } while (true);
        if (obj instanceof z)
        {
            return c.c;
        }
        if (obj instanceof t)
        {
            return c.a;
        }
        if (obj instanceof ac)
        {
            obj = (ac)obj;
            if (((ac) (obj)).l())
            {
                return c.f;
            }
            if (((ac) (obj)).a())
            {
                return c.h;
            }
            if (((ac) (obj)).k())
            {
                return c.g;
            } else
            {
                throw new AssertionError();
            }
        }
        if (obj instanceof y)
        {
            return c.i;
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
        a(c.e);
        java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator)r()).next();
        c.add(entry.getValue());
        return (String)entry.getKey();
    }

    public final String h()
    {
        c c1 = f();
        if (c1 != c.f && c1 != c.g)
        {
            throw new IllegalStateException((new StringBuilder("Expected ")).append(c.f).append(" but was ").append(c1).toString());
        } else
        {
            return ((ac)s()).c();
        }
    }

    public final boolean i()
    {
        a(c.h);
        return ((ac)s()).g();
    }

    public final void j()
    {
        a(c.i);
        s();
    }

    public final double k()
    {
        c c1 = f();
        if (c1 != c.g && c1 != c.f)
        {
            throw new IllegalStateException((new StringBuilder("Expected ")).append(c.g).append(" but was ").append(c1).toString());
        }
        double d1 = ((ac)r()).d();
        if (!p() && (Double.isNaN(d1) || Double.isInfinite(d1)))
        {
            throw new NumberFormatException((new StringBuilder("JSON forbids NaN and infinities: ")).append(d1).toString());
        } else
        {
            s();
            return d1;
        }
    }

    public final long l()
    {
        c c1 = f();
        if (c1 != c.g && c1 != c.f)
        {
            throw new IllegalStateException((new StringBuilder("Expected ")).append(c.g).append(" but was ").append(c1).toString());
        } else
        {
            long l1 = ((ac)r()).e();
            s();
            return l1;
        }
    }

    public final int m()
    {
        c c1 = f();
        if (c1 != c.g && c1 != c.f)
        {
            throw new IllegalStateException((new StringBuilder("Expected ")).append(c.g).append(" but was ").append(c1).toString());
        } else
        {
            int i1 = ((ac)r()).f();
            s();
            return i1;
        }
    }

    public final void n()
    {
        if (f() == c.e)
        {
            g();
            return;
        } else
        {
            s();
            return;
        }
    }

    public final void o()
    {
        a(c.e);
        java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator)r()).next();
        c.add(entry.getValue());
        c.add(new ac((String)entry.getKey()));
    }

    public final String toString()
    {
        return getClass().getSimpleName();
    }

}
