// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;


// Referenced classes of package com.taplytics:
//            gs, em, cv, turkey, 
//            ci, fy

final class fg
    implements com.github.nkzawa.b.a.a
{

    final fy a;
    final em b;

    fg(em em1, fy fy1)
    {
        b = em1;
        a = fy1;
        super();
    }

    public final transient void a(Object aobj[])
    {
        if (gs.b())
        {
            gs.a("SocketIO Connected!");
        }
        b.a = true;
        em.d(b);
        em.e(b);
        if (cv.a().d.equals(turkey.e))
        {
            aobj = cv.a();
            aobj.d = turkey.a;
            if (((cv) (aobj)).a && ci.b().g && ((cv) (aobj)).b)
            {
                ((cv) (aobj)).d();
            } else
            {
                ((cv) (aobj)).f();
            }
        }
        if (a != null)
        {
            a.a(Boolean.valueOf(true));
        }
    }
}
