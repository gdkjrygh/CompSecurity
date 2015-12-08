// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.view.model;

import com.auditude.ads.model.IAsset;
import com.auditude.ads.model.IOnPageAsset;

// Referenced classes of package com.auditude.ads.view.model:
//            IAdViewSource

public class AdViewSource
    implements IAdViewSource
{

    private Object adParameters;
    private IAsset asset;
    private IOnPageAsset companions[];

    public AdViewSource(IAsset iasset, IOnPageAsset aionpageasset[], Object obj)
    {
        asset = iasset;
        companions = aionpageasset;
        adParameters = obj;
    }

    public final Object getAdParameters()
    {
        return adParameters;
    }

    public final IAsset getAsset()
    {
        return asset;
    }

    public final IOnPageAsset[] getCompanions()
    {
        return companions;
    }
}
