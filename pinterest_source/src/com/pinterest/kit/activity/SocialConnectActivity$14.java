// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.kit.activity;

import com.pinterest.common.async.BackgroundTask;

// Referenced classes of package com.pinterest.kit.activity:
//            SocialConnectActivity

class this._cls0 extends BackgroundTask
{

    final SocialConnectActivity this$0;
    String token;

    public void onFinish()
    {
        if (token == null)
        {
            return;
        } else
        {
            SocialConnectActivity.access$1900(SocialConnectActivity.this, token);
            return;
        }
    }

    public void run()
    {
        token = SocialConnectActivity.access$1800(SocialConnectActivity.this);
    }

    _cls9()
    {
        this$0 = SocialConnectActivity.this;
        super();
    }
}
