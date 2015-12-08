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
//            co, bh, bg, r

class cp
    implements o.e
{
    static interface a
    {

        public abstract co a(r r);
    }

    static interface b
    {

        public abstract ScheduledExecutorService oQ();
    }


    private final String aoc;
    private String aoy;
    private bg aqt;
    private r aqu;
    private final ScheduledExecutorService aqw;
    private final a aqx;
    private ScheduledFuture aqy;
    private boolean mClosed;
    private final Context mContext;

    public cp(Context context, String s, r r)
    {
        this(context, s, r, null, null);
    }

    cp(Context context, String s, r r, b b1, a a1)
    {
        aqu = r;
        mContext = context;
        aoc = s;
        context = b1;
        if (b1 == null)
        {
            context = new b() {

                final cp aqz;

                public ScheduledExecutorService oQ()
                {
                    return Executors.newSingleThreadScheduledExecutor();
                }

            
            {
                aqz = cp.this;
                super();
            }
            };
        }
        aqw = context.oQ();
        if (a1 == null)
        {
            aqx = new a() {

                final cp aqz;

                public co a(r r1)
                {
                    return new co(cp.a(aqz), cp.b(aqz), r1);
                }

            
            {
                aqz = cp.this;
                super();
            }
            };
            return;
        } else
        {
            aqx = a1;
            return;
        }
    }

    static Context a(cp cp1)
    {
        return cp1.mContext;
    }

    static String b(cp cp1)
    {
        return cp1.aoc;
    }

    private co cK(String s)
    {
        co co1 = aqx.a(aqu);
        co1.a(aqt);
        co1.cu(aoy);
        co1.cJ(s);
        return co1;
    }

    private void oP()
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
        oP();
        aqt = bg;
        this;
        JVM INSTR monitorexit ;
        return;
        bg;
        throw bg;
    }

    public void cu(String s)
    {
        this;
        JVM INSTR monitorenter ;
        oP();
        aoy = s;
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    public void e(long l, String s)
    {
        this;
        JVM INSTR monitorenter ;
        bh.V((new StringBuilder()).append("loadAfterDelay: containerId=").append(aoc).append(" delay=").append(l).toString());
        oP();
        if (aqt == null)
        {
            throw new IllegalStateException("callback must be set before loadAfterDelay() is called.");
        }
        break MISSING_BLOCK_LABEL_62;
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
        if (aqy != null)
        {
            aqy.cancel(false);
        }
        aqy = aqw.schedule(cK(s), l, TimeUnit.MILLISECONDS);
        this;
        JVM INSTR monitorexit ;
    }

    public void release()
    {
        this;
        JVM INSTR monitorenter ;
        oP();
        if (aqy != null)
        {
            aqy.cancel(false);
        }
        aqw.shutdown();
        mClosed = true;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }
}
