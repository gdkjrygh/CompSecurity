// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.main;

import com.soundcloud.android.accounts.AccountOperations;

// Referenced classes of package com.soundcloud.android.main:
//            LauncherActivity

class this._cls0
    implements Runnable
{

    final LauncherActivity this$0;

    public void run()
    {
        if (accountOperations.isUserLoggedIn())
        {
            startActivity(LauncherActivity.access$000(LauncherActivity.this));
            return;
        } else
        {
            accountOperations.triggerLoginFlow(LauncherActivity.this);
            return;
        }
    }

    ns()
    {
        this$0 = LauncherActivity.this;
        super();
    }
}
