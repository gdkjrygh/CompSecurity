// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.view.modules;

import com.pinterest.activity.pin.view.PlaceModulePinGridView;
import com.pinterest.api.ApiResponse;
import com.pinterest.api.model.Feed;

// Referenced classes of package com.pinterest.activity.pin.view.modules:
//            PinCloseupNewPlaceModule

class this._cls0 extends com.pinterest.api.remote.wPlaceModule._cls4
{

    final PinCloseupNewPlaceModule this$0;

    public void onFailure(Throwable throwable, ApiResponse apiresponse)
    {
        super.nFailure(throwable, apiresponse);
        PinCloseupNewPlaceModule.access$300(PinCloseupNewPlaceModule.this).setVisibility(8);
        PinCloseupNewPlaceModule.access$402(PinCloseupNewPlaceModule.this, true);
    }

    public void onSuccess(Feed feed)
    {
        super.nSuccess(feed);
        int i = feed.getCount();
        feed = feed.getItems();
        PinCloseupNewPlaceModule.access$300(PinCloseupNewPlaceModule.this).setPins(feed);
        if (i < 4)
        {
            PinCloseupNewPlaceModule.access$300(PinCloseupNewPlaceModule.this).setVisibility(8);
        }
    }

    ()
    {
        this$0 = PinCloseupNewPlaceModule.this;
        super();
    }
}
