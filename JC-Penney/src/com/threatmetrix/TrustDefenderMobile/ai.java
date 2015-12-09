// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.threatmetrix.TrustDefenderMobile;


// Referenced classes of package com.threatmetrix.TrustDefenderMobile:
//            ag

final class ai
    implements Runnable
{

    final Thread a;
    final ag b;

    ai(ag ag1, Thread thread)
    {
        b = ag1;
        super();
        a = thread;
    }

    public final void run()
    {
        ag.d();
        (new StringBuilder("sending interrupt to TID: ")).append(a.getId());
        a.interrupt();
    }
}
