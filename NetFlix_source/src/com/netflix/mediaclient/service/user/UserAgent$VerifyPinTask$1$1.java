// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.user;

import android.os.Handler;

// Referenced classes of package com.netflix.mediaclient.service.user:
//            UserAgent, SimpleUserAgentWebCallback

class val.statusCode
    implements Runnable
{

    final val.statusCode this$2;
    final boolean val$isPinValid;
    final int val$statusCode;

    public void run()
    {
        allback().onPinVerified(val$isPinValid, val$statusCode);
    }

    init>()
    {
        this$2 = final_init>;
        val$isPinValid = flag;
        val$statusCode = I.this;
        super();
    }

    // Unreferenced inner class com/netflix/mediaclient/service/user/UserAgent$VerifyPinTask$1

/* anonymous class */
    class UserAgent.VerifyPinTask._cls1 extends SimpleUserAgentWebCallback
    {

        final UserAgent.VerifyPinTask this$1;

        public void onPinVerified(final boolean isPinValid, int i)
        {
            UserAgent.access$4100(this$0).post(i. new UserAgent.VerifyPinTask._cls1._cls1());
        }

            
            {
                this$1 = UserAgent.VerifyPinTask.this;
                super();
            }
    }

}
