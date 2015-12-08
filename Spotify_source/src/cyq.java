// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

final class cyq
    implements Runnable
{

    private cyp a;

    private cyq(cyp cyp1)
    {
        a = cyp1;
        super();
    }

    cyq(cyp cyp1, byte byte0)
    {
        this(cyp1);
    }

    public final void run()
    {
        long l = System.currentTimeMillis();
        Map map = cyp.a(a);
        map;
        JVM INSTR monitorenter ;
        Iterator iterator = cyp.a(a).entrySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            cys cys1 = (cys)((java.util.Map.Entry)iterator.next()).getValue();
            if (l - cys1.a > 1000L)
            {
                cyp.b(a).a(cys1.b, cys1.c);
                iterator.remove();
            }
        } while (true);
        break MISSING_BLOCK_LABEL_106;
        Exception exception;
        exception;
        map;
        JVM INSTR monitorexit ;
        throw exception;
        if (!cyp.a(a).isEmpty())
        {
            cyp.c(a).postDelayed(this, 500L);
        }
        map;
        JVM INSTR monitorexit ;
    }
}
