// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b;

import java.util.Iterator;

// Referenced classes of package com.google.a.b:
//            be, bl, aj, cp, 
//            di, ar

final class cu extends be
{

    final transient Object a[];
    private final Object b[];
    private final transient int c;
    private final transient int d;

    cu(Object aobj[], int i, Object aobj1[], int j)
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

    public final di a()
    {
        return bl.a(b);
    }

    public final boolean contains(Object obj)
    {
        if (obj == null)
        {
            return false;
        }
        int i = aj.a(obj.hashCode());
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

    final ar f()
    {
        return new cp(this, b);
    }

    public final int hashCode()
    {
        return d;
    }

    final boolean i_()
    {
        return true;
    }

    public final Iterator iterator()
    {
        return bl.a(b);
    }

    public final int size()
    {
        return b.length;
    }
}
