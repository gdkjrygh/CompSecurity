// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b.a;

import com.google.a.aa;
import com.google.a.ad;
import com.google.a.d.f;
import com.google.a.u;
import com.google.a.x;
import com.google.a.z;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.a.b.a:
//            j

public final class i extends f
{

    private static final Writer a = new j();
    private static final ad b = new ad("closed");
    private final List c = new ArrayList();
    private String d;
    private x e;

    public i()
    {
        super(a);
        e = z.a;
    }

    private void a(x x1)
    {
        if (d != null)
        {
            if (!(x1 instanceof z) || i())
            {
                ((aa)j()).a(d, x1);
            }
            d = null;
            return;
        }
        if (c.isEmpty())
        {
            e = x1;
            return;
        }
        x x2 = j();
        if (x2 instanceof u)
        {
            ((u)x2).a(x1);
            return;
        } else
        {
            throw new IllegalStateException();
        }
    }

    private x j()
    {
        return (x)c.get(c.size() - 1);
    }

    public final f a(long l)
    {
        a(((x) (new ad(Long.valueOf(l)))));
        return this;
    }

    public final f a(Number number)
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
        a(((x) (new ad(number))));
        return this;
    }

    public final f a(String s)
    {
        if (c.isEmpty() || d != null)
        {
            throw new IllegalStateException();
        }
        if (j() instanceof aa)
        {
            d = s;
            return this;
        } else
        {
            throw new IllegalStateException();
        }
    }

    public final f a(boolean flag)
    {
        a(((x) (new ad(Boolean.valueOf(flag)))));
        return this;
    }

    public final x a()
    {
        if (!c.isEmpty())
        {
            throw new IllegalStateException((new StringBuilder("Expected one JSON element but was ")).append(c).toString());
        } else
        {
            return e;
        }
    }

    public final f b()
    {
        u u1 = new u();
        a(u1);
        c.add(u1);
        return this;
    }

    public final f b(String s)
    {
        if (s == null)
        {
            return f();
        } else
        {
            a(new ad(s));
            return this;
        }
    }

    public final f c()
    {
        if (c.isEmpty() || d != null)
        {
            throw new IllegalStateException();
        }
        if (j() instanceof u)
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

    public final f d()
    {
        aa aa1 = new aa();
        a(aa1);
        c.add(aa1);
        return this;
    }

    public final f e()
    {
        if (c.isEmpty() || d != null)
        {
            throw new IllegalStateException();
        }
        if (j() instanceof aa)
        {
            c.remove(c.size() - 1);
            return this;
        } else
        {
            throw new IllegalStateException();
        }
    }

    public final f f()
    {
        a(z.a);
        return this;
    }

    public final void flush()
    {
    }

}
