// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import com.dominos.android.sdk.common.dom.locator.BuildingResult;
import com.dominos.android.sdk.common.dom.locator.RegionResult;
import com.dominos.android.sdk.common.dom.locator.SiteResult;

// Referenced classes of package com.dominos.activities:
//            UserAddLocation_

class .BuildingResult
    implements Runnable
{

    final UserAddLocation_ this$0;
    final BuildingResult val$buildingResult;
    final RegionResult val$regionResult;
    final SiteResult val$siteResult;

    public void run()
    {
        UserAddLocation_.access$501(UserAddLocation_.this, val$regionResult, val$siteResult, val$buildingResult);
    }

    .BuildingResult()
    {
        this$0 = final_useraddlocation_;
        val$regionResult = regionresult;
        val$siteResult = siteresult;
        val$buildingResult = BuildingResult.this;
        super();
    }
}
