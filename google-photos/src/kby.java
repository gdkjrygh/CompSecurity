// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

public final class kby
    implements android.os.Handler.Callback
{

    public final kbz a;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public volatile boolean e;
    public final AtomicInteger f = new AtomicInteger(0);
    public boolean g;
    public final Handler h;
    public final Object i = new Object();

    public kby(Looper looper, kbz kbz1)
    {
        e = false;
        g = false;
        a = kbz1;
        h = new Handler(looper, this);
    }

    public final void a()
    {
        e = false;
        f.incrementAndGet();
    }

    public final void a(int j)
    {
        boolean flag = false;
        if (Looper.myLooper() == h.getLooper())
        {
            flag = true;
        }
        b.a(flag, "onUnintentionalDisconnection must only be called on the Handler thread");
        h.removeMessages(1);
        Object obj = i;
        obj;
        JVM INSTR monitorenter ;
        g = true;
        Object obj1 = new ArrayList(b);
        int k = f.get();
        obj1 = ((ArrayList) (obj1)).iterator();
        do
        {
            if (!((Iterator) (obj1)).hasNext())
            {
                break;
            }
            jyq jyq1 = (jyq)((Iterator) (obj1)).next();
            if (!e || f.get() != k)
            {
                break;
            }
            if (b.contains(jyq1))
            {
                jyq1.a(j);
            }
        } while (true);
        break MISSING_BLOCK_LABEL_139;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        c.clear();
        g = false;
        obj;
        JVM INSTR monitorexit ;
    }

    public final void a(jyq jyq1)
    {
        b.d(jyq1);
        Object obj = i;
        obj;
        JVM INSTR monitorenter ;
        if (!b.contains(jyq1))
        {
            break MISSING_BLOCK_LABEL_82;
        }
        Log.w("GmsClientEvents", (new StringBuilder("registerConnectionCallbacks(): listener ")).append(jyq1).append(" is already registered").toString());
_L2:
        if (a.j())
        {
            h.sendMessage(h.obtainMessage(1, jyq1));
        }
        return;
        b.add(jyq1);
        if (true) goto _L2; else goto _L1
_L1:
        jyq1;
        obj;
        JVM INSTR monitorexit ;
        throw jyq1;
    }

    public final void a(jys jys)
    {
        b.d(jys);
        Object obj = i;
        obj;
        JVM INSTR monitorenter ;
        if (!d.contains(jys))
        {
            break MISSING_BLOCK_LABEL_53;
        }
        Log.w("GmsClientEvents", (new StringBuilder("registerConnectionFailedListener(): listener ")).append(jys).append(" is already registered").toString());
_L2:
        return;
        d.add(jys);
        if (true) goto _L2; else goto _L1
_L1:
        jys;
        obj;
        JVM INSTR monitorexit ;
        throw jys;
    }

    public final boolean b(jyq jyq1)
    {
        b.d(jyq1);
        boolean flag;
        synchronized (i)
        {
            flag = b.contains(jyq1);
        }
        return flag;
        jyq1;
        obj;
        JVM INSTR monitorexit ;
        throw jyq1;
    }

    public final boolean b(jys jys)
    {
        b.d(jys);
        boolean flag;
        synchronized (i)
        {
            flag = d.contains(jys);
        }
        return flag;
        jys;
        obj;
        JVM INSTR monitorexit ;
        throw jys;
    }

    public final boolean handleMessage(Message message)
    {
        if (message.what == 1)
        {
            jyq jyq1 = (jyq)message.obj;
            synchronized (i)
            {
                if (e && a.j() && b.contains(jyq1))
                {
                    jyq1.a(a.b());
                }
            }
            return true;
        } else
        {
            Log.wtf("GmsClientEvents", "Don't know how to handle this message.");
            return false;
        }
        exception;
        message;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
