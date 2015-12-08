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
//            ic, dm, id, ij, 
//            ih, qa, in, ip, 
//            ie

public final class im
    implements ic
{

    private final AdRequestInfoParcel a;
    private final ip b;
    private final Context c;
    private final Object d = new Object();
    private final ie e;
    private final boolean f;
    private final long g;
    private final long h;
    private final dm i;
    private boolean j;
    private ih k;

    public im(Context context, AdRequestInfoParcel adrequestinfoparcel, ip ip, ie ie, boolean flag, long l, 
            long l1, dm dm1)
    {
        j = false;
        c = context;
        a = adrequestinfoparcel;
        b = ip;
        e = ie;
        f = flag;
        g = l;
        h = l1;
        i = dm1;
    }

    public final ij a(List list)
    {
        dk dk;
        Iterator iterator;
        zzb.zzaF("Starting mediation.");
        obj = new ArrayList();
        dk = i.a();
        iterator = list.iterator();
_L4:
        id id1;
        Iterator iterator1;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_373;
        }
        id1 = (id)iterator.next();
        zzb.zzaG((new StringBuilder("Trying mediation network: ")).append(id1.b).toString());
        iterator1 = id1.c.iterator();
_L2:
        String s;
        dk dk1;
label0:
        {
            if (!iterator1.hasNext())
            {
                break; /* Loop/switch isn't completed */
            }
            s = (String)iterator1.next();
            dk1 = i.a();
            synchronized (d)
            {
                if (!j)
                {
                    break label0;
                }
                obj = new ij(-1);
            }
            return ((ij) (obj));
        }
        k = new ih(c, s, b, e, id1, a.zzEn, a.zzqn, a.zzqj, f, a.zzqB, a.zzqD);
        list;
        JVM INSTR monitorexit ;
        list = k.a(g, h);
        if (((ij) (list)).a == 0)
        {
            zzb.zzaF("Adapter succeeded.");
            i.a("mediation_network_succeed", s);
            if (!((List) (obj)).isEmpty())
            {
                i.a("mediation_networks_fail", TextUtils.join(",", ((Iterable) (obj))));
            }
            i.a(dk1, new String[] {
                "mls"
            });
            i.a(dk, new String[] {
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
        i.a(dk1, new String[] {
            "mlf"
        });
        if (((ij) (list)).c != null)
        {
            qa.a.post(new in(this, list));
        }
        if (true) goto _L2; else goto _L1
_L1:
        if (true) goto _L4; else goto _L3
_L3:
        if (!((List) (obj)).isEmpty())
        {
            i.a("mediation_networks_fail", TextUtils.join(",", ((Iterable) (obj))));
        }
        return new ij(1);
    }

    public final void a()
    {
        synchronized (d)
        {
            j = true;
            if (k != null)
            {
                k.a();
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
