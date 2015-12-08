// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import java.util.Iterator;

// Referenced classes of package bo.app:
//            gl, gf, hi, hk, 
//            hv, gi

final class hl extends gl
{

    final hk a;

    private hl(hk hk1)
    {
        a = hk1;
        super();
    }

    hl(hk hk1, byte byte0)
    {
        this(hk1);
    }

    public final hv a()
    {
        return b().a();
    }

    final gi d()
    {
        return a;
    }

    final gf f()
    {
        return new hi(this, hk.a(a));
    }

    public final Iterator iterator()
    {
        return b().a();
    }
}
