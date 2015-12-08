// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aa;

import com.google.android.m4b.maps.y.h;
import com.google.android.m4b.maps.y.j;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.m4b.maps.aa:
//            ax

static final class a extends AbstractCollection
{

    private Map a;

    public final void clear()
    {
        a.clear();
    }

    public final boolean contains(Object obj)
    {
        return a.containsValue(obj);
    }

    public final boolean isEmpty()
    {
        return a.isEmpty();
    }

    public final Iterator iterator()
    {
        return ax.b(a.entrySet().iterator());
    }

    public final boolean remove(Object obj)
    {
        boolean flag;
        try
        {
            flag = super.remove(obj);
        }
        catch (UnsupportedOperationException unsupportedoperationexception)
        {
            for (Iterator iterator1 = a.entrySet().iterator(); iterator1.hasNext();)
            {
                java.util.ntry ntry = (java.util.ntry)iterator1.next();
                if (h.a(obj, ntry.getValue()))
                {
                    a.remove(ntry.getKey());
                    return true;
                }
            }

            return false;
        }
        return flag;
    }

    public final boolean removeAll(Collection collection)
    {
        boolean flag;
        try
        {
            flag = super.removeAll((Collection)j.a(collection));
        }
        catch (UnsupportedOperationException unsupportedoperationexception)
        {
            HashSet hashset = new HashSet();
            Iterator iterator1 = a.entrySet().iterator();
            do
            {
                if (!iterator1.hasNext())
                {
                    break;
                }
                java.util.ntry ntry = (java.util.ntry)iterator1.next();
                if (collection.contains(ntry.getValue()))
                {
                    hashset.add(ntry.getKey());
                }
            } while (true);
            return a.keySet().removeAll(hashset);
        }
        return flag;
    }

    public final boolean retainAll(Collection collection)
    {
        boolean flag;
        try
        {
            flag = super.retainAll((Collection)j.a(collection));
        }
        catch (UnsupportedOperationException unsupportedoperationexception)
        {
            HashSet hashset = new HashSet();
            Iterator iterator1 = a.entrySet().iterator();
            do
            {
                if (!iterator1.hasNext())
                {
                    break;
                }
                java.util.ntry ntry = (java.util.ntry)iterator1.next();
                if (collection.contains(ntry.getValue()))
                {
                    hashset.add(ntry.getKey());
                }
            } while (true);
            return a.keySet().retainAll(hashset);
        }
        return flag;
    }

    public final int size()
    {
        return a.size();
    }

    ion(Map map)
    {
        a = (Map)j.a(map);
    }
}
