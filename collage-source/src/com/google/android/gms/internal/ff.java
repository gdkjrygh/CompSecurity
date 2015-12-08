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
//            gs, fg, ha, gl, 
//            gv, gw, ad, n

public class ff extends gs
{

    private final fb.a a;
    private final AdResponseParcel b;
    private final gl.a c;
    private final fg d;
    private final Object e;
    private Future f;

    public ff(Context context, zzn zzn, ad ad, gl.a a1, n n, fb.a a2)
    {
        this(a1, a2, new fg(context, zzn, ad, new ha(context), n, a1));
    }

    ff(gl.a a1, fb.a a2, fg fg1)
    {
        e = new Object();
        c = a1;
        b = a1.b;
        a = a2;
        d = fg1;
    }

    static fb.a a(ff ff1)
    {
        return ff1.a;
    }

    private gl a(int i)
    {
        return new gl(c.a.zzDy, null, null, i, null, null, b.orientation, b.zzyA, c.a.zzDB, false, null, null, null, null, null, b.zzDY, c.d, b.zzDW, c.f, b.zzEb, b.zzEc, c.h, null, c.a.zzDO);
    }

    public void onStop()
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

    public void zzdG()
    {
        synchronized (e)
        {
            f = gv.a(d);
        }
        obj = (gl)f.get(60000L, TimeUnit.MILLISECONDS);
        byte byte0 = -2;
_L1:
        if (obj == null)
        {
            obj = a(byte0);
        }
        gw.a.post(new zzge._cls1(this, ((gl) (obj))));
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
            zzb.zzaE("Timed out waiting for native ad.");
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
}
