// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b;

import java.util.Iterator;

// Referenced classes of package com.google.a.b:
//            be, ar, av, bb, 
//            di

final class ba extends be
{

    private final av a;

    ba(av av1)
    {
        a = av1;
    }

    public final di a()
    {
        return b().a();
    }

    public final boolean contains(Object obj)
    {
        return a.containsKey(obj);
    }

    final boolean e()
    {
        return true;
    }

    final ar f()
    {
        return new bb(this, a.b().b());
    }

    public final Iterator iterator()
    {
        return b().a();
    }

    public final int size()
    {
        return a.size();
    }
}
