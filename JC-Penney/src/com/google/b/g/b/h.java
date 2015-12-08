// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.g.b;

import java.io.Serializable;
import java.util.Comparator;

// Referenced classes of package com.google.b.g.b:
//            d, f

final class h
    implements Serializable, Comparator
{

    private final float a;

    private h(float f)
    {
        a = f;
    }

    h(float f, f f1)
    {
        this(f);
    }

    public int a(d d1, d d2)
    {
        float f = Math.abs(d2.c() - a);
        float f1 = Math.abs(d1.c() - a);
        if (f < f1)
        {
            return -1;
        }
        return f != f1 ? 1 : 0;
    }

    public int compare(Object obj, Object obj1)
    {
        return a((d)obj, (d)obj1);
    }
}
