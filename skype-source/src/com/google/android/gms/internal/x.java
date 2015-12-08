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
//            aa, y, gb, hi, 
//            cu

public final class x
    implements aa
{

    private final Object a = new Object();
    private final WeakHashMap b = new WeakHashMap();
    private final ArrayList c = new ArrayList();
    private final Context d;
    private final VersionInfoParcel e;
    private final cu f;

    public x(Context context, VersionInfoParcel versioninfoparcel, cu cu)
    {
        d = context.getApplicationContext();
        e = versioninfoparcel;
        f = cu;
    }

    private boolean e(gb gb1)
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        gb1 = (y)b.get(gb1);
        if (gb1 == null) goto _L2; else goto _L1
_L1:
        if (!gb1.e()) goto _L2; else goto _L3
_L3:
        boolean flag = true;
_L5:
        obj;
        JVM INSTR monitorexit ;
        return flag;
        gb1;
        obj;
        JVM INSTR monitorexit ;
        throw gb1;
_L2:
        flag = false;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public final y a(AdSizeParcel adsizeparcel, gb gb1)
    {
        return a(adsizeparcel, gb1, ((View) (gb1.b.a())));
    }

    public final y a(AdSizeParcel adsizeparcel, gb gb1, View view)
    {
label0:
        {
            synchronized (a)
            {
                if (!e(gb1))
                {
                    break label0;
                }
                adsizeparcel = (y)b.get(gb1);
            }
            return adsizeparcel;
        }
        adsizeparcel = new y(adsizeparcel, gb1, e, view, f);
        adsizeparcel.a(this);
        b.put(gb1, adsizeparcel);
        c.add(adsizeparcel);
        obj;
        JVM INSTR monitorexit ;
        return adsizeparcel;
        adsizeparcel;
        obj;
        JVM INSTR monitorexit ;
        throw adsizeparcel;
    }

    public final void a(gb gb1)
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        gb1 = (y)b.get(gb1);
        if (gb1 == null)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        gb1.c();
        obj;
        JVM INSTR monitorexit ;
        return;
        gb1;
        obj;
        JVM INSTR monitorexit ;
        throw gb1;
    }

    public final void a(y y1)
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        if (!y1.e())
        {
            c.remove(y1);
            Iterator iterator = b.entrySet().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                if (((java.util.Map.Entry)iterator.next()).getValue() == y1)
                {
                    iterator.remove();
                }
            } while (true);
        }
        break MISSING_BLOCK_LABEL_77;
        y1;
        obj;
        JVM INSTR monitorexit ;
        throw y1;
        obj;
        JVM INSTR monitorexit ;
    }

    public final void b(gb gb1)
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        gb1 = (y)b.get(gb1);
        if (gb1 == null)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        gb1.f();
        obj;
        JVM INSTR monitorexit ;
        return;
        gb1;
        obj;
        JVM INSTR monitorexit ;
        throw gb1;
    }

    public final void c(gb gb1)
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        gb1 = (y)b.get(gb1);
        if (gb1 == null)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        gb1.g();
        obj;
        JVM INSTR monitorexit ;
        return;
        gb1;
        obj;
        JVM INSTR monitorexit ;
        throw gb1;
    }

    public final void d(gb gb1)
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        gb1 = (y)b.get(gb1);
        if (gb1 == null)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        gb1.h();
        obj;
        JVM INSTR monitorexit ;
        return;
        gb1;
        obj;
        JVM INSTR monitorexit ;
        throw gb1;
    }
}
