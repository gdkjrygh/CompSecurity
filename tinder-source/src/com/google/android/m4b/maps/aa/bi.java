// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aa;

import java.util.Iterator;

// Referenced classes of package com.google.android.m4b.maps.aa:
//            al, e, be, bx, 
//            x, ae

final class bi extends al
{

    private final Object a[];
    private transient Object b[];
    private final transient int c;
    private final transient int d;

    bi(Object aobj[], int i, Object aobj1[], int j)
    {
        a = aobj;
        b = aobj1;
        c = j;
        d = i;
    }

    final int a(Object aobj[], int i)
    {
        System.arraycopy(((Object) (a)), 0, ((Object) (aobj)), i, a.length);
        return a.length + i;
    }

    public final x a()
    {
        return e.a(a);
    }

    final ae c()
    {
        return new be(this, a);
    }

    public final boolean contains(Object obj)
    {
        if (obj == null)
        {
            return false;
        }
        int i = bx.a(obj.hashCode());
        do
        {
            Object obj1 = b[c & i];
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

    final boolean d()
    {
        return false;
    }

    final boolean g()
    {
        return true;
    }

    public final int hashCode()
    {
        return d;
    }

    public final Iterator iterator()
    {
        return e.a(a);
    }

    public final int size()
    {
        return a.length;
    }
}
