// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs;

import com.google.android.apps.wallet.ui.toast.Toasts;
import com.google.android.apps.wallet.util.async.AsyncCallback;

// Referenced classes of package com.google.android.apps.wallet.wobs:
//            PerWobNotificationSettingsActivity

final class this._cls0
    implements AsyncCallback
{

    final PerWobNotificationSettingsActivity this$0;

    private void onSuccess(Void void1)
    {
        Toasts.show(PerWobNotificationSettingsActivity.this, com.google.android.apps.walletnfcrel.pdate_succeeded);
    }

    public final void onFailure(Exception exception)
    {
        Toasts.show(PerWobNotificationSettingsActivity.this, com.google.android.apps.walletnfcrel.pdate_failed);
        PerWobNotificationSettingsActivity.access$300(PerWobNotificationSettingsActivity.this, PerWobNotificationSettingsActivity.access$400(PerWobNotificationSettingsActivity.this));
    }

    public final volatile void onSuccess(Object obj)
    {
        onSuccess((Void)obj);
    }

    ()
    {
        this$0 = PerWobNotificationSettingsActivity.this;
        super();
    }
}
