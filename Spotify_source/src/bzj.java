// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.internal.zzal;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class bzj extends zzal
{

    private static AdvertisingIdClient d = null;
    private static CountDownLatch e = new CountDownLatch(1);
    private static volatile boolean f;
    private boolean g;

    private bzj(Context context, bzn bzn, bzo bzo, boolean flag)
    {
        super(context, bzn, bzo);
        g = flag;
    }

    public static bzj a(String s, Context context, boolean flag)
    {
        bys bys1;
        bys1 = new bys();
        a(s, context, ((bzn) (bys1)));
        if (!flag) goto _L2; else goto _L1
_L1:
        bzj;
        JVM INSTR monitorenter ;
        if (d == null)
        {
            (new Thread(new bzl(context))).start();
        }
        bzj;
        JVM INSTR monitorexit ;
_L2:
        return new bzj(context, bys1, new bzp(), flag);
        s;
        bzj;
        JVM INSTR monitorexit ;
        throw s;
    }

    static AdvertisingIdClient a()
    {
        return d;
    }

    static AdvertisingIdClient a(AdvertisingIdClient advertisingidclient)
    {
        d = advertisingidclient;
        return advertisingidclient;
    }

    static boolean b()
    {
        f = true;
        return true;
    }

    static CountDownLatch c()
    {
        return e;
    }

    private bzk d()
    {
label0:
        {
            bzk bzk1;
            try
            {
                if (e.await(2L, TimeUnit.SECONDS))
                {
                    break label0;
                }
                bzk1 = new bzk(null, false);
            }
            catch (InterruptedException interruptedexception)
            {
                return new bzk(null, false);
            }
            return bzk1;
        }
        bzj;
        JVM INSTR monitorenter ;
        Object obj;
        if (d != null)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        obj = new bzk(null, false);
        bzj;
        JVM INSTR monitorexit ;
        return ((bzk) (obj));
        Exception exception;
        exception;
        bzj;
        JVM INSTR monitorexit ;
        throw exception;
        exception = d.getInfo();
        bzj;
        JVM INSTR monitorexit ;
        return new bzk(a(exception.getId()), exception.isLimitAdTrackingEnabled());
    }

    protected final void b(Context context)
    {
        super.b(context);
        if (f || !g)
        {
            a(24, d(context));
            return;
        }
        String s;
        context = d();
        s = ((bzk) (context)).a;
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_84;
        }
        long l;
        if (((bzk) (context)).b)
        {
            l = 1L;
        } else
        {
            l = 0L;
        }
        try
        {
            a(28, l);
            a(26, 5L);
            a(24, s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context) { }
    }

}
