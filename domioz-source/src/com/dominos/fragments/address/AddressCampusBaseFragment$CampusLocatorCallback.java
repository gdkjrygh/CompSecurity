// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fragments.address;

import com.dominos.android.sdk.common.dom.locator.BuildingResult;
import com.dominos.android.sdk.common.dom.locator.RegionResult;
import com.dominos.android.sdk.common.dom.locator.SiteResult;

// Referenced classes of package com.dominos.fragments.address:
//            AddressCampusBaseFragment

class <init> extends com.dominos.android.sdk.core.storelocator.init>
{

    final AddressCampusBaseFragment this$0;

    public void onBegin()
    {
        AddressCampusBaseFragment.access$100(AddressCampusBaseFragment.this);
    }

    public void onError()
    {
    }

    public void onFinish()
    {
        AddressCampusBaseFragment.access$200(AddressCampusBaseFragment.this);
    }

    public void onGetBuildingsFound(BuildingResult buildingresult)
    {
        onGetBuildingCompleted(buildingresult);
    }

    public void onGetRegionsFound(RegionResult regionresult)
    {
        onGetRegionCompleted(regionresult);
    }

    public void onGetSavedCampusLocationFound(RegionResult regionresult, SiteResult siteresult, BuildingResult buildingresult)
    {
    }

    public void onGetSitesFound(SiteResult siteresult)
    {
        onGetSitesCompleted(siteresult);
    }

    private onCallback()
    {
        this$0 = AddressCampusBaseFragment.this;
        super();
    }

    onCallback(onCallback oncallback)
    {
        this();
    }
}
