// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class chv extends cjc
{

    final chq a;
    private final AdResponseParcel b;
    private final ciu c;
    private final chw d;
    private final Object e;
    private Future f;

    public chv(Context context, bks bks, cac cac, ciu ciu1, bzm bzm, chq chq)
    {
        new cjx(context);
        this(ciu1, chq, new chw(context, bks, cac, bzm, ciu1));
    }

    private chv(ciu ciu1, chq chq, chw chw1)
    {
        e = new Object();
        c = ciu1;
        b = ciu1.b;
        a = chq;
        d = chw1;
    }

    public final void a()
    {
        byte byte0 = -2;
        synchronized (e)
        {
            f = cji.a(d);
        }
        try
        {
            obj = (cit)f.get(60000L, TimeUnit.MILLISECONDS);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            bka.e("Timed out waiting for native ad.");
            byte0 = 2;
            f.cancel(true);
            obj = null;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            byte0 = 0;
            obj = null;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            byte0 = -1;
            obj = null;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            byte0 = -1;
            obj = null;
        }
        if (obj == null)
        {
            obj = c.a.c;
            int i = b.l;
            long l = b.k;
            String s = c.a.i;
            long l1 = b.i;
            com.google.android.gms.ads.internal.client.AdSizeParcel adsizeparcel = c.d;
            l1 = b.g;
            obj = new cit(((com.google.android.gms.ads.internal.client.AdRequestParcel) (obj)), null, null, byte0, null, null, i, l, s, false, null, null, null, null, null, adsizeparcel, c.f, b.n, b.o, c.h, null);
        }
        cjj.a.post(new Runnable(((cit) (obj))) {

            private cit a;
            private chv b;

            public final void run()
            {
                b.a.b(a);
            }

            
            {
                b = chv.this;
                a = cit1;
                super();
            }
        });
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void b()
    {
        synchronized (e)
        {
            if (f != null)
            {
                f.cancel(true);
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
