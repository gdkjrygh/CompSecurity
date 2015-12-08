// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.b;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.google.android.gms.internal:
//            am

public final class ab
{
    public static interface b
    {

        public abstract Bundle X_();

        public abstract boolean Y_();

        public abstract boolean c();
    }


    final ArrayList a = new ArrayList();
    private final b b;
    private final ArrayList c = new ArrayList();
    private boolean d;
    private final ArrayList e = new ArrayList();
    private final Handler f;

    public ab(Context context, Looper looper, b b1)
    {
        d = false;
        b = b1;
    /* block-local class not found */
    class a {}

        f = new a(looper);
    }

    static ArrayList a(ab ab1)
    {
        return ab1.c;
    }

    static b b(ab ab1)
    {
        return ab1.b;
    }

    protected void a()
    {
        synchronized (c)
        {
            a(b.X_());
        }
        return;
        exception;
        arraylist;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void a(int i)
    {
        f.removeMessages(1);
        ArrayList arraylist = c;
        arraylist;
        JVM INSTR monitorenter ;
        Iterator iterator;
        d = true;
        iterator = (new ArrayList(c)).iterator();
_L5:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        com.google.android.gms.common.api.h.b b1 = (com.google.android.gms.common.api.h.b)iterator.next();
        if (b.Y_()) goto _L3; else goto _L2
_L2:
        d = false;
        return;
_L3:
        if (c.contains(b1))
        {
            b1.a(i);
        }
        if (true) goto _L5; else goto _L4
_L4:
        Exception exception;
        exception;
        arraylist;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void a(Bundle bundle)
    {
        boolean flag1 = true;
        ArrayList arraylist = c;
        arraylist;
        JVM INSTR monitorenter ;
        Iterator iterator;
        com.google.android.gms.common.api.h.b b1;
        boolean flag;
        if (!d)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        am.a(flag);
        f.removeMessages(1);
        d = true;
        if (a.size() == 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        am.a(flag);
        iterator = (new ArrayList(c)).iterator();
_L5:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        b1 = (com.google.android.gms.common.api.h.b)iterator.next();
        if (b.Y_() && b.c()) goto _L3; else goto _L2
_L2:
        a.clear();
        d = false;
        arraylist;
        JVM INSTR monitorexit ;
        return;
_L3:
        if (!a.contains(b1))
        {
            b1.a(bundle);
        }
        if (true) goto _L5; else goto _L4
_L4:
        bundle;
        arraylist;
        JVM INSTR monitorexit ;
        throw bundle;
    }

    public void a(com.google.android.gms.common.api.h.b b1)
    {
        am.a(b1);
        ArrayList arraylist = c;
        arraylist;
        JVM INSTR monitorenter ;
        if (!c.contains(b1))
        {
            break MISSING_BLOCK_LABEL_85;
        }
        Log.w("GmsClientEvents", (new StringBuilder()).append("registerConnectionCallbacks(): listener ").append(b1).append(" is already registered").toString());
_L2:
        if (b.c())
        {
            f.sendMessage(f.obtainMessage(1, b1));
        }
        return;
        c.add(b1);
        if (true) goto _L2; else goto _L1
_L1:
        b1;
        arraylist;
        JVM INSTR monitorexit ;
        throw b1;
    }

    public void a(com.google.android.gms.common.b b1)
    {
        f.removeMessages(1);
        ArrayList arraylist = e;
        arraylist;
        JVM INSTR monitorenter ;
        Iterator iterator = (new ArrayList(e)).iterator();
_L2:
        com.google.android.gms.common.d.b b2;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_93;
        }
        b2 = (com.google.android.gms.common.d.b)iterator.next();
        if (!b.Y_())
        {
            return;
        }
        if (e.contains(b2))
        {
            b2.a(b1);
        }
        if (true) goto _L2; else goto _L1
_L1:
        b1;
        arraylist;
        JVM INSTR monitorexit ;
        throw b1;
        arraylist;
        JVM INSTR monitorexit ;
    }

    public void a(com.google.android.gms.common.d.b b1)
    {
        am.a(b1);
        ArrayList arraylist = e;
        arraylist;
        JVM INSTR monitorenter ;
        if (!e.contains(b1))
        {
            break MISSING_BLOCK_LABEL_56;
        }
        Log.w("GmsClientEvents", (new StringBuilder()).append("registerConnectionFailedListener(): listener ").append(b1).append(" is already registered").toString());
_L2:
        return;
        e.add(b1);
        if (true) goto _L2; else goto _L1
_L1:
        b1;
        arraylist;
        JVM INSTR monitorexit ;
        throw b1;
    }

    public boolean b(com.google.android.gms.common.api.h.b b1)
    {
        am.a(b1);
        boolean flag;
        synchronized (c)
        {
            flag = c.contains(b1);
        }
        return flag;
        b1;
        arraylist;
        JVM INSTR monitorexit ;
        throw b1;
    }

    public boolean b(com.google.android.gms.common.d.b b1)
    {
        am.a(b1);
        boolean flag;
        synchronized (e)
        {
            flag = e.contains(b1);
        }
        return flag;
        b1;
        arraylist;
        JVM INSTR monitorexit ;
        throw b1;
    }

    public void c(com.google.android.gms.common.api.h.b b1)
    {
        am.a(b1);
        ArrayList arraylist = c;
        arraylist;
        JVM INSTR monitorenter ;
        if (c == null) goto _L2; else goto _L1
_L1:
        if (c.remove(b1)) goto _L4; else goto _L3
_L3:
        Log.w("GmsClientEvents", (new StringBuilder()).append("unregisterConnectionCallbacks(): listener ").append(b1).append(" not found").toString());
_L2:
        return;
_L4:
        if (d)
        {
            a.add(b1);
        }
        if (true) goto _L2; else goto _L5
_L5:
        b1;
        arraylist;
        JVM INSTR monitorexit ;
        throw b1;
    }

    public void c(com.google.android.gms.common.d.b b1)
    {
        am.a(b1);
        synchronized (e)
        {
            if (e != null && !e.remove(b1))
            {
                Log.w("GmsClientEvents", (new StringBuilder()).append("unregisterConnectionFailedListener(): listener ").append(b1).append(" not found").toString());
            }
        }
        return;
        b1;
        arraylist;
        JVM INSTR monitorexit ;
        throw b1;
    }
}
