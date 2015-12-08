// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.bankaccount;

import android.view.KeyEvent;
import android.widget.TextView;

// Referenced classes of package com.google.android.apps.wallet.bankaccount:
//            ChallengeDepositActivity

final class this._cls0
    implements android.widget.ener
{

    final ChallengeDepositActivity this$0;

    public final boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
    {
        if (i == 6)
        {
            ChallengeDepositActivity.access$000(ChallengeDepositActivity.this);
            return true;
        } else
        {
            return false;
        }
    }

    ()
    {
        this$0 = ChallengeDepositActivity.this;
        super();
    }
}
