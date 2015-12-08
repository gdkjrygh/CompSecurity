// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            bd, db, da, df, 
//            de, gw, di

public final class cz
{

    private final AdRequestInfoParcel a;
    private final di b;
    private final Context c;
    private final Object d = new Object();
    private final db e;
    private final boolean f;
    private boolean g;
    private de h;

    public cz(Context context, AdRequestInfoParcel adrequestinfoparcel, di di, db db1, boolean flag)
    {
        g = false;
        c = context;
        a = adrequestinfoparcel;
        b = di;
        e = db1;
        f = flag;
    }

    public df a(long l, long l1, bd bd1)
    {
        ArrayList arraylist;
        bc bc;
        Iterator iterator;
        zzb.zzaC("Starting mediation.");
        arraylist = new ArrayList();
        bc = bd1.a();
        iterator = e.a.iterator();
_L4:
        da da1;
        Iterator iterator1;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_382;
        }
        da1 = (da)iterator.next();
        zzb.zzaD((new StringBuilder()).append("Trying mediation network: ").append(da1.b).toString());
        iterator1 = da1.c.iterator();
_L2:
        String s;
        bc bc1;
label0:
        {
            if (!iterator1.hasNext())
            {
                break; /* Loop/switch isn't completed */
            }
            s = (String)iterator1.next();
            bc1 = bd1.a();
            synchronized (d)
            {
                if (!g)
                {
                    break label0;
                }
                bd1 = new df(-1);
            }
            return bd1;
        }
        h = new de(c, s, b, e, da1, a.zzDy, a.zzqf, a.zzqb, f, a.zzqt, a.zzqv);
        obj;
        JVM INSTR monitorexit ;
        obj = h.a(l, l1);
        if (((df) (obj)).a == 0)
        {
            zzb.zzaC("Adapter succeeded.");
            bd1.a("mediation_network_succeed", s);
            if (!arraylist.isEmpty())
            {
                bd1.a("mediation_networks_fail", TextUtils.join(",", arraylist));
            }
            bd1.a(bc1, new String[] {
                "mls"
            });
            bd1.a(bc, new String[] {
                "ttm"
            });
            return ((df) (obj));
        }
        break MISSING_BLOCK_LABEL_327;
        bd1;
        obj;
        JVM INSTR monitorexit ;
        throw bd1;
        arraylist.add(s);
        bd1.a(bc1, new String[] {
            "mlf"
        });
        if (((df) (obj)).c != null)
        {
            gw.a.post(new zzdy._cls1(this, ((df) (obj))));
        }
        if (true) goto _L2; else goto _L1
_L1:
        if (true) goto _L4; else goto _L3
_L3:
        if (!arraylist.isEmpty())
        {
            bd1.a("mediation_networks_fail", TextUtils.join(",", arraylist));
        }
        return new df(1);
    }

    public void a()
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
