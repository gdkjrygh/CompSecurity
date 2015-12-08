// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.AdSize;

// Referenced classes of package com.google.android.gms.ads.mediation:
//            MediationAdapter, MediationBannerListener, MediationAdRequest

public interface MediationBannerAdapter
    extends MediationAdapter
{

    public abstract View getBannerView();

    public abstract void requestBannerAd(Context context, MediationBannerListener mediationbannerlistener, Bundle bundle, AdSize adsize, MediationAdRequest mediationadrequest, Bundle bundle1);
}
