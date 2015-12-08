// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.mediation;


// Referenced classes of package com.google.android.gms.ads.mediation:
//            MediationNativeAdapter, NativeAdMapper

public interface MediationNativeListener
{

    public abstract void onAdClicked(MediationNativeAdapter mediationnativeadapter);

    public abstract void onAdClosed(MediationNativeAdapter mediationnativeadapter);

    public abstract void onAdFailedToLoad(MediationNativeAdapter mediationnativeadapter, int i);

    public abstract void onAdLeftApplication(MediationNativeAdapter mediationnativeadapter);

    public abstract void onAdLoaded(MediationNativeAdapter mediationnativeadapter, NativeAdMapper nativeadmapper);

    public abstract void onAdOpened(MediationNativeAdapter mediationnativeadapter);
}
