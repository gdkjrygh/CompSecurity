// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mraid;

import com.mopub.mobileads.MraidActivity;
import com.mopub.mobileads.ResponseBodyInterstitial;
import java.util.Map;

class MraidInterstitial extends ResponseBodyInterstitial
{

    private String d;

    MraidInterstitial()
    {
    }

    protected final void a(com.mopub.mobileads.CustomEventInterstitial.CustomEventInterstitialListener customeventinterstitiallistener)
    {
        MraidActivity.preRenderHtml(a, customeventinterstitiallistener, d);
    }

    protected final void a(Map map)
    {
        d = (String)map.get("Html-Response-Body");
    }

    public void showInterstitial()
    {
        MraidActivity.start(a, b, d, c);
    }
}
