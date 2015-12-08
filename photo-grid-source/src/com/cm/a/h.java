// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cm.a;

import java.util.Iterator;

// Referenced classes of package com.cm.a:
//            d, j

final class h
    implements Iterator, java.util.Map.Entry
{

    int a;
    int b;
    boolean c;
    final d d;

    h(d d1)
    {
        d = d1;
        super();
        c = false;
        a = d1.a() - 1;
        b = -1;
    }

    public final boolean equals(Object obj)
    {
        if (!c)
        {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (obj instanceof java.util.Map.Entry)
        {
            if (j.a(((java.util.Map.Entry) (obj = (java.util.Map.Entry)obj)).getKey(), d.a(b, 0)) && j.a(((java.util.Map.Entry) (obj)).getValue(), d.a(b, 1)))
            {
                return true;
            }
        }
        return false;
    }

    public final Object getKey()
    {
        if (!c)
        {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        } else
        {
            return d.a(b, 0);
        }
    }

    public final Object getValue()
    {
        if (!c)
        {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        } else
        {
            return d.a(b, 1);
        }
    }

    public final boolean hasNext()
    {
        return b < a;
    }

    public final int hashCode()
    {
        int k = 0;
        if (!c)
        {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        Object obj = d.a(b, 0);
        Object obj1 = d.a(b, 1);
        int i;
        if (obj == null)
        {
            i = 0;
        } else
        {
            i = obj.hashCode();
        }
        if (obj1 != null)
        {
            k = obj1.hashCode();
        }
        return k ^ i;
    }

    public final volatile Object next()
    {
        b = b + 1;
        c = true;
        return this;
    }

    public final void remove()
    {
        if (!c)
        {
            throw new IllegalStateException();
        } else
        {
            b = b - 1;
            a = a - 1;
            c = false;
            d.a(b);
            return;
        }
    }

    public final Object setValue(Object obj)
    {
        if (!c)
        {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        } else
        {
            return d.a(b, obj);
        }
    }

    public final String toString()
    {
        return (new StringBuilder()).append(getKey()).append("=").append(getValue()).toString();
    }
}
