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
//            gs, gf, fy, fz, 
//            ga, db, da, gl

public class gg extends gs
    implements gf
{

    private final gl.a a;
    private final Context b;
    private final ArrayList c = new ArrayList();
    private final ArrayList d = new ArrayList();
    private final HashSet e = new HashSet();
    private final Object f = new Object();
    private final fy g;
    private final String h;

    public gg(Context context, String s, gl.a a1, fy fy1)
    {
        b = context;
        h = s;
        a = a1;
        g = fy1;
    }

    static fy a(gg gg1)
    {
        return gg1.g;
    }

    private void a(String s, String s1)
    {
        Object obj = f;
        obj;
        JVM INSTR monitorenter ;
        fz fz1 = g.b(s);
        if (fz1 == null)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        if (fz1.b() != null && fz1.a() != null)
        {
            break MISSING_BLOCK_LABEL_41;
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        s1 = new ga(b, s, h, s1, a, fz1, this);
        c.add(s1.zzgn());
        d.add(s);
        obj;
        JVM INSTR monitorexit ;
        return;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    public void a(String s)
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

    public void a(String s, int i)
    {
    }

    public void onStop()
    {
    }

    public void zzdG()
    {
        int i;
        for (Iterator iterator = a.c.a.iterator(); iterator.hasNext();)
        {
            Object obj3 = (da)iterator.next();
            String s = ((da) (obj3)).h;
            obj3 = ((da) (obj3)).c.iterator();
            while (((Iterator) (obj3)).hasNext()) 
            {
                a((String)((Iterator) (obj3)).next(), s);
            }
        }

        i = 0;
_L2:
        if (i >= c.size())
        {
            break MISSING_BLOCK_LABEL_371;
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
                obj2 = new gl(a.a.zzDy, null, a.b.zzyw, -2, a.b.zzyx, a.b.zzDZ, a.b.orientation, a.b.zzyA, a.a.zzDB, a.b.zzDX, (da)a.c.a.get(i), null, ((String) (obj2)), a.c, null, a.b.zzDY, a.d, a.b.zzDW, a.f, a.b.zzEb, a.b.zzEc, a.h, null, a.a.zzDO);
                zza.zzIy.post(new zzhe._cls1(this, ((gl) (obj2))));
            }
            return;
        }
        obj;
        JVM INSTR monitorexit ;
        break MISSING_BLOCK_LABEL_565;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        Object obj1;
        obj1;
        gl gl1 = new gl(a.a.zzDy, null, a.b.zzyw, 3, a.b.zzyx, a.b.zzDZ, a.b.orientation, a.b.zzyA, a.a.zzDB, a.b.zzDX, null, null, null, a.c, null, a.b.zzDY, a.d, a.b.zzDW, a.f, a.b.zzEb, a.b.zzEc, a.h, null, a.a.zzDO);
        zza.zzIy.post(new zzhe._cls2(this, gl1));
        return;
        gl1;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }
}
