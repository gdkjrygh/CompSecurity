// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;


// Referenced classes of package com.taplytics:
//            gs, em, fy, ci, 
//            cv, hk

final class fs
    implements com.github.nkzawa.b.a.a
{

    final fy a;
    final em b;

    fs(em em1, fy fy1)
    {
        b = em1;
        a = fy1;
        super();
    }

    public final transient void a(Object aobj[])
    {
        if (gs.b())
        {
            gs.a("SocketIO Disconnected!");
        }
        b.a = false;
        b.b = false;
        em.a(b, null);
        if (a != null)
        {
            a.a(Boolean.valueOf(false));
        }
        if (em.b(b) == 0 && ci.b().l && hk.a(cv.a().j))
        {
            cv.a().e();
        }
        if (ci.b().l && ci.b().g)
        {
            em.c(b);
        }
    }
}
