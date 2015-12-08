// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.adapters;

import android.content.Context;
import com.facebook.ads.AdSize;
import com.facebook.ads.internal.server.AdPlacementType;
import java.util.Map;

// Referenced classes of package com.facebook.ads.internal.adapters:
//            AdAdapter, BannerAdapterListener

public abstract class BannerAdapter
    implements AdAdapter
{

    public BannerAdapter()
    {
    }

    public final AdPlacementType getPlacementType()
    {
        return AdPlacementType.BANNER;
    }

    public abstract void loadBannerAd(Context context, AdSize adsize, BannerAdapterListener banneradapterlistener, Map map);

    public void onViewableImpression()
    {
    }
}
