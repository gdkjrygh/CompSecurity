// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b;

import com.google.a.a.ad;
import com.google.a.a.t;

// Referenced classes of package com.google.a.b:
//            ai, bi, be, bl

public abstract class ah
    implements Iterable
{

    private final Iterable a;

    protected ah()
    {
        a = this;
    }

    ah(Iterable iterable)
    {
        a = (Iterable)ad.a(iterable);
    }

    public static ah a(Iterable iterable)
    {
        if (iterable instanceof ah)
        {
            return (ah)iterable;
        } else
        {
            return new ai(iterable, iterable);
        }
    }

    public final ah a(t t)
    {
        return a(bi.a(a, t));
    }

    public final be a()
    {
        return be.a(a);
    }

    public String toString()
    {
        return bl.c(a.iterator());
    }
}
