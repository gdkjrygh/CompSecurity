// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzn;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

// Referenced classes of package com.google.android.gms.internal:
//            pj, mv, qr, pb, 
//            pu, pa, qa, mu, 
//            mo, bi, ad

public final class mt extends pj
{

    private final mo a;
    private final AdResponseParcel b;
    private final pb c;
    private final mv d;
    private final Object e;
    private Future f;

    public mt(Context context, zzn zzn, bi bi, pb pb1, ad ad, mo mo)
    {
        this(pb1, mo, new mv(context, zzn, bi, new qr(context), ad, pb1));
    }

    private mt(pb pb1, mo mo, mv mv1)
    {
        e = new Object();
        c = pb1;
        b = pb1.b;
        a = mo;
        d = mv1;
    }

    static mo a(mt mt1)
    {
        return mt1.a;
    }

    public final void onStop()
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

    public final void zzbn()
    {
        byte byte0 = -2;
        synchronized (e)
        {
            f = pu.a(d);
        }
        try
        {
            obj = (pa)f.get(60000L, TimeUnit.MILLISECONDS);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            zzb.zzaH("Timed out waiting for native ad.");
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
            obj = new pa(c.a.zzEn, null, null, byte0, null, null, b.orientation, b.zzzc, c.a.zzEq, false, null, null, null, null, null, b.zzEL, c.d, b.zzEJ, c.f, b.zzEO, b.zzEP, c.h, null);
        }
        qa.a.post(new mu(this, ((pa) (obj))));
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
