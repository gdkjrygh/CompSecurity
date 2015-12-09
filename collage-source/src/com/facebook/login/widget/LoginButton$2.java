// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.login.widget;

import com.facebook.AccessToken;
import com.facebook.AccessTokenTracker;

// Referenced classes of package com.facebook.login.widget:
//            LoginButton

class this._cls0 extends AccessTokenTracker
{

    final LoginButton this$0;

    protected void onCurrentAccessTokenChanged(AccessToken accesstoken, AccessToken accesstoken1)
    {
        LoginButton.access$300(LoginButton.this);
    }

    ()
    {
        this$0 = LoginButton.this;
        super();
    }
}
