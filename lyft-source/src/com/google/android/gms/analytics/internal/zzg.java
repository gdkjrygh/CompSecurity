// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.content.Context;
import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.internal.zzlb;
import com.google.android.gms.internal.zzld;
import com.google.android.gms.internal.zzns;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            zzu, zzk, zza, zzn, 
//            zzan, zzaf, zzr, zzl, 
//            zzag, zzb, zzj, zzah, 
//            zzi, zzv, zzai, zzf

public class zzg
{

    private final Context a;
    private final Context b;

    public zzg(Context context)
    {
        zzu.a(context);
        context = context.getApplicationContext();
        zzu.a(context, "Application context can't be null");
        a = context;
        b = context;
    }

    public Context a()
    {
        return a;
    }

    protected com.google.android.gms.analytics.internal.zzu a(zzf zzf)
    {
        return new com.google.android.gms.analytics.internal.zzu(zzf);
    }

    protected zzns a(Context context)
    {
        return zzns.a(context);
    }

    public Context b()
    {
        return b;
    }

    protected zzk b(zzf zzf)
    {
        return new zzk(zzf);
    }

    protected zza c(zzf zzf)
    {
        return new zza(zzf);
    }

    protected zzn d(zzf zzf)
    {
        return new zzn(zzf);
    }

    protected zzan e(zzf zzf)
    {
        return new zzan(zzf);
    }

    protected zzaf f(zzf zzf)
    {
        return new zzaf(zzf);
    }

    protected zzr g(zzf zzf)
    {
        return new zzr(zzf);
    }

    protected zzlb h(zzf zzf)
    {
        return zzld.c();
    }

    protected GoogleAnalytics i(zzf zzf)
    {
        return new GoogleAnalytics(zzf);
    }

    zzl j(zzf zzf)
    {
        return new zzl(zzf, this);
    }

    zzag k(zzf zzf)
    {
        return new zzag(zzf);
    }

    protected zzb l(zzf zzf)
    {
        return new zzb(zzf, this);
    }

    public zzj m(zzf zzf)
    {
        return new zzj(zzf);
    }

    public zzah n(zzf zzf)
    {
        return new zzah(zzf);
    }

    public zzi o(zzf zzf)
    {
        return new zzi(zzf);
    }

    public zzv p(zzf zzf)
    {
        return new zzv(zzf);
    }

    public zzai q(zzf zzf)
    {
        return new zzai(zzf);
    }
}
