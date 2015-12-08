// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.base.activity;

import android.content.Intent;
import com.google.common.base.Supplier;

// Referenced classes of package com.google.android.apps.wallet.base.activity:
//            WalletActivity

final class this._cls0
    implements Supplier
{

    final WalletActivity this$0;

    private Intent get()
    {
        Intent intent = new Intent(getIntent());
        intent.setFlags(intent.getFlags() & 0xefffffff);
        return intent;
    }

    public final volatile Object get()
    {
        return get();
    }

    ()
    {
        this$0 = WalletActivity.this;
        super();
    }
}
