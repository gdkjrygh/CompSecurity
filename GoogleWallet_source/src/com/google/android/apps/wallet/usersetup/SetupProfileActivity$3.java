// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.usersetup;

import com.google.android.apps.wallet.callstatus.CallStatus;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.usersetup:
//            SetupProfileActivity, FinishSetupActivator

final class this._cls0
    implements Callable
{

    final SetupProfileActivity this$0;

    private CallStatus call()
        throws Exception
    {
        return finishSetupActivator.finishSetup();
    }

    public final volatile Object call()
        throws Exception
    {
        return call();
    }

    ()
    {
        this$0 = SetupProfileActivity.this;
        super();
    }
}
