// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b;

import com.google.a.a.ab;
import com.google.a.a.ad;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.a.b:
//            ca

final class ci extends AbstractCollection
{

    final Map a;

    ci(Map map)
    {
        a = (Map)ad.a(map);
    }

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
        return ca.b(a.entrySet().iterator());
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
                java.util.Map.Entry entry = (java.util.Map.Entry)iterator1.next();
                if (ab.a(obj, entry.getValue()))
                {
                    a.remove(entry.getKey());
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
            flag = super.removeAll((Collection)ad.a(collection));
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
                java.util.Map.Entry entry = (java.util.Map.Entry)iterator1.next();
                if (collection.contains(entry.getValue()))
                {
                    hashset.add(entry.getKey());
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
            flag = super.retainAll((Collection)ad.a(collection));
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
                java.util.Map.Entry entry = (java.util.Map.Entry)iterator1.next();
                if (collection.contains(entry.getValue()))
                {
                    hashset.add(entry.getKey());
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
}
