// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.onboarding.auth;

import android.os.Bundle;
import com.soundcloud.android.onboarding.auth.tasks.LoginTask;

// Referenced classes of package com.soundcloud.android.onboarding.auth:
//            SignupTaskFragment

class this._cls0
    implements Runnable
{

    final SignupTaskFragment this$0;

    public void run()
    {
        SignupTaskFragment.access$000(SignupTaskFragment.this).executeOnThreadPool(new Bundle[] {
            getArguments()
        });
    }

    A()
    {
        this$0 = SignupTaskFragment.this;
        super();
    }
}
