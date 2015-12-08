// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.fragment;

import com.pinterest.activity.pin.adapter.PinSwipeAdapter;
import com.pinterest.adapter.LoadMoreListener;
import com.pinterest.api.model.Feed;
import com.pinterest.api.remote.BaseApi;
import com.pinterest.api.remote.FeedApiResponseHandler;
import com.pinterest.kit.log.PLog;

// Referenced classes of package com.pinterest.activity.pin.fragment:
//            PinSwipeFragment

class this._cls0
    implements LoadMoreListener
{

    final PinSwipeFragment this$0;

    public void loadMore()
    {
        Object obj = (PinSwipeAdapter)PinSwipeFragment.access$000(PinSwipeFragment.this);
        if (obj != null && ((PinSwipeAdapter) (obj)).getCount() != 0) goto _L2; else goto _L1
_L1:
        String s;
        return;
_L2:
        if ((s = ((PinSwipeAdapter) (obj)).getDataSource().getNextUrl()) == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = ((PinSwipeAdapter) (obj)).getDataSource().newApiHandler();
        if (obj != null)
        {
            try
            {
                ((FeedApiResponseHandler) (obj)).setHandler(swipeResponseHandler);
                BaseApi.e(s, ((com.pinterest.api.BaseApiResponseHandler) (obj)), getApiTag());
                return;
            }
            catch (Exception exception)
            {
                PLog.error(exception, "exception occurred", new Object[0]);
            }
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    ()
    {
        this$0 = PinSwipeFragment.this;
        super();
    }
}
