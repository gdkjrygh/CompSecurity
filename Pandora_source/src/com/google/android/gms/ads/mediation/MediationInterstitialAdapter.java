// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.os.Bundle;

// Referenced classes of package com.google.android.gms.ads.mediation:
//            MediationAdapter, MediationInterstitialListener, MediationAdRequest

public interface MediationInterstitialAdapter
    extends MediationAdapter
{

    public abstract void requestInterstitialAd(Context context, MediationInterstitialListener mediationinterstitiallistener, Bundle bundle, MediationAdRequest mediationadrequest, Bundle bundle1);

    public abstract void showInterstitial();
}
