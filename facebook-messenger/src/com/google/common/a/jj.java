// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.common.a:
//            jf, jk, gg

abstract class jj extends AbstractSet
{

    jj()
    {
    }

    abstract jf a();

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
        return gg.a(a().b().iterator(), new jk(this));
    }

    public boolean remove(Object obj)
    {
        int i = a().a(obj);
        if (i > 0)
        {
            a().b(obj, i);
            return true;
        } else
        {
            return false;
        }
    }

    public int size()
    {
        return a().b().size();
    }
}
