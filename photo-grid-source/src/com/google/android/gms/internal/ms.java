// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.zzp;

// Referenced classes of package com.google.android.gms.internal:
//            mj, pb, ij, pa, 
//            cy, im, cx, ie, 
//            ic, mm, ip, dm, 
//            mo

public final class ms extends mj
{

    protected ij g;
    private ip h;
    private ic i;
    private ie j;
    private final dm k;

    ms(Context context, pb pb1, ip ip, mo mo, dm dm)
    {
        super(context, pb1, mo);
        h = ip;
        j = pb1.c;
        k = dm;
    }

    protected final pa a(int l)
    {
        Object obj = e.a;
        com.google.android.gms.ads.internal.client.AdRequestParcel adrequestparcel = ((AdRequestInfoParcel) (obj)).zzEn;
        java.util.List list = f.zzyY;
        java.util.List list1 = f.zzyZ;
        java.util.List list2 = f.zzEM;
        int i1 = f.orientation;
        long l1 = f.zzzc;
        String s1 = ((AdRequestInfoParcel) (obj)).zzEq;
        boolean flag = f.zzEK;
        is is;
        String s;
        ig ig;
        ie ie1;
        if (g != null)
        {
            obj = g.b;
        } else
        {
            obj = null;
        }
        if (g != null)
        {
            is = g.c;
        } else
        {
            is = null;
        }
        if (g != null)
        {
            s = g.d;
        } else
        {
            s = com/google/ads/mediation/admob/AdMobAdapter.getName();
        }
        ie1 = j;
        if (g != null)
        {
            ig = g.e;
        } else
        {
            ig = null;
        }
        return new pa(adrequestparcel, null, list, l, list1, list2, i1, l1, s1, flag, ((id) (obj)), is, s, ie1, ig, f.zzEL, e.d, f.zzEJ, e.f, f.zzEO, f.zzEP, e.h, null);
    }

    protected final void a(long l)
    {
        synchronized (d)
        {
            Context context = b;
            AdRequestInfoParcel adrequestinfoparcel = e.a;
            ip ip = h;
            ie ie1 = j;
            boolean flag = f.zzth;
            cq cq = cy.am;
            i = new im(context, adrequestinfoparcel, ip, ie1, flag, l, ((Long)zzp.zzbE().a(cq)).longValue(), k);
        }
        g = i.a(j.a);
        switch (g.a)
        {
        default:
            throw new mm((new StringBuilder("Unexpected mediation result: ")).append(g.a).toString(), 0);

        case 1: // '\001'
            throw new mm("No fill from any mediation ad networks.", 3);

        case 0: // '\0'
            return;
        }
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void onStop()
    {
        synchronized (d)
        {
            super.onStop();
            if (i != null)
            {
                i.a();
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
