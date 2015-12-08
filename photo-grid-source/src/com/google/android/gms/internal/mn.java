// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzn;
import com.google.android.gms.ads.internal.zzp;

// Referenced classes of package com.google.android.gms.internal:
//            pb, ms, mp, mt, 
//            bi, mi, cy, cx, 
//            wn, ry, mr, mq, 
//            ad, ip, mo, dm

public final class mn
{

    public mn()
    {
    }

    public static mp a(Context context, zza zza, pb pb1, ad ad, ry ry1, ip ip, mo mo, dm dm)
    {
        AdResponseParcel adresponseparcel = pb1.b;
        if (adresponseparcel.zzEK)
        {
            context = new ms(context, pb1, ip, mo, dm);
        } else
        if (adresponseparcel.zzth)
        {
            if (zza instanceof zzn)
            {
                context = new mt(context, (zzn)zza, new bi(), pb1, ad, mo);
            } else
            {
                pb1 = new StringBuilder("Invalid NativeAdManager type. Found: ");
                if (zza != null)
                {
                    context = zza.getClass().getName();
                } else
                {
                    context = "null";
                }
                throw new IllegalArgumentException(pb1.append(context).append("; Required: NativeAdManager.").toString());
            }
        } else
        if (adresponseparcel.zzEQ)
        {
            context = new mi(context, pb1, ry1, mo);
        } else
        {
            zza = cy.R;
            if (((Boolean)zzp.zzbE().a(zza)).booleanValue() && wn.g() && !wn.i() && ry1.j().zztf)
            {
                context = new mr(context, pb1, ry1, mo);
            } else
            {
                context = new mq(context, pb1, ry1, mo);
            }
        }
        zzb.zzaF((new StringBuilder("AdRenderer: ")).append(context.getClass().getName()).toString());
        context.zzfu();
        return context;
    }
}
