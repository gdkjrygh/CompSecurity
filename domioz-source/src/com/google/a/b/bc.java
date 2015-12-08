// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b;

import java.util.Iterator;

// Referenced classes of package com.google.a.b:
//            am, av, be, ca, 
//            bl, bd, di, ar

final class bc extends am
{

    private final av a;

    bc(av av1)
    {
        a = av1;
    }

    public final di a()
    {
        return ca.a(a.b().a());
    }

    public final boolean contains(Object obj)
    {
        return obj != null && bl.a(a(), obj);
    }

    final boolean e()
    {
        return true;
    }

    final ar f()
    {
        return new bd(this, a.b().b());
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
