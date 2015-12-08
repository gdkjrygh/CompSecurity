// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.nux.adapter;

import android.os.Handler;
import com.pinterest.api.ApiResponse;
import com.pinterest.api.BaseApiResponseHandler;
import com.pinterest.api.model.UserFeed;
import com.pinterest.network.json.PinterestJsonObject;

// Referenced classes of package com.pinterest.activity.nux.adapter:
//            NUXSocialGridAdapter

class val.position extends BaseApiResponseHandler
{

    final NUXSocialGridAdapter this$0;
    final int val$position;

    public void onFailure(Throwable throwable, ApiResponse apiresponse)
    {
        super.onFailure(throwable, apiresponse);
        class _cls2
            implements Runnable
        {

            final NUXSocialGridAdapter._cls1 this$1;

            public void run()
            {
                setSpinnerState(1);
                NUXSocialGridAdapter.access$002(this$0, false);
            }

            _cls2()
            {
                this$1 = NUXSocialGridAdapter._cls1.this;
                super();
            }
        }

        NUXSocialGridAdapter.access$200(NUXSocialGridAdapter.this).post(new _cls2());
    }

    public void onSuccess(final PinterestJsonObject nextUserFeed)
    {
        nextUserFeed = new UserFeed(nextUserFeed, getBaseUrl());
        class _cls1
            implements Runnable
        {

            final NUXSocialGridAdapter._cls1 this$1;
            final Feed val$nextUserFeed;

            public void run()
            {
                setSpinnerState(1);
                NUXSocialGridAdapter.access$002(this$0, false);
                NUXSocialGridAdapter.access$100(this$0).appendItems(nextUserFeed);
                if (nextUserFeed.getCount() == 0)
                {
                    loadMore(position);
                    return;
                } else
                {
                    notifyDataSetChanged();
                    return;
                }
            }

            _cls1()
            {
                this$1 = NUXSocialGridAdapter._cls1.this;
                nextUserFeed = feed;
                super();
            }
        }

        NUXSocialGridAdapter.access$200(NUXSocialGridAdapter.this).post(new _cls1());
    }

    _cls1()
    {
        this$0 = final_nuxsocialgridadapter;
        val$position = I.this;
        super();
    }
}
