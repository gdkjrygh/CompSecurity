// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

public final class aqi
    implements aqk
{

    private final Object a = new Object();
    private final WeakHashMap b = new WeakHashMap();
    private final ArrayList c = new ArrayList();
    private final Context d;
    private final VersionInfoParcel e;
    private final adv f;

    public aqi(Context context, VersionInfoParcel versioninfoparcel, adv adv)
    {
        d = context.getApplicationContext();
        e = versioninfoparcel;
        f = adv;
    }

    private boolean e(ain ain1)
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        ain1 = (aqj)b.get(ain1);
        if (ain1 == null) goto _L2; else goto _L1
_L1:
        if (!ain1.e()) goto _L2; else goto _L3
_L3:
        boolean flag = true;
_L5:
        obj;
        JVM INSTR monitorexit ;
        return flag;
        ain1;
        obj;
        JVM INSTR monitorexit ;
        throw ain1;
_L2:
        flag = false;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public final aqj a(AdSizeParcel adsizeparcel, ain ain1)
    {
        return a(adsizeparcel, ain1, ((View) (ain1.b.a())));
    }

    public final aqj a(AdSizeParcel adsizeparcel, ain ain1, View view)
    {
label0:
        {
            synchronized (a)
            {
                if (!e(ain1))
                {
                    break label0;
                }
                adsizeparcel = (aqj)b.get(ain1);
            }
            return adsizeparcel;
        }
        adsizeparcel = new aqj(adsizeparcel, ain1, e, view, f);
        adsizeparcel.a(this);
        b.put(ain1, adsizeparcel);
        c.add(adsizeparcel);
        obj;
        JVM INSTR monitorexit ;
        return adsizeparcel;
        adsizeparcel;
        obj;
        JVM INSTR monitorexit ;
        throw adsizeparcel;
    }

    public final void a(ain ain1)
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        ain1 = (aqj)b.get(ain1);
        if (ain1 == null)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        ain1.c();
        obj;
        JVM INSTR monitorexit ;
        return;
        ain1;
        obj;
        JVM INSTR monitorexit ;
        throw ain1;
    }

    public final void a(aqj aqj1)
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        if (!aqj1.e())
        {
            c.remove(aqj1);
            Iterator iterator = b.entrySet().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                if (((java.util.Map.Entry)iterator.next()).getValue() == aqj1)
                {
                    iterator.remove();
                }
            } while (true);
        }
        break MISSING_BLOCK_LABEL_77;
        aqj1;
        obj;
        JVM INSTR monitorexit ;
        throw aqj1;
        obj;
        JVM INSTR monitorexit ;
    }

    public final void b(ain ain1)
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        ain1 = (aqj)b.get(ain1);
        if (ain1 == null)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        ain1.f();
        obj;
        JVM INSTR monitorexit ;
        return;
        ain1;
        obj;
        JVM INSTR monitorexit ;
        throw ain1;
    }

    public final void c(ain ain1)
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        ain1 = (aqj)b.get(ain1);
        if (ain1 == null)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        ain1.g();
        obj;
        JVM INSTR monitorexit ;
        return;
        ain1;
        obj;
        JVM INSTR monitorexit ;
        throw ain1;
    }

    public final void d(ain ain1)
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        ain1 = (aqj)b.get(ain1);
        if (ain1 == null)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        ain1.h();
        obj;
        JVM INSTR monitorexit ;
        return;
        ain1;
        obj;
        JVM INSTR monitorexit ;
        throw ain1;
    }
}
