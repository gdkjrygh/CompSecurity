// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b;

import java.util.Iterator;

// Referenced classes of package com.google.a.b:
//            az, ar, cp, cr, 
//            di, av

final class cs extends az
{

    final cr a;

    private cs(cr cr1)
    {
        a = cr1;
        super();
    }

    cs(cr cr1, byte byte0)
    {
        this(cr1);
    }

    public final di a()
    {
        return b().a();
    }

    final av d()
    {
        return a;
    }

    final ar f()
    {
        return new cp(this, cr.a(a));
    }

    public final Iterator iterator()
    {
        return b().a();
    }
}
