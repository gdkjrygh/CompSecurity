// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.fragment;

import com.pinterest.api.model.Feed;
import com.pinterest.api.remote.FeedApiResponseHandler;
import com.pinterest.ui.text.BevelTitleDivider;

// Referenced classes of package com.pinterest.activity.pin.fragment:
//            PinFragment

class  extends com.pinterest.api.remote.ApiResponse
{

    final PinFragment this$0;

    public void onSuccess(Feed feed)
    {
label0:
        {
            super.onSuccess(feed);
            if (PinFragment.access$2000(PinFragment.this) != null)
            {
                if (feed == null || feed.getCount() <= 0 || PinFragment.access$100(PinFragment.this) == null)
                {
                    break label0;
                }
                PinFragment.access$2000(PinFragment.this).setVisibility(0);
            }
            return;
        }
        PinFragment.access$2000(PinFragment.this).setVisibility(8);
    }

    (FeedApiResponseHandler feedapiresponsehandler)
    {
        this$0 = PinFragment.this;
        super(feedapiresponsehandler);
    }
}
