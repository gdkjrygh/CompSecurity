// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mobileads;

import android.content.Context;
import java.util.Map;

public abstract class CustomEventInterstitial
{

    public CustomEventInterstitial()
    {
    }

    protected abstract void loadInterstitial(Context context, CustomEventInterstitialListener customeventinterstitiallistener, Map map, Map map1);

    protected abstract void onInvalidate();

    protected abstract void showInterstitial();
}
