// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.a:
//            x, z

public final class u extends x
    implements Iterable
{

    private final List a = new ArrayList();

    public u()
    {
    }

    public final int a()
    {
        return a.size();
    }

    public final x a(int i)
    {
        return (x)a.get(i);
    }

    public final void a(x x1)
    {
        Object obj = x1;
        if (x1 == null)
        {
            obj = z.a;
        }
        a.add(obj);
    }

    public final Number b()
    {
        if (a.size() == 1)
        {
            return ((x)a.get(0)).b();
        } else
        {
            throw new IllegalStateException();
        }
    }

    public final String c()
    {
        if (a.size() == 1)
        {
            return ((x)a.get(0)).c();
        } else
        {
            throw new IllegalStateException();
        }
    }

    public final double d()
    {
        if (a.size() == 1)
        {
            return ((x)a.get(0)).d();
        } else
        {
            throw new IllegalStateException();
        }
    }

    public final float e()
    {
        if (a.size() == 1)
        {
            return ((x)a.get(0)).e();
        } else
        {
            throw new IllegalStateException();
        }
    }

    public final boolean equals(Object obj)
    {
        return obj == this || (obj instanceof u) && ((u)obj).a.equals(a);
    }

    public final long f()
    {
        if (a.size() == 1)
        {
            return ((x)a.get(0)).f();
        } else
        {
            throw new IllegalStateException();
        }
    }

    public final int g()
    {
        if (a.size() == 1)
        {
            return ((x)a.get(0)).g();
        } else
        {
            throw new IllegalStateException();
        }
    }

    public final boolean h()
    {
        if (a.size() == 1)
        {
            return ((x)a.get(0)).h();
        } else
        {
            throw new IllegalStateException();
        }
    }

    public final int hashCode()
    {
        return a.hashCode();
    }

    public final Iterator iterator()
    {
        return a.iterator();
    }
}
