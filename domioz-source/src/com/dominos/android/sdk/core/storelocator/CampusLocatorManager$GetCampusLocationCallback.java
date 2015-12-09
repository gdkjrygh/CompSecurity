// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.storelocator;

import com.dominos.android.sdk.common.BaseCallback;
import com.dominos.android.sdk.common.dom.locator.BuildingResult;
import com.dominos.android.sdk.common.dom.locator.RegionResult;
import com.dominos.android.sdk.common.dom.locator.SiteResult;

public abstract class  extends BaseCallback
{

    public abstract void onError();

    public abstract void onGetBuildingsFound(BuildingResult buildingresult);

    public abstract void onGetRegionsFound(RegionResult regionresult);

    public abstract void onGetSavedCampusLocationFound(RegionResult regionresult, SiteResult siteresult, BuildingResult buildingresult);

    public abstract void onGetSitesFound(SiteResult siteresult);

    public ()
    {
    }
}
