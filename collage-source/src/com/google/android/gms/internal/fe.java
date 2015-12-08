// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;

// Referenced classes of package com.google.android.gms.internal:
//            fa, df, gl, cz, 
//            di, db, bd, hs

public class fe extends fa
{

    protected df a;
    private di i;
    private cz j;
    private db k;
    private final bd l;

    fe(Context context, gl.a a1, hs hs, di di, fb.a a2, bd bd)
    {
        super(context, a1, hs, a2);
        i = di;
        k = a1.c;
        l = bd;
    }

    protected gl a(int i1)
    {
        AdRequestInfoParcel adrequestinfoparcel = g.a;
        com.google.android.gms.ads.internal.client.AdRequestParcel adrequestparcel = adrequestinfoparcel.zzDy;
        hs hs = d;
        java.util.List list = h.zzyw;
        java.util.List list1 = h.zzyx;
        java.util.List list2 = h.zzDZ;
        int j1 = h.orientation;
        long l1 = h.zzyA;
        String s1 = adrequestinfoparcel.zzDB;
        boolean flag = h.zzDX;
        da da;
        dj dj;
        String s;
        dd dd;
        db db;
        if (a != null)
        {
            da = a.b;
        } else
        {
            da = null;
        }
        if (a != null)
        {
            dj = a.c;
        } else
        {
            dj = null;
        }
        if (a != null)
        {
            s = a.d;
        } else
        {
            s = com/google/ads/mediation/admob/AdMobAdapter.getName();
        }
        db = k;
        if (a != null)
        {
            dd = a.e;
        } else
        {
            dd = null;
        }
        return new gl(adrequestparcel, hs, list, i1, list1, list2, j1, l1, s1, flag, da, dj, s, db, dd, h.zzDY, g.d, h.zzDW, g.f, h.zzEb, h.zzEc, g.h, null, adrequestinfoparcel.zzDO);
    }

    protected void b(long l1)
        throws fa.a
    {
        synchronized (f)
        {
            j = new cz(c, g.a, i, k, h.zzsJ);
        }
        a = j.a(l1, 60000L, l);
        switch (a.a)
        {
        default:
            throw new fa.a((new StringBuilder()).append("Unexpected mediation result: ").append(a.a).toString(), 0);

        case 1: // '\001'
            throw new fa.a("No fill from any mediation ad networks.", 3);

        case 0: // '\0'
            return;
        }
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void onStop()
    {
        synchronized (f)
        {
            super.onStop();
            if (j != null)
            {
                j.a();
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
