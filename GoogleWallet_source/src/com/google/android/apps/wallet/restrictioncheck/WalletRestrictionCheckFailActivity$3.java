// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.restrictioncheck;

import android.content.DialogInterface;
import com.google.android.apps.wallet.api.QuitIntent;

// Referenced classes of package com.google.android.apps.wallet.restrictioncheck:
//            WalletRestrictionCheckFailActivity

final class this._cls0
    implements android.content.tRestrictionCheckFailActivity._cls3
{

    final WalletRestrictionCheckFailActivity this$0;

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        startActivity(QuitIntent.create());
        finish();
    }

    ()
    {
        this$0 = WalletRestrictionCheckFailActivity.this;
        super();
    }
}
