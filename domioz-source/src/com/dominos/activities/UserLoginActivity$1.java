// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import android.view.View;
import com.dominos.android.sdk.core.user.UserProfileManager;

// Referenced classes of package com.dominos.activities:
//            UserLoginActivity

class this._cls0
    implements android.view.
{

    final UserLoginActivity this$0;

    public void onClick(View view)
    {
        mProfileManager.clearCurrentUser();
        finish();
    }

    leManager()
    {
        this$0 = UserLoginActivity.this;
        super();
    }
}
