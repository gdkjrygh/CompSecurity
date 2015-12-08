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

        public abstract ScheduledExecutorService qh();
    }


    private String aqI;
    private final String aqm;
    private bg asC;
    private r asD;
    private final ScheduledExecutorService asF;
    private final a asG;
    private ScheduledFuture asH;
    private boolean mClosed;
    private final Context mContext;

    public cp(Context context, String s, r r)
    {
        this(context, s, r, null, null);
    }

    cp(Context context, String s, r r, b b1, a a1)
    {
        asD = r;
        mContext = context;
        aqm = s;
        context = b1;
        if (b1 == null)
        {
            context = new b() {

                final cp asI;

                public ScheduledExecutorService qh()
                {
                    return Executors.newSingleThreadScheduledExecutor();
                }

            
            {
                asI = cp.this;
                super();
            }
            };
        }
        asF = context.qh();
        if (a1 == null)
        {
            asG = new a() {

                final cp asI;

                public co a(r r1)
                {
                    return new co(cp.a(asI), cp.b(asI), r1);
                }

            
            {
                asI = cp.this;
                super();
            }
            };
            return;
        } else
        {
            asG = a1;
            return;
        }
    }

    static Context a(cp cp1)
    {
        return cp1.mContext;
    }

    static String b(cp cp1)
    {
        return cp1.aqm;
    }

    private co cM(String s)
    {
        co co1 = asG.a(asD);
        co1.a(asC);
        co1.cw(aqI);
        co1.cL(s);
        return co1;
    }

    private void qg()
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
        qg();
        asC = bg;
        this;
        JVM INSTR monitorexit ;
        return;
        bg;
        throw bg;
    }

    public void cw(String s)
    {
        this;
        JVM INSTR monitorenter ;
        qg();
        aqI = s;
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
        bh.V((new StringBuilder()).append("loadAfterDelay: containerId=").append(aqm).append(" delay=").append(l).toString());
        qg();
        if (asC == null)
        {
            throw new IllegalStateException("callback must be set before loadAfterDelay() is called.");
        }
        break MISSING_BLOCK_LABEL_62;
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
        if (asH != null)
        {
            asH.cancel(false);
        }
        asH = asF.schedule(cM(s), l, TimeUnit.MILLISECONDS);
        this;
        JVM INSTR monitorexit ;
    }

    public void release()
    {
        this;
        JVM INSTR monitorenter ;
        qg();
        if (asH != null)
        {
            asH.cancel(false);
        }
        asF.shutdown();
        mClosed = true;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }
}
