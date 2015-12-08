// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.user.view;

import com.pinterest.api.model.User;

// Referenced classes of package com.pinterest.activity.user.view:
//            UserAboutFlagView

class this._cls0
    implements com.pinterest.base.ber
{

    final UserAboutFlagView this$0;

    public void onEventMainThread(com.pinterest.api.model.agView._cls2 _pcls2)
    {
        if (_pcls2.User().equals(UserAboutFlagView.access$100(UserAboutFlagView.this)))
        {
            UserAboutFlagView.access$102(UserAboutFlagView.this, _pcls2.User());
            updateUi(UserAboutFlagView.access$100(UserAboutFlagView.this));
        }
    }

    ()
    {
        this$0 = UserAboutFlagView.this;
        super();
    }
}
