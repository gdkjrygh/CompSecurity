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

public final class bzv
    implements bzz
{

    public final Object a = new Object();
    public final WeakHashMap b = new WeakHashMap();
    private final ArrayList c = new ArrayList();
    private final VersionInfoParcel d;
    private final ced e;

    public bzv(Context context, VersionInfoParcel versioninfoparcel, ced ced)
    {
        context.getApplicationContext();
        d = versioninfoparcel;
        e = ced;
    }

    private boolean b(cit cit1)
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        cit1 = (bzw)b.get(cit1);
        if (cit1 == null) goto _L2; else goto _L1
_L1:
        if (!cit1.d()) goto _L2; else goto _L3
_L3:
        boolean flag = true;
_L5:
        obj;
        JVM INSTR monitorexit ;
        return flag;
        cit1;
        obj;
        JVM INSTR monitorexit ;
        throw cit1;
_L2:
        flag = false;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public final bzw a(AdSizeParcel adsizeparcel, cit cit1)
    {
        return a(adsizeparcel, cit1, cit1.b.b());
    }

    public final bzw a(AdSizeParcel adsizeparcel, cit cit1, View view)
    {
label0:
        {
            synchronized (a)
            {
                if (!b(cit1))
                {
                    break label0;
                }
                adsizeparcel = (bzw)b.get(cit1);
            }
            return adsizeparcel;
        }
        view = new bzw(adsizeparcel, cit1, d, view, e);
        synchronized (((bzw) (view)).a)
        {
            view.c = this;
        }
        b.put(cit1, view);
        c.add(view);
        obj;
        JVM INSTR monitorexit ;
        return view;
        adsizeparcel;
        obj;
        JVM INSTR monitorexit ;
        throw adsizeparcel;
        cit1;
        adsizeparcel;
        JVM INSTR monitorexit ;
        throw cit1;
    }

    public final void a(bzw bzw1)
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        if (!bzw1.d())
        {
            c.remove(bzw1);
            Iterator iterator = b.entrySet().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                if (((java.util.Map.Entry)iterator.next()).getValue() == bzw1)
                {
                    iterator.remove();
                }
            } while (true);
        }
        break MISSING_BLOCK_LABEL_77;
        bzw1;
        obj;
        JVM INSTR monitorexit ;
        throw bzw1;
        obj;
        JVM INSTR monitorexit ;
    }

    public final void a(cit cit1)
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        cit1 = (bzw)b.get(cit1);
        if (cit1 == null)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        cit1.b();
        obj;
        JVM INSTR monitorexit ;
        return;
        cit1;
        obj;
        JVM INSTR monitorexit ;
        throw cit1;
    }
}
