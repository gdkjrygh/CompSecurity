// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.place.adapter;

import android.os.Handler;
import com.pinterest.api.ApiResponse;
import com.pinterest.api.BaseApiResponseHandler;
import com.pinterest.api.model.metadata.PlaceFeed;
import com.pinterest.base.Application;
import com.pinterest.network.json.PinterestJsonArray;

// Referenced classes of package com.pinterest.activity.place.adapter:
//            PlacePickerAdapter

class isPlacesTypeahead extends BaseApiResponseHandler
{

    private boolean isPlacesTypeahead;
    private String query;
    final PlacePickerAdapter this$0;

    private boolean isValidData()
    {
        return isPlacesTypeahead && PlacePickerAdapter.access$700(PlacePickerAdapter.this) && query.equals(PlacePickerAdapter.access$800(PlacePickerAdapter.this)) || !isPlacesTypeahead && !PlacePickerAdapter.access$700(PlacePickerAdapter.this) && query.equals(PlacePickerAdapter.access$900(PlacePickerAdapter.this));
    }

    public void onFailure(Throwable throwable, ApiResponse apiresponse)
    {
        super.onFailure(throwable, apiresponse);
        Application.showToast(throwable.getMessage());
    }

    public void onSuccess(final ApiResponse feed)
    {
        super.onSuccess(feed);
        if (isValidData())
        {
            feed = new PlaceFeed((PinterestJsonArray)feed.getData());
            class _cls1
                implements Runnable
            {

                final PlacePickerAdapter.PlaceResponseHandler this$1;
                final PlaceFeed val$feed;

                public void run()
                {
label0:
                    {
                        if (isValidData())
                        {
                            PlacePickerAdapter.access$200(this$0).hideSpinner();
                            if (feed.getCount() != 0)
                            {
                                break label0;
                            }
                            PlacePickerAdapter.access$300(this$0, 0x7f0703a0);
                        }
                        return;
                    }
                    feed.appendItem(PlacePickerAdapter.access$400(this$0));
                    PlacePickerAdapter.access$502(this$0, feed);
                    notifyDataSetChanged();
                }

            _cls1()
            {
                this$1 = PlacePickerAdapter.PlaceResponseHandler.this;
                feed = placefeed;
                super();
            }
            }

            PlacePickerAdapter.access$600(PlacePickerAdapter.this).post(new _cls1());
        }
    }


    public _cls1(String s, boolean flag)
    {
        this$0 = PlacePickerAdapter.this;
        super();
        query = s;
        isPlacesTypeahead = flag;
    }
}
