// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import android.content.Intent;
import android.view.View;

// Referenced classes of package com.dominos.activities:
//            UserChangePassword_, UserLoginActivity

class this._cls0
    implements android.view.
{

    final UserLoginActivity this$0;

    public void onClick(View view)
    {
        view = UserChangePassword_.intent(UserLoginActivity.this);
        view.get().putExtra("resetPassword", true);
        view.start();
    }

    IntentBuilder_()
    {
        this$0 = UserLoginActivity.this;
        super();
    }
}
