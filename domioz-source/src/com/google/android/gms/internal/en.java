// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            em

final class en
    implements Runnable
{

    final em a;

    en(em em1)
    {
        a = em1;
        super();
    }

    public final void run()
    {
        em.a(a, Thread.currentThread());
        a.b();
    }
}
