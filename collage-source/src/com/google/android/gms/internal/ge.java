// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.a.a;
import com.google.android.gms.a.b;
import com.google.android.gms.ads.internal.reward.mediation.client.RewardItemParcel;

// Referenced classes of package com.google.android.gms.internal:
//            gd, gc, gf

public class ge extends com.google.android.gms.ads.internal.reward.mediation.client.zza.zza
{

    private gc a;
    private gf b;
    private gd c;

    public ge(gd gd1)
    {
        c = gd1;
    }

    public void a(gc gc1)
    {
        a = gc1;
    }

    public void a(gf gf1)
    {
        b = gf1;
    }

    public void zza(a a1, RewardItemParcel rewarditemparcel)
    {
        if (c != null)
        {
            c.a(rewarditemparcel);
        }
    }

    public void zzb(a a1, int i)
    {
        if (a != null)
        {
            a.a(i);
        }
    }

    public void zzc(a a1, int i)
    {
        if (b != null)
        {
            b.a(com.google.android.gms.a.b.a(a1).getClass().getName(), i);
        }
    }

    public void zzg(a a1)
    {
        if (a != null)
        {
            a.a();
        }
    }

    public void zzh(a a1)
    {
        if (b != null)
        {
            b.a(com.google.android.gms.a.b.a(a1).getClass().getName());
        }
    }

    public void zzi(a a1)
    {
        if (c != null)
        {
            c.c();
        }
    }

    public void zzj(a a1)
    {
        if (c != null)
        {
            c.d();
        }
    }

    public void zzk(a a1)
    {
        if (c != null)
        {
            c.e();
        }
    }

    public void zzl(a a1)
    {
        if (c != null)
        {
            c.f();
        }
    }

    public void zzm(a a1)
    {
        if (c != null)
        {
            c.g();
        }
    }
}
