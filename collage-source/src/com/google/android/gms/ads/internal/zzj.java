// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzn;
import com.google.android.gms.ads.internal.client.zzo;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.bt;
import com.google.android.gms.internal.bu;
import com.google.android.gms.internal.bv;
import com.google.android.gms.internal.bw;
import com.google.android.gms.internal.di;
import com.google.android.gms.internal.iu;

// Referenced classes of package com.google.android.gms.ads.internal:
//            zzi

public class zzj extends com.google.android.gms.ads.internal.client.zzp.zza
{

    private final Context mContext;
    private zzn zzoS;
    private NativeAdOptionsParcel zzoX;
    private final String zzoZ;
    private final di zzow;
    private final VersionInfoParcel zzpa;
    private bt zzpf;
    private bu zzpg;
    private iu zzph;
    private iu zzpi;

    public zzj(Context context, String s, di di, VersionInfoParcel versioninfoparcel)
    {
        mContext = context;
        zzoZ = s;
        zzow = di;
        zzpa = versioninfoparcel;
        zzpi = new iu();
        zzph = new iu();
    }

    public void zza(NativeAdOptionsParcel nativeadoptionsparcel)
    {
        zzoX = nativeadoptionsparcel;
    }

    public void zza(bt bt)
    {
        zzpf = bt;
    }

    public void zza(bu bu)
    {
        zzpg = bu;
    }

    public void zza(String s, bw bw, bv bv)
    {
        if (TextUtils.isEmpty(s))
        {
            throw new IllegalArgumentException("Custom template ID for native custom template ad is empty. Please provide a valid template id.");
        } else
        {
            zzpi.put(s, bw);
            zzph.put(s, bv);
            return;
        }
    }

    public void zzb(zzn zzn)
    {
        zzoS = zzn;
    }

    public zzo zzbk()
    {
        return new zzi(mContext, zzoZ, zzow, zzpa, zzoS, zzpf, zzpg, zzpi, zzph, zzoX);
    }
}
