// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.client;

import android.os.IInterface;
import com.google.android.gms.b.a;
import com.google.android.gms.internal.ds;
import com.google.android.gms.internal.li;
import com.google.android.gms.internal.lu;

// Referenced classes of package com.google.android.gms.ads.internal.client:
//            AdSizeParcel, zzn, zzo, zzu, 
//            zzv, AdRequestParcel

public interface zzs
    extends IInterface
{

    public abstract void destroy();

    public abstract String getMediationAdapterClassName();

    public abstract boolean isLoading();

    public abstract boolean isReady();

    public abstract void pause();

    public abstract void resume();

    public abstract void setManualImpressionsEnabled(boolean flag);

    public abstract void showInterstitial();

    public abstract void stopLoading();

    public abstract void zza(AdSizeParcel adsizeparcel);

    public abstract void zza(zzn zzn);

    public abstract void zza(zzo zzo);

    public abstract void zza(zzu zzu);

    public abstract void zza(zzv zzv);

    public abstract void zza(ds ds);

    public abstract void zza(li li);

    public abstract void zza(lu lu, String s);

    public abstract a zzaM();

    public abstract AdSizeParcel zzaN();

    public abstract void zzaP();

    public abstract boolean zzb(AdRequestParcel adrequestparcel);
}
