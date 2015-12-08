// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cache;

import com.kik.g.p;
import com.kik.g.r;

// Referenced classes of package com.kik.cache:
//            h, e, d

final class f extends r
{

    final boolean a;
    final p b;
    final e c;

    f(e e1, boolean flag, p p1)
    {
        c = e1;
        a = flag;
        b = p1;
        super();
    }

    public final void a(Object obj)
    {
label0:
        {
            obj = (h)obj;
            Object obj1 = c.f.a(c.e, new h(((h) (obj)).a(), ((h) (obj)).b()));
            if (b != null)
            {
                if (obj1 == null)
                {
                    break label0;
                }
                c.a.a(new h(obj1, ((h) (obj)).b()));
            }
            return;
        }
        c.a.a(new RuntimeException());
    }

    public final void b()
    {
        if (b != null)
        {
            b.e();
        }
    }

    public final void b(Throwable throwable)
    {
        if (b != null)
        {
            b.a(throwable);
        }
    }
}
