// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import com.dominos.android.sdk.common.dom.locator.SiteResult;

// Referenced classes of package com.dominos.activities:
//            UserAddLocation_

class .SiteResult
    implements Runnable
{

    final UserAddLocation_ this$0;
    final SiteResult val$siteResult;

    public void run()
    {
        UserAddLocation_.access$701(UserAddLocation_.this, val$siteResult);
    }

    .SiteResult()
    {
        this$0 = final_useraddlocation_;
        val$siteResult = SiteResult.this;
        super();
    }
}
