// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aa;

import com.google.android.m4b.maps.y.h;
import com.google.android.m4b.maps.y.j;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.m4b.maps.aa:
//            ax, bo

static abstract class ion extends ion
{

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
            if (!(obj instanceof java.util.ntry))
            {
                break label0;
            }
            obj = (java.util.ntry)obj;
            Object obj1 = ((java.util.ntry) (obj)).getKey();
            Object obj2 = ax.a(a(), obj1);
            flag = flag1;
            if (!h.a(obj2, ((java.util.ntry) (obj)).getValue()))
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
            obj = (java.util.ntry)obj;
            return a().keySet().remove(((java.util.ntry) (obj)).getKey());
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
            flag = super.removeAll((Collection)j.a(collection));
        }
        catch (UnsupportedOperationException unsupportedoperationexception)
        {
            return bo.a(this, collection.iterator());
        }
        return flag;
    }

    public boolean retainAll(Collection collection)
    {
        boolean flag;
        try
        {
            flag = super.retainAll((Collection)j.a(collection));
        }
        catch (UnsupportedOperationException unsupportedoperationexception)
        {
            java.util.HashSet hashset = bo.a(collection.size());
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
                    hashset.add(((java.util.ntry)obj).getKey());
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

    ion()
    {
    }
}
