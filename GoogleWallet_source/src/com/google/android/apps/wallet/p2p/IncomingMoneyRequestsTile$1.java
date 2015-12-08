// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.p2p;

import android.app.Activity;
import android.view.View;
import com.google.android.apps.wallet.analytics.AnalyticsCustomDimension;
import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.android.apps.wallet.transfer.api.TransferApi;

// Referenced classes of package com.google.android.apps.wallet.p2p:
//            IncomingMoneyRequestsTile

final class this._cls0
    implements android.view.ngMoneyRequestsTile._cls1
{

    final IncomingMoneyRequestsTile this$0;

    public final void onClick(View view)
    {
        IncomingMoneyRequestsTile.access$000(IncomingMoneyRequestsTile.this).sendLinkTap("IncomingMoneyRequestsTile", new AnalyticsCustomDimension[0]);
        IncomingMoneyRequestsTile.access$200(IncomingMoneyRequestsTile.this).startActivity(IncomingMoneyRequestsTile.access$100(IncomingMoneyRequestsTile.this).createIncomingMoneyRequestListIntent());
    }

    on()
    {
        this$0 = IncomingMoneyRequestsTile.this;
        super();
    }
}
