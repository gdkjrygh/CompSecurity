// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.p2p;

import android.view.View;
import com.google.android.apps.wallet.api.UriRegistry;

// Referenced classes of package com.google.android.apps.wallet.p2p:
//            ClaimMoneyResultsActivity

final class this._cls0
    implements android.view.oneyResultsActivity._cls3
{

    final ClaimMoneyResultsActivity this$0;

    public final void onClick(View view)
    {
        startActivity(uriRegistry.createIntent(4000, new Object[0]));
    }

    ()
    {
        this$0 = ClaimMoneyResultsActivity.this;
        super();
    }
}
