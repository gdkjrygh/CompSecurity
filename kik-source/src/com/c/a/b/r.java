// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a.b;

import java.util.Iterator;

// Referenced classes of package com.c.a.b:
//            v, m, o, s, 
//            ao

final class r extends v
{

    private final o a;

    r(o o1)
    {
        a = o1;
    }

    public final ao a()
    {
        return c().a();
    }

    final boolean b()
    {
        return true;
    }

    public final boolean contains(Object obj)
    {
        return a.containsKey(obj);
    }

    final m e()
    {
        return new s(this, a.b().c());
    }

    public final Iterator iterator()
    {
        return c().a();
    }

    public final int size()
    {
        return a.size();
    }
}
