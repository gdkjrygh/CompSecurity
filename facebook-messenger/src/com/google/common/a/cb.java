// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import com.google.common.base.Equivalence;
import java.util.AbstractSet;
import java.util.Iterator;

// Referenced classes of package com.google.common.a:
//            bj, ca

final class cb extends AbstractSet
{

    final bj a;

    cb(bj bj1)
    {
        a = bj1;
        super();
    }

    public void clear()
    {
        a.clear();
    }

    public boolean contains(Object obj)
    {
        if (obj instanceof java.util.Map.Entry)
        {
            obj = (java.util.Map.Entry)obj;
            Object obj1 = ((java.util.Map.Entry) (obj)).getKey();
            if (obj1 != null)
            {
                obj1 = a.get(obj1);
                if (obj1 != null && a.g.equivalent(((java.util.Map.Entry) (obj)).getValue(), obj1))
                {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isEmpty()
    {
        return a.isEmpty();
    }

    public Iterator iterator()
    {
        return new ca(a);
    }

    public boolean remove(Object obj)
    {
        if (obj instanceof java.util.Map.Entry)
        {
            obj = (java.util.Map.Entry)obj;
            Object obj1 = ((java.util.Map.Entry) (obj)).getKey();
            if (obj1 != null && a.remove(obj1, ((java.util.Map.Entry) (obj)).getValue()))
            {
                return true;
            }
        }
        return false;
    }

    public int size()
    {
        return a.size();
    }
}
