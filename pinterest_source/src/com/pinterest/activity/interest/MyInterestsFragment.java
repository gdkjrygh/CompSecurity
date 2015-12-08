// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.interest;

import com.pinterest.api.remote.InterestsApi;

// Referenced classes of package com.pinterest.activity.interest:
//            InterestsFragment

public class MyInterestsFragment extends InterestsFragment
{

    public MyInterestsFragment()
    {
    }

    protected void loadData()
    {
        InterestsApi.a("interest", new com.pinterest.api.remote.InterestsApi.InterestsFeedApiResponse(gridResponseHandler), getApiTag());
    }
}
