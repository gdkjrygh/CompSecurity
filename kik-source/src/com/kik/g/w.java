// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.g;

import java.util.List;

// Referenced classes of package com.kik.g:
//            r, p

final class w extends r
{

    final List a;
    final int b;
    final p c;
    final List d;
    final List e;
    final p f;

    w(List list, int i, p p1, List list1, List list2, p p2)
    {
        a = list;
        b = i;
        c = p1;
        d = list1;
        e = list2;
        f = p2;
        super();
    }

    public final void a()
    {
        a.set(b, c.f());
        d.add(Boolean.valueOf(c.h()));
        if (d.size() == e.size())
        {
            f.a(a);
        }
    }
}
