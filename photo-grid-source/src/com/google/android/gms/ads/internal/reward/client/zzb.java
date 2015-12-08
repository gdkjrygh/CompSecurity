// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.reward.client;

import android.os.IInterface;

// Referenced classes of package com.google.android.gms.ads.internal.reward.client:
//            RewardedVideoAdRequestParcel, zzd

public interface zzb
    extends IInterface
{

    public abstract void destroy();

    public abstract boolean isLoaded();

    public abstract void pause();

    public abstract void resume();

    public abstract void setUserId(String s);

    public abstract void show();

    public abstract void zza(RewardedVideoAdRequestParcel rewardedvideoadrequestparcel);

    public abstract void zza(zzd zzd);
}
