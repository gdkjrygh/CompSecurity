// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.nux.fragment;

import com.pinterest.api.remote.InterestsApi;

// Referenced classes of package com.pinterest.activity.nux.fragment:
//            NUXEndScreenFragment

class this._cls0
    implements Runnable
{

    final NUXEndScreenFragment this$0;

    public void run()
    {
        class _cls1 extends ApiResponseHandler
        {

            final NUXEndScreenFragment._cls2 this$1;

            public void onFailure(Throwable throwable, ApiResponse apiresponse)
            {
                super.onFailure(throwable, apiresponse);
                pollHomeFeedReady();
            }

            public void onSuccess(ApiResponse apiresponse)
            {
                if (apiresponse.getCode() != 220)
                {
                    Experiences.c().d(Experiences.a);
                    NUXEndScreenFragment.access$000(this$0);
                    super.onSuccess(apiresponse);
                    return;
                } else
                {
                    pollHomeFeedReady();
                    return;
                }
            }

            _cls1()
            {
                this$1 = NUXEndScreenFragment._cls2.this;
                super();
            }
        }

        InterestsApi.a(new _cls1(), getApiTag());
    }

    _cls1()
    {
        this$0 = NUXEndScreenFragment.this;
        super();
    }
}
