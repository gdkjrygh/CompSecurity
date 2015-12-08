// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.place.adapter;

import com.pinterest.activity.sendapin.ui.ProgressSpinnerListCell;
import com.pinterest.api.model.metadata.PlaceFeed;

// Referenced classes of package com.pinterest.activity.place.adapter:
//            PlacePickerAdapter

class val.feed
    implements Runnable
{

    final val.feed this$1;
    final PlaceFeed val$feed;

    public void run()
    {
label0:
        {
            if (cess._mth100(this._cls1.this))
            {
                PlacePickerAdapter.access$200(_fld0).hideSpinner();
                if (val$feed.getCount() != 0)
                {
                    break label0;
                }
                PlacePickerAdapter.access$300(_fld0, 0x7f0703a0);
            }
            return;
        }
        val$feed.appendItem(PlacePickerAdapter.access$400(_fld0));
        PlacePickerAdapter.access$502(_fld0, val$feed);
        notifyDataSetChanged();
    }

    ()
    {
        this$1 = final_;
        val$feed = PlaceFeed.this;
        super();
    }
}
