// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.funding;

import android.view.View;
import com.google.android.apps.wallet.topup.api.TopUpApi;
import com.google.common.collect.ImmutableMap;

// Referenced classes of package com.google.android.apps.wallet.funding:
//            SelectFundingSourceActivity

final class this._cls0
    implements android.view.ctFundingSourceActivity._cls9
{

    final SelectFundingSourceActivity this$0;

    public final void onClick(View view)
    {
        view = TopUpApi.createFeeInfoActivityIntent(SelectFundingSourceActivity.this, ((Integer)SelectFundingSourceActivity.access$1000().get(Integer.valueOf(SelectFundingSourceActivity.access$900(SelectFundingSourceActivity.this)))).intValue());
        startActivity(view);
    }

    ()
    {
        this$0 = SelectFundingSourceActivity.this;
        super();
    }
}
