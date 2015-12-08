// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

// Referenced classes of package com.google.android.gms.internal:
//            bf, at, pa, ry, 
//            ha

public final class as
    implements bf
{

    private final Object a = new Object();
    private final WeakHashMap b = new WeakHashMap();
    private final ArrayList c = new ArrayList();
    private final Context d;
    private final VersionInfoParcel e;
    private final ha f;

    public as(Context context, VersionInfoParcel versioninfoparcel, ha ha)
    {
        d = context.getApplicationContext();
        e = versioninfoparcel;
        f = ha;
    }

    private boolean e(pa pa1)
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        pa1 = (at)b.get(pa1);
        if (pa1 == null) goto _L2; else goto _L1
_L1:
        if (!pa1.e()) goto _L2; else goto _L3
_L3:
        boolean flag = true;
_L5:
        obj;
        JVM INSTR monitorexit ;
        return flag;
        pa1;
        obj;
        JVM INSTR monitorexit ;
        throw pa1;
_L2:
        flag = false;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public final at a(AdSizeParcel adsizeparcel, pa pa1)
    {
        return a(adsizeparcel, pa1, pa1.b.b());
    }

    public final at a(AdSizeParcel adsizeparcel, pa pa1, View view)
    {
label0:
        {
            synchronized (a)
            {
                if (!e(pa1))
                {
                    break label0;
                }
                adsizeparcel = (at)b.get(pa1);
            }
            return adsizeparcel;
        }
        adsizeparcel = new at(adsizeparcel, pa1, e, view, f);
        adsizeparcel.a(this);
        b.put(pa1, adsizeparcel);
        c.add(adsizeparcel);
        obj;
        JVM INSTR monitorexit ;
        return adsizeparcel;
        adsizeparcel;
        obj;
        JVM INSTR monitorexit ;
        throw adsizeparcel;
    }

    public final void a(at at1)
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        if (!at1.e())
        {
            c.remove(at1);
            Iterator iterator = b.entrySet().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                if (((java.util.Map.Entry)iterator.next()).getValue() == at1)
                {
                    iterator.remove();
                }
            } while (true);
        }
        break MISSING_BLOCK_LABEL_77;
        at1;
        obj;
        JVM INSTR monitorexit ;
        throw at1;
        obj;
        JVM INSTR monitorexit ;
    }

    public final void a(pa pa1)
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        pa1 = (at)b.get(pa1);
        if (pa1 == null)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        pa1.c();
        obj;
        JVM INSTR monitorexit ;
        return;
        pa1;
        obj;
        JVM INSTR monitorexit ;
        throw pa1;
    }

    public final void b(pa pa1)
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        pa1 = (at)b.get(pa1);
        if (pa1 == null)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        pa1.f();
        obj;
        JVM INSTR monitorexit ;
        return;
        pa1;
        obj;
        JVM INSTR monitorexit ;
        throw pa1;
    }

    public final void c(pa pa1)
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        pa1 = (at)b.get(pa1);
        if (pa1 == null)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        pa1.g();
        obj;
        JVM INSTR monitorexit ;
        return;
        pa1;
        obj;
        JVM INSTR monitorexit ;
        throw pa1;
    }

    public final void d(pa pa1)
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        pa1 = (at)b.get(pa1);
        if (pa1 == null)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        pa1.h();
        obj;
        JVM INSTR monitorexit ;
        return;
        pa1;
        obj;
        JVM INSTR monitorexit ;
        throw pa1;
    }
}
