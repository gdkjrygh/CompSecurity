// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.c;

import b.a.a.a.a.b.i;
import b.a.a.a.a.g.q;
import b.a.a.a.d;
import b.a.a.a.o;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.a.a.c:
//            aw, g, x, m, 
//            av

private final class b extends i
{

    final aw a;
    private final float b;

    public final void a()
    {
        float f;
        d.c();
        (new StringBuilder("Starting report processing in ")).append(b).append(" second(s)...");
        f = b;
        if (f <= 0.0F)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        Thread.sleep((long)(b * 1000F));
        Object obj;
        g g1 = g.f();
        x x1 = g1.l();
        obj = a.a();
        if (!x1.a())
        {
            if (((List) (obj)).isEmpty() || ((Boolean)q.a().a(new m(g1), Boolean.valueOf(true))).booleanValue())
            {
                break MISSING_BLOCK_LABEL_383;
            }
            d.c();
            (new StringBuilder("User declined to send. Removing ")).append(((List) (obj)).size()).append(" Report(s).");
            for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); ((av)((Iterator) (obj)).next()).a()) { }
        }
_L1:
        aw.a(a);
        return;
        obj;
        try
        {
            Thread.currentThread().interrupt();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            d.c().b("Fabric", "An unexpected error occurred while attempting to upload crash reports.", ((Throwable) (obj)));
        }
          goto _L1
_L4:
        if (((List) (obj)).isEmpty() || g.f().l().a()) goto _L1; else goto _L2
_L2:
        d.c();
        (new StringBuilder("Attempting to send ")).append(((List) (obj)).size()).append(" report(s)");
        av av1;
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); a.a(av1))
        {
            av1 = (av)((Iterator) (obj)).next();
        }

        List list = a.a();
        obj = list;
        if (list.isEmpty()) goto _L4; else goto _L3
_L3:
        int j;
        long l;
        l = aw.b()[Math.min(j, aw.b().length - 1)];
        d.c();
        (new StringBuilder("Report submisson: scheduling delayed retry in ")).append(l).append(" seconds");
        Thread.sleep(l * 1000L);
        j++;
        obj = list;
          goto _L4
        InterruptedException interruptedexception;
        interruptedexception;
        Thread.currentThread().interrupt();
          goto _L1
        j = 0;
          goto _L4
    }

    tion(aw aw1, float f)
    {
        a = aw1;
        super();
        b = f;
    }
}
