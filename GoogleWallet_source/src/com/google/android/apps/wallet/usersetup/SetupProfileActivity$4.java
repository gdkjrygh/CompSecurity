// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.usersetup;

import com.google.android.apps.wallet.api.UriRegistry;
import com.google.android.apps.wallet.callstatus.CallStatus;
import com.google.android.apps.wallet.userevents.UserEventLogger;
import com.google.android.apps.wallet.util.async.AsyncCallback;

// Referenced classes of package com.google.android.apps.wallet.usersetup:
//            SetupProfileActivity

final class this._cls0
    implements AsyncCallback
{

    final SetupProfileActivity this$0;

    private void onSuccess(CallStatus callstatus)
    {
        if (callstatus == CallStatus.SUCCESS)
        {
            userEventLogger.log(31, 239);
            startActivity(uriRegistry.createIntent(2, new Object[0]));
            finish();
            return;
        } else
        {
            SetupProfileActivity.access$600(SetupProfileActivity.this);
            return;
        }
    }

    public final void onFailure(Exception exception)
    {
        SetupProfileActivity.access$600(SetupProfileActivity.this);
    }

    public final volatile void onSuccess(Object obj)
    {
        onSuccess((CallStatus)obj);
    }

    ()
    {
        this$0 = SetupProfileActivity.this;
        super();
    }
}
