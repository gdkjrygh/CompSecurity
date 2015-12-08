// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Comparator;
import java.util.SortedSet;

// Referenced classes of package com.google.common.collect:
//            m, AbstractMapBasedMultimap

final class r extends m
    implements SortedSet
{

    final AbstractMapBasedMultimap a;

    r(AbstractMapBasedMultimap abstractmapbasedmultimap, Object obj, SortedSet sortedset, m m1)
    {
        a = abstractmapbasedmultimap;
        super(abstractmapbasedmultimap, obj, sortedset, m1);
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
        AbstractMapBasedMultimap abstractmapbasedmultimap = a;
        Object obj1 = super.b;
        SortedSet sortedset = ((SortedSet)super.c).headSet(obj);
        if (super.d == null)
        {
            obj = this;
        } else
        {
            obj = super.d;
        }
        return new r(abstractmapbasedmultimap, obj1, sortedset, ((m) (obj)));
    }

    public final Object last()
    {
        a();
        return ((SortedSet)super.c).last();
    }

    public final SortedSet subSet(Object obj, Object obj1)
    {
        a();
        AbstractMapBasedMultimap abstractmapbasedmultimap = a;
        Object obj2 = super.b;
        obj1 = ((SortedSet)super.c).subSet(obj, obj1);
        if (super.d == null)
        {
            obj = this;
        } else
        {
            obj = super.d;
        }
        return new r(abstractmapbasedmultimap, obj2, ((SortedSet) (obj1)), ((m) (obj)));
    }

    public final SortedSet tailSet(Object obj)
    {
        a();
        AbstractMapBasedMultimap abstractmapbasedmultimap = a;
        Object obj1 = super.b;
        SortedSet sortedset = ((SortedSet)super.c).tailSet(obj);
        if (super.d == null)
        {
            obj = this;
        } else
        {
            obj = super.d;
        }
        return new r(abstractmapbasedmultimap, obj1, sortedset, ((m) (obj)));
    }
}
