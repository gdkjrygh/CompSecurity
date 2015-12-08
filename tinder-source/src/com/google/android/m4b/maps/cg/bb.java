// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cg;

import com.google.android.m4b.maps.model.Tile;
import com.google.android.m4b.maps.model.u;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final class bb
{
    public static interface a
    {

        public abstract void a(b b1);

        public abstract void a(b b1, Tile tile);
    }

    public final class b
        implements Runnable
    {

        public final int a;
        public final int b;
        public final int c;
        private final a d;
        private ScheduledFuture e;
        private int f;
        private bb g;

        public final void a()
        {
            this;
            JVM INSTR monitorenter ;
            if (e != null && !e.isCancelled() && !e.isDone())
            {
                e.cancel(false);
            }
            this;
            JVM INSTR monitorexit ;
            return;
            Exception exception;
            exception;
            throw exception;
        }

        public final void run()
        {
            this;
            JVM INSTR monitorenter ;
            Object obj = bb.a(g).a(a, b, c);
            if (obj != null) goto _L2; else goto _L1
_L1:
            long l;
            int i = f;
            f = i + 1;
            l = (long)(200D * Math.pow(2D, i) + (double)bb.b(g).nextInt(100));
            if (l >= bb.a) goto _L4; else goto _L3
_L3:
            e = bb.c(g).schedule(this, l, TimeUnit.MILLISECONDS);
_L5:
            this;
            JVM INSTR monitorexit ;
            return;
_L4:
            d.a(this);
              goto _L5
            obj;
            throw obj;
_L2:
label0:
            {
                if (((Tile) (obj)).b != u.a.b || ((Tile) (obj)).c != u.a.c || ((Tile) (obj)).d != u.a.d)
                {
                    break label0;
                }
                d.a(this);
            }
              goto _L5
            d.a(this, ((Tile) (obj)));
              goto _L5
        }

        public b(int i, int j, int k, a a1)
        {
            g = bb.this;
            super();
            e = null;
            f = 0;
            a = i;
            b = j;
            c = k;
            d = a1;
        }
    }


    static final long a;
    public final ScheduledExecutorService b;
    private final Random c;
    private final u d;

    public bb(ScheduledExecutorService scheduledexecutorservice, Random random, u u)
    {
        b = scheduledexecutorservice;
        c = random;
        d = u;
    }

    static u a(bb bb1)
    {
        return bb1.d;
    }

    static Random b(bb bb1)
    {
        return bb1.c;
    }

    static ScheduledExecutorService c(bb bb1)
    {
        return bb1.b;
    }

    static 
    {
        a = TimeUnit.MINUTES.toMillis(5L);
    }
}
