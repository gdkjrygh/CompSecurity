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
//            bh, zzbg, cn, zzbf

class bi
    implements zzp.e
{
    static interface a
    {

        public abstract bh a(cn cn);
    }

    static interface b
    {

        public abstract ScheduledExecutorService a();
    }


    private final String a;
    private final Context b;
    private final ScheduledExecutorService c;
    private final a d;
    private ScheduledFuture e;
    private boolean f;
    private cn g;
    private String h;
    private zzbf i;

    public bi(Context context, String s, cn cn)
    {
        this(context, s, cn, null, null);
    }

    bi(Context context, String s, cn cn, b b1, a a1)
    {
        g = cn;
        b = context;
        a = s;
        context = b1;
        if (b1 == null)
        {
            context = new b() {

                final bi a;

                public ScheduledExecutorService a()
                {
                    return Executors.newSingleThreadScheduledExecutor();
                }

            
            {
                a = bi.this;
                super();
            }
            };
        }
        c = context.a();
        if (a1 == null)
        {
            d = new a() {

                final bi a;

                public bh a(cn cn1)
                {
                    return new bh(bi.a(a), bi.b(a), cn1);
                }

            
            {
                a = bi.this;
                super();
            }
            };
            return;
        } else
        {
            d = a1;
            return;
        }
    }

    static Context a(bi bi1)
    {
        return bi1.b;
    }

    private void a()
    {
        this;
        JVM INSTR monitorenter ;
        if (f)
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

    private bh b(String s)
    {
        bh bh1 = d.a(g);
        bh1.a(i);
        bh1.a(h);
        bh1.b(s);
        return bh1;
    }

    static String b(bi bi1)
    {
        return bi1.a;
    }

    public void a(long l, String s)
    {
        this;
        JVM INSTR monitorenter ;
        zzbg.zzam((new StringBuilder()).append("loadAfterDelay: containerId=").append(a).append(" delay=").append(l).toString());
        a();
        if (i == null)
        {
            throw new IllegalStateException("callback must be set before loadAfterDelay() is called.");
        }
        break MISSING_BLOCK_LABEL_62;
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
        if (e != null)
        {
            e.cancel(false);
        }
        e = c.schedule(b(s), l, TimeUnit.MILLISECONDS);
        this;
        JVM INSTR monitorexit ;
    }

    public void a(zzbf zzbf)
    {
        this;
        JVM INSTR monitorenter ;
        a();
        i = zzbf;
        this;
        JVM INSTR monitorexit ;
        return;
        zzbf;
        throw zzbf;
    }

    public void a(String s)
    {
        this;
        JVM INSTR monitorenter ;
        a();
        h = s;
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    public void release()
    {
        this;
        JVM INSTR monitorenter ;
        a();
        if (e != null)
        {
            e.cancel(false);
        }
        c.shutdown();
        f = true;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }
}
