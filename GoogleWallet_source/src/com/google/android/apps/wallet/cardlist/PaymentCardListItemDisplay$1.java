// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.cardlist;

import android.content.Context;
import android.content.Intent;
import android.view.View;

// Referenced classes of package com.google.android.apps.wallet.cardlist:
//            PaymentCardListItemDisplay

final class this._cls0
    implements android.view.ymentCardListItemDisplay._cls1
{

    final PaymentCardListItemDisplay this$0;

    public final void onClick(View view)
    {
        view = (Intent)PaymentCardListItemDisplay.access$000(PaymentCardListItemDisplay.this).getTag(com.google.android.apps.walletnfcrel.ey);
        PaymentCardListItemDisplay.access$100(PaymentCardListItemDisplay.this).startActivity(view);
    }

    ()
    {
        this$0 = PaymentCardListItemDisplay.this;
        super();
    }
}
