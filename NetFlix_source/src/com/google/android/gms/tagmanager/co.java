// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.Context;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.tagmanager:
//            cn, bh, bg, r

class co
    implements o.e
{
    static interface a
    {

        public abstract cn a(r r);
    }

    static interface b
    {

        public abstract ScheduledExecutorService la();
    }


    private final String WJ;
    private String Xg;
    private bg Zf;
    private r Zg;
    private final ScheduledExecutorService Zi;
    private final a Zj;
    private ScheduledFuture Zk;
    private boolean mClosed;
    private final Context mContext;

    public co(Context context, String s, r r)
    {
        this(context, s, r, null, null);
    }

    co(Context context, String s, r r, b b1, a a1)
    {
        Zg = r;
        mContext = context;
        WJ = s;
        context = b1;
        if (b1 == null)
        {
            context = new b() {

                final co Zl;

                public ScheduledExecutorService la()
                {
                    return Executors.newSingleThreadScheduledExecutor();
                }

            
            {
                Zl = co.this;
                super();
            }
            };
        }
        Zi = context.la();
        if (a1 == null)
        {
            Zj = new a() {

                final co Zl;

                public cn a(r r1)
                {
                    return new cn(co.a(Zl), co.b(Zl), r1);
                }

            
            {
                Zl = co.this;
                super();
            }
            };
            return;
        } else
        {
            Zj = a1;
            return;
        }
    }

    static Context a(co co1)
    {
        return co1.mContext;
    }

    static String b(co co1)
    {
        return co1.WJ;
    }

    private cn bK(String s)
    {
        cn cn1 = Zj.a(Zg);
        cn1.a(Zf);
        cn1.bu(Xg);
        cn1.bJ(s);
        return cn1;
    }

    private void kZ()
    {
        this;
        JVM INSTR monitorenter ;
        if (mClosed)
        {
            throw new IllegalStateException("called method after closed");
        }
        break MISSING_BLOCK_LABEL_24;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        this;
        JVM INSTR monitorexit ;
    }

    public void a(bg bg)
    {
        this;
        JVM INSTR monitorenter ;
        kZ();
        Zf = bg;
        this;
        JVM INSTR monitorexit ;
        return;
        bg;
        throw bg;
    }

    public void bu(String s)
    {
        this;
        JVM INSTR monitorenter ;
        kZ();
        Xg = s;
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    public void d(long l, String s)
    {
        this;
        JVM INSTR monitorenter ;
        bh.y((new StringBuilder()).append("loadAfterDelay: containerId=").append(WJ).append(" delay=").append(l).toString());
        kZ();
        if (Zf == null)
        {
            throw new IllegalStateException("callback must be set before loadAfterDelay() is called.");
        }
        break MISSING_BLOCK_LABEL_62;
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
        if (Zk != null)
        {
            Zk.cancel(false);
        }
        Zk = Zi.schedule(bK(s), l, TimeUnit.MILLISECONDS);
        this;
        JVM INSTR monitorexit ;
    }

    public void release()
    {
        this;
        JVM INSTR monitorenter ;
        kZ();
        if (Zk != null)
        {
            Zk.cancel(false);
        }
        Zi.shutdown();
        mClosed = true;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }
}
