// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            ee, dl, dq

abstract class dp extends ee
{

    dp()
    {
    }

    abstract dl a();

    public void clear()
    {
        a().clear();
    }

    public boolean contains(Object obj)
    {
        return a().contains(obj);
    }

    public boolean containsAll(Collection collection)
    {
        return a().containsAll(collection);
    }

    public boolean isEmpty()
    {
        return a().isEmpty();
    }

    public Iterator iterator()
    {
        return new dq(this, a().entrySet().iterator());
    }

    public boolean remove(Object obj)
    {
        int i = a().count(obj);
        if (i > 0)
        {
            a().remove(obj, i);
            return true;
        } else
        {
            return false;
        }
    }

    public int size()
    {
        return a().entrySet().size();
    }
}
