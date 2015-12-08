// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.b;

import java.util.Iterator;

// Referenced classes of package com.c.b:
//            ax, be, aq, f

public final class aw extends ax
{
    static final class a
        implements java.util.Map.Entry
    {

        private java.util.Map.Entry a;

        public final aw a()
        {
            return (aw)a.getValue();
        }

        public final Object getKey()
        {
            return a.getKey();
        }

        public final Object getValue()
        {
            aw aw1 = (aw)a.getValue();
            if (aw1 == null)
            {
                return null;
            } else
            {
                return aw1.a();
            }
        }

        public final Object setValue(Object obj)
        {
            if (!(obj instanceof be))
            {
                throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
            } else
            {
                return ((aw)a.getValue()).b((be)obj);
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
            if (entry.getValue() instanceof aw)
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


    private final be b;

    public aw(be be, aq aq, f f)
    {
        super(aq, f);
        b = be;
    }

    public final be a()
    {
        return a(b);
    }

    public final boolean equals(Object obj)
    {
        return a().equals(obj);
    }

    public final int hashCode()
    {
        return a().hashCode();
    }

    public final String toString()
    {
        return a().toString();
    }
}
