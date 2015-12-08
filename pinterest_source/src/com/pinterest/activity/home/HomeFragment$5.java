// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.home;

import com.pinterest.api.model.PinFeed;
import com.pinterest.base.StopWatch;
import com.pinterest.common.async.BackgroundTask;
import com.pinterest.kit.data.Preferences;
import com.pinterest.kit.data.PreferencesManager;
import com.pinterest.network.json.PinterestJsonObject;
import com.pinterest.reporting.CrashReporting;

// Referenced classes of package com.pinterest.activity.home:
//            HomeFragment

class init> extends BackgroundTask
{

    PinFeed _cachedFeed;
    final HomeFragment this$0;
    final String val$cachedFeedString;
    final StopWatch val$sw;

    public void onFinish()
    {
        val$sw.stopSubWatch("ttrfp_tmp_log", "du_40_hf_obj_creation");
        HomeFragment.access$2002(HomeFragment.this, false);
        _homeFeedHandler.onSuccess(_cachedFeed);
        refresh();
        val$sw.logTimeStamp("ttrfp_tmp_log", "ts_x_hf_refresh");
    }

    public void run()
    {
        if (!Preferences.user().getBoolean("PREF_HOME_FEED_STREAMING", false))
        {
            break MISSING_BLOCK_LABEL_41;
        }
        _cachedFeed = PinFeed.parseJson(val$cachedFeedString, null);
_L1:
        _cachedFeed.isHomeFeed = true;
        _cachedFeed.setCached(true);
        return;
        try
        {
            _cachedFeed = new PinFeed(new PinterestJsonObject(val$cachedFeedString), null);
        }
        catch (Exception exception)
        {
            CrashReporting.a(new Exception((new StringBuilder("MY_HOME_FEED cachedFeedString: ")).append(val$cachedFeedString).append("\n_cachedFeed: ").append(_cachedFeed).append("\norg_msg: ").append(exception.getMessage()).toString()));
            return;
        }
          goto _L1
    }

    ect()
    {
        this$0 = final_homefragment;
        val$cachedFeedString = s;
        val$sw = StopWatch.this;
        super();
    }
}
