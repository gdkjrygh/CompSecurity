// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.signup;

import android.view.MenuItem;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.ui.login.LoginActivity;
import com.netflix.mediaclient.util.LogUtils;

// Referenced classes of package com.netflix.mediaclient.ui.signup:
//            SignupActivity

class this._cls0
    implements android.view.emClickListener
{

    final SignupActivity this$0;

    public boolean onMenuItemClick(MenuItem menuitem)
    {
        Log.d("SignupActivity", "User tapped sign-in button");
        LogUtils.reportLoginActionStarted(SignupActivity.this, null, getUiScreen());
        SignupActivity.access$000(SignupActivity.this, LoginActivity.createStartIntent(SignupActivity.this));
        return true;
    }

    ()
    {
        this$0 = SignupActivity.this;
        super();
    }
}
