// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b;

import com.google.b.d.a;
import com.google.b.d.c;
import com.google.b.d.d;

// Referenced classes of package com.google.b:
//            al, k

final class p extends al
{

    final k a;

    p(k k)
    {
        a = k;
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
            return Long.valueOf(a1.l());
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
            d1.b(obj.toString());
            return;
        }
    }
}
