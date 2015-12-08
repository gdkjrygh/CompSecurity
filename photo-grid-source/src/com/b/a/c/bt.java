// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a.c;

import a.a.a.a.a.b.k;
import a.a.a.a.a.g.q;
import a.a.a.a.f;
import a.a.a.a.s;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.b.a.c:
//            h, br, aa, n, 
//            bq

final class bt extends k
{

    final br a;
    private final float b;

    bt(br br1, float f1)
    {
        a = br1;
        super();
        b = f1;
    }

    public final void a()
    {
        float f1;
        f.d();
        (new StringBuilder("Starting report processing in ")).append(b).append(" second(s)...");
        f1 = b;
        if (f1 <= 0.0F)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        Thread.sleep((long)(b * 1000F));
        Object obj;
        h h1 = com.b.a.c.h.f();
        aa aa1 = h1.l();
        obj = a.a();
        if (!aa1.a())
        {
            if (((List) (obj)).isEmpty() || ((Boolean)q.a().a(new n(h1), Boolean.valueOf(true))).booleanValue())
            {
                break MISSING_BLOCK_LABEL_383;
            }
            f.d();
            (new StringBuilder("User declined to send. Removing ")).append(((List) (obj)).size()).append(" Report(s).");
            for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); ((bq)((Iterator) (obj)).next()).a()) { }
        }
_L1:
        br.a(a);
        return;
        obj;
        try
        {
            Thread.currentThread().interrupt();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            f.d().b("CrashlyticsCore", "An unexpected error occurred while attempting to upload crash reports.", ((Throwable) (obj)));
        }
          goto _L1
_L4:
        if (((List) (obj)).isEmpty() || com.b.a.c.h.f().l().a()) goto _L1; else goto _L2
_L2:
        f.d();
        (new StringBuilder("Attempting to send ")).append(((List) (obj)).size()).append(" report(s)");
        bq bq1;
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); a.a(bq1))
        {
            bq1 = (bq)((Iterator) (obj)).next();
        }

        List list = a.a();
        obj = list;
        if (list.isEmpty()) goto _L4; else goto _L3
_L3:
        int i;
        long l;
        l = br.b()[Math.min(i, br.b().length - 1)];
        f.d();
        (new StringBuilder("Report submisson: scheduling delayed retry in ")).append(l).append(" seconds");
        Thread.sleep(l * 1000L);
        i++;
        obj = list;
          goto _L4
        InterruptedException interruptedexception;
        interruptedexception;
        Thread.currentThread().interrupt();
          goto _L1
        i = 0;
          goto _L4
    }
}
