// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import com.google.common.base.Preconditions;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.a:
//            ir, gg

abstract class iq extends AbstractSet
{

    iq()
    {
    }

    abstract Map a();

    public void clear()
    {
        a().clear();
    }

    public boolean contains(Object obj)
    {
        return a().containsKey(obj);
    }

    public boolean isEmpty()
    {
        return a().isEmpty();
    }

    public Iterator iterator()
    {
        return gg.a(a().entrySet().iterator(), new ir(this));
    }

    public boolean remove(Object obj)
    {
        if (contains(obj))
        {
            a().remove(obj);
            return true;
        } else
        {
            return false;
        }
    }

    public boolean removeAll(Collection collection)
    {
        return super.removeAll((Collection)Preconditions.checkNotNull(collection));
    }

    public int size()
    {
        return a().size();
    }
}
