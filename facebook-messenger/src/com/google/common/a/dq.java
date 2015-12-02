// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.common.a:
//            fi, gg, mh

final class dq extends fi
{

    static final dq a = new dq();
    private static final Object b[] = new Object[0];

    private dq()
    {
    }

    boolean a()
    {
        return false;
    }

    boolean c()
    {
        return true;
    }

    public boolean contains(Object obj)
    {
        return false;
    }

    public boolean containsAll(Collection collection)
    {
        return collection.isEmpty();
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof Set)
        {
            return ((Set)obj).isEmpty();
        } else
        {
            return false;
        }
    }

    public mh h_()
    {
        return gg.a();
    }

    public final int hashCode()
    {
        return 0;
    }

    public boolean isEmpty()
    {
        return true;
    }

    public Iterator iterator()
    {
        return h_();
    }

    public int size()
    {
        return 0;
    }

    public Object[] toArray()
    {
        return b;
    }

    public Object[] toArray(Object aobj[])
    {
        if (aobj.length > 0)
        {
            aobj[0] = null;
        }
        return aobj;
    }

    public String toString()
    {
        return "[]";
    }

}
