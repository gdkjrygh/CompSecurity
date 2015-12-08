// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package bo.app:
//            gw, hd, gl, ib

final class fw extends gw
{

    static final fw a = new fw();

    private fw()
    {
    }

    final int a(Object aobj[], int i)
    {
        return i;
    }

    public final ib a()
    {
        return hd.a();
    }

    public final gl b()
    {
        return gl.d();
    }

    final boolean b_()
    {
        return true;
    }

    public final boolean contains(Object obj)
    {
        return false;
    }

    public final boolean containsAll(Collection collection)
    {
        return collection.isEmpty();
    }

    final boolean e()
    {
        return false;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof Set)
        {
            return ((Set)obj).isEmpty();
        } else
        {
            return false;
        }
    }

    public final int hashCode()
    {
        return 0;
    }

    public final boolean isEmpty()
    {
        return true;
    }

    public final Iterator iterator()
    {
        return hd.a();
    }

    public final int size()
    {
        return 0;
    }

    public final String toString()
    {
        return "[]";
    }

}
