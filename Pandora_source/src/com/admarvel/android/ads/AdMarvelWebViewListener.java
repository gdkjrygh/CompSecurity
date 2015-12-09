// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;


// Referenced classes of package com.admarvel.android.ads:
//            AdMarvelAd, AdMarvelWebView

interface AdMarvelWebViewListener
{

    public abstract void onClickAd(AdMarvelAd admarvelad, String s);

    public abstract void onClose();

    public abstract void onExpand();

    public abstract void onFailedToReceiveAd(AdMarvelWebView admarvelwebview, AdMarvelAd admarvelad, int i, AdMarvelUtils.ErrorReason errorreason);

    public abstract void onReceiveAd(AdMarvelWebView admarvelwebview, AdMarvelAd admarvelad);
}
