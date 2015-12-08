// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.ct;

import java.util.Iterator;

// Referenced classes of package com.google.android.m4b.maps.ct:
//            o, q

public final class n extends o
{
    static final class a
        implements java.util.Map.Entry
    {

        private java.util.Map.Entry a;

        public final Object getKey()
        {
            return a.getKey();
        }

        public final Object getValue()
        {
            n n1 = (n)a.getValue();
            if (n1 == null)
            {
                return null;
            } else
            {
                return n1.b();
            }
        }

        public final Object setValue(Object obj)
        {
            if (!(obj instanceof q))
            {
                throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
            } else
            {
                return ((n)a.getValue()).b((q)obj);
            }
        }

        private a(java.util.Map.Entry entry)
        {
            a = entry;
        }

        a(java.util.Map.Entry entry, byte byte0)
        {
            this(entry);
        }
    }

    static final class b
        implements Iterator
    {

        private Iterator a;

        public final boolean hasNext()
        {
            return a.hasNext();
        }

        public final Object next()
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)a.next();
            Object obj = entry;
            if (entry.getValue() instanceof n)
            {
                obj = new a(entry, (byte)0);
            }
            return obj;
        }

        public final void remove()
        {
            a.remove();
        }

        public b(Iterator iterator)
        {
            a = iterator;
        }
    }


    private final q b;

    public final boolean a()
    {
        return super.a() || a == b;
    }

    public final q b()
    {
        return a(b);
    }

    public final boolean equals(Object obj)
    {
        return b().equals(obj);
    }

    public final int hashCode()
    {
        return b().hashCode();
    }

    public final String toString()
    {
        return b().toString();
    }
}
