// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.event;

import com.auditude.ads.model.INonLinearAsset;
import com.auditude.ads.model.IOnPageAsset;
import java.util.HashMap;

// Referenced classes of package com.auditude.ads.event:
//            AdPluginEvent

public class NonLinearAdEvent extends AdPluginEvent
{

    public static final String AD_BEGIN = "nonLinearAdBegin";
    public static final String AD_END = "nonLinearAdEnd";
    private INonLinearAsset asset;
    private IOnPageAsset banners[];

    public NonLinearAdEvent(String s, INonLinearAsset inonlinearasset, IOnPageAsset aionpageasset[])
    {
        this(s, inonlinearasset, aionpageasset, null);
    }

    public NonLinearAdEvent(String s, INonLinearAsset inonlinearasset, IOnPageAsset aionpageasset[], HashMap hashmap)
    {
        super(s, hashmap);
        asset = inonlinearasset;
        banners = aionpageasset;
    }

    public final INonLinearAsset getAsset()
    {
        return asset;
    }

    public final IOnPageAsset[] getBanners()
    {
        return banners;
    }
}
