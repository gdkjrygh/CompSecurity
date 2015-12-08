// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b.a;

import com.google.a.d.a;
import com.google.a.d.c;
import com.google.a.r;
import com.google.a.v;
import com.google.a.w;
import com.google.a.z;
import java.io.Reader;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.a.b.a:
//            i

public final class h extends a
{

    private static final Reader a = new i();
    private static final Object b = new Object();
    private final List c;

    private void a(c c1)
    {
        if (f() != c1)
        {
            throw new IllegalStateException((new StringBuilder()).append("Expected ").append(c1).append(" but was ").append(f()).toString());
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

    public void a()
    {
        a(c.a);
        r r1 = (r)r();
        c.add(r1.iterator());
    }

    public void b()
    {
        a(c.b);
        s();
        s();
    }

    public void c()
    {
        a(c.c);
        w w1 = (w)r();
        c.add(w1.a().iterator());
    }

    public void close()
    {
        c.clear();
        c.add(b);
    }

    public void d()
    {
        a(c.d);
        s();
        s();
    }

    public boolean e()
    {
        c c1 = f();
        return c1 != c.d && c1 != c.b;
    }

    public c f()
    {
        if (c.isEmpty())
        {
            return c.j;
        }
        Object obj = r();
        if (obj instanceof Iterator)
        {
            boolean flag = c.get(c.size() - 2) instanceof w;
            obj = (Iterator)obj;
            if (((Iterator) (obj)).hasNext())
            {
                if (flag)
                {
                    return c.e;
                } else
                {
                    c.add(((Iterator) (obj)).next());
                    return f();
                }
            }
            if (flag)
            {
                return c.d;
            } else
            {
                return c.b;
            }
        }
        if (obj instanceof w)
        {
            return c.c;
        }
        if (obj instanceof r)
        {
            return c.a;
        }
        if (obj instanceof z)
        {
            obj = (z)obj;
            if (((z) (obj)).q())
            {
                return c.f;
            }
            if (((z) (obj)).a())
            {
                return c.h;
            }
            if (((z) (obj)).p())
            {
                return c.g;
            } else
            {
                throw new AssertionError();
            }
        }
        if (obj instanceof v)
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

    public String g()
    {
        a(c.e);
        java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator)r()).next();
        c.add(entry.getValue());
        return (String)entry.getKey();
    }

    public String h()
    {
        c c1 = f();
        if (c1 != c.f && c1 != c.g)
        {
            throw new IllegalStateException((new StringBuilder()).append("Expected ").append(c.f).append(" but was ").append(c1).toString());
        } else
        {
            return ((z)s()).c();
        }
    }

    public boolean i()
    {
        a(c.h);
        return ((z)s()).g();
    }

    public void j()
    {
        a(c.i);
        s();
    }

    public double k()
    {
        c c1 = f();
        if (c1 != c.g && c1 != c.f)
        {
            throw new IllegalStateException((new StringBuilder()).append("Expected ").append(c.g).append(" but was ").append(c1).toString());
        }
        double d1 = ((z)r()).d();
        if (!p() && (Double.isNaN(d1) || Double.isInfinite(d1)))
        {
            throw new NumberFormatException((new StringBuilder()).append("JSON forbids NaN and infinities: ").append(d1).toString());
        } else
        {
            s();
            return d1;
        }
    }

    public long l()
    {
        c c1 = f();
        if (c1 != c.g && c1 != c.f)
        {
            throw new IllegalStateException((new StringBuilder()).append("Expected ").append(c.g).append(" but was ").append(c1).toString());
        } else
        {
            long l1 = ((z)r()).e();
            s();
            return l1;
        }
    }

    public int m()
    {
        c c1 = f();
        if (c1 != c.g && c1 != c.f)
        {
            throw new IllegalStateException((new StringBuilder()).append("Expected ").append(c.g).append(" but was ").append(c1).toString());
        } else
        {
            int i1 = ((z)r()).f();
            s();
            return i1;
        }
    }

    public void n()
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

    public void o()
    {
        a(c.e);
        java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator)r()).next();
        c.add(entry.getValue());
        c.add(new z((String)entry.getKey()));
    }

    public String toString()
    {
        return getClass().getSimpleName();
    }

}
