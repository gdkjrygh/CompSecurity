// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.util.async.activity;

import com.google.android.apps.wallet.util.async.AsyncCallback;

// Referenced classes of package com.google.android.apps.wallet.util.async.activity:
//            WalletTaskFragment

final class val.actionId
    implements AsyncCallback
{

    final WalletTaskFragment this$0;
    final String val$actionId;

    private void onSuccess(Object aobj[])
    {
        WalletTaskFragment.access$000(WalletTaskFragment.this, val$actionId, ((Object) (aobj)));
    }

    public final void onFailure(Exception exception)
    {
        WalletTaskFragment.access$100(WalletTaskFragment.this, val$actionId, exception);
    }

    public final volatile void onSuccess(Object obj)
    {
        onSuccess((Object[])obj);
    }

    ()
    {
        this$0 = final_wallettaskfragment;
        val$actionId = String.this;
        super();
    }
}
