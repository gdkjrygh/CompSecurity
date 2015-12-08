// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import com.dominos.android.sdk.common.dom.locator.BuildingResult;

// Referenced classes of package com.dominos.activities:
//            UserAddLocation_

class BuildingResult
    implements Runnable
{

    final UserAddLocation_ this$0;
    final BuildingResult val$buildingResult;

    public void run()
    {
        UserAddLocation_.access$1101(UserAddLocation_.this, val$buildingResult);
    }

    BuildingResult()
    {
        this$0 = final_useraddlocation_;
        val$buildingResult = BuildingResult.this;
        super();
    }
}
