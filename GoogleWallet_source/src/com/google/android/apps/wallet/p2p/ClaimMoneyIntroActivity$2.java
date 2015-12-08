// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.p2p;

import com.google.android.apps.wallet.util.async.AsyncCallback;
import com.google.android.apps.wallet.widgets.progressspinner.FullScreenProgressSpinnerManager;

// Referenced classes of package com.google.android.apps.wallet.p2p:
//            ClaimMoneyIntroActivity

final class this._cls0
    implements AsyncCallback
{

    final ClaimMoneyIntroActivity this$0;

    private void onSuccess(Boolean boolean1)
    {
        ClaimMoneyIntroActivity.access$002(ClaimMoneyIntroActivity.this, boolean1.booleanValue());
        spinnerManager.hide();
        ClaimMoneyIntroActivity.access$100(ClaimMoneyIntroActivity.this);
    }

    public final void onFailure(Exception exception)
    {
        spinnerManager.hide();
        ClaimMoneyIntroActivity.access$002(ClaimMoneyIntroActivity.this, false);
        ClaimMoneyIntroActivity.access$100(ClaimMoneyIntroActivity.this);
    }

    public final volatile void onSuccess(Object obj)
    {
        onSuccess((Boolean)obj);
    }

    reenProgressSpinnerManager()
    {
        this$0 = ClaimMoneyIntroActivity.this;
        super();
    }
}
