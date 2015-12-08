// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.advertising.android;

import android.text.TextUtils;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.microsoft.advertising.android:
//            ah, av, af, d, 
//            l, ab, bx, ai, 
//            n, h

public final class k
{
    final class a
        implements n.a
    {

        private volatile n a;
        private volatile d b;

        public final d a()
        {
            this;
            JVM INSTR monitorenter ;
            d d1;
            d1 = b;
            b = null;
            this;
            JVM INSTR monitorexit ;
            return d1;
            Exception exception;
            exception;
            this;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public final void a(n n1, n.b b1)
        {
            d d1;
            boolean flag;
            flag = true;
            d1 = null;
            af.a(new Object[] {
                n1, b1
            });
            this;
            JVM INSTR monitorenter ;
            if (a != n1 || b != null)
            {
                flag = false;
            }
            if (!af.a(flag))
            {
                break MISSING_BLOCK_LABEL_103;
            }
            a = null;
            if (b1 == null)
            {
                break MISSING_BLOCK_LABEL_60;
            }
            d1 = b1.a;
            b = d1;
            if (b != null && n1.a() != null)
            {
                n1.a().a(new h(null, com.microsoft.advertising.android.a.a.a.d, b));
            }
            this;
            JVM INSTR monitorexit ;
            return;
            n1;
            this;
            JVM INSTR monitorexit ;
            throw n1;
        }
    }


    private final ConcurrentMap a = new ConcurrentHashMap();
    private ai b;
    private final String c;
    private final ExecutorService d;

    k(String s, ExecutorService executorservice)
    {
        b = new ah(null);
        if (TextUtils.isEmpty(s) || executorservice == null)
        {
            throw new IllegalArgumentException();
        } else
        {
            c = s;
            d = executorservice;
            return;
        }
    }

    final d a(String s)
    {
        av.a("AdLoader", (new StringBuilder("dequeueAd(adUnitId=")).append(s).append(")").toString());
        Object obj;
        if (TextUtils.isEmpty(s))
        {
            obj = null;
        } else
        {
            s = (a)a.get(s);
            if (s != null)
            {
                s = s.a();
            } else
            {
                s = null;
            }
            if (s != null && af.a())
            {
                af.a(s.c().a(com.microsoft.advertising.android.a.a.a.f));
            }
            obj = s;
            if (s != null)
            {
                obj = s;
                if (s.c().a(ab.a().a("MAX_TIME_IN_PREFETCH_CACHE_MS"), TimeUnit.MILLISECONDS))
                {
                    return null;
                }
            }
        }
        return ((d) (obj));
    }
}
