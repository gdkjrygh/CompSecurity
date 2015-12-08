// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.home;

import android.support.v4.widget.SwipeRefreshLayout;
import com.pinterest.api.ApiResponse;
import com.pinterest.api.ApiResponseHandler;
import com.pinterest.experience.ExperienceValue;
import com.pinterest.experience.Experiences;

// Referenced classes of package com.pinterest.activity.home:
//            HomeFragment

class this._cls1 extends ApiResponseHandler
{

    final is._cls0 this$1;

    public void onFailure(Throwable throwable, ApiResponse apiresponse)
    {
        super.onFailure(throwable, apiresponse);
        HomeFragment.access$1200(_fld0);
    }

    public void onSuccess(ApiResponse apiresponse)
    {
        if (apiresponse.getCode() != 220)
        {
            super.onSuccess(apiresponse);
            HomeFragment.access$2400(_fld0).setRefreshing(false);
            apiresponse = Experiences.a(Experiences.a);
            if (apiresponse != null)
            {
                Experiences.c(((ExperienceValue) (apiresponse)).e);
                apiresponse.c();
            }
            Experiences.c().d(Experiences.a);
            refresh();
            return;
        } else
        {
            HomeFragment.access$1200(_fld0);
            return;
        }
    }

    ()
    {
        this$1 = this._cls1.this;
        super();
    }
}
