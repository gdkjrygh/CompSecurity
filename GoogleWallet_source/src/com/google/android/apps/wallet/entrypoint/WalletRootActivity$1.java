// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.entrypoint;

import android.content.Intent;
import com.google.android.apps.wallet.api.UriRegistry;
import com.google.common.base.Supplier;

// Referenced classes of package com.google.android.apps.wallet.entrypoint:
//            WalletRootActivity

final class this._cls0
    implements Supplier
{

    final WalletRootActivity this$0;

    private Intent get()
    {
        return new Intent(uriRegistry.createIntent(2, new Object[0]));
    }

    public final volatile Object get()
    {
        return get();
    }

    ()
    {
        this$0 = WalletRootActivity.this;
        super();
    }
}
