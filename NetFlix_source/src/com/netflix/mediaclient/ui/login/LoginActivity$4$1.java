// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.login;

import com.netflix.mediaclient.servicemgr.SimpleManagerCallback;

// Referenced classes of package com.netflix.mediaclient.ui.login:
//            LoginActivity

class val.msg
    implements Runnable
{

    final val.msg this$1;
    final String val$msg;
    final int val$statusCode;

    public void run()
    {
        LoginActivity.access$100(_fld0, val$statusCode, val$msg);
    }

    lback()
    {
        this$1 = final_lback;
        val$statusCode = i;
        val$msg = String.this;
        super();
    }

    // Unreferenced inner class com/netflix/mediaclient/ui/login/LoginActivity$4

/* anonymous class */
    class LoginActivity._cls4 extends SimpleManagerCallback
    {

        final LoginActivity this$0;

        public void onLoginComplete(final int statusCode, String s)
        {
            runOnUiThread(s. new LoginActivity._cls4._cls1());
        }

            
            {
                this$0 = LoginActivity.this;
                super();
            }
    }

}
