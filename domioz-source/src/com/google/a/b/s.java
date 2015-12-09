// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b;

import java.util.Comparator;
import java.util.SortedSet;

// Referenced classes of package com.google.a.b:
//            n, e

final class s extends n
    implements SortedSet
{

    final e a;

    s(e e, Object obj, SortedSet sortedset, n n1)
    {
        a = e;
        super(e, obj, sortedset, n1);
    }

    public final Comparator comparator()
    {
        return ((SortedSet)super.c).comparator();
    }

    public final Object first()
    {
        a();
        return ((SortedSet)super.c).first();
    }

    public final SortedSet headSet(Object obj)
    {
        a();
        e e = a;
        Object obj1 = super.b;
        SortedSet sortedset = ((SortedSet)super.c).headSet(obj);
        if (super.d == null)
        {
            obj = this;
        } else
        {
            obj = super.d;
        }
        return new s(e, obj1, sortedset, ((n) (obj)));
    }

    public final Object last()
    {
        a();
        return ((SortedSet)super.c).last();
    }

    public final SortedSet subSet(Object obj, Object obj1)
    {
        a();
        e e = a;
        Object obj2 = super.b;
        obj1 = ((SortedSet)super.c).subSet(obj, obj1);
        if (super.d == null)
        {
            obj = this;
        } else
        {
            obj = super.d;
        }
        return new s(e, obj2, ((SortedSet) (obj1)), ((n) (obj)));
    }

    public final SortedSet tailSet(Object obj)
    {
        a();
        e e = a;
        Object obj1 = super.b;
        SortedSet sortedset = ((SortedSet)super.c).tailSet(obj);
        if (super.d == null)
        {
            obj = this;
        } else
        {
            obj = super.d;
        }
        return new s(e, obj1, sortedset, ((n) (obj)));
    }
}
