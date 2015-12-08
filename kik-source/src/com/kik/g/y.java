// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.g;

import com.kik.m.o;

// Referenced classes of package com.kik.g:
//            r, p

final class y extends r
{

    final p a;
    final p b;
    final boolean c;

    y(p p1, p p2, boolean flag)
    {
        a = p1;
        b = p2;
        c = flag;
        super();
    }

    public final void a(Object obj)
    {
        if (a.g())
        {
            b.a(new o(a.f(), obj));
        }
    }

    public final void b()
    {
        if (c)
        {
            if (a.g())
            {
                b.a(new o(a.f(), null));
            }
            return;
        } else
        {
            b.e();
            return;
        }
    }

    public final void b(Throwable throwable)
    {
        if (c)
        {
            if (a.g())
            {
                b.a(new o(a.f(), null));
            }
            return;
        } else
        {
            b.a(throwable);
            return;
        }
    }
}
