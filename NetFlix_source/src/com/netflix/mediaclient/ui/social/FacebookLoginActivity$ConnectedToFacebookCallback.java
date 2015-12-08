// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.social;

import com.netflix.mediaclient.servicemgr.LoggingManagerCallback;

// Referenced classes of package com.netflix.mediaclient.ui.social:
//            FacebookLoginActivity

private class this._cls0 extends LoggingManagerCallback
{

    final FacebookLoginActivity this$0;

    public void onConnectWithFacebookComplete(int i, String s)
    {
        super.onConnectWithFacebookComplete(i, s);
        if (i == 0)
        {
            FacebookLoginActivity.access$400(FacebookLoginActivity.this);
            return;
        } else
        {
            FacebookLoginActivity.access$300(FacebookLoginActivity.this);
            return;
        }
    }

    public Y()
    {
        this$0 = FacebookLoginActivity.this;
        super("FacebookLoginActivity");
    }
}
