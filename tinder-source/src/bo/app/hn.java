// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import java.util.Iterator;

// Referenced classes of package bo.app:
//            gq, gx, ft, hi, 
//            hv, gf

final class hn extends gq
{

    final transient Object a[];
    private final Object b[];
    private final transient int c;
    private final transient int d;

    hn(Object aobj[], int i, Object aobj1[], int j)
    {
        b = aobj;
        a = aobj1;
        c = j;
        d = i;
    }

    final int a(Object aobj[], int i)
    {
        System.arraycopy(((Object) (b)), 0, ((Object) (aobj)), i, b.length);
        return b.length + i;
    }

    public final hv a()
    {
        return gx.a(b);
    }

    final boolean b_()
    {
        return true;
    }

    public final boolean contains(Object obj)
    {
        if (obj == null)
        {
            return false;
        }
        int i = ft.a(obj.hashCode());
        do
        {
            Object obj1 = a[c & i];
            if (obj1 == null)
            {
                return false;
            }
            if (obj1.equals(obj))
            {
                return true;
            }
            i++;
        } while (true);
    }

    final boolean e()
    {
        return false;
    }

    final gf f()
    {
        return new hi(this, b);
    }

    public final int hashCode()
    {
        return d;
    }

    public final Iterator iterator()
    {
        return gx.a(b);
    }

    public final int size()
    {
        return b.length;
    }
}
