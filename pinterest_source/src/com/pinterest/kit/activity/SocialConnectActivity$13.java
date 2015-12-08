// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.kit.activity;

import com.pinterest.api.model.MyUser;
import com.pinterest.api.remote.MyUserApi;
import com.pinterest.common.async.BackgroundTask;

// Referenced classes of package com.pinterest.kit.activity:
//            SocialConnectActivity

class this._cls0 extends BackgroundTask
{

    final SocialConnectActivity this$0;

    public void onFinish()
    {
        if (SocialConnectActivity.access$1500(SocialConnectActivity.this) == null)
        {
            return;
        }
        if (!MyUser.hasAccessTokenAndUser())
        {
            SocialConnectActivity.access$1700(SocialConnectActivity.this);
            return;
        } else
        {
            com.pinterest.api.remote.arams arams = new com.pinterest.api.remote.arams();
            arams.k = SocialConnectActivity.access$1500(SocialConnectActivity.this);
            MyUserApi.a(arams, onGPlusConnectSubmit, SocialConnectActivity.access$1000(SocialConnectActivity.this));
            return;
        }
    }

    public void run()
    {
        SocialConnectActivity.access$1502(SocialConnectActivity.this, SocialConnectActivity.access$1600(SocialConnectActivity.this));
    }

    ams()
    {
        this$0 = SocialConnectActivity.this;
        super();
    }
}
