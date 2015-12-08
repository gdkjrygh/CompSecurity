// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.p2p;

import android.support.v4.app.FragmentActivity;
import android.view.View;
import com.google.android.apps.wallet.purchaserecord.DeclineMoneyRequestDialog;
import com.google.android.apps.wallet.purchaserecord.PurchaseRecord;

// Referenced classes of package com.google.android.apps.wallet.p2p:
//            IncomingMoneyRequestView

final class val.purchaseRecord
    implements android.view.ingMoneyRequestView._cls3
{

    final IncomingMoneyRequestView this$0;
    final PurchaseRecord val$purchaseRecord;

    public final void onClick(View view)
    {
        DeclineMoneyRequestDialog.show(val$purchaseRecord, ((FragmentActivity)getContext()).getSupportFragmentManager());
    }

    estDialog()
    {
        this$0 = final_incomingmoneyrequestview;
        val$purchaseRecord = PurchaseRecord.this;
        super();
    }
}
