// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.menu;

import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.ApiResponse;
import com.pinterest.api.model.ModelHelper;
import com.pinterest.api.model.Pin;
import com.pinterest.schemas.event.EventType;

// Referenced classes of package com.pinterest.ui.menu:
//            PinContextMenu

class iResponse extends com.pinterest.api.remote.sponse
{

    final is._cls0 this$1;

    public void onFailure(Throwable throwable, ApiResponse apiresponse)
    {
        super.onFailure(throwable, apiresponse);
        if (PinContextMenu.access$000(_fld0) != null)
        {
            throwable = PinContextMenu.access$000(_fld0);
            int i;
            boolean flag;
            if (!PinContextMenu.access$000(_fld0).getLiked().booleanValue())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            throwable.setLiked(Boolean.valueOf(flag));
            throwable = PinContextMenu.access$000(_fld0);
            if (PinContextMenu.access$000(_fld0).getLiked().booleanValue())
            {
                i = PinContextMenu.access$000(_fld0).getLikeCountDisplay() + 1;
            } else
            {
                i = PinContextMenu.access$000(_fld0).getLikeCountDisplay() - 1;
            }
            throwable.setLikeCount(Integer.valueOf(i));
            ModelHelper.setPin(PinContextMenu.access$000(_fld0));
        }
    }

    public void onSuccess(ApiResponse apiresponse)
    {
        super.onSuccess(apiresponse);
        if (PinContextMenu.access$000(_fld0) != null)
        {
            if (PinContextMenu.access$000(_fld0).getLiked().booleanValue())
            {
                apiresponse = EventType.PIN_LIKE;
            } else
            {
                apiresponse = EventType.PIN_UNLIKE;
            }
            Pinalytics.a(apiresponse, PinContextMenu.access$000(_fld0).getUid(), PinContextMenu.access$000(_fld0).getLoggingAuxData());
            ModelHelper.setPin(PinContextMenu.access$000(_fld0));
        }
    }

    iResponse(Pin pin)
    {
        this$1 = this._cls1.this;
        super(pin);
    }
}
