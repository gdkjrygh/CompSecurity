// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.a.f;

// Referenced classes of package com.google.android.gms.internal:
//            ax, aq, db, ab, 
//            ap, bd, ek, ba, 
//            at, eh, av, aw, 
//            z

public final class au
    implements ax
{

    private final String a;
    private final ba b;
    private final long c;
    private final ap d;
    private final z e;
    private final ab f;
    private final Context g;
    private final Object h = new Object();
    private final db i;
    private bd j;
    private int k;

    public au(Context context, String s, ba ba1, aq aq1, ap ap1, z z, ab ab1, 
            db db1)
    {
        k = -2;
        g = context;
        a = s;
        b = ba1;
        long l;
        if (aq1.b != -1L)
        {
            l = aq1.b;
        } else
        {
            l = 10000L;
        }
        c = l;
        d = ap1;
        e = z;
        f = ab1;
        i = db1;
    }

    static bd a(au au1, bd bd1)
    {
        au1.j = bd1;
        return bd1;
    }

    static Object a(au au1)
    {
        return au1.h;
    }

    static void a(au au1, at at1)
    {
        if (au1.i.e >= 0x3e8fa0)
        {
            break MISSING_BLOCK_LABEL_97;
        }
        if (au1.f.f)
        {
            au1.j.a(com.google.android.gms.a.f.a(au1.g), au1.e, au1.d.f, at1);
            return;
        }
        try
        {
            au1.j.a(com.google.android.gms.a.f.a(au1.g), au1.f, au1.e, au1.d.f, at1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (at at1)
        {
            ek.a("Could not request ad from mediation adapter.", at1);
        }
        au1.a(5);
        return;
        if (au1.f.f)
        {
            au1.j.a(com.google.android.gms.a.f.a(au1.g), au1.e, au1.d.f, au1.d.a, at1);
            return;
        }
        au1.j.a(com.google.android.gms.a.f.a(au1.g), au1.f, au1.e, au1.d.f, au1.d.a, at1);
        return;
    }

    static int b(au au1)
    {
        return au1.k;
    }

    private bd b()
    {
        ek.b((new StringBuilder("Instantiating mediation adapter: ")).append(a).toString());
        bd bd1;
        try
        {
            bd1 = b.a(a);
        }
        catch (RemoteException remoteexception)
        {
            String s = (new StringBuilder("Could not instantiate mediation adapter: ")).append(a).toString();
            if (ek.a(3))
            {
                Log.d("Ads", s, remoteexception);
            }
            return null;
        }
        return bd1;
    }

    static bd c(au au1)
    {
        return au1.b();
    }

    static bd d(au au1)
    {
        return au1.j;
    }

    public final aw a(long l)
    {
        Object obj = h;
        obj;
        JVM INSTR monitorenter ;
        Object obj1;
        long l1;
        long l2;
        l1 = SystemClock.elapsedRealtime();
        obj1 = new at();
        eh.a.post(new av(this, ((at) (obj1))));
        l2 = c;
_L1:
        long l4;
        if (k != -2)
        {
            break MISSING_BLOCK_LABEL_139;
        }
        l4 = SystemClock.elapsedRealtime();
        long l3;
        l3 = l2 - (l4 - l1);
        l4 = 60000L - (l4 - l);
        if (l3 > 0L && l4 > 0L)
        {
            break MISSING_BLOCK_LABEL_112;
        }
        ek.b("Timed out waiting for adapter.");
        k = 3;
          goto _L1
        obj1;
        throw obj1;
        h.wait(Math.min(l3, l4));
          goto _L1
        InterruptedException interruptedexception;
        interruptedexception;
        k = -1;
          goto _L1
        obj1 = new aw(d, j, a, ((at) (obj1)), k);
        obj;
        JVM INSTR monitorexit ;
        return ((aw) (obj1));
    }

    public final void a()
    {
        Object obj = h;
        obj;
        JVM INSTR monitorenter ;
        if (j != null)
        {
            j.c();
        }
_L1:
        k = -1;
        h.notify();
        return;
        Object obj1;
        obj1;
        ek.a("Could not destroy mediation adapter.", ((Throwable) (obj1)));
          goto _L1
        obj1;
        throw obj1;
    }

    public final void a(int l)
    {
        synchronized (h)
        {
            k = l;
            h.notify();
        }
    }
}
