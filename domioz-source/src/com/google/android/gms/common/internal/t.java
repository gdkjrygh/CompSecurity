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
import com.google.android.gms.common.api.n;
import com.google.android.gms.common.api.o;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.google.android.gms.common.internal:
//            u, ap

public final class t
    implements android.os.Handler.Callback
{

    final ArrayList a = new ArrayList();
    private final u b;
    private final ArrayList c = new ArrayList();
    private boolean d;
    private final ArrayList e = new ArrayList();
    private final Handler f;

    public t(Looper looper, u u1)
    {
        d = false;
        b = u1;
        f = new Handler(looper, this);
    }

    protected final void a()
    {
        synchronized (c)
        {
            a(((Bundle) (null)));
        }
        return;
        exception;
        arraylist;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void a(int i)
    {
        f.removeMessages(1);
        ArrayList arraylist = c;
        arraylist;
        JVM INSTR monitorenter ;
        d = true;
        Iterator iterator = (new ArrayList(c)).iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            n n1 = (n)iterator.next();
            if (!b.f_())
            {
                break;
            }
            if (c.contains(n1))
            {
                n1.onConnectionSuspended(i);
            }
        } while (true);
        break MISSING_BLOCK_LABEL_95;
        Exception exception;
        exception;
        arraylist;
        JVM INSTR monitorexit ;
        throw exception;
        a.clear();
        d = false;
        arraylist;
        JVM INSTR monitorexit ;
    }

    public final void a(Bundle bundle)
    {
        boolean flag1 = true;
        ArrayList arraylist = c;
        arraylist;
        JVM INSTR monitorenter ;
        Iterator iterator;
        boolean flag;
        if (!d)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ap.a(flag);
        f.removeMessages(1);
        d = true;
        if (a.size() == 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        ap.a(flag);
        iterator = (new ArrayList(c)).iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            n n1 = (n)iterator.next();
            if (!b.f_() || !b.c())
            {
                break;
            }
            if (!a.contains(n1))
            {
                n1.onConnected(bundle);
            }
        } while (true);
        break MISSING_BLOCK_LABEL_156;
        bundle;
        arraylist;
        JVM INSTR monitorexit ;
        throw bundle;
        a.clear();
        d = false;
        arraylist;
        JVM INSTR monitorexit ;
    }

    public final void a(ConnectionResult connectionresult)
    {
        f.removeMessages(1);
        ArrayList arraylist = e;
        arraylist;
        JVM INSTR monitorenter ;
        Iterator iterator = (new ArrayList(e)).iterator();
_L2:
        o o1;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_93;
        }
        o1 = (o)iterator.next();
        if (!b.f_())
        {
            return;
        }
        if (e.contains(o1))
        {
            o1.onConnectionFailed(connectionresult);
        }
        if (true) goto _L2; else goto _L1
_L1:
        connectionresult;
        arraylist;
        JVM INSTR monitorexit ;
        throw connectionresult;
        arraylist;
        JVM INSTR monitorexit ;
    }

    public final void a(n n1)
    {
        ap.a(n1);
        ArrayList arraylist = c;
        arraylist;
        JVM INSTR monitorenter ;
        if (!c.contains(n1))
        {
            break MISSING_BLOCK_LABEL_82;
        }
        Log.w("GmsClientEvents", (new StringBuilder("registerConnectionCallbacks(): listener ")).append(n1).append(" is already registered").toString());
_L2:
        if (b.c())
        {
            f.sendMessage(f.obtainMessage(1, n1));
        }
        return;
        c.add(n1);
        if (true) goto _L2; else goto _L1
_L1:
        n1;
        arraylist;
        JVM INSTR monitorexit ;
        throw n1;
    }

    public final void a(o o1)
    {
        ap.a(o1);
        ArrayList arraylist = e;
        arraylist;
        JVM INSTR monitorenter ;
        if (!e.contains(o1))
        {
            break MISSING_BLOCK_LABEL_53;
        }
        Log.w("GmsClientEvents", (new StringBuilder("registerConnectionFailedListener(): listener ")).append(o1).append(" is already registered").toString());
_L2:
        return;
        e.add(o1);
        if (true) goto _L2; else goto _L1
_L1:
        o1;
        arraylist;
        JVM INSTR monitorexit ;
        throw o1;
    }

    public final void b(n n1)
    {
        ap.a(n1);
        ArrayList arraylist = c;
        arraylist;
        JVM INSTR monitorenter ;
        if (c.remove(n1)) goto _L2; else goto _L1
_L1:
        Log.w("GmsClientEvents", (new StringBuilder("unregisterConnectionCallbacks(): listener ")).append(n1).append(" not found").toString());
_L4:
        return;
_L2:
        if (d)
        {
            a.add(n1);
        }
        if (true) goto _L4; else goto _L3
_L3:
        n1;
        arraylist;
        JVM INSTR monitorexit ;
        throw n1;
    }

    public final void b(o o1)
    {
        ap.a(o1);
        synchronized (e)
        {
            if (!e.remove(o1))
            {
                Log.w("GmsClientEvents", (new StringBuilder("unregisterConnectionFailedListener(): listener ")).append(o1).append(" not found").toString());
            }
        }
        return;
        o1;
        arraylist;
        JVM INSTR monitorexit ;
        throw o1;
    }

    public final boolean handleMessage(Message message)
    {
        if (message.what == 1)
        {
            n n1 = (n)message.obj;
            synchronized (c)
            {
                if (b.f_() && b.c() && c.contains(n1))
                {
                    n1.onConnected(null);
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
