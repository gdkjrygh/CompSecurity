// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.hce.tap;

import com.google.android.apps.wallet.base.java.System;
import com.google.android.apps.wallet.hce.emv.Ppse;
import com.google.android.apps.wallet.logging.WLog;

// Referenced classes of package com.google.android.apps.wallet.hce.tap:
//            WalletHceEventListener

final class this._cls0
    implements com.google.android.apps.wallet.hce.emv.this._cls0
{

    final WalletHceEventListener this$0;

    public final void onPpseSelect(Ppse ppse)
    {
        WLog.d(WalletHceEventListener.access$000(), "PPSE selected");
        WalletHceEventListener.access$100(WalletHceEventListener.this);
        ppse = WalletHceEventListener.this;
        System _tmp = WalletHceEventListener.access$200(WalletHceEventListener.this);
        WalletHceEventListener.access$300(ppse, System.currentTimeMillis(), 3);
    }

    ()
    {
        this$0 = WalletHceEventListener.this;
        super();
    }
}
