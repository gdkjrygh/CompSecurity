// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.google.android.gms.common.internal:
//            z

public final class n
    implements android.os.Handler.Callback
{
    public static interface a
    {

        public abstract boolean isConnected();

        public abstract Bundle zzmw();
    }


    final ArrayList a = new ArrayList();
    private final a b;
    private final ArrayList c = new ArrayList();
    private final ArrayList d = new ArrayList();
    private volatile boolean e;
    private final AtomicInteger f = new AtomicInteger(0);
    private boolean g;
    private final Handler h;
    private final Object i = new Object();

    public n(Looper looper, a a1)
    {
        e = false;
        g = false;
        b = a1;
        h = new Handler(looper, this);
    }

    public void a()
    {
        e = false;
        f.incrementAndGet();
    }

    public void a(int j)
    {
        boolean flag = false;
        if (Looper.myLooper() == h.getLooper())
        {
            flag = true;
        }
        z.a(flag, "onUnintentionalDisconnection must only be called on the Handler thread");
        h.removeMessages(1);
        Object obj = i;
        obj;
        JVM INSTR monitorenter ;
        Object obj1;
        int k;
        g = true;
        obj1 = new ArrayList(c);
        k = f.get();
        obj1 = ((ArrayList) (obj1)).iterator();
_L5:
        if (!((Iterator) (obj1)).hasNext()) goto _L2; else goto _L1
_L1:
        com.google.android.gms.common.api.c.b b1 = (com.google.android.gms.common.api.c.b)((Iterator) (obj1)).next();
        if (e && f.get() == k) goto _L3; else goto _L2
_L2:
        a.clear();
        g = false;
        return;
_L3:
        if (c.contains(b1))
        {
            b1.onConnectionSuspended(j);
        }
        if (true) goto _L5; else goto _L4
_L4:
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void a(Bundle bundle)
    {
        boolean flag;
        boolean flag1 = true;
        Object obj;
        Object obj1;
        com.google.android.gms.common.api.c.b b1;
        int j;
        if (Looper.myLooper() == h.getLooper())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        z.a(flag, "onConnectionSuccess must only be called on the Handler thread");
        obj = i;
        obj;
        JVM INSTR monitorenter ;
        if (!g)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        z.a(flag);
        h.removeMessages(1);
        g = true;
        if (a.size() == 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        z.a(flag);
        obj1 = new ArrayList(c);
        j = f.get();
        obj1 = ((ArrayList) (obj1)).iterator();
_L5:
        if (!((Iterator) (obj1)).hasNext()) goto _L2; else goto _L1
_L1:
        b1 = (com.google.android.gms.common.api.c.b)((Iterator) (obj1)).next();
        if (e && b.isConnected() && f.get() == j) goto _L3; else goto _L2
_L2:
        a.clear();
        g = false;
        obj;
        JVM INSTR monitorexit ;
        return;
_L3:
        if (!a.contains(b1))
        {
            b1.onConnected(bundle);
        }
        if (true) goto _L5; else goto _L4
_L4:
        bundle;
        obj;
        JVM INSTR monitorexit ;
        throw bundle;
    }

    public void a(ConnectionResult connectionresult)
    {
        Object obj;
        Object obj1;
        com.google.android.gms.common.api.c.c c1;
        int j;
        boolean flag;
        if (Looper.myLooper() == h.getLooper())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        z.a(flag, "onConnectionFailure must only be called on the Handler thread");
        h.removeMessages(1);
        obj = i;
        obj;
        JVM INSTR monitorenter ;
        obj1 = new ArrayList(d);
        j = f.get();
        obj1 = ((ArrayList) (obj1)).iterator();
_L2:
        if (!((Iterator) (obj1)).hasNext())
        {
            break MISSING_BLOCK_LABEL_134;
        }
        c1 = (com.google.android.gms.common.api.c.c)((Iterator) (obj1)).next();
        if (!e || f.get() != j)
        {
            return;
        }
        if (d.contains(c1))
        {
            c1.onConnectionFailed(connectionresult);
        }
        if (true) goto _L2; else goto _L1
_L1:
        connectionresult;
        obj;
        JVM INSTR monitorexit ;
        throw connectionresult;
        obj;
        JVM INSTR monitorexit ;
    }

    public void a(com.google.android.gms.common.api.c.b b1)
    {
        z.a(b1);
        Object obj = i;
        obj;
        JVM INSTR monitorenter ;
        if (!c.contains(b1))
        {
            break MISSING_BLOCK_LABEL_85;
        }
        Log.w("GmsClientEvents", (new StringBuilder()).append("registerConnectionCallbacks(): listener ").append(b1).append(" is already registered").toString());
_L2:
        if (b.isConnected())
        {
            h.sendMessage(h.obtainMessage(1, b1));
        }
        return;
        c.add(b1);
        if (true) goto _L2; else goto _L1
_L1:
        b1;
        obj;
        JVM INSTR monitorexit ;
        throw b1;
    }

    public void a(com.google.android.gms.common.api.c.c c1)
    {
        z.a(c1);
        Object obj = i;
        obj;
        JVM INSTR monitorenter ;
        if (!d.contains(c1))
        {
            break MISSING_BLOCK_LABEL_56;
        }
        Log.w("GmsClientEvents", (new StringBuilder()).append("registerConnectionFailedListener(): listener ").append(c1).append(" is already registered").toString());
_L2:
        return;
        d.add(c1);
        if (true) goto _L2; else goto _L1
_L1:
        c1;
        obj;
        JVM INSTR monitorexit ;
        throw c1;
    }

    public void b()
    {
        e = true;
    }

    public void b(com.google.android.gms.common.api.c.b b1)
    {
        z.a(b1);
        Object obj = i;
        obj;
        JVM INSTR monitorenter ;
        if (c.remove(b1)) goto _L2; else goto _L1
_L1:
        Log.w("GmsClientEvents", (new StringBuilder()).append("unregisterConnectionCallbacks(): listener ").append(b1).append(" not found").toString());
_L4:
        return;
_L2:
        if (g)
        {
            a.add(b1);
        }
        if (true) goto _L4; else goto _L3
_L3:
        b1;
        obj;
        JVM INSTR monitorexit ;
        throw b1;
    }

    public void b(com.google.android.gms.common.api.c.c c1)
    {
        z.a(c1);
        synchronized (i)
        {
            if (!d.remove(c1))
            {
                Log.w("GmsClientEvents", (new StringBuilder()).append("unregisterConnectionFailedListener(): listener ").append(c1).append(" not found").toString());
            }
        }
        return;
        c1;
        obj;
        JVM INSTR monitorexit ;
        throw c1;
    }

    public boolean handleMessage(Message message)
    {
        if (message.what == 1)
        {
            com.google.android.gms.common.api.c.b b1 = (com.google.android.gms.common.api.c.b)message.obj;
            synchronized (i)
            {
                if (e && b.isConnected() && c.contains(b1))
                {
                    b1.onConnected(b.zzmw());
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
