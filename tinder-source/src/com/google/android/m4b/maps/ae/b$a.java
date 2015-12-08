// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.ae;

import java.util.HashMap;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

// Referenced classes of package com.google.android.m4b.maps.ae:
//            b

public final class c
{

    private int a;
    private int b;
    private Iterator c;
    private b d;

    public final boolean a()
    {
        if (b != 0x80000000)
        {
            return true;
        }
        if (a <= d.c)
        {
            for (; a <= d.c; a = a + 1)
            {
                if (d.a[a] != null)
                {
                    int i = a;
                    a = i + 1;
                    b = i;
                    return true;
                }
            }

        }
        if (d.b != null)
        {
            if (c == null)
            {
                c = d.b.keySet().iterator();
            }
            if (c.hasNext())
            {
                b = ((Integer)c.next()).intValue();
                return true;
            }
        }
        return false;
    }

    public final int b()
    {
        if (!a())
        {
            throw new NoSuchElementException();
        } else
        {
            int i = b;
            b = 0x80000000;
            return i;
        }
    }

    public (b b1)
    {
        d = b1;
        super();
        a = 0;
        b = 0x80000000;
        c = null;
    }
}
