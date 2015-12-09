// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.b;

import com.nuance.b.b.a.ap;
import com.nuance.b.b.a.n;
import com.nuance.b.b.a.o;
import com.nuance.b.c.b;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.nuance.b.b:
//            bz, fr, bx, au, 
//            dc, db

final class da
    implements o
{

    final bx a;

    da(bx bx1)
    {
        a = bx1;
        super();
    }

    private void c(b b1)
    {
        b1.c(new bz(this));
    }

    public final void a(b b1)
    {
        c(b1);
    }

    public final void b(b b1)
    {
        c(b1);
    }

    public final void onEndOfSpeech(n n1)
    {
        fr.f((new StringBuilder("onEndOfSpeech ")).append(n1.a).toString());
        int i;
        if (a.a != null)
        {
            i = au.d;
        }
        List list = bx.c(a);
        list;
        JVM INSTR monitorenter ;
        o o1;
        for (Iterator iterator = bx.c(a).iterator(); iterator.hasNext(); bx.d().execute(new dc(this, o1, n1)))
        {
            o1 = (o)iterator.next();
        }

        break MISSING_BLOCK_LABEL_107;
        n1;
        list;
        JVM INSTR monitorexit ;
        throw n1;
        list;
        JVM INSTR monitorexit ;
    }

    public final void onStartOfSpeech(ap ap1)
    {
        fr.f((new StringBuilder("onStartOfSpeech ")).append(ap1.a).toString());
        int i;
        if (a.a != null)
        {
            i = com.nuance.b.b.au.b;
        }
        List list = bx.c(a);
        list;
        JVM INSTR monitorenter ;
        o o1;
        for (Iterator iterator = bx.c(a).iterator(); iterator.hasNext(); bx.d().execute(new db(this, o1, ap1)))
        {
            o1 = (o)iterator.next();
        }

        break MISSING_BLOCK_LABEL_107;
        ap1;
        list;
        JVM INSTR monitorexit ;
        throw ap1;
        list;
        JVM INSTR monitorexit ;
    }
}
