// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package bo.app:
//            ho, gl, ib, hm, 
//            ff

public abstract class gc extends AbstractCollection
    implements Serializable
{

    private transient gl a;

    gc()
    {
    }

    int a(Object aobj[], int i)
    {
        for (Iterator iterator1 = iterator(); iterator1.hasNext();)
        {
            aobj[i] = iterator1.next();
            i++;
        }

        return i;
    }

    public abstract ib a();

    public final boolean add(Object obj)
    {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(Collection collection)
    {
        throw new UnsupportedOperationException();
    }

    public gl b()
    {
        gl gl2 = a;
        gl gl1 = gl2;
        if (gl2 == null)
        {
            gl1 = f();
            a = gl1;
        }
        return gl1;
    }

    public final void clear()
    {
        throw new UnsupportedOperationException();
    }

    public boolean contains(Object obj)
    {
        return obj != null && super.contains(obj);
    }

    abstract boolean e();

    gl f()
    {
        switch (size())
        {
        default:
            return new ho(this, toArray());

        case 0: // '\0'
            return gl.d();

        case 1: // '\001'
            return gl.a(a().next());
        }
    }

    public Iterator iterator()
    {
        return a();
    }

    public final boolean remove(Object obj)
    {
        throw new UnsupportedOperationException();
    }

    public final boolean removeAll(Collection collection)
    {
        throw new UnsupportedOperationException();
    }

    public final boolean retainAll(Collection collection)
    {
        throw new UnsupportedOperationException();
    }

    public final Object[] toArray()
    {
        if (size() == 0)
        {
            return hm.a;
        } else
        {
            Object aobj[] = new Object[size()];
            a(aobj, 0);
            return aobj;
        }
    }

    public final Object[] toArray(Object aobj[])
    {
        int i;
        ff.a(((Object) (aobj)));
        i = size();
        if (aobj.length >= i) goto _L2; else goto _L1
_L1:
        Object aobj1[] = hm.a(aobj, i);
_L4:
        a(aobj1, 0);
        return aobj1;
_L2:
        aobj1 = aobj;
        if (aobj.length > i)
        {
            aobj[i] = null;
            aobj1 = aobj;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
