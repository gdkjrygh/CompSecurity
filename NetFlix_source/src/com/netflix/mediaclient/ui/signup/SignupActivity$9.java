// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.signup;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.ui.login.LoginActivity;

// Referenced classes of package com.netflix.mediaclient.ui.signup:
//            SignupActivity

class this._cls0
    implements Runnable
{

    final SignupActivity this$0;

    public void run()
    {
        Log.d("SignupActivity", "Handling error during signup");
        clearCookies();
        SignupActivity.access$000(SignupActivity.this, LoginActivity.createStartIntent(SignupActivity.this));
        finish();
    }

    ()
    {
        this$0 = SignupActivity.this;
        super();
    }
}
