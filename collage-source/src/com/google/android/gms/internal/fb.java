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

// Referenced classes of package com.google.android.gms.internal:
//            fe, gs, ff, ad, 
//            ez, ay, au, jc, 
//            hs, fd, fc, n, 
//            di, bd

public class fb
{

    public fb()
    {
    }

    public gs a(Context context, zza zza, gl.a a1, n n, hs hs1, di di, a a2, 
            bd bd)
    {
        AdResponseParcel adresponseparcel = a1.b;
        if (adresponseparcel.zzDX)
        {
            context = new fe(context, a1, hs1, di, a2, bd);
        } else
        if (adresponseparcel.zzsJ)
        {
            if (zza instanceof zzn)
            {
                context = new ff(context, (zzn)zza, new ad(), a1, n, a2);
            } else
            {
                a1 = (new StringBuilder()).append("Invalid NativeAdManager type. Found: ");
                if (zza != null)
                {
                    context = zza.getClass().getName();
                } else
                {
                    context = "null";
                }
                throw new IllegalArgumentException(a1.append(context).append("; Required: NativeAdManager.").toString());
            }
        } else
        if (adresponseparcel.zzEd)
        {
            context = new ez(context, a1, hs1, a2);
        } else
        if (((Boolean)ay.R.c()).booleanValue() && jc.f() && !jc.h() && hs1.h().zzsH)
        {
            context = new fd(context, a1, hs1, a2);
        } else
        {
            context = new fc(context, a1, hs1, a2);
        }
        zzb.zzaC((new StringBuilder()).append("AdRenderer: ").append(context.getClass().getName()).toString());
        context.zzgo();
        return context;
    }

    // Unreferenced inner class com/google/android/gms/internal/fb$a
    /* block-local class not found */
    class a {}

}
