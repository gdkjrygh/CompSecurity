// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.create.fragment;

import android.support.v4.app.FragmentActivity;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.ApiResponse;
import com.pinterest.api.ApiResponseHandler;
import com.pinterest.api.model.Board;
import com.pinterest.api.model.ModelHelper;
import com.pinterest.api.model.Pin;
import com.pinterest.base.Application;
import com.pinterest.schemas.event.EventType;

// Referenced classes of package com.pinterest.activity.create.fragment:
//            PinEditFragment

class this._cls0 extends ApiResponseHandler
{

    final PinEditFragment this$0;

    public void onSuccess(ApiResponse apiresponse)
    {
        super.onSuccess(apiresponse);
        if (getActivity() != null)
        {
            getActivity().setResult(10400);
            getActivity().finish();
        }
        Application.showToast(0x7f070400);
        Pinalytics.a(EventType.PIN_DELETE, _pin.getUid());
        if (_pin != null)
        {
            apiresponse = ModelHelper.getBoard(_pin.getBoardUid());
            if (apiresponse != null && apiresponse.getPinCountDisplay() > 0)
            {
                apiresponse.setPinCount(Integer.valueOf(apiresponse.getPinCountDisplay() - 1));
                ModelHelper.setBoard(apiresponse);
            }
        }
    }

    (int i)
    {
        this$0 = PinEditFragment.this;
        super(i);
    }
}
