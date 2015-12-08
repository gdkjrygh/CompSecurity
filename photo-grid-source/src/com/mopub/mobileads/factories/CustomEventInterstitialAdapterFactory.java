// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mobileads.factories;

import com.mopub.common.AdReport;
import com.mopub.mobileads.CustomEventInterstitialAdapter;
import com.mopub.mobileads.MoPubInterstitial;
import java.util.Map;

public class CustomEventInterstitialAdapterFactory
{

    protected static CustomEventInterstitialAdapterFactory a = new CustomEventInterstitialAdapterFactory();

    public CustomEventInterstitialAdapterFactory()
    {
    }

    public static CustomEventInterstitialAdapter create(MoPubInterstitial mopubinterstitial, String s, Map map, long l, AdReport adreport)
    {
        return new CustomEventInterstitialAdapter(mopubinterstitial, s, map, l, adreport);
    }

    public static void setInstance(CustomEventInterstitialAdapterFactory customeventinterstitialadapterfactory)
    {
        a = customeventinterstitialadapterfactory;
    }

}
