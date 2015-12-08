// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.purchase;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.gms.ads.internal.p;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.internal.er;
import com.google.android.gms.internal.gi;
import com.google.android.gms.internal.gm;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.gms.ads.internal.purchase:
//            b, h, f, i, 
//            k, g

public final class c extends gi
    implements ServiceConnection
{

    private final Object a;
    private boolean b;
    private Context c;
    private er d;
    private com.google.android.gms.ads.internal.purchase.b e;
    private h f;
    private List g;
    private k h;

    public c(Context context, er er, k k)
    {
        this(context, er, k, new com.google.android.gms.ads.internal.purchase.b(context), com.google.android.gms.ads.internal.purchase.h.a(context.getApplicationContext()));
    }

    private c(Context context, er er, k k, com.google.android.gms.ads.internal.purchase.b b1, h h1)
    {
        a = new Object();
        b = false;
        g = null;
        c = context;
        d = er;
        h = k;
        e = b1;
        f = h1;
        g = f.a();
    }

    static k a(c c1)
    {
        return c1.h;
    }

    private void a(long l)
    {
        do
        {
            if (!b(l))
            {
                com.google.android.gms.ads.internal.util.client.b.a(2);
            }
        } while (!b);
    }

    static Context b(c c1)
    {
        return c1.c;
    }

    private boolean b(long l)
    {
        l = 60000L - (SystemClock.elapsedRealtime() - l);
        if (l <= 0L)
        {
            return false;
        }
        try
        {
            a.wait(l);
        }
        catch (InterruptedException interruptedexception)
        {
            com.google.android.gms.ads.internal.util.client.b.c("waitWithTimeout_lock interrupted");
        }
        return true;
    }

    static er c(c c1)
    {
        return c1.d;
    }

    public final void a()
    {
        synchronized (a)
        {
            Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
            intent.setPackage("com.android.vending");
            com.google.android.gms.common.stats.b.a().a(c, intent, this, 1);
            a(SystemClock.elapsedRealtime());
            com.google.android.gms.common.stats.b.a().a(c, this);
            e.a = null;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void b()
    {
        synchronized (a)
        {
            com.google.android.gms.common.stats.b.a().a(c, this);
            e.a = null;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        e.a(ibinder);
        if (g.isEmpty()) goto _L2; else goto _L1
_L1:
        ibinder = new HashMap();
        f f1;
        for (componentname = g.iterator(); componentname.hasNext(); ibinder.put(f1.c, f1))
        {
            f1 = (f)componentname.next();
        }

          goto _L3
        componentname;
        obj;
        JVM INSTR monitorexit ;
        throw componentname;
_L3:
        componentname = null;
_L5:
        componentname = e.b(c.getPackageName(), componentname);
        if (componentname == null)
        {
            break; /* Loop/switch isn't completed */
        }
        ArrayList arraylist;
        ArrayList arraylist1;
        ArrayList arraylist2;
        p.o();
        if (i.a(componentname) != 0)
        {
            break; /* Loop/switch isn't completed */
        }
        arraylist = componentname.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
        arraylist1 = componentname.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        arraylist2 = componentname.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        componentname = componentname.getString("INAPP_CONTINUATION_TOKEN");
        int j = 0;
_L6:
        if (j < arraylist.size())
        {
            if (ibinder.containsKey(arraylist.get(j)))
            {
                String s1 = (String)arraylist.get(j);
                String s2 = (String)arraylist1.get(j);
                String s3 = (String)arraylist2.get(j);
                f f2 = (f)ibinder.get(s1);
                p.o();
                String s4 = i.a(s2);
                if (f2.b.equals(s4))
                {
                    Intent intent = new Intent();
                    p.o();
                    intent.putExtra("RESPONSE_CODE", 0);
                    p.o();
                    intent.putExtra("INAPP_PURCHASE_DATA", s2);
                    p.o();
                    intent.putExtra("INAPP_DATA_SIGNATURE", s3);
                    gm.a.post(new Runnable(f2, intent) {

                        final f a;
                        final Intent b;
                        final c c;

                        public final void run()
                        {
                            if (c.a(c).a(a.b, b))
                            {
                                c.c(c).a(new g(com.google.android.gms.ads.internal.purchase.c.b(c), a.c, true, -1, b, a));
                                return;
                            }
                            try
                            {
                                c.c(c).a(new g(com.google.android.gms.ads.internal.purchase.c.b(c), a.c, false, -1, b, a));
                                return;
                            }
                            catch (RemoteException remoteexception)
                            {
                                com.google.android.gms.ads.internal.util.client.b.c("Fail to verify and dispatch pending transaction");
                            }
                            return;
                        }

            
            {
                c = c.this;
                a = f1;
                b = intent;
                super();
            }
                    });
                    ibinder.remove(s1);
                }
            }
            break MISSING_BLOCK_LABEL_404;
        }
        if (componentname == null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (!ibinder.isEmpty()) goto _L5; else goto _L4
_L4:
        String s;
        for (componentname = ibinder.keySet().iterator(); componentname.hasNext(); f.a((f)ibinder.get(s)))
        {
            s = (String)componentname.next();
        }

_L2:
        b = true;
        a.notify();
        obj;
        JVM INSTR monitorexit ;
        return;
        j++;
          goto _L6
    }

    public final void onServiceDisconnected(ComponentName componentname)
    {
        com.google.android.gms.ads.internal.util.client.b.b("In-app billing service disconnected.");
        e.a = null;
    }
}
