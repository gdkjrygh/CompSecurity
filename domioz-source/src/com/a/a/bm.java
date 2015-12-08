// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a;

import b.a.a.a.a.b.k;
import b.a.a.a.f;
import b.a.a.a.q;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.a.a:
//            h, bk, z, n, 
//            bj

final class bm extends k
{

    final bk a;
    private final float b;

    bm(bk bk1, float f1)
    {
        a = bk1;
        super();
        b = f1;
    }

    public final void a()
    {
        float f1;
        f.c().a("Fabric", (new StringBuilder("Starting report processing in ")).append(b).append(" second(s)...").toString());
        f1 = b;
        if (f1 <= 0.0F)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        Thread.sleep((long)(b * 1000F));
        Object obj;
        h h1 = com.a.a.h.f();
        z z1 = h1.l();
        obj = a.a();
        if (!z1.a())
        {
            if (((List) (obj)).isEmpty() || ((Boolean)b.a.a.a.a.g.q.a().a(new n(h1), Boolean.valueOf(true))).booleanValue())
            {
                break MISSING_BLOCK_LABEL_415;
            }
            f.c().a("Fabric", (new StringBuilder("User declined to send. Removing ")).append(((List) (obj)).size()).append(" Report(s).").toString());
            for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); ((bj)((Iterator) (obj)).next()).a()) { }
        }
_L1:
        bk.a(a);
        return;
        obj;
        try
        {
            Thread.currentThread().interrupt();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            f.c().c("Fabric", "An unexpected error occurred while attempting to upload crash reports.", ((Throwable) (obj)));
        }
          goto _L1
_L4:
        if (((List) (obj)).isEmpty() || com.a.a.h.f().l().a()) goto _L1; else goto _L2
_L2:
        f.c().a("Fabric", (new StringBuilder("Attempting to send ")).append(((List) (obj)).size()).append(" report(s)").toString());
        bj bj1;
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); a.a(bj1))
        {
            bj1 = (bj)((Iterator) (obj)).next();
        }

        List list = a.a();
        obj = list;
        if (list.isEmpty()) goto _L4; else goto _L3
_L3:
        int i;
        long l;
        l = bk.b()[Math.min(i, bk.b().length - 1)];
        f.c().a("Fabric", (new StringBuilder("Report submisson: scheduling delayed retry in ")).append(l).append(" seconds").toString());
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
