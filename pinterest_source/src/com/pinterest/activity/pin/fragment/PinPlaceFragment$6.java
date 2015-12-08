// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.fragment;

import com.pinterest.api.model.Pin;
import com.pinterest.api.remote.PlaceApi;

// Referenced classes of package com.pinterest.activity.pin.fragment:
//            PinPlaceFragment

class this._cls0
    implements Runnable
{

    final PinPlaceFragment this$0;

    public void run()
    {
        class _cls1 extends com.pinterest.api.remote.PinApi.PinFeedApiResponse
        {

            final PinPlaceFragment._cls6 this$1;

            public void onSuccess(Feed feed)
            {
label0:
                {
                    super.onSuccess(feed);
                    if (_relatedTitle != null)
                    {
                        if (feed == null || feed.getCount() <= 0 || PinPlaceFragment.access$200(this$0) == null)
                        {
                            break label0;
                        }
                        _relatedTitle.setVisibility(0);
                    }
                    return;
                }
                _relatedTitle.setVisibility(8);
            }

            _cls1(FeedApiResponseHandler feedapiresponsehandler)
            {
                this$1 = PinPlaceFragment._cls6.this;
                super(feedapiresponsehandler);
            }
        }

        PlaceApi.a(PinPlaceFragment.access$1000(PinPlaceFragment.this).getPlaceUid(), new _cls1(PinPlaceFragment.access$1100(PinPlaceFragment.this)), getApiTag());
        PinPlaceFragment.access$1202(PinPlaceFragment.this, false);
    }

    _cls1()
    {
        this$0 = PinPlaceFragment.this;
        super();
    }
}
