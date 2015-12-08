// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.request;

import android.content.Context;
import com.google.android.gms.internal.zzal;
import com.google.android.gms.internal.zzap;
import com.google.android.gms.internal.zzat;
import com.google.android.gms.internal.zzep;
import com.google.android.gms.internal.zzeq;

// Referenced classes of package com.google.android.gms.ads.internal.request:
//            zzd, AdRequestInfoParcel, zzi

public static final class mContext extends zzd
{

    private final Context mContext;

    public void zzeo()
    {
    }

    public zzi zzep()
    {
        zzal zzal1 = new zzal((String)zzat.zzrh.get());
        return zzeq.zza(mContext, zzal1, com.google.android.gms.internal.zzep.zzew());
    }

    public tInfoParcel(Context context, AdRequestInfoParcel adrequestinfoparcel, tInfoParcel tinfoparcel)
    {
        super(adrequestinfoparcel, tinfoparcel);
        mContext = context;
    }
}
