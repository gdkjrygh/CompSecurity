// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package a.a:
//            fm, ft, fb, gs

final class em extends fm
{

    static final em a = new em();

    private em()
    {
    }

    final int a(Object aobj[], int i)
    {
        return i;
    }

    public final gs a()
    {
        return ft.a();
    }

    public final fb b_()
    {
        return fb.d();
    }

    final boolean c()
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
        return ft.a();
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
