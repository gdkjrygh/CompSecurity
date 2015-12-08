// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.user.view;

import com.pinterest.api.model.User;

// Referenced classes of package com.pinterest.activity.user.view:
//            UserMetadataView

class this._cls0
    implements com.pinterest.base.iber
{

    final UserMetadataView this$0;

    public void onEventMainThread(com.pinterest.api.model.taView._cls1 _pcls1)
    {
        _pcls1 = _pcls1.tUser();
        if (_pcls1 == null || !_pcls1.equals(UserMetadataView.access$000(UserMetadataView.this)))
        {
            return;
        } else
        {
            setUser(_pcls1);
            return;
        }
    }

    _cls9()
    {
        this$0 = UserMetadataView.this;
        super();
    }
}
