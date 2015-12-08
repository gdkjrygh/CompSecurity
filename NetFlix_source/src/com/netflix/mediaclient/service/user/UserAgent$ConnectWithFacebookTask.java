// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.user;

import android.os.Handler;
import com.netflix.mediaclient.service.webclient.model.leafs.UserProfile;

// Referenced classes of package com.netflix.mediaclient.service.user:
//            UserAgent, UserWebClient, UserAgentWebCallback, SimpleUserAgentWebCallback

private class accessToken extends accessToken
{

    final String accessToken;
    final UserAgent this$0;
    private final UserAgentWebCallback webClientCallback = new SimpleUserAgentWebCallback() {

        final UserAgent.ConnectWithFacebookTask this$1;

        public void onConnectWithFacebook(final int statusCode, String s1)
        {
            if (statusCode == 0)
            {
                UserAgent.access$3500(this$0).setFacebookConnectStatus(true);
            }
            UserAgent.access$3900(this$0).post(s1. new Runnable() {

                final _cls1 this$2;
                final String val$errorMsg;
                final int val$statusCode;

                public void run()
                {
                    getCallback().onConnectWithFacebook(statusCode, errorMsg);
                }

            
            {
                this$2 = final__pcls1;
                statusCode = i;
                errorMsg = String.this;
                super();
            }
            });
        }

            
            {
                this$1 = UserAgent.ConnectWithFacebookTask.this;
                super();
            }
    };

    public void run()
    {
        UserAgent.access$2700(UserAgent.this).connectWithFacebook(accessToken, webClientCallback);
    }

    public _cls1.this._cls1(String s, _cls1.this._cls1 _pcls1)
    {
        this$0 = UserAgent.this;
        super(_pcls1);
        accessToken = s;
    }
}
