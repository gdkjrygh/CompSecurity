// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;


// Referenced classes of package com.taplytics:
//            em, hq

final class en
    implements com.github.nkzawa.b.a.a
{

    final em a;

    en(em em1)
    {
        a = em1;
        super();
    }

    public final transient void a(Object aobj[])
    {
        em em1 = a;
        if (em.a(a).c())
        {
            aobj = new hq();
        } else
        {
            aobj = em.a(a);
        }
        em.a(em1, ((hq) (aobj)));
        em.a(a).a();
    }
}
