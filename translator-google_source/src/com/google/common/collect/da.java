// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.k;
import com.google.common.base.p;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            ee, Maps, ed

abstract class da extends ee
{

    da()
    {
    }

    abstract Map a();

    public void clear()
    {
        a().clear();
    }

    public boolean contains(Object obj)
    {
        boolean flag;
label0:
        {
            boolean flag1 = false;
            flag = flag1;
            if (!(obj instanceof java.util.Map.Entry))
            {
                break label0;
            }
            obj = (java.util.Map.Entry)obj;
            Object obj1 = ((java.util.Map.Entry) (obj)).getKey();
            Object obj2 = Maps.a(a(), obj1);
            flag = flag1;
            if (!k.a(obj2, ((java.util.Map.Entry) (obj)).getValue()))
            {
                break label0;
            }
            if (obj2 == null)
            {
                flag = flag1;
                if (!a().containsKey(obj1))
                {
                    break label0;
                }
            }
            flag = true;
        }
        return flag;
    }

    public boolean isEmpty()
    {
        return a().isEmpty();
    }

    public boolean remove(Object obj)
    {
        if (contains(obj))
        {
            obj = (java.util.Map.Entry)obj;
            return a().keySet().remove(((java.util.Map.Entry) (obj)).getKey());
        } else
        {
            return false;
        }
    }

    public boolean removeAll(Collection collection)
    {
        boolean flag;
        try
        {
            flag = super.removeAll((Collection)p.a(collection));
        }
        catch (UnsupportedOperationException unsupportedoperationexception)
        {
            return ed.a(this, collection.iterator());
        }
        return flag;
    }

    public boolean retainAll(Collection collection)
    {
        boolean flag;
        try
        {
            flag = super.retainAll((Collection)p.a(collection));
        }
        catch (UnsupportedOperationException unsupportedoperationexception)
        {
            java.util.HashSet hashset = ed.a(collection.size());
            collection = collection.iterator();
            do
            {
                if (!collection.hasNext())
                {
                    break;
                }
                Object obj = collection.next();
                if (contains(obj))
                {
                    hashset.add(((java.util.Map.Entry)obj).getKey());
                }
            } while (true);
            return a().keySet().retainAll(hashset);
        }
        return flag;
    }

    public int size()
    {
        return a().size();
    }
}
