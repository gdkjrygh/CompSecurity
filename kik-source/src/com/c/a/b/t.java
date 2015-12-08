// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a.b;

import java.util.Iterator;

// Referenced classes of package com.c.a.b:
//            k, o, v, ac, 
//            w, u, ao, m

final class t extends k
{

    private final o a;

    t(o o1)
    {
        a = o1;
    }

    public final ao a()
    {
        return ac.a(a.b().a());
    }

    final boolean b()
    {
        return true;
    }

    public final boolean contains(Object obj)
    {
        return obj != null && w.a(a(), obj);
    }

    final m e()
    {
        return new u(this, a.b().c());
    }

    public final Iterator iterator()
    {
        return a();
    }

    public final int size()
    {
        return a.size();
    }
}
