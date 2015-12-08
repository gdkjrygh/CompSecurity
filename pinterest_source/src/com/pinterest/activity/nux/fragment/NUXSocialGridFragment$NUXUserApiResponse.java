// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.nux.fragment;

import android.os.Handler;
import com.pinterest.activity.nux.adapter.NUXSocialGridAdapter;
import com.pinterest.api.ApiResponse;
import com.pinterest.api.model.Feed;
import com.pinterest.api.model.MyUser;
import com.pinterest.api.model.UserFeed;
import com.pinterest.api.remote.FeedApiResponseHandler;
import com.pinterest.base.Application;
import com.pinterest.base.Events;

// Referenced classes of package com.pinterest.activity.nux.fragment:
//            NUXSocialGridFragment

class tryagain extends com.pinterest.api.remote.piResponse
{

    final NUXSocialGridFragment this$0;
    int tryagain;

    public void onFailure(Throwable throwable, ApiResponse apiresponse)
    {
        Application.showDebugToast(throwable.toString());
        super.piResponse(throwable, apiresponse);
    }

    public void onFinish()
    {
    }

    public void onStart()
    {
        _showLoadingDialog = true;
        super._showLoadingDialog();
    }

    public void onSuccess(Feed feed)
    {
        if (isActive()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (feed.getCode() != 0 && tryagain < 5)
        {
            tryagain = tryagain + 1;
            class _cls1
                implements Runnable
            {

                final NUXSocialGridFragment.NUXUserApiResponse this$1;

                public void run()
                {
                    loadData();
                }

            _cls1()
            {
                this$1 = NUXSocialGridFragment.NUXUserApiResponse.this;
                super();
            }
            }

            NUXSocialGridFragment.access$1300(NUXSocialGridFragment.this).postDelayed(new _cls1(), tryagain * 2000);
            return;
        }
        if (feed.getCode() != 0) goto _L1; else goto _L3
_L3:
        NUXSocialGridFragment.access$1402(NUXSocialGridFragment.this, (UserFeed)feed);
        ((NUXSocialGridAdapter)NUXSocialGridFragment.access$1500(NUXSocialGridFragment.this)).setDataSource(NUXSocialGridFragment.access$1400(NUXSocialGridFragment.this));
        if (NUXSocialGridFragment.access$1400(NUXSocialGridFragment.this).getCount() == 0)
        {
            showNoFollowersHeader();
            return;
        }
        if (!MyUser.isConnectedToFacebook() || NUXSocialGridFragment.access$1600(NUXSocialGridFragment.this) != 0) goto _L5; else goto _L4
_L4:
        Events.post(new ent(0));
_L7:
        super.ConnectedEvent(feed);
        return;
_L5:
        if (MyUser.isConnectedToTwitter() && NUXSocialGridFragment.access$1600(NUXSocialGridFragment.this) == 1)
        {
            Events.post(new ent(1));
        }
        if (true) goto _L7; else goto _L6
_L6:
    }

    public ent(FeedApiResponseHandler feedapiresponsehandler)
    {
        this$0 = NUXSocialGridFragment.this;
        super(feedapiresponsehandler);
        tryagain = 0;
    }
}
