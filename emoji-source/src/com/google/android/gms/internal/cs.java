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
//            em, cr, cx, et, 
//            eu, cv, cy, dg, 
//            cz, cw

public class cs extends em
    implements ServiceConnection
{

    private final Object ls = new Object();
    private Context mContext;
    private boolean oW;
    private dg oX;
    private cr oY;
    private cx oZ;
    private List pa;
    private cz pb;

    public cs(Context context, dg dg, cz cz)
    {
        oW = false;
        pa = null;
        mContext = context;
        oX = dg;
        pb = cz;
        oY = new cr(context);
        oZ = cx.k(mContext);
        pa = oZ.d(10L);
    }

    static cz a(cs cs1)
    {
        return cs1.pb;
    }

    private void a(cv cv1, String s, String s1)
    {
        Intent intent = new Intent();
        intent.putExtra("RESPONSE_CODE", 0);
        intent.putExtra("INAPP_PURCHASE_DATA", s);
        intent.putExtra("INAPP_DATA_SIGNATURE", s1);
        et.sv.post(new Runnable(cv1, intent) {

            final cv pc;
            final Intent pd;
            final cs pe;

            public void run()
            {
                if (cs.a(pe).a(pc.pm, -1, pd))
                {
                    cs.c(pe).a(new cw(cs.b(pe), pc.pn, true, -1, pd, pc));
                    return;
                }
                try
                {
                    cs.c(pe).a(new cw(cs.b(pe), pc.pn, false, -1, pd, pc));
                    return;
                }
                catch (RemoteException remoteexception)
                {
                    eu.D("Fail to verify and dispatch pending transaction");
                }
                return;
            }

            
            {
                pe = cs.this;
                pc = cv1;
                pd = intent;
                super();
            }
        });
    }

    static Context b(cs cs1)
    {
        return cs1.mContext;
    }

    private void b(long l)
    {
        do
        {
            if (!c(l))
            {
                eu.D("Timeout waiting for pending transaction to be processed.");
            }
        } while (!oW);
    }

    private void bi()
    {
        if (!pa.isEmpty()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj;
        HashMap hashmap;
        hashmap = new HashMap();
        cv cv1;
        for (Iterator iterator = pa.iterator(); iterator.hasNext(); hashmap.put(cv1.pn, cv1))
        {
            cv1 = (cv)iterator.next();
        }

        obj = null;
_L6:
        obj = oY.b(mContext.getPackageName(), ((String) (obj)));
          goto _L3
_L5:
        obj = hashmap.keySet().iterator();
        while (((Iterator) (obj)).hasNext()) 
        {
            String s = (String)((Iterator) (obj)).next();
            oZ.a((cv)hashmap.get(s));
        }
          goto _L1
_L3:
        if (obj == null || cy.a(((Bundle) (obj))) != 0) goto _L5; else goto _L4
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
            cv cv2 = (cv)hashmap.get(s1);
            String s4 = cy.p(s2);
            if (cv2.pm.equals(s4))
            {
                a(cv2, s2, s3);
                hashmap.remove(s1);
            }
        }

        if (obj == null || hashmap.isEmpty()) goto _L5; else goto _L6
    }

    static dg c(cs cs1)
    {
        return cs1.oX;
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
            ls.wait(l);
        }
        catch (InterruptedException interruptedexception)
        {
            eu.D("waitWithTimeout_lock interrupted");
        }
        return true;
    }

    public void bh()
    {
        synchronized (ls)
        {
            Context context = mContext;
            Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
            Context context1 = mContext;
            context.bindService(intent, this, 1);
            b(SystemClock.elapsedRealtime());
            mContext.unbindService(this);
            oY.destroy();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        synchronized (ls)
        {
            oY.o(ibinder);
            bi();
            oW = true;
            ls.notify();
        }
        return;
        ibinder;
        componentname;
        JVM INSTR monitorexit ;
        throw ibinder;
    }

    public void onServiceDisconnected(ComponentName componentname)
    {
        eu.B("In-app billing service disconnected.");
        oY.destroy();
    }

    public void onStop()
    {
        synchronized (ls)
        {
            mContext.unbindService(this);
            oY.destroy();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
