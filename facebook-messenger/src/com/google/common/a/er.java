// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;

// Referenced classes of package com.google.common.a:
//            fi, gg, mh

final class er extends fi
{

    private final transient EnumSet a;
    private transient int b;

    er(EnumSet enumset)
    {
        a = enumset;
    }

    boolean a()
    {
        return false;
    }

    public boolean contains(Object obj)
    {
        return a.contains(obj);
    }

    public boolean containsAll(Collection collection)
    {
        return a.containsAll(collection);
    }

    public boolean equals(Object obj)
    {
        return obj == this || a.equals(obj);
    }

    public mh h_()
    {
        return gg.a(a.iterator());
    }

    public int hashCode()
    {
        int j = b;
        int i = j;
        if (j == 0)
        {
            i = a.hashCode();
            b = i;
        }
        return i;
    }

    public boolean isEmpty()
    {
        return a.isEmpty();
    }

    public Iterator iterator()
    {
        return h_();
    }

    public int size()
    {
        return a.size();
    }

    public Object[] toArray()
    {
        return a.toArray();
    }

    public Object[] toArray(Object aobj[])
    {
        return a.toArray(aobj);
    }

    public String toString()
    {
        return a.toString();
    }
}
