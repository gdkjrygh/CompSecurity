// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.util.client.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            be, da, cy, de, 
//            dd, gm, dh, di

public final class cx
{

    private final AdRequestInfoParcel a;
    private final dh b;
    private final Context c;
    private final Object d = new Object();
    private final da e;
    private final boolean f;
    private boolean g;
    private dd h;

    public cx(Context context, AdRequestInfoParcel adrequestinfoparcel, dh dh, da da1, boolean flag)
    {
        g = false;
        c = context;
        a = adrequestinfoparcel;
        b = dh;
        e = da1;
        f = flag;
    }

    public final de a(long l, be be1)
    {
        ArrayList arraylist;
        bd bd;
        Iterator iterator;
        com.google.android.gms.ads.internal.util.client.b.a(3);
        arraylist = new ArrayList();
        bd = be1.a();
        iterator = e.a.iterator();
_L4:
        cy cy1;
        Iterator iterator1;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_367;
        }
        cy1 = (cy)iterator.next();
        com.google.android.gms.ads.internal.util.client.b.b((new StringBuilder("Trying mediation network: ")).append(cy1.b).toString());
        iterator1 = cy1.c.iterator();
_L2:
        String s;
        bd bd1;
label0:
        {
            if (!iterator1.hasNext())
            {
                break; /* Loop/switch isn't completed */
            }
            s = (String)iterator1.next();
            bd1 = be1.a();
            synchronized (d)
            {
                if (!g)
                {
                    break label0;
                }
                be1 = new de(-1);
            }
            return be1;
        }
        h = new dd(c, s, b, e, cy1, a.c, a.d, a.k, f, a.C, a.n);
        obj;
        JVM INSTR monitorexit ;
        obj = h.a(l);
        if (((de) (obj)).a == 0)
        {
            com.google.android.gms.ads.internal.util.client.b.a(3);
            be1.a("mediation_network_succeed", s);
            if (!arraylist.isEmpty())
            {
                be1.a("mediation_networks_fail", TextUtils.join(",", arraylist));
            }
            be1.a(bd1, new String[] {
                "mls"
            });
            be1.a(bd, new String[] {
                "ttm"
            });
            return ((de) (obj));
        }
        break MISSING_BLOCK_LABEL_313;
        be1;
        obj;
        JVM INSTR monitorexit ;
        throw be1;
        arraylist.add(s);
        be1.a(bd1, new String[] {
            "mlf"
        });
        if (((de) (obj)).c != null)
        {
            gm.a.post(new Runnable(((de) (obj))) {

                final de a;
                final cx b;

                public final void run()
                {
                    try
                    {
                        a.c.c();
                        return;
                    }
                    catch (RemoteException remoteexception)
                    {
                        com.google.android.gms.ads.internal.util.client.b.b("Could not destroy mediation adapter.", remoteexception);
                    }
                }

            
            {
                b = cx.this;
                a = de1;
                super();
            }
            });
        }
        if (true) goto _L2; else goto _L1
_L1:
        if (true) goto _L4; else goto _L3
_L3:
        if (!arraylist.isEmpty())
        {
            be1.a("mediation_networks_fail", TextUtils.join(",", arraylist));
        }
        return new de(1);
    }

    public final void a()
    {
        synchronized (d)
        {
            g = true;
            if (h != null)
            {
                h.a();
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
