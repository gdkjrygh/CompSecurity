// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.a.a.b;

import java.io.Serializable;
import java.util.Comparator;

public final class b
    implements Serializable
{
    private static final class a extends Enum
        implements Comparator
    {

        public static final a a;
        private static final a b[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(org/a/a/b/b$a, s);
        }

        public static final a[] values()
        {
            return (a[])b.clone();
        }

        public final int compare(Object obj, Object obj1)
        {
            return ((Comparable)obj).compareTo(obj1);
        }

        static 
        {
            a = new a("INSTANCE");
            b = (new a[] {
                a
            });
        }

        private a(String s)
        {
            super(s, 0);
        }
    }


    private final Comparator a;
    private final Object b;
    private final Object c;
    private transient int d;
    private transient String e;

    private b(Object obj, Object obj1)
    {
        if (obj == null || obj1 == null)
        {
            throw new IllegalArgumentException((new StringBuilder("Elements in a range must not be null: element1=")).append(obj).append(", element2=").append(obj1).toString());
        }
        a a1 = a.a;
        if (a1.compare(obj, obj1) <= 0)
        {
            b = obj;
            c = obj1;
        } else
        {
            b = obj1;
            c = obj;
        }
        a = a1;
    }

    public static b a(Comparable comparable, Comparable comparable1)
    {
        return new b(comparable, comparable1);
    }

    public final boolean a(Object obj)
    {
        while (obj == null || a.compare(obj, b) < 0 || a.compare(obj, c) > 0) 
        {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (obj == null || obj.getClass() != getClass())
            {
                return false;
            }
            obj = (b)obj;
            if (!b.equals(((b) (obj)).b) || !c.equals(((b) (obj)).c))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        int i = d;
        if (d == 0)
        {
            i = ((getClass().hashCode() + 629) * 37 + b.hashCode()) * 37 + c.hashCode();
            d = i;
        }
        return i;
    }

    public final String toString()
    {
        String s = e;
        Object obj = s;
        if (s == null)
        {
            obj = new StringBuilder(32);
            ((StringBuilder) (obj)).append('[');
            ((StringBuilder) (obj)).append(b);
            ((StringBuilder) (obj)).append("..");
            ((StringBuilder) (obj)).append(c);
            ((StringBuilder) (obj)).append(']');
            obj = ((StringBuilder) (obj)).toString();
            e = ((String) (obj));
        }
        return ((String) (obj));
    }
}
