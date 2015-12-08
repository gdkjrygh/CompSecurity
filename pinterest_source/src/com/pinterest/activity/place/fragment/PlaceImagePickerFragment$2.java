// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.place.fragment;

import com.pinterest.api.model.PlaceImageFeed;
import com.pinterest.api.remote.FeedApiResponseHandler;
import com.pinterest.network.json.PinterestJsonObject;

// Referenced classes of package com.pinterest.activity.place.fragment:
//            PlaceImagePickerFragment

class this._cls0 extends FeedApiResponseHandler
{

    final PlaceImagePickerFragment this$0;

    public void onSuccess(PinterestJsonObject pinterestjsonobject)
    {
        onSuccess(((com.pinterest.api.model.Feed) (new PlaceImageFeed(pinterestjsonobject))));
    }

    (FeedApiResponseHandler feedapiresponsehandler)
    {
        this$0 = PlaceImagePickerFragment.this;
        super(feedapiresponsehandler);
    }
}
