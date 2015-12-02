// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;

public final class ahf extends agz
{

    protected aef a;
    private aej i;
    private adz j;
    private aeb k;

    ahf(Context context, aio aio1, akk akk, aej aej, ahc ahc)
    {
        super(context, aio1, akk, ahc);
        i = aej;
        k = aio1.c;
    }

    protected final ain a(int l)
    {
        AdRequestInfoParcel adrequestinfoparcel = g.a;
        com.google.android.gms.ads.internal.client.AdRequestParcel adrequestparcel = adrequestinfoparcel.c;
        akk akk = d;
        java.util.List list = h.d;
        java.util.List list1 = h.f;
        java.util.List list2 = h.j;
        int i1 = h.l;
        long l1 = h.k;
        String s1 = adrequestinfoparcel.i;
        boolean flag = h.h;
        aea aea;
        aem aem;
        String s;
        aed aed;
        aeb aeb;
        if (a != null)
        {
            aea = a.b;
        } else
        {
            aea = null;
        }
        if (a != null)
        {
            aem = a.c;
        } else
        {
            aem = null;
        }
        if (a != null)
        {
            s = a.d;
        } else
        {
            s = kb.getName();
        }
        aeb = k;
        if (a != null)
        {
            aed = a.e;
        } else
        {
            aed = null;
        }
        return new ain(adrequestparcel, akk, list, l, list1, list2, i1, l1, s1, flag, aea, aem, s, aeb, aed, h.i, g.d, h.g, g.f, h.n, h.o, g.h, null, adrequestinfoparcel.x);
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

    protected final void b(long l)
    {
        synchronized (f)
        {
            j = new adz(c, g.a, i, k);
        }
        a = j.a(l);
        switch (a.a)
        {
        default:
            throw new aha((new StringBuilder("Unexpected mediation result: ")).append(a.a).toString(), 0);

        case 1: // '\001'
            throw new aha("No fill from any mediation ad networks.", 3);

        case 0: // '\0'
            return;
        }
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
