// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a.b;

import com.c.a.a.u;
import java.util.ListIterator;

// Referenced classes of package com.c.a.b:
//            m, w, ap

final class ag extends m
{

    private final transient int a;
    private final transient int b;
    private final transient Object c[];

    ag(Object aobj[])
    {
        this(aobj, 0, aobj.length);
    }

    private ag(Object aobj[], int i, int j)
    {
        a = i;
        b = j;
        c = aobj;
    }

    final int a(Object aobj[], int i)
    {
        System.arraycopy(((Object) (c)), a, ((Object) (aobj)), i, b);
        return b + i;
    }

    public final ap a(int i)
    {
        return w.a(c, a, b, i);
    }

    final m b(int i, int j)
    {
        return new ag(c, a + i, j - i);
    }

    final boolean b()
    {
        return b != c.length;
    }

    public final Object get(int i)
    {
        u.a(i, b);
        return c[a + i];
    }

    public final int indexOf(Object obj)
    {
        if (obj != null) goto _L2; else goto _L1
_L1:
        int j = -1;
_L4:
        return j;
_L2:
        int i = 0;
label0:
        do
        {
label1:
            {
                if (i >= b)
                {
                    break label1;
                }
                j = i;
                if (c[a + i].equals(obj))
                {
                    break label0;
                }
                i++;
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
        return -1;
    }

    public final int lastIndexOf(Object obj)
    {
        if (obj != null)
        {
            int i = b - 1;
            while (i >= 0) 
            {
                if (c[a + i].equals(obj))
                {
                    return i;
                }
                i--;
            }
        }
        return -1;
    }

    public final ListIterator listIterator(int i)
    {
        return a(i);
    }

    public final int size()
    {
        return b;
    }
}
