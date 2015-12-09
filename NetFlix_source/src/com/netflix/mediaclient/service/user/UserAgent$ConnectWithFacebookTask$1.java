// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.user;

import android.os.Handler;
import com.netflix.mediaclient.service.webclient.model.leafs.UserProfile;

// Referenced classes of package com.netflix.mediaclient.service.user:
//            SimpleUserAgentWebCallback, UserAgent

class this._cls1 extends SimpleUserAgentWebCallback
{

    final _cls1.val.errorMsg this$1;

    public void onConnectWithFacebook(final int statusCode, final String errorMsg)
    {
        if (statusCode == 0)
        {
            UserAgent.access$3500(_fld0).setFacebookConnectStatus(true);
        }
        UserAgent.access$3900(_fld0).post(new Runnable() {

            final UserAgent.ConnectWithFacebookTask._cls1 this$2;
            final String val$errorMsg;
            final int val$statusCode;

            public void run()
            {
                getCallback().onConnectWithFacebook(statusCode, errorMsg);
            }

            
            {
                this$2 = UserAgent.ConnectWithFacebookTask._cls1.this;
                statusCode = i;
                errorMsg = s;
                super();
            }
        });
    }

    _cls1.val.errorMsg()
    {
        this$1 = this._cls1.this;
        super();
    }
}
