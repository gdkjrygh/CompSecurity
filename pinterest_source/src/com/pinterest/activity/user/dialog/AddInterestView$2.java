// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.user.dialog;

import com.pinterest.api.remote.SearchApi;

// Referenced classes of package com.pinterest.activity.user.dialog:
//            AddInterestView

class val.query
    implements Runnable
{

    final AddInterestView this$0;
    final String val$query;

    public void run()
    {
        class _cls1 extends com.pinterest.api.remote.InterestsApi.InterestsFeedApiResponse
        {

            final AddInterestView._cls2 this$1;

            public void onFailure(Throwable throwable, ApiResponse apiresponse)
            {
                super.onFailure(throwable, apiresponse);
                AddInterestView.access$500(this$0, throwable, apiresponse);
            }

            public void onSuccess(Feed feed)
            {
                super.onSuccess(feed);
                AddInterestView.access$400(this$0, feed, query);
            }

            public void onSuccess(PinterestJsonObject pinterestjsonobject)
            {
                if (_searchEt == null || !_searchEt.getText().toString().equals(query))
                {
                    return;
                } else
                {
                    super.onSuccess(pinterestjsonobject);
                    return;
                }
            }

            _cls1()
            {
                this$1 = AddInterestView._cls2.this;
                super();
            }
        }

        SearchApi.a(val$query, new _cls1());
    }

    _cls1()
    {
        this$0 = final_addinterestview;
        val$query = String.this;
        super();
    }
}
