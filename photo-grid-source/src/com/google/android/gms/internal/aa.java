// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.internal:
//            y, h, ac, aj, 
//            ab, z, af, ag

public class aa extends y
{

    private static AdvertisingIdClient e = null;
    private static CountDownLatch f = new CountDownLatch(1);
    private static volatile boolean g;
    private boolean h;

    private aa(Context context, af af, ag ag, boolean flag)
    {
        super(context, af, ag);
        h = flag;
    }

    static AdvertisingIdClient a()
    {
        return e;
    }

    static AdvertisingIdClient a(AdvertisingIdClient advertisingidclient)
    {
        e = advertisingidclient;
        return advertisingidclient;
    }

    public static aa a(String s, Context context, boolean flag)
    {
        h h1;
        h1 = new h();
        a(s, context, ((af) (h1)));
        if (!flag) goto _L2; else goto _L1
_L1:
        com/google/android/gms/internal/aa;
        JVM INSTR monitorenter ;
        if (e == null)
        {
            (new Thread(new ac(context))).start();
        }
        com/google/android/gms/internal/aa;
        JVM INSTR monitorexit ;
_L2:
        return new aa(context, h1, new aj(), flag);
        s;
        com/google/android/gms/internal/aa;
        JVM INSTR monitorexit ;
        throw s;
    }

    static boolean b()
    {
        g = true;
        return true;
    }

    static CountDownLatch c()
    {
        return f;
    }

    private ab d()
    {
label0:
        {
            ab ab1;
            try
            {
                if (f.await(2L, TimeUnit.SECONDS))
                {
                    break label0;
                }
                ab1 = new ab(this, null, false);
            }
            catch (InterruptedException interruptedexception)
            {
                return new ab(this, null, false);
            }
            return ab1;
        }
        com/google/android/gms/internal/aa;
        JVM INSTR monitorenter ;
        Object obj;
        if (e != null)
        {
            break MISSING_BLOCK_LABEL_71;
        }
        obj = new ab(this, null, false);
        com/google/android/gms/internal/aa;
        JVM INSTR monitorexit ;
        return ((ab) (obj));
        Exception exception;
        exception;
        com/google/android/gms/internal/aa;
        JVM INSTR monitorexit ;
        throw exception;
        exception = e.getInfo();
        com/google/android/gms/internal/aa;
        JVM INSTR monitorexit ;
        return new ab(this, a(exception.getId()), exception.isLimitAdTrackingEnabled());
    }

    protected final void b(Context context)
    {
        super.b(context);
        if (g || !h)
        {
            a(24, d(context));
            return;
        }
        String s;
        context = d();
        s = context.a();
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_84;
        }
        long l;
        if (context.b())
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
