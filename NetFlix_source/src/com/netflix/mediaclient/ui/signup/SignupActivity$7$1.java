// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.signup;

import com.netflix.mediaclient.servicemgr.SimpleManagerCallback;

// Referenced classes of package com.netflix.mediaclient.ui.signup:
//            SignupActivity

class val.msg
    implements Runnable
{

    final val.msg this$1;
    final String val$msg;
    final int val$statusCode;

    public void run()
    {
        SignupActivity.access$1600(_fld0, val$statusCode, val$msg);
    }

    ack()
    {
        this$1 = final_ack;
        val$statusCode = i;
        val$msg = String.this;
        super();
    }

    // Unreferenced inner class com/netflix/mediaclient/ui/signup/SignupActivity$7

/* anonymous class */
    class SignupActivity._cls7 extends SimpleManagerCallback
    {

        final SignupActivity this$0;

        public void onLoginComplete(final int statusCode, String s)
        {
            runOnUiThread(s. new SignupActivity._cls7._cls1());
        }

            
            {
                this$0 = SignupActivity.this;
                super();
            }
    }

}
