// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import java.util.Iterator;

// Referenced classes of package bo.app:
//            gm, gg, hj, hl, 
//            hw, gj

final class hm extends gm
{

    final hl a;

    private hm(hl hl1)
    {
        a = hl1;
        super();
    }

    hm(hl hl1, byte byte0)
    {
        this(hl1);
    }

    public final hw a()
    {
        return b().a();
    }

    final gj d()
    {
        return a;
    }

    final gg f()
    {
        return new hj(this, hl.a(a));
    }

    public final Iterator iterator()
    {
        return b().a();
    }
}
