// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            aa, de, Maps, dk, 
//            di, af

final class dh extends aa
{

    final de a;

    dh(de de1)
    {
        a = de1;
    }

    public final void clear()
    {
        a.clear();
    }

    public final boolean contains(Object obj)
    {
        return a.containsKey(obj);
    }

    public final int count(Object obj)
    {
        obj = (Collection)Maps.a(a.asMap(), obj);
        if (obj == null)
        {
            return 0;
        } else
        {
            return ((Collection) (obj)).size();
        }
    }

    final Set createEntrySet()
    {
        return new dk(this);
    }

    final int distinctElements()
    {
        return a.asMap().size();
    }

    public final Set elementSet()
    {
        return a.keySet();
    }

    final Iterator entryIterator()
    {
        return new di(this, a.asMap().entrySet().iterator());
    }

    public final Iterator iterator()
    {
        return Maps.a(a.entries().iterator());
    }

    public final int remove(Object obj, int i)
    {
        int j = 0;
        af.a(i, "occurrences");
        if (i == 0)
        {
            return count(obj);
        }
        obj = (Collection)Maps.a(a.asMap(), obj);
        if (obj == null)
        {
            return 0;
        }
        int k = ((Collection) (obj)).size();
        if (i >= k)
        {
            ((Collection) (obj)).clear();
        } else
        {
            obj = ((Collection) (obj)).iterator();
            while (j < i) 
            {
                ((Iterator) (obj)).next();
                ((Iterator) (obj)).remove();
                j++;
            }
        }
        return k;
    }
}
