// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.dogfood;

import android.content.DialogInterface;
import com.google.android.apps.wallet.config.sharedpreferences.SharedPreference;
import com.google.android.apps.wallet.ui.dialog.alert.AlertDialogFragment;
import com.google.common.base.Preconditions;

// Referenced classes of package com.google.android.apps.wallet.dogfood:
//            ConfidentialFilter

final class this._cls0
    implements android.content.ckListener
{

    final ConfidentialFilter this$0;

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        boolean flag;
        if (i == -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        SharedPreference.LAST_SEEN_CONFIDENTIAL_WARNING.put(ConfidentialFilter.access$000(ConfidentialFilter.this), ConfidentialFilter.access$100(ConfidentialFilter.this));
        ConfidentialFilter.access$200(ConfidentialFilter.this).dismiss();
        ConfidentialFilter.access$202(ConfidentialFilter.this, null);
    }

    agment()
    {
        this$0 = ConfidentialFilter.this;
        super();
    }
}
