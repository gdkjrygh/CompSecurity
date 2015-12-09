// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public final class cly
    implements cmq
{

    private final cmk a;

    public cly(cmk cmk1)
    {
        a = cmk1;
    }

    private void a(cmp cmp1)
    {
        a.a(cmp1);
        bqr bqr1 = a.a(cmp1.d());
        if (!bqr1.k() && a.m.containsKey(cmp1.d()))
        {
            cmp1.c(new Status(17));
            return;
        } else
        {
            cmp1.b(bqr1);
            return;
        }
    }

    public final clu a(clu clu)
    {
        return b(clu);
    }

    public final void a()
    {
        while (!a.f.isEmpty()) 
        {
            try
            {
                a((cmp)a.f.remove());
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
            cmk cmk1 = a;
            if (!cmk1.g)
            {
                cmk1.g = true;
                if (cmk1.k == null)
                {
                    cmk1.k = (cmn)cmt.b(cmk1.d.getApplicationContext(), new cmn(cmk1));
                }
                cmk1.j.sendMessageDelayed(cmk1.j.obtainMessage(1), cmk1.h);
                cmk1.j.sendMessageDelayed(cmk1.j.obtainMessage(2), cmk1.i);
            }
        }
        for (Iterator iterator = a.s.iterator(); iterator.hasNext(); ((cmp)iterator.next()).d(new Status(8, "The connection to Google Play services was lost"))) { }
        a.g();
        obj1 = a.c;
        Object obj2;
        bqw bqw1;
        int j;
        boolean flag;
        if (Looper.myLooper() == ((bsm) (obj1)).h.getLooper())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        btl.a(flag, "onUnintentionalDisconnection must only be called on the Handler thread");
        ((bsm) (obj1)).h.removeMessages(1);
        obj = ((bsm) (obj1)).i;
        obj;
        JVM INSTR monitorenter ;
        obj1.g = true;
        obj2 = new ArrayList(((bsm) (obj1)).b);
        j = ((bsm) (obj1)).f.get();
        obj2 = ((ArrayList) (obj2)).iterator();
        do
        {
            if (!((Iterator) (obj2)).hasNext())
            {
                break;
            }
            bqw1 = (bqw)((Iterator) (obj2)).next();
            if (!((bsm) (obj1)).e || ((bsm) (obj1)).f.get() != j)
            {
                break;
            }
            if (((bsm) (obj1)).b.contains(bqw1))
            {
                bqw1.a(i);
            }
        } while (true);
        break MISSING_BLOCK_LABEL_306;
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        ((bsm) (obj1)).c.clear();
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

    public final void a(ConnectionResult connectionresult, bql bql, int i)
    {
    }

    public final clu b(clu clu)
    {
        try
        {
            a(clu);
        }
        catch (DeadObjectException deadobjectexception)
        {
            a.a(new cmm(this) {

                private cly a;

                public final void a()
                {
                    a.a(1);
                }

            
            {
                a = cly.this;
                super(cmq1);
            }
            });
            return clu;
        }
        return clu;
    }

    public final void b()
    {
        a.m.clear();
        a.f();
        a.g();
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
