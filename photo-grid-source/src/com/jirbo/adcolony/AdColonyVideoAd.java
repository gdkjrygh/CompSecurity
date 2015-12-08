// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jirbo.adcolony;


// Referenced classes of package com.jirbo.adcolony:
//            AdColonyInterstitialAd, AdColonyAdListener

public class AdColonyVideoAd extends AdColonyInterstitialAd
{

    public AdColonyVideoAd()
    {
    }

    public AdColonyVideoAd(String s)
    {
        super(s);
    }

    public volatile AdColonyInterstitialAd withListener(AdColonyAdListener adcolonyadlistener)
    {
        return withListener(adcolonyadlistener);
    }

    public AdColonyVideoAd withListener(AdColonyAdListener adcolonyadlistener)
    {
        v = adcolonyadlistener;
        return this;
    }
}
