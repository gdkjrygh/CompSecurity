// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.reward.mediation.client.RewardItemParcel;
import com.google.android.gms.b.a;
import com.google.android.gms.b.d;

// Referenced classes of package com.google.android.gms.internal:
//            oq, op, os

public final class or extends com.google.android.gms.ads.internal.reward.mediation.client.zza.zza
{

    private op a;
    private os b;
    private oq c;

    public or(oq oq1)
    {
        c = oq1;
    }

    public final void a(op op1)
    {
        a = op1;
    }

    public final void a(os os1)
    {
        b = os1;
    }

    public final void zza(a a1, RewardItemParcel rewarditemparcel)
    {
        if (c != null)
        {
            c.a(rewarditemparcel);
        }
    }

    public final void zzb(a a1, int i)
    {
        if (a != null)
        {
            a.b();
        }
    }

    public final void zzc(a a1, int i)
    {
        if (b != null)
        {
            os os1 = b;
            d.a(a1).getClass().getName();
            os1.a(i);
        }
    }

    public final void zzg(a a1)
    {
        if (a != null)
        {
            a.a();
        }
    }

    public final void zzh(a a1)
    {
        if (b != null)
        {
            b.a(d.a(a1).getClass().getName());
        }
    }

    public final void zzi(a a1)
    {
        if (c != null)
        {
            c.g();
        }
    }

    public final void zzj(a a1)
    {
        if (c != null)
        {
            c.h();
        }
    }

    public final void zzk(a a1)
    {
        if (c != null)
        {
            c.i();
        }
    }

    public final void zzl(a a1)
    {
        if (c != null)
        {
            c.j();
        }
    }

    public final void zzm(a a1)
    {
        if (c != null)
        {
            c.k();
        }
    }
}
