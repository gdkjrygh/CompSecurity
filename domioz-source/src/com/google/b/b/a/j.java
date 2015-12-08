// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.b.a;

import com.google.b.ac;
import com.google.b.d.d;
import com.google.b.t;
import com.google.b.w;
import com.google.b.y;
import com.google.b.z;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.b.b.a:
//            k

public final class j extends d
{

    private static final Writer a = new k();
    private static final ac b = new ac("closed");
    private final List c = new ArrayList();
    private String d;
    private w e;

    public j()
    {
        super(a);
        e = y.a;
    }

    private void a(w w1)
    {
        if (d != null)
        {
            if (!(w1 instanceof y) || i())
            {
                ((z)j()).a(d, w1);
            }
            d = null;
            return;
        }
        if (c.isEmpty())
        {
            e = w1;
            return;
        }
        w w2 = j();
        if (w2 instanceof t)
        {
            ((t)w2).a(w1);
            return;
        } else
        {
            throw new IllegalStateException();
        }
    }

    private w j()
    {
        return (w)c.get(c.size() - 1);
    }

    public final d a(long l)
    {
        a(((w) (new ac(Long.valueOf(l)))));
        return this;
    }

    public final d a(Number number)
    {
        if (number == null)
        {
            return f();
        }
        if (!g())
        {
            double d1 = number.doubleValue();
            if (Double.isNaN(d1) || Double.isInfinite(d1))
            {
                throw new IllegalArgumentException((new StringBuilder("JSON forbids NaN and infinities: ")).append(number).toString());
            }
        }
        a(((w) (new ac(number))));
        return this;
    }

    public final d a(String s)
    {
        if (c.isEmpty() || d != null)
        {
            throw new IllegalStateException();
        }
        if (j() instanceof z)
        {
            d = s;
            return this;
        } else
        {
            throw new IllegalStateException();
        }
    }

    public final d a(boolean flag)
    {
        a(((w) (new ac(Boolean.valueOf(flag)))));
        return this;
    }

    public final w a()
    {
        if (!c.isEmpty())
        {
            throw new IllegalStateException((new StringBuilder("Expected one JSON element but was ")).append(c).toString());
        } else
        {
            return e;
        }
    }

    public final d b()
    {
        t t1 = new t();
        a(t1);
        c.add(t1);
        return this;
    }

    public final d b(String s)
    {
        if (s == null)
        {
            return f();
        } else
        {
            a(new ac(s));
            return this;
        }
    }

    public final d c()
    {
        if (c.isEmpty() || d != null)
        {
            throw new IllegalStateException();
        }
        if (j() instanceof t)
        {
            c.remove(c.size() - 1);
            return this;
        } else
        {
            throw new IllegalStateException();
        }
    }

    public final void close()
    {
        if (!c.isEmpty())
        {
            throw new IOException("Incomplete document");
        } else
        {
            c.add(b);
            return;
        }
    }

    public final d d()
    {
        z z1 = new z();
        a(z1);
        c.add(z1);
        return this;
    }

    public final d e()
    {
        if (c.isEmpty() || d != null)
        {
            throw new IllegalStateException();
        }
        if (j() instanceof z)
        {
            c.remove(c.size() - 1);
            return this;
        } else
        {
            throw new IllegalStateException();
        }
    }

    public final d f()
    {
        a(y.a);
        return this;
    }

    public final void flush()
    {
    }

}
