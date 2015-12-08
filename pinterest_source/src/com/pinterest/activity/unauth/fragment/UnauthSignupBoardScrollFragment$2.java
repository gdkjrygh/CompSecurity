// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.unauth.fragment;

import com.pinterest.activity.FragmentHelper;
import com.pinterest.api.ApiResponse;
import com.pinterest.api.model.Feed;
import com.pinterest.api.remote.FeedApiResponseHandler;
import com.pinterest.kit.log.PLog;

// Referenced classes of package com.pinterest.activity.unauth.fragment:
//            UnauthSignupBoardScrollFragment, InspiredWallFragment

class this._cls0 extends com.pinterest.api.remote.ollFragment._cls2
{

    final UnauthSignupBoardScrollFragment this$0;

    public void onFailure(Throwable throwable, ApiResponse apiresponse)
    {
        PLog.error((new StringBuilder("Pins missing from board data: ")).append(apiresponse).toString(), new Object[0]);
        FragmentHelper.replaceFragment(getActivity(), new InspiredWallFragment(), false);
    }

    public void onSuccess(Feed feed)
    {
        super.s(feed);
        class _cls1 extends BackgroundTask
        {

            final UnauthSignupBoardScrollFragment._cls2 this$1;

            public void run()
            {
                UnauthSignupBoardScrollFragment.access$000(this$0);
            }

            _cls1()
            {
                this$1 = UnauthSignupBoardScrollFragment._cls2.this;
                super();
            }
        }

        (new _cls1()).schedule(100L);
    }

    _cls1(FeedApiResponseHandler feedapiresponsehandler)
    {
        this$0 = UnauthSignupBoardScrollFragment.this;
        super(feedapiresponsehandler);
    }
}
