// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Iterator;

// Referenced classes of package com.google.android.gms.internal:
//            dz

final class b
    implements Iterator
{

    final int a;
    int b;
    int c;
    boolean d;
    final dz e;

    public final boolean hasNext()
    {
        return c < b;
    }

    public final Object next()
    {
        Object obj = e.a(c, a);
        c = c + 1;
        d = true;
        return obj;
    }

    public final void remove()
    {
        if (!d)
        {
            throw new IllegalStateException();
        } else
        {
            c = c - 1;
            b = b - 1;
            d = false;
            e.a(c);
            return;
        }
    }

    (dz dz1, int i)
    {
        e = dz1;
        super();
        d = false;
        a = i;
        b = dz1.a();
    }
}
