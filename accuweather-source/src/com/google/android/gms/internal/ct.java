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
//            en, cs, cy, eu, 
//            ev, cw, cz, dh, 
//            da, cx

public class ct extends en
    implements ServiceConnection
{

    private final Object lq = new Object();
    private Context mContext;
    private boolean oU;
    private dh oV;
    private cs oW;
    private cy oX;
    private List oY;
    private da oZ;

    public ct(Context context, dh dh, da da)
    {
        oU = false;
        oY = null;
        mContext = context;
        oV = dh;
        oZ = da;
        oW = new cs(context);
        oX = cy.h(mContext);
        oY = oX.d(10L);
    }

    static da a(ct ct1)
    {
        return ct1.oZ;
    }

    private void a(cw cw1, String s, String s1)
    {
        Intent intent = new Intent();
        intent.putExtra("RESPONSE_CODE", 0);
        intent.putExtra("INAPP_PURCHASE_DATA", s);
        intent.putExtra("INAPP_DATA_SIGNATURE", s1);
        eu.ss.post(new Runnable(cw1, intent) {

            final cw pa;
            final Intent pb;
            final ct pc;

            public void run()
            {
                if (ct.a(pc).a(pa.pk, -1, pb))
                {
                    ct.c(pc).a(new cx(ct.b(pc), pa.pl, true, -1, pb, pa));
                    return;
                }
                try
                {
                    ct.c(pc).a(new cx(ct.b(pc), pa.pl, false, -1, pb, pa));
                    return;
                }
                catch (RemoteException remoteexception)
                {
                    ev.D("Fail to verify and dispatch pending transaction");
                }
                return;
            }

            
            {
                pc = ct.this;
                pa = cw1;
                pb = intent;
                super();
            }
        });
    }

    static Context b(ct ct1)
    {
        return ct1.mContext;
    }

    private void b(long l)
    {
        do
        {
            if (!c(l))
            {
                ev.D("Timeout waiting for pending transaction to be processed.");
            }
        } while (!oU);
    }

    private void bd()
    {
        if (!oY.isEmpty()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj;
        HashMap hashmap;
        hashmap = new HashMap();
        cw cw1;
        for (Iterator iterator = oY.iterator(); iterator.hasNext(); hashmap.put(cw1.pl, cw1))
        {
            cw1 = (cw)iterator.next();
        }

        obj = null;
_L6:
        obj = oW.b(mContext.getPackageName(), ((String) (obj)));
          goto _L3
_L5:
        obj = hashmap.keySet().iterator();
        while (((Iterator) (obj)).hasNext()) 
        {
            String s = (String)((Iterator) (obj)).next();
            oX.a((cw)hashmap.get(s));
        }
          goto _L1
_L3:
        if (obj == null || cz.a(((Bundle) (obj))) != 0) goto _L5; else goto _L4
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
            cw cw2 = (cw)hashmap.get(s1);
            String s4 = cz.p(s2);
            if (cw2.pk.equals(s4))
            {
                a(cw2, s2, s3);
                hashmap.remove(s1);
            }
        }

        if (obj == null || hashmap.isEmpty()) goto _L5; else goto _L6
    }

    static dh c(ct ct1)
    {
        return ct1.oV;
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
            lq.wait(l);
        }
        catch (InterruptedException interruptedexception)
        {
            ev.D("waitWithTimeout_lock interrupted");
        }
        return true;
    }

    public void bc()
    {
        synchronized (lq)
        {
            Context context = mContext;
            Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
            Context context1 = mContext;
            context.bindService(intent, this, 1);
            b(SystemClock.elapsedRealtime());
            mContext.unbindService(this);
            oW.destroy();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        synchronized (lq)
        {
            oW.o(ibinder);
            bd();
            oU = true;
            lq.notify();
        }
        return;
        ibinder;
        componentname;
        JVM INSTR monitorexit ;
        throw ibinder;
    }

    public void onServiceDisconnected(ComponentName componentname)
    {
        ev.B("In-app billing service disconnected.");
        oW.destroy();
    }

    public void onStop()
    {
        synchronized (lq)
        {
            mContext.unbindService(this);
            oW.destroy();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
