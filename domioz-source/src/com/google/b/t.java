// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.b:
//            w, y

public final class t extends w
    implements Iterable
{

    private final List a = new ArrayList();

    public t()
    {
    }

    public final int a()
    {
        return a.size();
    }

    public final w a(int i)
    {
        return (w)a.get(i);
    }

    public final void a(w w1)
    {
        Object obj = w1;
        if (w1 == null)
        {
            obj = y.a;
        }
        a.add(obj);
    }

    public final Number b()
    {
        if (a.size() == 1)
        {
            return ((w)a.get(0)).b();
        } else
        {
            throw new IllegalStateException();
        }
    }

    public final String c()
    {
        if (a.size() == 1)
        {
            return ((w)a.get(0)).c();
        } else
        {
            throw new IllegalStateException();
        }
    }

    public final double d()
    {
        if (a.size() == 1)
        {
            return ((w)a.get(0)).d();
        } else
        {
            throw new IllegalStateException();
        }
    }

    public final long e()
    {
        if (a.size() == 1)
        {
            return ((w)a.get(0)).e();
        } else
        {
            throw new IllegalStateException();
        }
    }

    public final boolean equals(Object obj)
    {
        return obj == this || (obj instanceof t) && ((t)obj).a.equals(a);
    }

    public final int f()
    {
        if (a.size() == 1)
        {
            return ((w)a.get(0)).f();
        } else
        {
            throw new IllegalStateException();
        }
    }

    public final boolean g()
    {
        if (a.size() == 1)
        {
            return ((w)a.get(0)).g();
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
