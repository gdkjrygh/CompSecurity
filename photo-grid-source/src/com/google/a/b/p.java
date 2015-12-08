// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b;

import com.google.a.am;
import com.google.a.d.a;
import com.google.a.d.f;
import com.google.a.k;

// Referenced classes of package com.google.a.b:
//            o

final class p extends am
{

    final boolean a;
    final boolean b;
    final k c;
    final com.google.a.c.a d;
    final o e;
    private am f;

    p(o o, boolean flag, boolean flag1, k k1, com.google.a.c.a a1)
    {
        e = o;
        a = flag;
        b = flag1;
        c = k1;
        d = a1;
        super();
    }

    private am a()
    {
        am am1 = f;
        if (am1 != null)
        {
            return am1;
        } else
        {
            am am2 = c.a(e, d);
            f = am2;
            return am2;
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

    public final void a(f f1, Object obj)
    {
        if (b)
        {
            f1.f();
            return;
        } else
        {
            a().a(f1, obj);
            return;
        }
    }
}
