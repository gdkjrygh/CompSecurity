// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.k;
import com.google.android.gms.common.internal.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.google.android.gms.internal:
//            dm, dl, do

public final class di
    implements dm
{

    private final dl a;

    public di(dl dl1)
    {
        a = dl1;
    }

    private void a(dl.f f)
        throws DeadObjectException
    {
        a.a(f);
        com.google.android.gms.common.api.a.b b1 = a.a(f.b());
        if (!b1.b() && a.n.containsKey(f.b()))
        {
            f.a(new Status(17));
            return;
        } else
        {
            f.a(b1);
            return;
        }
    }

    public final dg.a a(dg.a a1)
    {
        return b(a1);
    }

    public final void a()
    {
        while (!a.f.isEmpty()) 
        {
            try
            {
                a((dl.f)a.f.remove());
            }
            catch (DeadObjectException deadobjectexception)
            {
                Log.w("GACConnected", "Service died while flushing queue", deadobjectexception);
            }
        }
    }

    public final void a(int i)
    {
        Object obj;
        Object obj1;
        if (i == 1)
        {
            dl dl1 = a;
            if (!dl1.g)
            {
                dl1.g = true;
                if (dl1.l == null)
                {
                    dl1.l = (dl.d)com.google.android.gms.internal.do.b(dl1.d.getApplicationContext(), new dl.d(dl1));
                }
                dl1.j.sendMessageDelayed(dl1.j.obtainMessage(1), dl1.h);
                dl1.j.sendMessageDelayed(dl1.j.obtainMessage(2), dl1.i);
            }
        }
        for (Iterator iterator = a.t.iterator(); iterator.hasNext(); ((dl.f)iterator.next()).b(new Status(8, "The connection to Google Play services was lost"))) { }
        a.a(null);
        obj1 = a.c;
        Object obj2;
        com.google.android.gms.common.api.c.b b1;
        int j;
        boolean flag;
        if (Looper.myLooper() == ((k) (obj1)).h.getLooper())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        u.a(flag, "onUnintentionalDisconnection must only be called on the Handler thread");
        ((k) (obj1)).h.removeMessages(1);
        obj = ((k) (obj1)).i;
        obj;
        JVM INSTR monitorenter ;
        obj1.g = true;
        obj2 = new ArrayList(((k) (obj1)).b);
        j = ((k) (obj1)).f.get();
        obj2 = ((ArrayList) (obj2)).iterator();
        do
        {
            if (!((Iterator) (obj2)).hasNext())
            {
                break;
            }
            b1 = (com.google.android.gms.common.api.c.b)((Iterator) (obj2)).next();
            if (!((k) (obj1)).e || ((k) (obj1)).f.get() != j)
            {
                break;
            }
            if (((k) (obj1)).b.contains(b1))
            {
                b1.a(i);
            }
        } while (true);
        break MISSING_BLOCK_LABEL_307;
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        ((k) (obj1)).c.clear();
        obj1.g = false;
        obj;
        JVM INSTR monitorexit ;
        a.c.a();
        if (i == 2)
        {
            a.b();
        }
        return;
    }

    public final void a(Bundle bundle)
    {
    }

    public final void a(ConnectionResult connectionresult, a a1, int i)
    {
    }

    public final dg.a b(dg.a a1)
    {
        try
        {
            a(a1);
        }
        catch (DeadObjectException deadobjectexception)
        {
            a.a(new dl.b(this) {

                final di a;

                public final void a()
                {
                    a.a(1);
                }

            
            {
                a = di.this;
                super(dm1);
            }
            });
            return a1;
        }
        return a1;
    }

    public final void b()
    {
        a.n.clear();
        a.f();
        a.a(null);
        a.c.a();
    }

    public final void c()
    {
    }

    public final String d()
    {
        return "CONNECTED";
    }
}
