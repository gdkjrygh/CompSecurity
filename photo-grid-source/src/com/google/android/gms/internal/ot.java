// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.util.client.zza;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;

// Referenced classes of package com.google.android.gms.internal:
//            pj, os, pb, ie, 
//            id, oj, ol, om, 
//            pa, ou, ov

public final class ot extends pj
    implements os
{

    private final pb a;
    private final Context b;
    private final ArrayList c = new ArrayList();
    private final ArrayList d = new ArrayList();
    private final HashSet e = new HashSet();
    private final Object f = new Object();
    private final oj g;
    private final String h;

    public ot(Context context, String s, pb pb1, oj oj1)
    {
        b = context;
        h = s;
        a = pb1;
        g = oj1;
    }

    static oj a(ot ot1)
    {
        return ot1.g;
    }

    public final void a(int i)
    {
    }

    public final void a(String s)
    {
        synchronized (f)
        {
            e.add(s);
        }
        return;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    public final void onStop()
    {
    }

    public final void zzbn()
    {
        Iterator iterator = a.c.a.iterator();
_L4:
        String s;
        Iterator iterator1;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        id id1 = (id)iterator.next();
        s = id1.h;
        iterator1 = id1.c.iterator();
_L1:
        String s1;
        if (!iterator1.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        s1 = (String)iterator1.next();
        Object obj3 = f;
        obj3;
        JVM INSTR monitorenter ;
        Object obj4 = g.b(s1);
        if (obj4 == null)
        {
            break MISSING_BLOCK_LABEL_112;
        }
        if (((ol) (obj4)).b() != null && ((ol) (obj4)).a() != null)
        {
            break MISSING_BLOCK_LABEL_122;
        }
        obj3;
        JVM INSTR monitorexit ;
          goto _L1
        Object obj;
        obj;
        obj3;
        JVM INSTR monitorexit ;
        throw obj;
        obj4 = new om(b, s1, h, s, a, ((ol) (obj4)), this);
        c.add(((pj) (obj4)).zzgz());
        d.add(s1);
        obj3;
        JVM INSTR monitorexit ;
        if (true) goto _L1; else goto _L2
_L2:
        if (true) goto _L4; else goto _L3
_L3:
        int i = 0;
_L6:
        if (i >= c.size())
        {
            break MISSING_BLOCK_LABEL_462;
        }
        ((Future)c.get(i)).get();
label0:
        {
            synchronized (f)
            {
                if (!e.contains(d.get(i)))
                {
                    break label0;
                }
                Object obj2 = (String)d.get(i);
                obj2 = new pa(a.a.zzEn, null, a.b.zzyY, -2, a.b.zzyZ, a.b.zzEM, a.b.orientation, a.b.zzzc, a.a.zzEq, a.b.zzEK, (id)a.c.a.get(i), null, ((String) (obj2)), a.c, null, a.b.zzEL, a.d, a.b.zzEJ, a.f, a.b.zzEO, a.b.zzEP, a.h, null);
                zza.zzJt.post(new ou(this, ((pa) (obj2))));
            }
            return;
        }
        obj1;
        JVM INSTR monitorexit ;
        break MISSING_BLOCK_LABEL_646;
        exception;
        obj1;
        JVM INSTR monitorexit ;
        throw exception;
        obj1;
        pa pa1 = new pa(a.a.zzEn, null, a.b.zzyY, 3, a.b.zzyZ, a.b.zzEM, a.b.orientation, a.b.zzzc, a.a.zzEq, a.b.zzEK, null, null, null, a.c, null, a.b.zzEL, a.d, a.b.zzEJ, a.f, a.b.zzEO, a.b.zzEP, a.h, null);
        zza.zzJt.post(new ov(this, pa1));
        return;
        pa1;
        i++;
        if (true) goto _L6; else goto _L5
_L5:
    }
}
