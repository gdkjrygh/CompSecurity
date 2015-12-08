// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.mywallet;

import com.google.android.apps.wallet.analytics.AnalyticsCustomDimension;
import com.google.android.apps.wallet.analytics.AnalyticsUtil;

// Referenced classes of package com.google.android.apps.wallet.mywallet:
//            MyWalletActivity

final class this._cls0
    implements android.support.v4.widget.OnRefreshListener
{

    final MyWalletActivity this$0;

    public final void onRefresh()
    {
        analyticsUtil.sendSwipe("RefreshWallet", new AnalyticsCustomDimension[0]);
        MyWalletActivity.access$000(MyWalletActivity.this);
    }

    ension()
    {
        this$0 = MyWalletActivity.this;
        super();
    }
}
