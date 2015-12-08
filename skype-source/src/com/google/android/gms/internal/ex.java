// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.ads.internal.p;
import com.google.android.gms.ads.internal.util.client.b;

// Referenced classes of package com.google.android.gms.internal:
//            fa, hi, gn, hj

public abstract class ex extends fa
    implements hj.a
{

    protected boolean a;
    private final hj i;
    private boolean j;

    protected ex(Context context, gb.a a1, hi hi1, fc.a a2)
    {
        super(context, a1, hi1, a2);
        a = false;
        j = false;
        i = hi1.j();
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

    protected final void a(long l)
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

    public final void a(hi hi1, boolean flag)
    {
        boolean flag1 = true;
        hi1 = ((hi) (e));
        hi1;
        JVM INSTR monitorenter ;
        com.google.android.gms.ads.internal.util.client.b.a(3);
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
        hi1;
        JVM INSTR monitorexit ;
        return;
        exception;
        hi1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void b()
    {
        synchronized (f)
        {
            d.stopLoading();
            p.g().a(d.a());
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
