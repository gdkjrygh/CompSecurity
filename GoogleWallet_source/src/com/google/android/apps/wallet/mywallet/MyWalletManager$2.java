// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.mywallet;

import com.google.android.apps.wallet.eventbus.EventHandler;
import com.google.android.apps.wallet.refresh.RequestRefreshEvent;
import com.google.android.apps.wallet.util.async.ActionExecutor;

// Referenced classes of package com.google.android.apps.wallet.mywallet:
//            MyWalletManager

final class this._cls0
    implements EventHandler
{

    final MyWalletManager this$0;

    private void handleEvent(RequestRefreshEvent requestrefreshevent)
    {
        MyWalletManager.access$300(MyWalletManager.this).executeAction(MyWalletManager.access$100(MyWalletManager.this), MyWalletManager.access$200(MyWalletManager.this));
    }

    public final volatile void handleEvent(Object obj)
    {
        handleEvent((RequestRefreshEvent)obj);
    }

    ()
    {
        this$0 = MyWalletManager.this;
        super();
    }
}
