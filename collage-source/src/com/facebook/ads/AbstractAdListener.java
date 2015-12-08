// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads;


// Referenced classes of package com.facebook.ads:
//            AdListener, ImpressionListener, InterstitialAdListener, Ad, 
//            AdError

public abstract class AbstractAdListener
    implements AdListener, ImpressionListener, InterstitialAdListener
{

    public AbstractAdListener()
    {
    }

    public void onAdClicked(Ad ad)
    {
    }

    public void onAdLoaded(Ad ad)
    {
    }

    public void onError(Ad ad, AdError aderror)
    {
    }

    public void onInterstitialDismissed(Ad ad)
    {
    }

    public void onInterstitialDisplayed(Ad ad)
    {
    }

    public void onLoggingImpression(Ad ad)
    {
    }
}
