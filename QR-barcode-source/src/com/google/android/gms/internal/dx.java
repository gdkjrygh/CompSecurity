// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            gg, dw, ec, gr, 
//            gs, ea, ed, el, 
//            ee, eb

public class dx extends gg
    implements ServiceConnection
{

    private Context mContext;
    private final Object mw = new Object();
    private boolean sl;
    private el sm;
    private dw sn;
    private ec so;
    private List sp;
    private ee sq;

    public dx(Context context, el el, ee ee)
    {
        sl = false;
        sp = null;
        mContext = context;
        sm = el;
        sq = ee;
        sn = new dw(context);
        so = ec.j(mContext);
        sp = so.d(10L);
    }

    static ee a(dx dx1)
    {
        return dx1.sq;
    }

    private void a(ea ea1, String s, String s1)
    {
        Intent intent = new Intent();
        intent.putExtra("RESPONSE_CODE", 0);
        intent.putExtra("INAPP_PURCHASE_DATA", s);
        intent.putExtra("INAPP_DATA_SIGNATURE", s1);
        gr.wC.post(new Runnable(ea1, intent) {

            final ea sr;
            final Intent ss;
            final dx st;

            public void run()
            {
                if (dx.a(st).a(sr.sB, -1, ss))
                {
                    dx.c(st).a(new eb(dx.b(st), sr.sC, true, -1, ss, sr));
                    return;
                }
                try
                {
                    dx.c(st).a(new eb(dx.b(st), sr.sC, false, -1, ss, sr));
                    return;
                }
                catch (RemoteException remoteexception)
                {
                    gs.W("Fail to verify and dispatch pending transaction");
                }
                return;
            }

            
            {
                st = dx.this;
                sr = ea1;
                ss = intent;
                super();
            }
        });
    }

    static Context b(dx dx1)
    {
        return dx1.mContext;
    }

    private void b(long l)
    {
        do
        {
            if (!c(l))
            {
                gs.W("Timeout waiting for pending transaction to be processed.");
            }
        } while (!sl);
    }

    static el c(dx dx1)
    {
        return dx1.sm;
    }

    private boolean c(long l)
    {
        l = 60000L - (SystemClock.elapsedRealtime() - l);
        if (l <= 0L)
        {
            return false;
        }
        try
        {
            mw.wait(l);
        }
        catch (InterruptedException interruptedexception)
        {
            gs.W("waitWithTimeout_lock interrupted");
        }
        return true;
    }

    private void cp()
    {
        if (!sp.isEmpty()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj;
        HashMap hashmap;
        hashmap = new HashMap();
        ea ea1;
        for (Iterator iterator = sp.iterator(); iterator.hasNext(); hashmap.put(ea1.sC, ea1))
        {
            ea1 = (ea)iterator.next();
        }

        obj = null;
_L6:
        obj = sn.d(mContext.getPackageName(), ((String) (obj)));
          goto _L3
_L5:
        obj = hashmap.keySet().iterator();
        while (((Iterator) (obj)).hasNext()) 
        {
            String s = (String)((Iterator) (obj)).next();
            so.a((ea)hashmap.get(s));
        }
          goto _L1
_L3:
        if (obj == null || ed.b(((Bundle) (obj))) != 0) goto _L5; else goto _L4
_L4:
        ArrayList arraylist = ((Bundle) (obj)).getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
        ArrayList arraylist1 = ((Bundle) (obj)).getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        ArrayList arraylist2 = ((Bundle) (obj)).getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        obj = ((Bundle) (obj)).getString("INAPP_CONTINUATION_TOKEN");
        for (int i = 0; i < arraylist.size(); i++)
        {
            if (!hashmap.containsKey(arraylist.get(i)))
            {
                continue;
            }
            String s1 = (String)arraylist.get(i);
            String s2 = (String)arraylist1.get(i);
            String s3 = (String)arraylist2.get(i);
            ea ea2 = (ea)hashmap.get(s1);
            String s4 = ed.D(s2);
            if (ea2.sB.equals(s4))
            {
                a(ea2, s2, s3);
                hashmap.remove(s1);
            }
        }

        if (obj == null || hashmap.isEmpty()) goto _L5; else goto _L6
    }

    public void co()
    {
        synchronized (mw)
        {
            Context context = mContext;
            Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
            Context context1 = mContext;
            context.bindService(intent, this, 1);
            b(SystemClock.elapsedRealtime());
            mContext.unbindService(this);
            sn.destroy();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        synchronized (mw)
        {
            sn.r(ibinder);
            cp();
            sl = true;
            mw.notify();
        }
        return;
        ibinder;
        componentname;
        JVM INSTR monitorexit ;
        throw ibinder;
    }

    public void onServiceDisconnected(ComponentName componentname)
    {
        gs.U("In-app billing service disconnected.");
        sn.destroy();
    }

    public void onStop()
    {
        synchronized (mw)
        {
            mContext.unbindService(this);
            sn.destroy();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
