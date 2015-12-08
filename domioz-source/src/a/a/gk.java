// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;

import java.util.Iterator;

// Referenced classes of package a.a:
//            fm, ft, ep, gf, 
//            gs, fb

final class gk extends fm
{

    final transient Object a[];
    private final Object b[];
    private final transient int c;
    private final transient int d;

    gk(Object aobj[], int i, Object aobj1[], int j)
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

    public final gs a()
    {
        return ft.a(b);
    }

    final boolean c()
    {
        return true;
    }

    public final boolean contains(Object obj)
    {
        if (obj == null)
        {
            return false;
        }
        int i = ep.a(obj.hashCode());
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

    final fb f()
    {
        return new gf(this, b);
    }

    public final int hashCode()
    {
        return d;
    }

    public final Iterator iterator()
    {
        return ft.a(b);
    }

    public final int size()
    {
        return b.length;
    }
}
