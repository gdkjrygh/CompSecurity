// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.kit.activity;

import com.facebook.Session;
import com.facebook.SessionState;

// Referenced classes of package com.pinterest.kit.activity:
//            SocialConnectActivity

class this._cls0
    implements com.facebook.ectActivity._cls5
{

    final SocialConnectActivity this$0;

    public void call(Session session, SessionState sessionstate, Exception exception)
    {
        if (exception != null)
        {
            return;
        } else
        {
            SocialConnectActivity.access$700(SocialConnectActivity.this, session.getAccessToken());
            return;
        }
    }

    ()
    {
        this$0 = SocialConnectActivity.this;
        super();
    }
}
