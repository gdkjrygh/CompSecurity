// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.storedvalue;

import android.view.View;
import com.google.android.apps.wallet.analytics.AnalyticsCustomDimension;
import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.android.apps.wallet.api.UriRegistry;

// Referenced classes of package com.google.android.apps.wallet.storedvalue:
//            BalanceHeader

final class this._cls0
    implements android.view.ener
{

    final BalanceHeader this$0;

    public final void onClick(View view)
    {
        view = BalanceHeader.access$000(BalanceHeader.this).createIntent(4000, new Object[0]);
        BalanceHeader.access$200(BalanceHeader.this, view, BalanceHeader.access$100(BalanceHeader.this));
        BalanceHeader.access$300(BalanceHeader.this).sendButtonTap("OpenSendMoney", new AnalyticsCustomDimension[0]);
        BalanceHeader.access$300(BalanceHeader.this).startTiming("OpenSendMoney", "user_open_send_money");
    }

    ension()
    {
        this$0 = BalanceHeader.this;
        super();
    }
}
