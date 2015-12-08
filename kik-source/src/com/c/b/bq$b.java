// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.b;


// Referenced classes of package com.c.b:
//            bq

private final class y.getValue
    implements Comparable, java.util.ntry
{

    final bq a;
    private final Comparable b;
    private Object c;

    private static boolean a(Object obj, Object obj1)
    {
        if (obj == null)
        {
            return obj1 == null;
        } else
        {
            return obj.equals(obj1);
        }
    }

    public final Comparable a()
    {
        return b;
    }

    public final volatile int compareTo(Object obj)
    {
        obj = (ect)obj;
        return b.compareTo(((ect) (obj)).b);
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof java.util.ntry))
            {
                return false;
            }
            obj = (java.util.ntry)obj;
            if (!a(b, ((java.util.ntry) (obj)).getKey()) || !a(c, ((java.util.ntry) (obj)).getValue()))
            {
                return false;
            }
        }
        return true;
    }

    public final volatile Object getKey()
    {
        return b;
    }

    public final Object getValue()
    {
        return c;
    }

    public final int hashCode()
    {
        int j = 0;
        int i;
        if (b == null)
        {
            i = 0;
        } else
        {
            i = b.hashCode();
        }
        if (c != null)
        {
            j = c.hashCode();
        }
        return i ^ j;
    }

    public final Object setValue(Object obj)
    {
        bq.a(a);
        Object obj1 = c;
        c = obj;
        return obj1;
    }

    public final String toString()
    {
        return (new StringBuilder()).append(b).append("=").append(c).toString();
    }

    ect(bq bq1, Comparable comparable, Object obj)
    {
        a = bq1;
        super();
        b = comparable;
        c = obj;
    }

    ect(bq bq1, java.util.ntry ntry)
    {
        this(bq1, (Comparable)ntry.getKey(), ntry.getValue());
    }
}
