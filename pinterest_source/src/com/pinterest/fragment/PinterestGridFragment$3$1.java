// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.fragment;

import com.pinterest.api.ApiResponse;
import com.pinterest.api.model.Feed;
import com.pinterest.common.async.BackgroundTask;
import java.sql.SQLDataException;

// Referenced classes of package com.pinterest.fragment:
//            PinterestGridFragment

class val.response extends BackgroundTask
{

    Feed _feed;
    final val.pagination this$1;
    final int val$pagination;
    final ApiResponse val$response;

    public void onFinish()
    {
        if (_feed != null && _feed.getAbsCount() > 0)
        {
            _feed.setOffline(true);
            Success(_feed);
            return;
        } else
        {
            Failure(new SQLDataException(), val$response);
            return;
        }
    }

    public void run()
    {
        _feed = getOfflineFeed(val$pagination);
    }

    ()
    {
        this$1 = final_;
        val$pagination = i;
        val$response = ApiResponse.this;
        super();
    }
}
