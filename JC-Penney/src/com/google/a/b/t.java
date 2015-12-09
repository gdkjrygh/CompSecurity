// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b;

import com.google.a.af;
import com.google.a.d.a;
import com.google.a.d.d;
import com.google.a.j;

// Referenced classes of package com.google.a.b:
//            s

class t extends af
{

    final boolean a;
    final boolean b;
    final j c;
    final com.google.a.c.a d;
    final s e;
    private af f;

    t(s s, boolean flag, boolean flag1, j j1, com.google.a.c.a a1)
    {
        e = s;
        a = flag;
        b = flag1;
        c = j1;
        d = a1;
        super();
    }

    private af a()
    {
        af af1 = f;
        if (af1 != null)
        {
            return af1;
        } else
        {
            af af2 = c.a(e, d);
            f = af2;
            return af2;
        }
    }

    public void a(d d1, Object obj)
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

    public Object b(a a1)
    {
        if (a)
        {
            a1.n();
            return null;
        } else
        {
            return a().b(a1);
        }
    }
}
