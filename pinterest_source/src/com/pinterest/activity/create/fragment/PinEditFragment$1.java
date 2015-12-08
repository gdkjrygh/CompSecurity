// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.create.fragment;

import android.app.Activity;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.ApiResponseHandler;
import com.pinterest.api.model.Pin;
import com.pinterest.base.Application;
import com.pinterest.base.Events;
import com.pinterest.network.json.PinterestJsonObject;
import com.pinterest.schemas.event.EventType;

// Referenced classes of package com.pinterest.activity.create.fragment:
//            PinEditFragment

class this._cls0 extends ApiResponseHandler
{

    final PinEditFragment this$0;

    public void onSuccess(PinterestJsonObject pinterestjsonobject)
    {
        Pin.make(pinterestjsonobject);
        Pinalytics.a(EventType.PIN_EDIT, _pin.getUid());
        Application.showToast(0x7f070219);
        Events.postSticky(new com.pinterest.api.model.<init>(_pin.getBoard(), false, true));
        pinterestjsonobject = getActivity();
        if (pinterestjsonobject != null)
        {
            pinterestjsonobject.onBackPressed();
        }
    }

    (boolean flag)
    {
        this$0 = PinEditFragment.this;
        super(flag);
    }
}
