// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.ads.internal.n;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.util.client.b;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

// Referenced classes of package com.google.android.gms.internal:
//            gi, fh, gq, gl, 
//            gb, gm, ac, o

public final class fg extends gi
{

    private final fc.a a;
    private final AdResponseParcel b;
    private final gb.a c;
    private final fh d;
    private final Object e;
    private Future f;

    public fg(Context context, n n, ac ac, gb.a a1, o o, fc.a a2)
    {
        this(a1, a2, new fh(context, n, ac, new gq(context), o, a1));
    }

    private fg(gb.a a1, fc.a a2, fh fh1)
    {
        e = new Object();
        c = a1;
        b = a1.b;
        a = a2;
        d = fh1;
    }

    static fc.a a(fg fg1)
    {
        return fg1.a;
    }

    public final void a()
    {
        byte byte0 = -2;
        synchronized (e)
        {
            f = gl.a(d);
        }
        try
        {
            obj = (gb)f.get(60000L, TimeUnit.MILLISECONDS);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            com.google.android.gms.ads.internal.util.client.b.c("Timed out waiting for native ad.");
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
            obj = new gb(c.a.c, null, null, byte0, null, null, b.l, b.k, c.a.i, false, null, null, null, null, null, b.i, c.d, b.g, c.f, b.n, b.o, c.h, null, c.a.x);
        }
        gm.a.post(new Runnable(((gb) (obj))) {

            final gb a;
            final fg b;

            public final void run()
            {
                fg.a(b).b(a);
            }

            
            {
                b = fg.this;
                a = gb1;
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
