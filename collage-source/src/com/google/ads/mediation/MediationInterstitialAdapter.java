// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads.mediation;

import android.app.Activity;

// Referenced classes of package com.google.ads.mediation:
//            MediationAdapter, MediationInterstitialListener, MediationServerParameters, MediationAdRequest, 
//            NetworkExtras

public interface MediationInterstitialAdapter
    extends MediationAdapter
{

    public abstract void a(MediationInterstitialListener mediationinterstitiallistener, Activity activity, MediationServerParameters mediationserverparameters, MediationAdRequest mediationadrequest, NetworkExtras networkextras);

    public abstract void e();
}
