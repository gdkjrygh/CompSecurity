// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

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

public final class bif extends cjc
    implements ServiceConnection
{

    private final Object a;
    private boolean b;
    private Context c;
    private chh d;
    private bie e;
    private bik f;
    private List h;
    private bio i;

    public bif(Context context, chh chh, bio bio)
    {
        this(context, chh, bio, new bie(context), bik.a(context.getApplicationContext()));
    }

    private bif(Context context, chh chh, bio bio, bie bie1, bik bik1)
    {
        a = new Object();
        b = false;
        h = null;
        c = context;
        d = chh;
        i = bio;
        e = bie1;
        f = bik1;
        h = f.b();
    }

    static bio a(bif bif1)
    {
        return bif1.i;
    }

    private void a(long l)
    {
        do
        {
            if (!b(l))
            {
                bka.d("Timeout waiting for pending transaction to be processed.");
            }
        } while (!b);
    }

    static Context b(bif bif1)
    {
        return bif1.c;
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
            bka.e("waitWithTimeout_lock interrupted");
        }
        return true;
    }

    static chh c(bif bif1)
    {
        return bif1.d;
    }

    public final void a()
    {
        synchronized (a)
        {
            Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
            intent.setPackage("com.android.vending");
            bto.a();
            bto.b(c, intent, this, 1);
            a(SystemClock.elapsedRealtime());
            bto.a();
            bto.a(c, this);
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
            bto.a();
            bto.a(c, this);
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
        if (h.isEmpty()) goto _L2; else goto _L1
_L1:
        ibinder = new HashMap();
        bii bii1;
        for (componentname = h.iterator(); componentname.hasNext(); ibinder.put(bii1.c, bii1))
        {
            bii1 = (bii)componentname.next();
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
        bkv.o();
        if (bim.a(componentname) != 0)
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
                bii bii2 = (bii)ibinder.get(s1);
                bkv.o();
                String s4 = bim.a(s2);
                if (bii2.b.equals(s4))
                {
                    Intent intent = new Intent();
                    bkv.o();
                    intent.putExtra("RESPONSE_CODE", 0);
                    bkv.o();
                    intent.putExtra("INAPP_PURCHASE_DATA", s2);
                    bkv.o();
                    intent.putExtra("INAPP_DATA_SIGNATURE", s3);
                    cjj.a.post(new Runnable(bii2, intent) {

                        private bii a;
                        private Intent b;
                        private bif c;

                        public final void run()
                        {
                            if (bif.a(c).a(a.b, b))
                            {
                                bif.c(c).a(new bij(bif.b(c), a.c, true, -1, b, a));
                                return;
                            }
                            try
                            {
                                bif.c(c).a(new bij(bif.b(c), a.c, false, -1, b, a));
                                return;
                            }
                            catch (RemoteException remoteexception)
                            {
                                bka.e("Fail to verify and dispatch pending transaction");
                            }
                            return;
                        }

            
            {
                c = bif.this;
                a = bii1;
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
        for (componentname = ibinder.keySet().iterator(); componentname.hasNext(); f.a((bii)ibinder.get(s)))
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
        bka.c("In-app billing service disconnected.");
        e.a = null;
    }
}
