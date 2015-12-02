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

public final class ahg extends aiw
{

    private final ahc a;
    private final AdResponseParcel b;
    private final aio c;
    private final ahh d;
    private final Object e;
    private Future f;

    private ahg(aio aio1, ahc ahc, ahh ahh1)
    {
        e = new Object();
        c = aio1;
        b = aio1.b;
        a = ahc;
        d = ahh1;
    }

    public ahg(Context context, oh oh, aqn aqn, aio aio1, amb amb, ahc ahc)
    {
        this(aio1, ahc, new ahh(context, oh, aqn, new ajn(), amb, aio1));
    }

    static ahc a(ahg ahg1)
    {
        return ahg1.a;
    }

    private ain a(int i)
    {
        return new ain(c.a.c, null, null, i, null, null, b.l, b.k, c.a.i, false, null, null, null, null, null, b.i, c.d, b.g, c.f, b.n, b.o, c.h, null, c.a.x);
    }

    public final void a()
    {
        synchronized (e)
        {
            f = ajb.a(d);
        }
        obj = (ain)f.get(60000L, TimeUnit.MILLISECONDS);
        byte byte0 = -2;
_L1:
        if (obj == null)
        {
            obj = a(byte0);
        }
        ajc.a.post(new _cls1(((ain) (obj))));
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        try
        {
            throw exception;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            of.e("Timed out waiting for native ad.");
            f.cancel(true);
            byte0 = 2;
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
            obj = null;
            byte0 = -1;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            obj = null;
            byte0 = -1;
        }
          goto _L1
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

    /* member class not found */
    class _cls1 {}

}
