// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.user;

import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.model.User;
import com.pinterest.schemas.event.EventType;

// Referenced classes of package com.pinterest.activity.user:
//            UserSetImageActivity

class t> extends com.pinterest.api.remote.._cls1
{

    final sh this$1;

    public void onSuccess(User user)
    {
        super.nSuccess(user);
        Pinalytics.a(EventType.USER_EDIT, null);
        finish();
    }

    ()
    {
        this$1 = this._cls1.this;
        super();
    }
}
