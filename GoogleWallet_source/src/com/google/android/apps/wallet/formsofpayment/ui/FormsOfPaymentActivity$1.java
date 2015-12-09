// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.formsofpayment.ui;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package com.google.android.apps.wallet.formsofpayment.ui:
//            FormsOfPaymentActivity

final class this._cls0
    implements android.widget.stener
{

    final FormsOfPaymentActivity this$0;

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = (Intent)view.getTag(com.google.android.apps.walletnfcrel.TagKey);
        startActivity(adapterview);
    }

    ()
    {
        this$0 = FormsOfPaymentActivity.this;
        super();
    }
}
