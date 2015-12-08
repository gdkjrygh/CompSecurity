// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.internal.zzgf;

public final class chu extends zzgf
{

    private cex h;
    private cem i;
    private ceo j;
    private ces k;
    private final cbk l;

    chu(Context context, ciu ciu1, cex cex, chq chq, cbk cbk)
    {
        super(context, ciu1, chq);
        h = cex;
        j = ciu1.c;
        l = cbk;
    }

    protected final cit a(int i1)
    {
        Object obj = e.a;
        com.google.android.gms.ads.internal.client.AdRequestParcel adrequestparcel = ((AdRequestInfoParcel) (obj)).c;
        java.util.List list = f.d;
        java.util.List list1 = f.f;
        java.util.List list2 = f.j;
        int j1 = f.l;
        long l1 = f.k;
        String s1 = ((AdRequestInfoParcel) (obj)).i;
        boolean flag = f.h;
        cfa cfa;
        String s;
        ceq ceq;
        ceo ceo1;
        com.google.android.gms.ads.internal.client.AdSizeParcel adsizeparcel;
        long l2;
        if (k != null)
        {
            obj = k.b;
        } else
        {
            obj = null;
        }
        if (k != null)
        {
            cfa = k.c;
        } else
        {
            cfa = null;
        }
        if (k != null)
        {
            s = k.d;
        } else
        {
            s = ayk.getName();
        }
        ceo1 = j;
        if (k != null)
        {
            ceq = k.e;
        } else
        {
            ceq = null;
        }
        l2 = f.i;
        adsizeparcel = e.d;
        l2 = f.g;
        return new cit(adrequestparcel, null, list, i1, list1, list2, j1, l1, s1, flag, ((cen) (obj)), cfa, s, ceo1, ceq, adsizeparcel, e.f, f.n, f.o, e.h, null);
    }

    protected final void a(long l1)
    {
        synchronized (d)
        {
            Context context = b;
            AdRequestInfoParcel adrequestinfoparcel = e.a;
            cex cex = h;
            ceo ceo1 = j;
            boolean flag = f.t;
            cax cax = cbb.T;
            i = new cev(context, adrequestinfoparcel, cex, ceo1, flag, l1, ((Long)bkv.n().a(cax)).longValue(), l);
        }
        k = i.a(j.a);
        switch (k.a)
        {
        default:
            throw new com.google.android.gms.internal.zzgf.zza((new StringBuilder("Unexpected mediation result: ")).append(k.a).toString(), 0);

        case 1: // '\001'
            throw new com.google.android.gms.internal.zzgf.zza("No fill from any mediation ad networks.", 3);

        case 0: // '\0'
            return;
        }
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void b()
    {
        synchronized (d)
        {
            super.b();
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
