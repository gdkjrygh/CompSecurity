// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.mediation.MediationAdRequest;

// Referenced classes of package com.google.android.gms.ads.mediation.customevent:
//            CustomEvent, CustomEventInterstitialListener

public interface CustomEventInterstitial
    extends CustomEvent
{

    public abstract void requestInterstitialAd(Context context, CustomEventInterstitialListener customeventinterstitiallistener, String s, MediationAdRequest mediationadrequest, Bundle bundle);

    public abstract void showInterstitial();
}
