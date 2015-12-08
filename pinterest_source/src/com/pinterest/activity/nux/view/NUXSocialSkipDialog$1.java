// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.nux.view;

import android.view.View;
import com.pinterest.api.model.MyUser;
import com.pinterest.base.Events;

// Referenced classes of package com.pinterest.activity.nux.view:
//            NUXSocialSkipDialog

class this._cls0
    implements android.view.SocialSkipDialog._cls1
{

    final NUXSocialSkipDialog this$0;

    public void onClick(View view)
    {
        if (NUXSocialSkipDialog.access$000(NUXSocialSkipDialog.this) != 0) goto _L2; else goto _L1
_L1:
        if (MyUser.isConnectedToTwitter()) goto _L4; else goto _L3
_L3:
        Events.post(new com.pinterest.base.vent(com.pinterest.base.));
_L6:
        return;
_L4:
        Events.post(new com.pinterest.activity.nux.fragment.t.SocialConnectedEvent(1));
        return;
_L2:
        if (NUXSocialSkipDialog.access$000(NUXSocialSkipDialog.this) == 1)
        {
            if (!MyUser.isConnectedToFacebook())
            {
                Events.post(new com.pinterest.base.vent(com.pinterest.base.K));
                return;
            } else
            {
                Events.post(new com.pinterest.activity.nux.fragment.t.SocialConnectedEvent(0));
                return;
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    gment.SocialConnectedEvent()
    {
        this$0 = NUXSocialSkipDialog.this;
        super();
    }
}
