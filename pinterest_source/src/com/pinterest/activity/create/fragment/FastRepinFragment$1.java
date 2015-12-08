// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.create.fragment;

import android.support.v4.app.FragmentActivity;
import com.pinterest.api.model.Pin;
import com.pinterest.base.Constants;
import com.pinterest.base.Device;
import com.pinterest.ui.ViewHelper;

// Referenced classes of package com.pinterest.activity.create.fragment:
//            FastRepinFragment

class this._cls0
    implements com.pinterest.base.ber
{

    final FastRepinFragment this$0;

    public void onEventMainThread(com.pinterest.activity.create.helper.ardCreatedEvent ardcreatedevent)
    {
        ardcreatedevent = ardcreatedevent.getBoardId();
        pin(ardcreatedevent);
        getActivity().onBackPressed();
    }

    public void onEventMainThread(com.pinterest.api.model.epinFragment._cls1 _pcls1)
    {
        _pcls1 = _pcls1.();
        if (_pcls1 != null && _pcls1.getUid().startsWith(_pin.getUid()))
        {
            FastRepinFragment.access$002(FastRepinFragment.this, _pcls1.getDescription());
        }
    }

    public void onEventMainThread(com.pinterest.base.Event event)
    {
        event = getView();
        int i;
        if (Device.isTablet() || Device.isLandscape())
        {
            i = Constants.SHEET_MAX_WIDTH;
        } else
        {
            i = (int)Device.getScreenWidth();
        }
        ViewHelper.updateViewWidth(event, i);
    }

    dCreatedEvent()
    {
        this$0 = FastRepinFragment.this;
        super();
    }
}
