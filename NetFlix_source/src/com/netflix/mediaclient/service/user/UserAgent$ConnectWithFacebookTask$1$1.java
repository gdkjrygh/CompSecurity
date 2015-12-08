// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.user;

import android.os.Handler;
import com.netflix.mediaclient.service.webclient.model.leafs.UserProfile;

// Referenced classes of package com.netflix.mediaclient.service.user:
//            UserAgent, SimpleUserAgentWebCallback

class val.errorMsg
    implements Runnable
{

    final val.errorMsg this$2;
    final String val$errorMsg;
    final int val$statusCode;

    public void run()
    {
        allback().ithFacebook(val$statusCode, val$errorMsg);
    }

    is._cls1()
    {
        this$2 = final__pcls1;
        val$statusCode = i;
        val$errorMsg = String.this;
        super();
    }

    // Unreferenced inner class com/netflix/mediaclient/service/user/UserAgent$ConnectWithFacebookTask$1

/* anonymous class */
    class UserAgent.ConnectWithFacebookTask._cls1 extends SimpleUserAgentWebCallback
    {

        final UserAgent.ConnectWithFacebookTask this$1;

        public void onConnectWithFacebook(final int statusCode, String s)
        {
            if (statusCode == 0)
            {
                UserAgent.access$3500(this$0).setFacebookConnectStatus(true);
            }
            UserAgent.access$3900(this$0).post(s. new UserAgent.ConnectWithFacebookTask._cls1._cls1());
        }

            
            {
                this$1 = UserAgent.ConnectWithFacebookTask.this;
                super();
            }
    }

}
