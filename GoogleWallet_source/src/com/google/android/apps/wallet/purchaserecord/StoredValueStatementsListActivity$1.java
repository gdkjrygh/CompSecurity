// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.purchaserecord;

import android.content.DialogInterface;
import com.google.android.apps.wallet.api.UriIntents;
import com.google.android.apps.wallet.config.appcontrol.AppControl;
import com.google.android.apps.wallet.config.appcontrol.AppControlKey;

// Referenced classes of package com.google.android.apps.wallet.purchaserecord:
//            StoredValueStatementsListActivity

final class this._cls0
    implements android.content.ValueStatementsListActivity._cls1
{

    final StoredValueStatementsListActivity this$0;

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        if (i == -1)
        {
            dialoginterface = UriIntents.create(StoredValueStatementsListActivity.this, appControl.getString(AppControlKey.PDF_VIEWER_URL));
            startActivity(dialoginterface);
        }
    }

    ()
    {
        this$0 = StoredValueStatementsListActivity.this;
        super();
    }
}
