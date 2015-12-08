// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.paymentcard.ui;

import android.app.Activity;
import android.content.Intent;
import com.google.android.apps.wallet.paymentcard.api.PaymentCardApi;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.paymentcard.ui:
//            AddressUpgradeRequiredDialog

final class val.activity
    implements Callable
{

    final AddressUpgradeRequiredDialog this$0;
    final Activity val$activity;

    private Intent call()
        throws Exception
    {
        return paymentCardApi.createEditCardIntent(val$activity, AddressUpgradeRequiredDialog.access$100(AddressUpgradeRequiredDialog.this));
    }

    public final volatile Object call()
        throws Exception
    {
        return call();
    }

    ()
    {
        this$0 = final_addressupgraderequireddialog;
        val$activity = Activity.this;
        super();
    }
}
