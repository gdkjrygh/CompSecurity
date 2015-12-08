// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.unauth.fragment;

import android.content.res.Resources;
import android.view.View;
import com.pinterest.api.ApiResponse;
import com.pinterest.api.model.Pin;
import com.pinterest.kit.log.PLog;
import com.pinterest.ui.imageview.WebImageView;

// Referenced classes of package com.pinterest.activity.unauth.fragment:
//            UnauthSignupPinFragment

class this._cls0 extends com.pinterest.api.remote.PinFragment._cls1
{

    final UnauthSignupPinFragment this$0;

    public void onFailure(Throwable throwable, ApiResponse apiresponse)
    {
        PLog.error(throwable, (new StringBuilder("Could not load pin for warm app signup: ")).append(apiresponse.toString()).toString(), new Object[0]);
        throwable = getResources().getDrawable(0x7f020048);
        _pin.setImageDrawable(throwable, true);
        _pin.setPadding(0, (int)com.pinterest.kit.application.Resources.dimension(0x7f0a0162), 0, 0);
        _gradient.setVisibility(0);
    }

    public void onSuccess(Pin pin)
    {
        super.ccess(pin);
        _pin.loadUrl(pin.getImageLargeUrl());
        _pin.setCornerRadius((int)com.pinterest.kit.application.Resources.dimension(0x7f0a0181));
    }

    ()
    {
        this$0 = UnauthSignupPinFragment.this;
        super();
    }
}
