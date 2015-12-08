// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.settings.ui;

import android.content.DialogInterface;
import com.google.android.apps.wallet.api.UriRegistry;

// Referenced classes of package com.google.android.apps.wallet.settings.ui:
//            NotificationSettingsActivity

final class this._cls0
    implements android.content.
{

    final NotificationSettingsActivity this$0;

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        if (i == -1)
        {
            startActivity(uriRegistry.createIntent(10000, new Object[0]));
        }
    }

    ()
    {
        this$0 = NotificationSettingsActivity.this;
        super();
    }
}
