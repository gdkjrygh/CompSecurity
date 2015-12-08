// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.usermedia;

import android.content.ContentResolver;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.kik.cache.d;
import com.kik.cache.g;
import com.kik.cache.h;
import com.kik.g.p;
import com.kik.g.s;
import com.kik.sdkutils.b.a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.kik.cards.usermedia:
//            m, n, p, q

public final class o extends d
{

    private ContentResolver a;
    private boolean b;
    private final int c;
    private Map d;
    private ThreadPoolExecutor e;

    public o(a a1, ContentResolver contentresolver, Resources resources)
    {
        super(null, a1);
        b = false;
        d = new HashMap();
        e = new ThreadPoolExecutor(5, 10, 50L, TimeUnit.MICROSECONDS, new LinkedBlockingQueue(25), new m());
        a = contentresolver;
        if (resources.getDisplayMetrics().density >= 2.0F)
        {
            c = 1;
            return;
        } else
        {
            c = 3;
            return;
        }
    }

    private p a(q q1)
    {
label0:
        {
            synchronized (d)
            {
                if (!b)
                {
                    break label0;
                }
                q1 = s.a(null);
            }
            return q1;
        }
        if (!d.containsKey(q1))
        {
            break MISSING_BLOCK_LABEL_59;
        }
        q1 = (p)d.get(q1);
        map;
        JVM INSTR monitorexit ;
        return q1;
        q1;
        map;
        JVM INSTR monitorexit ;
        throw q1;
        p p1;
        n n1 = new n(q1, a, c);
        p1 = n1.a;
        d.put(q1, p1);
        e.execute(n1);
        p1.a(new com.kik.cards.usermedia.p(this, q1));
        map;
        JVM INSTR monitorexit ;
        return p1;
    }

    static Map a(o o1)
    {
        return o1.d;
    }

    protected final volatile p a(Object obj)
    {
        return a((q)obj);
    }

    public final volatile Object a(Object obj, h h1)
    {
        return (g)h1.a();
    }

    protected final Set a()
    {
        return new HashSet();
    }

    protected final volatile void b(Object obj)
    {
    }

    public final void d()
    {
        Map map = d;
        map;
        JVM INSTR monitorenter ;
        b = true;
        e.shutdownNow();
        e.awaitTermination(10L, TimeUnit.MILLISECONDS);
_L1:
        e = null;
        return;
        Object obj;
        obj;
        ((InterruptedException) (obj)).printStackTrace();
          goto _L1
        obj;
        map;
        JVM INSTR monitorexit ;
        throw obj;
    }
}
