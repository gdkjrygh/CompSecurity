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

        public abstract ScheduledExecutorService mk();
    }


    private String aeP;
    private final String aet;
    private bg agN;
    private r agO;
    private final ScheduledExecutorService agQ;
    private final a agR;
    private ScheduledFuture agS;
    private boolean mClosed;
    private final Context mContext;

    public co(Context context, String s, r r)
    {
        this(context, s, r, null, null);
    }

    co(Context context, String s, r r, b b1, a a1)
    {
        agO = r;
        mContext = context;
        aet = s;
        context = b1;
        if (b1 == null)
        {
            context = new b() {

                final co agT;

                public ScheduledExecutorService mk()
                {
                    return Executors.newSingleThreadScheduledExecutor();
                }

            
            {
                agT = co.this;
                super();
            }
            };
        }
        agQ = context.mk();
        if (a1 == null)
        {
            agR = new a() {

                final co agT;

                public cn a(r r1)
                {
                    return new cn(co.a(agT), co.b(agT), r1);
                }

            
            {
                agT = co.this;
                super();
            }
            };
            return;
        } else
        {
            agR = a1;
            return;
        }
    }

    static Context a(co co1)
    {
        return co1.mContext;
    }

    static String b(co co1)
    {
        return co1.aet;
    }

    private cn cc(String s)
    {
        cn cn1 = agR.a(agO);
        cn1.a(agN);
        cn1.bM(aeP);
        cn1.cb(s);
        return cn1;
    }

    private void mj()
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
        mj();
        agN = bg;
        this;
        JVM INSTR monitorexit ;
        return;
        bg;
        throw bg;
    }

    public void bM(String s)
    {
        this;
        JVM INSTR monitorenter ;
        mj();
        aeP = s;
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
        bh.C((new StringBuilder()).append("loadAfterDelay: containerId=").append(aet).append(" delay=").append(l).toString());
        mj();
        if (agN == null)
        {
            throw new IllegalStateException("callback must be set before loadAfterDelay() is called.");
        }
        break MISSING_BLOCK_LABEL_62;
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
        if (agS != null)
        {
            agS.cancel(false);
        }
        agS = agQ.schedule(cc(s), l, TimeUnit.MILLISECONDS);
        this;
        JVM INSTR monitorexit ;
    }

    public void release()
    {
        this;
        JVM INSTR monitorenter ;
        mj();
        if (agS != null)
        {
            agS.cancel(false);
        }
        agQ.shutdown();
        mClosed = true;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }
}
