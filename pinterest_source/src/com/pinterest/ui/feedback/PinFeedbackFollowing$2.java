// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.feedback;

import android.view.View;
import com.pinterest.activity.task.model.Location;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.api.model.Pin;
import com.pinterest.api.model.User;
import com.pinterest.api.remote.UserApi;
import com.pinterest.kit.application.Resources;

// Referenced classes of package com.pinterest.ui.feedback:
//            PinFeedbackFollowing, PinFeedbackState, PinFeedbackBase

class ckListener extends ckListener
{

    final PinFeedbackFollowing this$0;

    public void onClick(View view)
    {
        super.onClick(view);
        view = Resources.string(0x7f07039e, new Object[] {
            _pin.getUser().getFullName()
        });
        _pin.setFeedbackState((new PinFeedbackState(PinFeedbackBase.STR_UNFOLLOWED, view)).setDestination(new Navigation(Location.USER, _pin.getUser())));
        UserApi.h(_pin.getUserUid(), null, getApiTag());
        dematerializePin();
    }

    ckListener()
    {
        this$0 = PinFeedbackFollowing.this;
        super(PinFeedbackFollowing.this);
    }
}
