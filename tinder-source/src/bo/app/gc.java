// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import java.util.Iterator;

// Referenced classes of package bo.app:
//            gl, gd, ga, hv, 
//            gi

final class gc extends gl
{

    final ga a;

    gc(ga ga)
    {
        a = ga;
        super();
    }

    public final hv a()
    {
        return new gd(this);
    }

    final gi d()
    {
        return a;
    }

    public final Iterator iterator()
    {
        return a();
    }
}
