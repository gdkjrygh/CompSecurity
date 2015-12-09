// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cx;

import android.content.OperationApplicationException;
import android.os.AsyncTask;
import android.os.RemoteException;
import com.pandora.radio.data.u;
import com.pandora.radio.util.i;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONException;
import p.cw.c;
import p.df.a;

// Referenced classes of package p.cx:
//            y, q, n, m

public abstract class d extends AsyncTask
{

    public static final Object b = null;
    private boolean a;
    private long c;
    private final Object d;

    protected d()
    {
        a = false;
        d = b;
    }

    protected transient void a(Exception exception, Object aobj[])
    {
        int j;
label0:
        {
            if (!(exception instanceof y))
            {
                b(exception, aobj);
                return;
            }
            int k = ((y)exception).a();
            if (k != 1)
            {
                j = k;
                if (k != 1000)
                {
                    break label0;
                }
            }
            j = 1;
        }
        i.a(exception.getMessage(), j);
    }

    public transient AsyncTask a_(Object aobj[])
    {
        a = true;
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            return executeOnExecutor(THREAD_POOL_EXECUTOR, aobj);
        } else
        {
            return execute(aobj);
        }
    }

    public transient abstract Object b(Object aobj[])
        throws JSONException, q, y, n, RemoteException, OperationApplicationException;

    protected transient boolean b(Exception exception, Object aobj[])
    {
        if (!p.cx.m.a(exception, getClass()))
        {
            return false;
        }
        try
        {
            Thread.sleep(3000L);
        }
        // Misplaced declaration of an exception variable
        catch (Exception exception)
        {
            exception.printStackTrace();
        }
        p.cx.m.a(this, aobj);
        return true;
    }

    public transient Object doInBackground(Object aobj[])
    {
        if (a) goto _L2; else goto _L1
_L1:
        long l = System.currentTimeMillis();
        p/cx/d;
        JVM INSTR monitorenter ;
        Object obj;
        p.df.a.a("ApiTask", (new StringBuilder()).append("ApiTask ").append(getClass()).append(" blocked for ").append(System.currentTimeMillis() - l).append(" ms").toString());
        obj = b(aobj);
        p/cx/d;
        JVM INSTR monitorexit ;
_L4:
        c.z.t().c();
        return obj;
        obj;
        p/cx/d;
        JVM INSTR monitorexit ;
        try
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            p.df.a.a("ApiTask", (new StringBuilder()).append("ApiTask ").append(getClass()).append(" failed (may retry).").toString(), ((Throwable) (obj)));
            if (p.cx.m.a(((y) (obj)), this, aobj))
            {
                return d;
            }
            break; /* Loop/switch isn't completed */
        }
        catch (Exception exception)
        {
            p.df.a.a("ApiTask", (new StringBuilder()).append("ApiTask ").append(getClass()).append(" failed (may retry).").toString(), exception);
            if (c.z != null && c.z.C())
            {
                a(exception, aobj);
                return d;
            }
            if (b(exception, aobj))
            {
                return d;
            }
            if (exception instanceof RemoteException)
            {
                p.cx.m.a((RemoteException)exception, getClass());
                return d;
            }
            p.df.a.b("ApiTask", "ApiTask error", exception);
        }
        break MISSING_BLOCK_LABEL_168;
_L2:
        obj = b(aobj);
        if (true) goto _L4; else goto _L3
_L3:
        if (c.z.C())
        {
            a(((Exception) (obj)), aobj);
            return d;
        }
        m.b(((y) (obj)), this, aobj);
        return d;
    }

    protected boolean f()
    {
        if (THREAD_POOL_EXECUTOR instanceof ThreadPoolExecutor)
        {
            BlockingQueue blockingqueue = ((ThreadPoolExecutor)THREAD_POOL_EXECUTOR).getQueue();
            if (blockingqueue != null && blockingqueue.remainingCapacity() <= 32)
            {
                return true;
            }
        }
        return false;
    }

    protected long g()
    {
        return System.currentTimeMillis() - c;
    }

    public void onPostExecute(Object obj)
    {
    }

    protected void onPreExecute()
    {
        c = System.currentTimeMillis();
    }

}
