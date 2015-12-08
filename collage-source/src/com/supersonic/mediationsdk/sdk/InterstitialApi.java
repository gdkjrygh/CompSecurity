// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.supersonic.mediationsdk.sdk;

import android.app.Activity;

// Referenced classes of package com.supersonic.mediationsdk.sdk:
//            BaseApi, InterstitialListener

public interface InterstitialApi
    extends BaseApi
{

    public abstract void initInterstitial(Activity activity, String s, String s1);

    public abstract boolean isInterstitialAdAvailable();

    public abstract void setInterstitialListener(InterstitialListener interstitiallistener);

    public abstract void showInterstitial();
}
