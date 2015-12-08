// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.viewcrawler;

import android.os.Handler;
import com.mixpanel.android.mpmetrics.h;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.mixpanel.android.viewcrawler:
//            b

private final class <init>
    implements Runnable
{

    final b a;

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
            <init> <init>1 = (a)((java.util.Entry)iterator.next()).getValue();
            if (l - <init>1.a > 1000L)
            {
                b.b(a).a(<init>1.b, <init>1.c);
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

    private (b b1)
    {
        a = b1;
        super();
    }

    a(b b1, a a1)
    {
        this(b1);
    }
}
