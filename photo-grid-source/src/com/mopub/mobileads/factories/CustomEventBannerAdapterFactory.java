// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mobileads.factories;

import com.mopub.common.AdReport;
import com.mopub.mobileads.CustomEventBannerAdapter;
import com.mopub.mobileads.MoPubView;
import java.util.Map;

public class CustomEventBannerAdapterFactory
{

    protected static CustomEventBannerAdapterFactory a = new CustomEventBannerAdapterFactory();

    public CustomEventBannerAdapterFactory()
    {
    }

    public static CustomEventBannerAdapter create(MoPubView mopubview, String s, Map map, long l, AdReport adreport)
    {
        return new CustomEventBannerAdapter(mopubview, s, map, l, adreport);
    }

    public static void setInstance(CustomEventBannerAdapterFactory customeventbanneradapterfactory)
    {
        a = customeventbanneradapterfactory;
    }

}
