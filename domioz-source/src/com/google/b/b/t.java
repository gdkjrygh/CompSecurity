// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.b;

import com.google.b.al;
import com.google.b.d.a;
import com.google.b.d.d;
import com.google.b.k;

// Referenced classes of package com.google.b.b:
//            s

final class t extends al
{

    final boolean a;
    final boolean b;
    final k c;
    final com.google.b.c.a d;
    final s e;
    private al f;

    t(s s, boolean flag, boolean flag1, k k1, com.google.b.c.a a1)
    {
        e = s;
        a = flag;
        b = flag1;
        c = k1;
        d = a1;
        super();
    }

    private al a()
    {
        al al1 = f;
        if (al1 != null)
        {
            return al1;
        } else
        {
            al al2 = c.a(e, d);
            f = al2;
            return al2;
        }
    }

    public final Object a(a a1)
    {
        if (a)
        {
            a1.n();
            return null;
        } else
        {
            return a().a(a1);
        }
    }

    public final void a(d d1, Object obj)
    {
        if (b)
        {
            d1.f();
            return;
        } else
        {
            a().a(d1, obj);
            return;
        }
    }
}
