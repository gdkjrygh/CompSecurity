// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.home;

import com.pinterest.adapter.PinGridAdapter;
import com.pinterest.api.model.Feed;
import com.pinterest.api.remote.FeedApiResponseHandler;
import com.pinterest.base.StopWatch;
import com.pinterest.education.EducationHelper;
import com.pinterest.experience.SurveyHelper;
import com.pinterest.schemas.experiences.Placement;

// Referenced classes of package com.pinterest.activity.home:
//            HomeFragment

class dler extends com.pinterest.api.remote.eedApiResponseHandler
{

    final HomeFragment this$0;

    public void onSuccess(Feed feed)
    {
        if (feed == null)
        {
            return;
        }
        StopWatch stopwatch = StopWatch.get();
        if (feed.isCached())
        {
            stopwatch.logTimeStamp("ttrfp_tmp_log", "ts_41_hf_created_disk");
        } else
        {
            stopwatch.stopSubWatch("ttrfp_tmp_log", "ts_42_hf_created_net");
            stopwatch.stopSubWatch("ttrfp_tmp_log", "du_42_load_hf_from_net");
        }
        if (HomeFragment.access$2100(HomeFragment.this) != null)
        {
            ((PinGridAdapter)HomeFragment.access$2200(HomeFragment.this)).setDataSource(null);
        }
        super.onSuccess(feed);
        if (isActive())
        {
            SurveyHelper.a(getActivity(), Placement.ANDROID_GLOBAL_SURVEY);
            HomeFragment.access$2302(HomeFragment.this, EducationHelper.a(Placement.ANDROID_HOME_FEED_TAKEOVER, HomeFragment.this));
        }
        stopwatch.logTimeStamp("ttrfp_tmp_log", "ts_60_hf_on_success_done");
    }

    dler(FeedApiResponseHandler feedapiresponsehandler)
    {
        this$0 = HomeFragment.this;
        super(feedapiresponsehandler);
    }
}
