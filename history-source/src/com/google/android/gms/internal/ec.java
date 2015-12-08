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
//            gf, eb, eh, gq, 
//            gr, ef, ei, er, 
//            ek, eg

public class ec extends gf
    implements ServiceConnection
{

    private Context mContext;
    private final Object mH = new Object();
    private boolean sD;
    private er sE;
    private eb sF;
    private eh sG;
    private List sH;
    private ek sI;

    public ec(Context context, er er, ek ek)
    {
        sD = false;
        sH = null;
        mContext = context;
        sE = er;
        sI = ek;
        sF = new eb(context);
        sG = eh.j(mContext);
        sH = sG.d(10L);
    }

    static ek a(ec ec1)
    {
        return ec1.sI;
    }

    private void a(ef ef1, String s, String s1)
    {
        Intent intent = new Intent();
        intent.putExtra("RESPONSE_CODE", 0);
        intent.putExtra("INAPP_PURCHASE_DATA", s);
        intent.putExtra("INAPP_DATA_SIGNATURE", s1);
        gq.wR.post(new Runnable(ef1, intent) {

            final ef sJ;
            final Intent sK;
            final ec sL;

            public void run()
            {
                if (ec.a(sL).a(sJ.sU, -1, sK))
                {
                    ec.c(sL).a(new eg(ec.b(sL), sJ.sV, true, -1, sK, sJ));
                    return;
                }
                try
                {
                    ec.c(sL).a(new eg(ec.b(sL), sJ.sV, false, -1, sK, sJ));
                    return;
                }
                catch (RemoteException remoteexception)
                {
                    gr.W("Fail to verify and dispatch pending transaction");
                }
                return;
            }

            
            {
                sL = ec.this;
                sJ = ef1;
                sK = intent;
                super();
            }
        });
    }

    static Context b(ec ec1)
    {
        return ec1.mContext;
    }

    private void b(long l)
    {
        do
        {
            if (!c(l))
            {
                gr.W("Timeout waiting for pending transaction to be processed.");
            }
        } while (!sD);
    }

    static er c(ec ec1)
    {
        return ec1.sE;
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
            mH.wait(l);
        }
        catch (InterruptedException interruptedexception)
        {
            gr.W("waitWithTimeout_lock interrupted");
        }
        return true;
    }

    private void cy()
    {
        if (!sH.isEmpty()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj;
        HashMap hashmap;
        hashmap = new HashMap();
        ef ef1;
        for (Iterator iterator = sH.iterator(); iterator.hasNext(); hashmap.put(ef1.sV, ef1))
        {
            ef1 = (ef)iterator.next();
        }

        obj = null;
_L6:
        obj = sF.d(mContext.getPackageName(), ((String) (obj)));
          goto _L3
_L5:
        obj = hashmap.keySet().iterator();
        while (((Iterator) (obj)).hasNext()) 
        {
            String s = (String)((Iterator) (obj)).next();
            sG.a((ef)hashmap.get(s));
        }
          goto _L1
_L3:
        if (obj == null || ei.b(((Bundle) (obj))) != 0) goto _L5; else goto _L4
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
            ef ef2 = (ef)hashmap.get(s1);
            String s4 = ei.D(s2);
            if (ef2.sU.equals(s4))
            {
                a(ef2, s2, s3);
                hashmap.remove(s1);
            }
        }

        if (obj == null || hashmap.isEmpty()) goto _L5; else goto _L6
    }

    public void cx()
    {
        synchronized (mH)
        {
            Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
            intent.setPackage("com.android.vending");
            mContext.bindService(intent, this, 1);
            b(SystemClock.elapsedRealtime());
            mContext.unbindService(this);
            sF.destroy();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        synchronized (mH)
        {
            sF.t(ibinder);
            cy();
            sD = true;
            mH.notify();
        }
        return;
        ibinder;
        componentname;
        JVM INSTR monitorexit ;
        throw ibinder;
    }

    public void onServiceDisconnected(ComponentName componentname)
    {
        gr.U("In-app billing service disconnected.");
        sF.destroy();
    }

    public void onStop()
    {
        synchronized (mH)
        {
            mContext.unbindService(this);
            sF.destroy();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
