// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.fragment;

import android.support.v4.app.FixedFragmentStatePagerAdapter;
import com.pinterest.activity.pin.adapter.PinSwipeAdapter;
import com.pinterest.api.ApiResponse;
import com.pinterest.api.model.Feed;
import com.pinterest.api.remote.FeedApiResponseHandler;

// Referenced classes of package com.pinterest.activity.pin.fragment:
//            PinSwipeFragment

class this._cls0 extends FeedApiResponseHandler
{

    final PinSwipeFragment this$0;

    public void onFailure(Throwable throwable, ApiResponse apiresponse)
    {
        super.onFailure(throwable, apiresponse);
        if (PinSwipeFragment.access$1600(PinSwipeFragment.this) != null)
        {
            ((PinSwipeAdapter)PinSwipeFragment.access$1700(PinSwipeFragment.this)).setLoading(false);
        }
    }

    public void onFinish()
    {
        super.onFinish();
    }

    public void onStart()
    {
        super.onStart();
        if (PinSwipeFragment.access$1800(PinSwipeFragment.this) != null)
        {
            ((PinSwipeAdapter)PinSwipeFragment.access$1900(PinSwipeFragment.this)).setLoading(true);
        }
    }

    public void onSuccess(Feed feed)
    {
        super.onSuccess(feed);
        if (PinSwipeFragment.access$1200(PinSwipeFragment.this) != null)
        {
            ((PinSwipeAdapter)PinSwipeFragment.access$1300(PinSwipeFragment.this)).appendDataSource(feed);
            PinSwipeFragment.access$1400(PinSwipeFragment.this).notifyDataSetChanged();
            ((PinSwipeAdapter)PinSwipeFragment.access$1500(PinSwipeFragment.this)).setLoading(false);
        }
    }

    ()
    {
        this$0 = PinSwipeFragment.this;
        super();
    }
}
