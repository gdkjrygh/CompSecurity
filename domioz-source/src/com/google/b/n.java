// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b;

import com.google.b.d.a;
import com.google.b.d.c;
import com.google.b.d.d;

// Referenced classes of package com.google.b:
//            al, k

final class n extends al
{

    final k a;

    n(k k1)
    {
        a = k1;
        super();
    }

    public final Object a(a a1)
    {
        if (a1.f() == c.i)
        {
            a1.j();
            return null;
        } else
        {
            return Double.valueOf(a1.k());
        }
    }

    public final void a(d d1, Object obj)
    {
        obj = (Number)obj;
        if (obj == null)
        {
            d1.f();
            return;
        } else
        {
            com.google.b.k.a(((Number) (obj)).doubleValue());
            d1.a(((Number) (obj)));
            return;
        }
    }
}
