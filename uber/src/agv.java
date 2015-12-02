// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.SystemClock;

public abstract class agv extends agz
    implements akm
{

    protected boolean a;
    private final akl i;
    private boolean j;

    protected agv(Context context, aio aio, akk akk1, ahc ahc)
    {
        super(context, aio, akk1, ahc);
        a = false;
        j = false;
        i = akk1.i();
    }

    private boolean c(long l)
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
            throw new aha("Ad request cancelled.", -1);
        }
        return true;
    }

    protected final void a(long l)
    {
        do
        {
            if (!c(l))
            {
                throw new aha("Timed out waiting for WebView to finish loading.", 2);
            }
            if (j)
            {
                throw new aha("Received cancellation request from creative.", 0);
            }
        } while (!a);
    }

    public final void a(akk akk1, boolean flag)
    {
        boolean flag1 = true;
        akk1 = ((akk) (e));
        akk1;
        JVM INSTR monitorenter ;
        of.a("WebView finished loading.");
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
        akk1;
        JVM INSTR monitorexit ;
        return;
        exception;
        akk1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void b()
    {
        synchronized (f)
        {
            d.stopLoading();
            ot.g().a(d.a());
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
