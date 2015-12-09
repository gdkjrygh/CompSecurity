// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.wear.manager;

import com.dominos.android.sdk.core.user.UserProfileManager;
import com.dominos.wear.client.WearMessageClient;

// Referenced classes of package com.dominos.wear.manager:
//            WearManager

class this._cls0
    implements com.dominos.wear.client.ent.WearConnectionCallback
{

    final WearManager this$0;

    public void onConnectionFailed()
    {
    }

    public void onConnectionSuccess()
    {
        String s;
        if (WearManager.access$000(WearManager.this).isRemembered() || WearManager.access$000(WearManager.this).isUserLoggedIn())
        {
            s = "UserSigned:YES";
        } else
        {
            s = "UserSigned:NO";
        }
        mWearMessageClient.sendToWear("/dominos-trigger-intro-notification", s);
    }

    nt()
    {
        this$0 = WearManager.this;
        super();
    }
}
