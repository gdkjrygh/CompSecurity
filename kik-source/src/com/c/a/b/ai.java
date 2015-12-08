// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a.b;

import java.util.Iterator;

// Referenced classes of package com.c.a.b:
//            v, w, h, af, 
//            ao, m

final class ai extends v
{

    final transient Object a[];
    private final Object b[];
    private final transient int c;
    private final transient int d;

    ai(Object aobj[], int i, Object aobj1[], int j)
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

    public final ao a()
    {
        return w.a(b);
    }

    final boolean b()
    {
        return false;
    }

    public final boolean contains(Object obj)
    {
        if (obj == null)
        {
            return false;
        }
        int i = h.a(obj.hashCode());
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

    final boolean d()
    {
        return true;
    }

    final m e()
    {
        return new af(this, b);
    }

    public final int hashCode()
    {
        return d;
    }

    public final Iterator iterator()
    {
        return w.a(b);
    }

    public final int size()
    {
        return b.length;
    }
}
