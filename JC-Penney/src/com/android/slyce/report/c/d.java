// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.report.c;

import android.os.Handler;
import com.android.slyce.report.mpmetrics.af;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.android.slyce.report.c:
//            b, f, c

final class d
    implements Runnable
{

    final b a;

    private d(b b1)
    {
        a = b1;
        super();
    }

    d(b b1, c c)
    {
        this(b1);
    }

    public void run()
    {
        long l = System.currentTimeMillis();
        Map map = b.a(a);
        map;
        JVM INSTR monitorenter ;
        Iterator iterator = b.a(a).entrySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            f f1 = (f)((java.util.Map.Entry)iterator.next()).getValue();
            if (l - f1.a > 1000L)
            {
                b.b(a).a(f1.b, f1.c);
                iterator.remove();
            }
        } while (true);
        break MISSING_BLOCK_LABEL_106;
        Exception exception;
        exception;
        map;
        JVM INSTR monitorexit ;
        throw exception;
        if (!b.a(a).isEmpty())
        {
            b.c(a).postDelayed(this, 500L);
        }
        map;
        JVM INSTR monitorexit ;
    }
}
