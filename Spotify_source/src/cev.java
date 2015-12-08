// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Handler;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class cev
    implements cem
{

    private final AdRequestInfoParcel a;
    private final cex b;
    private final Context c;
    private final Object d = new Object();
    private final ceo e;
    private final boolean f;
    private final long g;
    private final long h;
    private final cbk i;
    private boolean j;
    private cer k;

    public cev(Context context, AdRequestInfoParcel adrequestinfoparcel, cex cex, ceo ceo, boolean flag, long l, 
            long l1, cbk cbk1)
    {
        j = false;
        c = context;
        a = adrequestinfoparcel;
        b = cex;
        e = ceo;
        f = flag;
        g = l;
        h = l1;
        i = cbk1;
    }

    public final ces a(List list)
    {
        cbi cbi;
        Iterator iterator;
        bka.a("Starting mediation.");
        obj = new ArrayList();
        cbi = i.a();
        iterator = list.iterator();
_L4:
        cen cen1;
        Iterator iterator1;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_372;
        }
        cen1 = (cen)iterator.next();
        bka.c((new StringBuilder("Trying mediation network: ")).append(cen1.b).toString());
        iterator1 = cen1.c.iterator();
_L2:
        String s;
        cbi cbi1;
label0:
        {
            if (!iterator1.hasNext())
            {
                break; /* Loop/switch isn't completed */
            }
            s = (String)iterator1.next();
            cbi1 = i.a();
            synchronized (d)
            {
                if (!j)
                {
                    break label0;
                }
                obj = new ces(-1);
            }
            return ((ces) (obj));
        }
        k = new cer(c, s, b, e, cen1, a.c, a.d, a.k, f, a.z, a.n);
        list;
        JVM INSTR monitorexit ;
        list = k.a(g, h);
        if (((ces) (list)).a == 0)
        {
            bka.a("Adapter succeeded.");
            i.a("mediation_network_succeed", s);
            if (!((List) (obj)).isEmpty())
            {
                i.a("mediation_networks_fail", TextUtils.join(",", ((Iterable) (obj))));
            }
            i.a(cbi1, new String[] {
                "mls"
            });
            i.a(cbi, new String[] {
                "ttm"
            });
            return list;
        }
        break MISSING_BLOCK_LABEL_319;
        obj;
        list;
        JVM INSTR monitorexit ;
        throw obj;
        ((List) (obj)).add(s);
        i.a(cbi1, new String[] {
            "mlf"
        });
        if (((ces) (list)).c != null)
        {
            cjj.a.post(new Runnable(list) {

                private ces a;

                public final void run()
                {
                    try
                    {
                        a.c.c();
                        return;
                    }
                    catch (RemoteException remoteexception)
                    {
                        bka.c("Could not destroy mediation adapter.", remoteexception);
                    }
                }

            
            {
                a = ces1;
                super();
            }
            });
        }
        if (true) goto _L2; else goto _L1
_L1:
        if (true) goto _L4; else goto _L3
_L3:
        if (!((List) (obj)).isEmpty())
        {
            i.a("mediation_networks_fail", TextUtils.join(",", ((Iterable) (obj))));
        }
        return new ces(1);
    }

    public final void a()
    {
        Object obj = d;
        obj;
        JVM INSTR monitorenter ;
        j = true;
        if (k == null) goto _L2; else goto _L1
_L1:
        cer cer1 = k;
        Object obj1 = cer1.f;
        obj1;
        JVM INSTR monitorenter ;
        if (cer1.k != null)
        {
            cer1.k.c();
        }
_L3:
        cer1.l = -1;
        cer1.f.notify();
_L2:
        obj;
        JVM INSTR monitorexit ;
        return;
        RemoteException remoteexception;
        remoteexception;
        bka.c("Could not destroy mediation adapter.", remoteexception);
          goto _L3
        Exception exception1;
        exception1;
        obj1;
        JVM INSTR monitorexit ;
        throw exception1;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
