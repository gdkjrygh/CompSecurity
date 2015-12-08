// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.settings.ui;

import com.google.android.apps.wallet.api.InternalIntents;
import com.google.android.apps.wallet.ui.listener.OnActionListener;

// Referenced classes of package com.google.android.apps.wallet.settings.ui:
//            SettingsActivity, NotificationSettingsActivity

final class this._cls0
    implements OnActionListener
{

    final SettingsActivity this$0;

    private void onAction(Void void1)
    {
        startActivity(InternalIntents.forClass(SettingsActivity.this, com/google/android/apps/wallet/settings/ui/NotificationSettingsActivity));
    }

    public final volatile void onAction(Object obj)
    {
        onAction((Void)obj);
    }

    sActivity()
    {
        this$0 = SettingsActivity.this;
        super();
    }
}
