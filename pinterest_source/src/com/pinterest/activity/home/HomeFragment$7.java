// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.home;

import com.pinterest.api.remote.InterestsApi;

// Referenced classes of package com.pinterest.activity.home:
//            HomeFragment

class this._cls0
    implements Runnable
{

    final HomeFragment this$0;

    public void run()
    {
        class _cls1 extends ApiResponseHandler
        {

            final HomeFragment._cls7 this$1;

            public void onFailure(Throwable throwable, ApiResponse apiresponse)
            {
                super.onFailure(throwable, apiresponse);
                HomeFragment.access$1200(this$0);
            }

            public void onSuccess(ApiResponse apiresponse)
            {
                if (apiresponse.getCode() != 220)
                {
                    super.onSuccess(apiresponse);
                    HomeFragment.access$2400(this$0).setRefreshing(false);
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
                    HomeFragment.access$1200(this$0);
                    return;
                }
            }

            _cls1()
            {
                this$1 = HomeFragment._cls7.this;
                super();
            }
        }

        InterestsApi.a(new _cls1(), getApiTag());
    }

    _cls1()
    {
        this$0 = HomeFragment.this;
        super();
    }
}
