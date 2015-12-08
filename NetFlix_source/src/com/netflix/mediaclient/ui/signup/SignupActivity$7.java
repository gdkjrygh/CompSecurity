// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.signup;

import com.netflix.mediaclient.servicemgr.SimpleManagerCallback;

// Referenced classes of package com.netflix.mediaclient.ui.signup:
//            SignupActivity

class lback extends SimpleManagerCallback
{

    final SignupActivity this$0;

    public void onLoginComplete(final int statusCode, final String msg)
    {
        runOnUiThread(new Runnable() {

            final SignupActivity._cls7 this$1;
            final String val$msg;
            final int val$statusCode;

            public void run()
            {
                SignupActivity.access$1600(this$0, statusCode, msg);
            }

            
            {
                this$1 = SignupActivity._cls7.this;
                statusCode = i;
                msg = s;
                super();
            }
        });
    }

    _cls1.val.msg()
    {
        this$0 = SignupActivity.this;
        super();
    }
}
