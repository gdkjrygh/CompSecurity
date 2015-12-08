// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.adapters;

import android.content.Context;
import com.facebook.ads.internal.server.AdPlacementType;
import java.util.Map;

// Referenced classes of package com.facebook.ads.internal.adapters:
//            AdAdapter, InterstitialAdapterListener

public abstract class InterstitialAdapter
    implements AdAdapter
{

    public InterstitialAdapter()
    {
    }

    public final AdPlacementType getPlacementType()
    {
        return AdPlacementType.INTERSTITIAL;
    }

    public abstract void loadInterstitialAd(Context context, InterstitialAdapterListener interstitialadapterlistener, Map map);

    public abstract boolean show();
}
