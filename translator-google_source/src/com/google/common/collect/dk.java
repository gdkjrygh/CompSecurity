// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

// Referenced classes of package com.google.common.collect:
//            dr, dm, dh, de, 
//            dl

final class dk extends dr
{

    final dh a;

    dk(dh dh1)
    {
        a = dh1;
        super();
    }

    final dl a()
    {
        return a;
    }

    public final boolean contains(Object obj)
    {
        if (obj instanceof dm)
        {
            obj = (dm)obj;
            Collection collection = (Collection)a.a.asMap().get(((dm) (obj)).getElement());
            return collection != null && collection.size() == ((dm) (obj)).getCount();
        } else
        {
            return false;
        }
    }

    public final boolean isEmpty()
    {
        return a.a.isEmpty();
    }

    public final Iterator iterator()
    {
        return a.entryIterator();
    }

    public final boolean remove(Object obj)
    {
        if (obj instanceof dm)
        {
            obj = (dm)obj;
            Collection collection = (Collection)a.a.asMap().get(((dm) (obj)).getElement());
            if (collection != null && collection.size() == ((dm) (obj)).getCount())
            {
                collection.clear();
                return true;
            }
        }
        return false;
    }

    public final int size()
    {
        return a.distinctElements();
    }
}
