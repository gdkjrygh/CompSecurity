// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.fragment;

import android.widget.TextView;
import com.pinterest.api.model.Feed;
import com.pinterest.api.remote.FeedApiResponseHandler;

// Referenced classes of package com.pinterest.activity.pin.fragment:
//            PinPlaceFragment

class  extends com.pinterest.api.remote.onse
{

    final atedTitle this$1;

    public void onSuccess(Feed feed)
    {
label0:
        {
            super.onSuccess(feed);
            if (_relatedTitle != null)
            {
                if (feed == null || feed.getCount() <= 0 || PinPlaceFragment.access$200(_fld0) == null)
                {
                    break label0;
                }
                _relatedTitle.setVisibility(0);
            }
            return;
        }
        _relatedTitle.setVisibility(8);
    }

    (FeedApiResponseHandler feedapiresponsehandler)
    {
        this$1 = this._cls1.this;
        super(feedapiresponsehandler);
    }
}
