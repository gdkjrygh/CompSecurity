// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.a;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.d;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.internal:
//            gb, gt, gc

public final class ga
{

    final ArrayList a = new ArrayList();
    private final gc b;
    private ArrayList c;
    private boolean d;
    private ArrayList e;
    private final Handler f;
    private boolean g;

    public ga(Looper looper, gc gc1)
    {
        d = false;
        g = false;
        c = new ArrayList();
        e = new ArrayList();
        b = gc1;
        f = new gb(this, looper);
    }

    static ArrayList a(ga ga1)
    {
        return ga1.c;
    }

    static gc b(ga ga1)
    {
        return ga1.b;
    }

    protected final void a()
    {
        boolean flag1 = true;
        ArrayList arraylist = c;
        arraylist;
        JVM INSTR monitorenter ;
        Object obj = b;
        obj = c;
        obj;
        JVM INSTR monitorenter ;
        Exception exception;
        ArrayList arraylist1;
        Exception exception1;
        int i;
        int j;
        boolean flag;
        if (!d)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.gms.internal.gt.a(flag);
        f.removeMessages(1);
        d = true;
        if (a.size() == 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        com.google.android.gms.internal.gt.a(flag);
        arraylist1 = c;
        j = arraylist1.size();
        i = 0;
_L2:
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_155;
        }
        if (b.j() && b.e())
        {
            a.size();
            if (!a.contains(arraylist1.get(i)))
            {
                ((b)arraylist1.get(i)).a();
            }
            break MISSING_BLOCK_LABEL_182;
        }
        a.clear();
        d = false;
        obj;
        JVM INSTR monitorexit ;
        arraylist;
        JVM INSTR monitorexit ;
        return;
        exception1;
        obj;
        JVM INSTR monitorexit ;
        throw exception1;
        exception;
        arraylist;
        JVM INSTR monitorexit ;
        throw exception;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final void a(a a1)
    {
        f.removeMessages(1);
        ArrayList arraylist = e;
        arraylist;
        JVM INSTR monitorenter ;
        ArrayList arraylist1;
        int j;
        g = true;
        arraylist1 = e;
        j = arraylist1.size();
        int i = 0;
_L2:
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_90;
        }
        if (b.j())
        {
            break MISSING_BLOCK_LABEL_56;
        }
        arraylist;
        JVM INSTR monitorexit ;
        return;
        if (e.contains(arraylist1.get(i)))
        {
            ((d)arraylist1.get(i)).a(a1);
        }
        break MISSING_BLOCK_LABEL_103;
        g = false;
        arraylist;
        JVM INSTR monitorexit ;
        return;
        a1;
        arraylist;
        JVM INSTR monitorexit ;
        throw a1;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final void a(b b1)
    {
        com.google.android.gms.internal.gt.a(b1);
        ArrayList arraylist = c;
        arraylist;
        JVM INSTR monitorenter ;
        if (!c.contains(b1))
        {
            break MISSING_BLOCK_LABEL_82;
        }
        Log.w("GmsClientEvents", (new StringBuilder("registerConnectionCallbacks(): listener ")).append(b1).append(" is already registered").toString());
_L2:
        if (b.e())
        {
            f.sendMessage(f.obtainMessage(1, b1));
        }
        return;
        if (d)
        {
            c = new ArrayList(c);
        }
        c.add(b1);
        if (true) goto _L2; else goto _L1
_L1:
        b1;
        throw b1;
    }

    public final void a(d d1)
    {
        com.google.android.gms.internal.gt.a(d1);
        ArrayList arraylist = e;
        arraylist;
        JVM INSTR monitorenter ;
        if (!e.contains(d1))
        {
            break MISSING_BLOCK_LABEL_53;
        }
        Log.w("GmsClientEvents", (new StringBuilder("registerConnectionFailedListener(): listener ")).append(d1).append(" is already registered").toString());
_L2:
        return;
        if (g)
        {
            e = new ArrayList(e);
        }
        e.add(d1);
        if (true) goto _L2; else goto _L1
_L1:
        d1;
        throw d1;
    }

    public final void b()
    {
        f.removeMessages(1);
        ArrayList arraylist = c;
        arraylist;
        JVM INSTR monitorenter ;
        ArrayList arraylist1;
        int j;
        d = true;
        arraylist1 = c;
        j = arraylist1.size();
        int i = 0;
_L2:
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_82;
        }
        if (b.j())
        {
            if (c.contains(arraylist1.get(i)))
            {
                ((b)arraylist1.get(i)).b();
            }
            break MISSING_BLOCK_LABEL_95;
        }
        d = false;
        arraylist;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        arraylist;
        JVM INSTR monitorexit ;
        throw exception;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }
}
