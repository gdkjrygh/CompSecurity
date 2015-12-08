// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.b;

import java.util.Iterator;

// Referenced classes of package android.support.v4.b:
//            f, c

final class j
    implements Iterator, java.util.Map.Entry
{

    int a;
    int b;
    boolean c;
    final f d;

    j(f f1)
    {
        d = f1;
        super();
        c = false;
        a = f1.a() - 1;
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
            if (android.support.v4.b.c.a(((java.util.Map.Entry) (obj = (java.util.Map.Entry)obj)).getKey(), d.a(b, 0)) && android.support.v4.b.c.a(((java.util.Map.Entry) (obj)).getValue(), d.a(b, 1)))
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
            d.a(b);
            b = b - 1;
            a = a - 1;
            c = false;
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
