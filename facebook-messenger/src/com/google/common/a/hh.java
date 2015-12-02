// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import com.google.common.base.Preconditions;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.common.a:
//            jf, gw, ho, hj, 
//            hi, hn, gg, gx

class hh extends AbstractCollection
    implements jf
{

    final gw a;

    private hh(gw gw1)
    {
        a = gw1;
        super();
    }

    hh(gw gw1, gx gx)
    {
        this(gw1);
    }

    public int a(Object obj)
    {
        return gw.d(a).a(obj);
    }

    public int a(Object obj, int i)
    {
        throw new UnsupportedOperationException();
    }

    public int b(Object obj, int i)
    {
        int j;
        boolean flag;
        if (i >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        j = a(obj);
        for (obj = new ho(a, obj); i > 0 && ((Iterator) (obj)).hasNext(); i--)
        {
            ((Iterator) (obj)).next();
            ((Iterator) (obj)).remove();
        }

        return j;
    }

    public Set b()
    {
        return new hj(this);
    }

    public boolean equals(Object obj)
    {
        return gw.d(a).equals(obj);
    }

    public Set f()
    {
        return a.g();
    }

    public int hashCode()
    {
        return gw.d(a).hashCode();
    }

    public Iterator iterator()
    {
        return new hi(this, new hn(a));
    }

    public boolean removeAll(Collection collection)
    {
        return gg.a(iterator(), collection);
    }

    public boolean retainAll(Collection collection)
    {
        return gg.b(iterator(), collection);
    }

    public int size()
    {
        return gw.d(a).size();
    }

    public String toString()
    {
        return gw.d(a).toString();
    }
}
