// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import java.util.Comparator;
import java.util.SortedSet;

// Referenced classes of package com.google.common.a:
//            ak, x

class ap extends ak
    implements SortedSet
{

    final x a;

    ap(x x, Object obj, SortedSet sortedset, ak ak1)
    {
        a = x;
        super(x, obj, sortedset, ak1);
    }

    public Comparator comparator()
    {
        return g().comparator();
    }

    public Object first()
    {
        a();
        return g().first();
    }

    SortedSet g()
    {
        return (SortedSet)e();
    }

    public SortedSet headSet(Object obj)
    {
        a();
        x x = a;
        Object obj1 = c();
        SortedSet sortedset = g().headSet(obj);
        if (f() == null)
        {
            obj = this;
        } else
        {
            obj = f();
        }
        return new ap(x, obj1, sortedset, ((ak) (obj)));
    }

    public Object last()
    {
        a();
        return g().last();
    }

    public SortedSet subSet(Object obj, Object obj1)
    {
        a();
        x x = a;
        Object obj2 = c();
        obj1 = g().subSet(obj, obj1);
        if (f() == null)
        {
            obj = this;
        } else
        {
            obj = f();
        }
        return new ap(x, obj2, ((SortedSet) (obj1)), ((ak) (obj)));
    }

    public SortedSet tailSet(Object obj)
    {
        a();
        x x = a;
        Object obj1 = c();
        SortedSet sortedset = g().tailSet(obj);
        if (f() == null)
        {
            obj = this;
        } else
        {
            obj = f();
        }
        return new ap(x, obj1, sortedset, ((ak) (obj)));
    }
}
