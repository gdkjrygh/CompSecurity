// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Equivalence;
import java.util.AbstractSet;
import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            MapMakerInternalMap, by

final class bz extends AbstractSet
{

    final MapMakerInternalMap a;

    bz(MapMakerInternalMap mapmakerinternalmap)
    {
        a = mapmakerinternalmap;
        super();
    }

    public final void clear()
    {
        a.clear();
    }

    public final boolean contains(Object obj)
    {
        if (obj instanceof java.util.Map.Entry)
        {
            obj = (java.util.Map.Entry)obj;
            Object obj1 = ((java.util.Map.Entry) (obj)).getKey();
            if (obj1 != null)
            {
                obj1 = a.get(obj1);
                if (obj1 != null && a.valueEquivalence.equivalent(((java.util.Map.Entry) (obj)).getValue(), obj1))
                {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean isEmpty()
    {
        return a.isEmpty();
    }

    public final Iterator iterator()
    {
        return new by(a);
    }

    public final boolean remove(Object obj)
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

    public final int size()
    {
        return a.size();
    }
}
