// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.gms.dynamic.c;

// Referenced classes of package com.google.android.gms.internal:
//            ap, cn, aw, x, 
//            ao, ax, ar, cm, 
//            at, v

public final class as
    implements at.a
{

    private final aw dZ;
    private final Object eJ = new Object();
    private final v em;
    private final String fd;
    private final long fe;
    private final ao ff;
    private final x fg;
    private ax fh;
    private int fi;
    private final Context mContext;

    public as(Context context, String s, aw aw1, ap ap1, ao ao1, v v, x x1)
    {
        fi = -2;
        mContext = context;
        fd = s;
        dZ = aw1;
        long l;
        if (ap1.eV != -1L)
        {
            l = ap1.eV;
        } else
        {
            l = 10000L;
        }
        fe = l;
        ff = ao1;
        em = v;
        fg = x1;
    }

    private ax P()
    {
        cn.o((new StringBuilder()).append("Instantiating mediation adapter: ").append(fd).toString());
        ax ax1;
        try
        {
            ax1 = dZ.g(fd);
        }
        catch (RemoteException remoteexception)
        {
            cn.a((new StringBuilder()).append("Could not instantiate mediation adapter: ").append(fd).toString(), remoteexception);
            return null;
        }
        return ax1;
    }

    static ax a(as as1, ax ax1)
    {
        as1.fh = ax1;
        return ax1;
    }

    static Object a(as as1)
    {
        return as1.eJ;
    }

    private void a(long l, long l1, long l2, long l3)
    {
        do
        {
            if (fi != -2)
            {
                return;
            }
            b(l, l1, l2, l3);
        } while (true);
    }

    private void a(ar ar1)
    {
        if (fg.ex)
        {
            fh.a(com.google.android.gms.dynamic.c.g(mContext), em, ff.eS, ar1);
            return;
        }
        try
        {
            fh.a(com.google.android.gms.dynamic.c.g(mContext), fg, em, ff.eS, ar1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ar ar1)
        {
            cn.b("Could not request ad from mediation adapter.", ar1);
        }
        d(5);
        return;
    }

    static void a(as as1, ar ar1)
    {
        as1.a(ar1);
    }

    static int b(as as1)
    {
        return as1.fi;
    }

    private void b(long l, long l1, long l2, long l3)
    {
        long l4 = SystemClock.elapsedRealtime();
        l = l1 - (l4 - l);
        l1 = l3 - (l4 - l2);
        if (l <= 0L || l1 <= 0L)
        {
            cn.o("Timed out waiting for adapter.");
            fi = 3;
            return;
        }
        try
        {
            eJ.wait(Math.min(l, l1));
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            fi = -1;
        }
    }

    static ax c(as as1)
    {
        return as1.P();
    }

    static ax d(as as1)
    {
        return as1.fh;
    }

    public at b(long l, long l1)
    {
        Object obj1;
        synchronized (eJ)
        {
            long l2 = SystemClock.elapsedRealtime();
            obj1 = new ar();
            cm.hO.post(new Runnable(((ar) (obj1))) {

                final ar fj;
                final as fk;

                public void run()
                {
label0:
                    {
                        synchronized (as.a(fk))
                        {
                            if (as.b(fk) == -2)
                            {
                                break label0;
                            }
                        }
                        return;
                    }
                    as.a(fk, com.google.android.gms.internal.as.c(fk));
                    if (as.d(fk) != null)
                    {
                        break MISSING_BLOCK_LABEL_66;
                    }
                    fk.d(4);
                    obj2;
                    JVM INSTR monitorexit ;
                    return;
                    exception1;
                    obj2;
                    JVM INSTR monitorexit ;
                    throw exception1;
                    fj.a(fk);
                    as.a(fk, fj);
                    obj2;
                    JVM INSTR monitorexit ;
                }

            
            {
                fk = as.this;
                fj = ar1;
                super();
            }
            });
            a(l2, fe, l, l1);
            obj1 = new at(ff, fh, fd, ((ar) (obj1)), fi);
        }
        return ((at) (obj1));
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void cancel()
    {
        Object obj = eJ;
        obj;
        JVM INSTR monitorenter ;
        if (fh != null)
        {
            fh.destroy();
        }
_L1:
        fi = -1;
        eJ.notify();
        return;
        Object obj1;
        obj1;
        cn.b("Could not destroy mediation adapter.", ((Throwable) (obj1)));
          goto _L1
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
    }

    public void d(int i)
    {
        synchronized (eJ)
        {
            fi = i;
            eJ.notify();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
