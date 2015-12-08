// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.b;

import com.nuance.b.b.a.ae;
import com.nuance.b.b.a.ag;
import com.nuance.b.b.a.ah;
import com.nuance.b.b.a.ai;
import com.nuance.b.b.a.aj;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.nuance.b.b:
//            fr, bx, cq, cs, 
//            cp, cr

final class co
    implements ag
{

    final bx a;

    co(bx bx1)
    {
        a = bx1;
        super();
    }

    public final void a(ae ae1)
    {
        fr.f((new StringBuilder("onPlaybackError ")).append(ae1.a).append(" ").append(ae1.b).toString());
        du du = a.b;
        List list = bx.h(a);
        list;
        JVM INSTR monitorenter ;
        ag ag1;
        for (Iterator iterator = bx.h(a).iterator(); iterator.hasNext(); bx.d().execute(new cq(this, ag1, ae1)))
        {
            ag1 = (ag)iterator.next();
        }

        break MISSING_BLOCK_LABEL_112;
        ae1;
        list;
        JVM INSTR monitorexit ;
        throw ae1;
        list;
        JVM INSTR monitorexit ;
    }

    public final void a(ah ah1)
    {
        fr.f((new StringBuilder("onPlaybackQueueEmptied ")).append(ah1.a).toString());
        du du = a.b;
        List list = bx.h(a);
        list;
        JVM INSTR monitorenter ;
        ag ag1;
        for (Iterator iterator = bx.h(a).iterator(); iterator.hasNext(); bx.d().execute(new cs(this, ag1, ah1)))
        {
            ag1 = (ag)iterator.next();
        }

        break MISSING_BLOCK_LABEL_100;
        ah1;
        list;
        JVM INSTR monitorexit ;
        throw ah1;
        list;
        JVM INSTR monitorexit ;
    }

    public final void a(ai ai1)
    {
        fr.f((new StringBuilder("onPlaybackStarted ")).append(ai1.a).toString());
        du du = a.b;
        List list = bx.h(a);
        list;
        JVM INSTR monitorenter ;
        ag ag1;
        for (Iterator iterator = bx.h(a).iterator(); iterator.hasNext(); bx.d().execute(new cp(this, ag1, ai1)))
        {
            ag1 = (ag)iterator.next();
        }

        break MISSING_BLOCK_LABEL_100;
        ai1;
        list;
        JVM INSTR monitorexit ;
        throw ai1;
        list;
        JVM INSTR monitorexit ;
    }

    public final void a(aj aj1)
    {
        fr.f((new StringBuilder("onPlaybackStopped ")).append(aj1.a).toString());
        du du = a.b;
        List list = bx.h(a);
        list;
        JVM INSTR monitorenter ;
        ag ag1;
        for (Iterator iterator = bx.h(a).iterator(); iterator.hasNext(); bx.d().execute(new cr(this, ag1, aj1)))
        {
            ag1 = (ag)iterator.next();
        }

        break MISSING_BLOCK_LABEL_100;
        aj1;
        list;
        JVM INSTR monitorexit ;
        throw aj1;
        list;
        JVM INSTR monitorexit ;
    }
}
