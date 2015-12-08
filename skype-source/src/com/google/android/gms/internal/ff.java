// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import com.google.ads.mediation.a.a;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;

// Referenced classes of package com.google.android.gms.internal:
//            fa, de, gb, cx, 
//            dh, da, be, hi

public final class ff extends fa
{

    protected de a;
    private dh i;
    private cx j;
    private da k;
    private final be l;

    ff(Context context, gb.a a1, hi hi, dh dh, fc.a a2, be be)
    {
        super(context, a1, hi, a2);
        i = dh;
        k = a1.c;
        l = be;
    }

    protected final gb a(int i1)
    {
        AdRequestInfoParcel adrequestinfoparcel = g.a;
        com.google.android.gms.ads.internal.client.AdRequestParcel adrequestparcel = adrequestinfoparcel.c;
        hi hi = d;
        java.util.List list = h.d;
        java.util.List list1 = h.f;
        java.util.List list2 = h.j;
        int j1 = h.l;
        long l1 = h.k;
        String s1 = adrequestinfoparcel.i;
        boolean flag = h.h;
        cy cy;
        di di;
        String s;
        dc dc;
        da da;
        if (a != null)
        {
            cy = a.b;
        } else
        {
            cy = null;
        }
        if (a != null)
        {
            di = a.c;
        } else
        {
            di = null;
        }
        if (a != null)
        {
            s = a.d;
        } else
        {
            s = com/google/ads/mediation/a/a.getName();
        }
        da = k;
        if (a != null)
        {
            dc = a.e;
        } else
        {
            dc = null;
        }
        return new gb(adrequestparcel, hi, list, i1, list1, list2, j1, l1, s1, flag, cy, di, s, da, dc, h.i, g.d, h.g, g.f, h.n, h.o, g.h, null, adrequestinfoparcel.x);
    }

    public final void b()
    {
        synchronized (f)
        {
            super.b();
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

    protected final void b(long l1)
        throws fa.a
    {
        synchronized (f)
        {
            j = new cx(c, g.a, i, k, h.t);
        }
        a = j.a(l1, l);
        switch (a.a)
        {
        default:
            throw new fa.a((new StringBuilder("Unexpected mediation result: ")).append(a.a).toString(), 0);

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
}
