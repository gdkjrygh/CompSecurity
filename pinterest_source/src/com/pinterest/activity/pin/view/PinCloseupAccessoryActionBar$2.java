// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.view;

import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.ApiResponse;
import com.pinterest.api.model.ModelHelper;
import com.pinterest.api.model.Pin;
import com.pinterest.schemas.event.EventType;

// Referenced classes of package com.pinterest.activity.pin.view:
//            PinCloseupAccessoryActionBar

class this._cls0 extends com.pinterest.api.remote.nBar._cls2
{

    final PinCloseupAccessoryActionBar this$0;

    public void onFailure(Throwable throwable, ApiResponse apiresponse)
    {
        super.lure(throwable, apiresponse);
        if (PinCloseupAccessoryActionBar.access$000(PinCloseupAccessoryActionBar.this) != null)
        {
            throwable = PinCloseupAccessoryActionBar.access$000(PinCloseupAccessoryActionBar.this);
            int i;
            boolean flag;
            if (!PinCloseupAccessoryActionBar.access$000(PinCloseupAccessoryActionBar.this).getLiked().booleanValue())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            throwable.setLiked(Boolean.valueOf(flag));
            throwable = PinCloseupAccessoryActionBar.access$000(PinCloseupAccessoryActionBar.this);
            if (PinCloseupAccessoryActionBar.access$000(PinCloseupAccessoryActionBar.this).getLiked().booleanValue())
            {
                i = PinCloseupAccessoryActionBar.access$000(PinCloseupAccessoryActionBar.this).getLikeCountDisplay() + 1;
            } else
            {
                i = PinCloseupAccessoryActionBar.access$000(PinCloseupAccessoryActionBar.this).getLikeCountDisplay() - 1;
            }
            throwable.setLikeCount(Integer.valueOf(i));
            ModelHelper.setPin(PinCloseupAccessoryActionBar.access$000(PinCloseupAccessoryActionBar.this));
            updateView();
        }
    }

    public void onSuccess(ApiResponse apiresponse)
    {
        super.cess(apiresponse);
        if (PinCloseupAccessoryActionBar.access$000(PinCloseupAccessoryActionBar.this) != null)
        {
            if (PinCloseupAccessoryActionBar.access$000(PinCloseupAccessoryActionBar.this).getLiked().booleanValue())
            {
                apiresponse = EventType.PIN_LIKE;
            } else
            {
                apiresponse = EventType.PIN_UNLIKE;
            }
            Pinalytics.a(apiresponse, PinCloseupAccessoryActionBar.access$000(PinCloseupAccessoryActionBar.this).getUid(), PinCloseupAccessoryActionBar.access$000(PinCloseupAccessoryActionBar.this).getLoggingAuxData());
            ModelHelper.setPin(PinCloseupAccessoryActionBar.access$000(PinCloseupAccessoryActionBar.this));
        }
    }

    (Pin pin)
    {
        this$0 = PinCloseupAccessoryActionBar.this;
        super(pin);
    }
}
