// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.devicecollector.collectors;

import android.app.Activity;
import android.os.AsyncTask;
import android.util.Log;
import com.devicecollector.DataCollection;
import java.util.concurrent.TimeoutException;

// Referenced classes of package com.devicecollector.collectors:
//            CollectorStatusListener, SoftErrorCode, CollectorEnum

public abstract class AbstractAsyncCollectorTask extends AsyncTask
{

    protected Activity a;
    protected DataCollection b;
    protected CollectorEnum c;
    protected CollectorStatusListener d;
    protected SoftErrorCode e;
    protected Exception f;
    protected boolean g;
    private long h;

    public AbstractAsyncCollectorTask(Activity activity, CollectorStatusListener collectorstatuslistener, DataCollection datacollection, CollectorEnum collectorenum, long l)
    {
        a = activity;
        b = datacollection;
        d = collectorstatuslistener;
        c = collectorenum;
        if (l < 1000L)
        {
            a(5000L);
            return;
        } else
        {
            a(l);
            return;
        }
    }

    protected transient DataCollection a(Void avoid[])
    {
        a("Starting runner...", new Object[0]);
        if (!g)
        {
            a();
        }
        return b;
    }

    protected abstract void a();

    public void a(long l)
    {
        h = l;
    }

    protected void a(DataCollection datacollection)
    {
        a("Post Execute...", new Object[0]);
        d();
    }

    protected void a(SoftErrorCode softerrorcode, Exception exception)
    {
        a((new StringBuilder()).append("end process:").append(softerrorcode).toString(), new Object[0]);
        g = true;
        if (softerrorcode == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        b.a(c, softerrorcode);
        e = softerrorcode;
        f = exception;
        this;
        JVM INSTR monitorenter ;
        notifyAll();
        this;
        JVM INSTR monitorexit ;
        return;
        softerrorcode;
        this;
        JVM INSTR monitorexit ;
        throw softerrorcode;
    }

    transient void a(String s, Object aobj[])
    {
        Log.v(getClass().getSimpleName(), (new StringBuilder()).append("[").append(c).append("]").append(String.format(s, aobj)).toString());
    }

    public CollectorEnum b()
    {
        return c;
    }

    public boolean c()
    {
        return g;
    }

    void d()
    {
        a("Notifying listener...", new Object[0]);
        if (d == null) goto _L2; else goto _L1
_L1:
        if (e == null)
        {
            d.b(c);
        } else
        {
            d.a(c, e, f);
        }
        this;
        JVM INSTR monitorenter ;
        notifyAll();
        this;
        JVM INSTR monitorexit ;
_L2:
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((Void[])aobj);
    }

    public void e()
    {
        if (!g)
        {
            a("Timed out. Cancelling...", new Object[0]);
            a(SoftErrorCode.e, new TimeoutException("Timed out."));
            g = true;
            cancel(true);
            d();
            return;
        } else
        {
            a("No need to timeout, already finished", new Object[0]);
            return;
        }
    }

    public long f()
    {
        return h;
    }

    protected void onPostExecute(Object obj)
    {
        a((DataCollection)obj);
    }

    protected void onPreExecute()
    {
        a("Pre Execute...", new Object[0]);
        if (d != null)
        {
            d.a(c);
        }
        g = false;
    }
}
