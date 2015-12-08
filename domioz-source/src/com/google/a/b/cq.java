// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b;

import com.google.a.a.ad;
import java.util.ListIterator;

// Referenced classes of package com.google.a.b:
//            ar, bl, dj

final class cq extends ar
{

    private final transient int a;
    private final transient int b;
    private final transient Object c[];

    cq(Object aobj[])
    {
        this(aobj, 0, aobj.length);
    }

    private cq(Object aobj[], int i, int j)
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

    public final dj a(int i)
    {
        return bl.a(c, a, b, i);
    }

    final ar b(int i, int j)
    {
        return new cq(c, a + i, j - i);
    }

    final boolean e()
    {
        return b != c.length;
    }

    public final Object get(int i)
    {
        ad.a(i, b);
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
