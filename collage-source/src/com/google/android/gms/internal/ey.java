// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzp;

// Referenced classes of package com.google.android.gms.internal:
//            fa, hs, gx, ht

public abstract class ey extends fa
    implements ht.a
{

    protected boolean a;
    private final ht i;
    private boolean j;

    protected ey(Context context, gl.a a1, hs hs1, fb.a a2)
    {
        super(context, a1, hs1, a2);
        a = false;
        j = false;
        i = hs1.i();
    }

    private boolean c(long l)
        throws fa.a
    {
        l = 60000L - (SystemClock.elapsedRealtime() - l);
        if (l <= 1L)
        {
            return false;
        }
        try
        {
            e.wait(l);
        }
        catch (InterruptedException interruptedexception)
        {
            throw new fa.a("Ad request cancelled.", -1);
        }
        return true;
    }

    protected void a(long l)
        throws fa.a
    {
        do
        {
            if (!c(l))
            {
                throw new fa.a("Timed out waiting for WebView to finish loading.", 2);
            }
            if (j)
            {
                throw new fa.a("Received cancellation request from creative.", 0);
            }
        } while (!a);
    }

    public void onStop()
    {
        synchronized (f)
        {
            d.stopLoading();
            zzp.zzbz().a(d.getWebView());
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zza(hs hs1, boolean flag)
    {
        boolean flag1 = true;
        hs1 = ((hs) (e));
        hs1;
        JVM INSTR monitorenter ;
        zzb.zzaC("WebView finished loading.");
        a = true;
        Exception exception;
        if (!flag)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        j = flag;
        e.notify();
        hs1;
        JVM INSTR monitorexit ;
        return;
        exception;
        hs1;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
