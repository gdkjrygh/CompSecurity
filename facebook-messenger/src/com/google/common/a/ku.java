// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import com.google.common.base.Preconditions;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.common.a:
//            fi, gg, jp, mh

final class ku extends fi
{

    final transient Object a;
    private transient Integer b;

    ku(Object obj)
    {
        a = Preconditions.checkNotNull(obj);
    }

    ku(Object obj, int i)
    {
        a = obj;
        b = Integer.valueOf(i);
    }

    boolean a()
    {
        return false;
    }

    boolean c()
    {
        return false;
    }

    public boolean contains(Object obj)
    {
        return a.equals(obj);
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (obj instanceof Set)
            {
                if (((Set) (obj = (Set)obj)).size() != 1 || !a.equals(((Set) (obj)).iterator().next()))
                {
                    return false;
                }
            } else
            {
                return false;
            }
        }
        return true;
    }

    public mh h_()
    {
        return gg.a(a);
    }

    public final int hashCode()
    {
        Integer integer = b;
        if (integer == null)
        {
            integer = Integer.valueOf(a.hashCode());
            b = integer;
            return integer.intValue();
        } else
        {
            return integer.intValue();
        }
    }

    public boolean isEmpty()
    {
        return false;
    }

    public Iterator iterator()
    {
        return h_();
    }

    public int size()
    {
        return 1;
    }

    public Object[] toArray()
    {
        return (new Object[] {
            a
        });
    }

    public Object[] toArray(Object aobj[])
    {
        if (aobj.length != 0) goto _L2; else goto _L1
_L1:
        Object aobj1[] = jp.a(aobj, 1);
_L4:
        aobj1[0] = a;
        return aobj1;
_L2:
        aobj1 = aobj;
        if (aobj.length > 1)
        {
            aobj[1] = null;
            aobj1 = aobj;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public String toString()
    {
        String s = a.toString();
        return (new StringBuilder(s.length() + 2)).append('[').append(s).append(']').toString();
    }
}
