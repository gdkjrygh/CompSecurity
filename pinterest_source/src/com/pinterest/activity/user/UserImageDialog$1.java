// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.user;

import com.pinterest.api.model.User;

// Referenced classes of package com.pinterest.activity.user:
//            UserImageDialog

class this._cls0
    implements com.pinterest.base.riber
{

    final UserImageDialog this$0;

    public void onEventMainThread(com.pinterest.api.model.g._cls1 _pcls1)
    {
        _pcls1 = _pcls1.etUser();
        if (_pcls1 == null || UserImageDialog.access$000(UserImageDialog.this) != null && !UserImageDialog.access$000(UserImageDialog.this).equals(_pcls1))
        {
            return;
        } else
        {
            dismissAllowingStateLoss();
            return;
        }
    }

    ()
    {
        this$0 = UserImageDialog.this;
        super();
    }
}
