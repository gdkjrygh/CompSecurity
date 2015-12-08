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
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.google.android.gms.common.internal:
//            bl, al

public final class ak
    implements android.os.Handler.Callback
{

    final ArrayList a = new ArrayList();
    private final al b;
    private final ArrayList c = new ArrayList();
    private final ArrayList d = new ArrayList();
    private volatile boolean e;
    private final AtomicInteger f = new AtomicInteger(0);
    private boolean g;
    private final Handler h;
    private final Object i = new Object();

    public ak(Looper looper, al al1)
    {
        e = false;
        g = false;
        b = al1;
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
        bl.a(flag, "onUnintentionalDisconnection must only be called on the Handler thread");
        h.removeMessages(1);
        Object obj = i;
        obj;
        JVM INSTR monitorenter ;
        g = true;
        Object obj1 = new ArrayList(c);
        int i1 = f.get();
        obj1 = ((ArrayList) (obj1)).iterator();
        do
        {
            if (!((Iterator) (obj1)).hasNext())
            {
                break;
            }
            k k1 = (k)((Iterator) (obj1)).next();
            if (!e || f.get() != i1)
            {
                break;
            }
            if (c.contains(k1))
            {
                k1.onConnectionSuspended(j);
            }
        } while (true);
        break MISSING_BLOCK_LABEL_139;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        a.clear();
        g = false;
        obj;
        JVM INSTR monitorexit ;
    }

    public final void a(Bundle bundle)
    {
        Object obj;
        boolean flag;
        boolean flag1 = true;
        Object obj1;
        k k1;
        int j;
        if (Looper.myLooper() == h.getLooper())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        bl.a(flag, "onConnectionSuccess must only be called on the Handler thread");
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
        bl.a(flag);
        h.removeMessages(1);
        g = true;
        if (a.size() == 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        bl.a(flag);
        obj1 = new ArrayList(c);
        j = f.get();
        obj1 = ((ArrayList) (obj1)).iterator();
        do
        {
            if (!((Iterator) (obj1)).hasNext())
            {
                break;
            }
            k1 = (k)((Iterator) (obj1)).next();
            if (!e || !b.isConnected() || f.get() != j)
            {
                break;
            }
            if (!a.contains(k1))
            {
                k1.onConnected(bundle);
            }
        } while (true);
        break MISSING_BLOCK_LABEL_203;
        bundle;
        obj;
        JVM INSTR monitorexit ;
        throw bundle;
        a.clear();
        g = false;
        obj;
        JVM INSTR monitorexit ;
    }

    public final void a(ConnectionResult connectionresult)
    {
        Object obj;
        Object obj1;
        l l1;
        int j;
        boolean flag;
        if (Looper.myLooper() == h.getLooper())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        bl.a(flag, "onConnectionFailure must only be called on the Handler thread");
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
        l1 = (l)((Iterator) (obj1)).next();
        if (!e || f.get() != j)
        {
            return;
        }
        if (d.contains(l1))
        {
            l1.onConnectionFailed(connectionresult);
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

    public final void a(k k1)
    {
        bl.a(k1);
        Object obj = i;
        obj;
        JVM INSTR monitorenter ;
        if (!c.contains(k1))
        {
            break MISSING_BLOCK_LABEL_82;
        }
        Log.w("GmsClientEvents", (new StringBuilder("registerConnectionCallbacks(): listener ")).append(k1).append(" is already registered").toString());
_L2:
        if (b.isConnected())
        {
            h.sendMessage(h.obtainMessage(1, k1));
        }
        return;
        c.add(k1);
        if (true) goto _L2; else goto _L1
_L1:
        k1;
        obj;
        JVM INSTR monitorexit ;
        throw k1;
    }

    public final void a(l l1)
    {
        bl.a(l1);
        Object obj = i;
        obj;
        JVM INSTR monitorenter ;
        if (!d.contains(l1))
        {
            break MISSING_BLOCK_LABEL_53;
        }
        Log.w("GmsClientEvents", (new StringBuilder("registerConnectionFailedListener(): listener ")).append(l1).append(" is already registered").toString());
_L2:
        return;
        d.add(l1);
        if (true) goto _L2; else goto _L1
_L1:
        l1;
        obj;
        JVM INSTR monitorexit ;
        throw l1;
    }

    public final void b()
    {
        e = true;
    }

    public final void b(l l1)
    {
        bl.a(l1);
        synchronized (i)
        {
            if (!d.remove(l1))
            {
                Log.w("GmsClientEvents", (new StringBuilder("unregisterConnectionFailedListener(): listener ")).append(l1).append(" not found").toString());
            }
        }
        return;
        l1;
        obj;
        JVM INSTR monitorexit ;
        throw l1;
    }

    public final boolean handleMessage(Message message)
    {
        if (message.what == 1)
        {
            k k1 = (k)message.obj;
            synchronized (i)
            {
                if (e && b.isConnected() && c.contains(k1))
                {
                    k1.onConnected(b.zzmS());
                }
            }
            return true;
        } else
        {
            Log.wtf("GmsClientEvents", (new StringBuilder("Don't know how to handle message: ")).append(message.what).toString(), new Exception());
            return false;
        }
        exception;
        message;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
