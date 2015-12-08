// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads.mediation;

import android.app.Activity;
import android.view.View;
import com.google.ads.AdSize;

// Referenced classes of package com.google.ads.mediation:
//            MediationAdapter, MediationBannerListener, MediationServerParameters, MediationAdRequest, 
//            NetworkExtras

public interface MediationBannerAdapter
    extends MediationAdapter
{

    public abstract View getBannerView();

    public abstract void requestBannerAd(MediationBannerListener mediationbannerlistener, Activity activity, MediationServerParameters mediationserverparameters, AdSize adsize, MediationAdRequest mediationadrequest, NetworkExtras networkextras);
}
