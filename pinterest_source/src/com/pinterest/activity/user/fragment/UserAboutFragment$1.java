// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.user.fragment;

import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.model.User;
import com.pinterest.base.Application;
import com.pinterest.network.json.PinterestJsonObject;
import com.pinterest.schemas.event.EventType;

// Referenced classes of package com.pinterest.activity.user.fragment:
//            UserAboutFragment

class nit> extends com.pinterest.api.remote.iResponse
{

    final UserAboutFragment this$0;

    public void onFailure(Throwable throwable, PinterestJsonObject pinterestjsonobject)
    {
        super.onFailure(throwable, pinterestjsonobject);
        updateView();
    }

    public void onSuccess(User user)
    {
        Pinalytics.a(EventType.USER_EDIT, null);
        if (getActivity() == null)
        {
            return;
        } else
        {
            UserAboutFragment.access$002(UserAboutFragment.this, user);
            updateView();
            Application.showToastShort(0x7f0702f5);
            return;
        }
    }

    (boolean flag)
    {
        this$0 = UserAboutFragment.this;
        super(flag);
    }
}
