// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.usersetup;

import com.google.android.apps.wallet.util.async.AsyncCallback;
import com.google.android.gms.auth.UserRecoverableAuthException;

// Referenced classes of package com.google.android.apps.wallet.usersetup:
//            SetupProfileActivity

final class this._cls0
    implements AsyncCallback
{

    final SetupProfileActivity this$0;

    private void onSuccess(Boolean boolean1)
    {
        if (boolean1.booleanValue())
        {
            SetupProfileActivity.access$400(SetupProfileActivity.this);
            return;
        } else
        {
            SetupProfileActivity.access$500(SetupProfileActivity.this);
            return;
        }
    }

    public final void onFailure(Exception exception)
    {
        if (exception instanceof UserRecoverableAuthException)
        {
            return;
        } else
        {
            SetupProfileActivity.access$600(SetupProfileActivity.this);
            return;
        }
    }

    public final volatile void onSuccess(Object obj)
    {
        onSuccess((Boolean)obj);
    }

    ()
    {
        this$0 = SetupProfileActivity.this;
        super();
    }
}
