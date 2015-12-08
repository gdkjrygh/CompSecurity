// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.model;


// Referenced classes of package com.auditude.ads.model:
//            Asset, INonLinearAsset, BaseElement

public class NonLinearAsset extends Asset
    implements INonLinearAsset
{

    public NonLinearAsset(BaseElement baseelement)
    {
        super(baseelement);
    }

    public void CopyTo(Asset asset)
    {
        super.CopyTo(asset);
        if (asset != null)
        {
            asset.setDurationInMillis(getDurationInMillis());
            asset.setLeadTimeInMillis(getLeadTimeInMillis());
        }
    }

    public String getType()
    {
        return "nonlinear";
    }
}
