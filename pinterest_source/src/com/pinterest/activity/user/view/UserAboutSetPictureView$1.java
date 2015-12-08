// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.user.view;

import android.view.View;
import com.pinterest.activity.user.fragment.UserAboutHelper;

// Referenced classes of package com.pinterest.activity.user.view:
//            UserAboutSetPictureView

class this._cls0
    implements android.view.outSetPictureView._cls1
{

    final UserAboutSetPictureView this$0;

    public void onClick(View view)
    {
        UserAboutHelper.showUserPictureSource(getContext());
    }

    ()
    {
        this$0 = UserAboutSetPictureView.this;
        super();
    }
}
