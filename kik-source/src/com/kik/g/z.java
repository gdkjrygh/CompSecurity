// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.g;

import java.util.List;

// Referenced classes of package com.kik.g:
//            r, aq

final class z extends r
{

    final List a;
    final aq b;

    z(List list, aq aq1)
    {
        a = list;
        b = aq1;
        super();
    }

    public final void a(Object obj)
    {
        a.add(obj);
        if (a.size() == 2)
        {
            b.a(obj);
        }
    }

    public final void b()
    {
        b.e();
    }

    public final void b(Throwable throwable)
    {
        b.a(throwable);
    }
}
