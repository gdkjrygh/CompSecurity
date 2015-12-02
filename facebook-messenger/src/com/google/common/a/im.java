// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.a:
//            kl

abstract class im extends AbstractSet
{

    im()
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
            Object obj2 = a().get(obj1);
            flag = flag1;
            if (!Objects.equal(obj2, ((java.util.Map.Entry) (obj)).getValue()))
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
        boolean flag1;
        try
        {
            flag1 = super.removeAll((Collection)Preconditions.checkNotNull(collection));
        }
        catch (UnsupportedOperationException unsupportedoperationexception)
        {
            boolean flag = true;
            collection = collection.iterator();
            do
            {
                flag1 = flag;
                if (!collection.hasNext())
                {
                    continue;
                }
                flag |= remove(collection.next());
            } while (true);
        }
        return flag1;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_13;
_L1:
    }

    public boolean retainAll(Collection collection)
    {
        boolean flag;
        try
        {
            flag = super.retainAll((Collection)Preconditions.checkNotNull(collection));
        }
        catch (UnsupportedOperationException unsupportedoperationexception)
        {
            java.util.HashSet hashset = kl.a(collection.size());
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
