// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.kyc;

import android.content.DialogInterface;

// Referenced classes of package com.google.android.apps.wallet.kyc:
//            KycFlowActivity

final class this._cls0
    implements android.content.ClickListener
{

    final KycFlowActivity this$0;

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        switch (i)
        {
        default:
            return;

        case -1: 
            KycFlowActivity.access$000(KycFlowActivity.this);
            return;

        case -2: 
            setResult(0);
            finish();
            return;
        }
    }

    ()
    {
        this$0 = KycFlowActivity.this;
        super();
    }
}
