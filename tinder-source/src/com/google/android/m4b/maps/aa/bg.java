// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aa;

import com.google.android.m4b.maps.y.j;
import java.util.ListIterator;

// Referenced classes of package com.google.android.m4b.maps.aa:
//            ae, e, as

final class bg extends ae
{

    private final transient int b;
    private final transient int c;
    private final transient Object d[];

    bg(Object aobj[])
    {
        this(aobj, 0, aobj.length);
    }

    private bg(Object aobj[], int i, int k)
    {
        b = i;
        c = k;
        d = aobj;
    }

    final int a(Object aobj[], int i)
    {
        System.arraycopy(((Object) (d)), b, ((Object) (aobj)), i, c);
        return c + i;
    }

    public final as a(int i)
    {
        return e.a(d, b, c, i);
    }

    final ae b(int i, int k)
    {
        return new bg(d, b + i, k - i);
    }

    final boolean d()
    {
        return c != d.length;
    }

    public final Object get(int i)
    {
        j.a(i, c);
        return d[b + i];
    }

    public final int indexOf(Object obj)
    {
        if (obj != null) goto _L2; else goto _L1
_L1:
        int k = -1;
_L4:
        return k;
_L2:
        int i = 0;
label0:
        do
        {
label1:
            {
                if (i >= c)
                {
                    break label1;
                }
                k = i;
                if (d[b + i].equals(obj))
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
            int i = c - 1;
            while (i >= 0) 
            {
                if (d[b + i].equals(obj))
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
        return c;
    }
}
