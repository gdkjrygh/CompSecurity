// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.mywallet;

import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.util.async.AsyncCallback;

// Referenced classes of package com.google.android.apps.wallet.mywallet:
//            MyWalletManager, MyWalletEvent

final class this._cls0
    implements AsyncCallback
{

    final MyWalletManager this$0;

    private void onSuccess(com.google.wallet.proto.api..FetchMyWalletResponse fetchmywalletresponse)
    {
        while (fetchmywalletresponse == null || MyWalletManager.access$600(MyWalletManager.this) != null) 
        {
            return;
        }
        MyWalletManager.access$602(MyWalletManager.this, fetchmywalletresponse);
        MyWalletManager.access$700(MyWalletManager.this).post(new MyWalletEvent(fetchmywalletresponse.tileGroups));
    }

    public final void onFailure(Exception exception)
    {
        WLog.efmt(MyWalletManager.access$800(), "Error retrieving cached response from data store: %s", new Object[] {
            exception
        });
    }

    public final volatile void onSuccess(Object obj)
    {
        onSuccess((com.google.wallet.proto.api..FetchMyWalletResponse)obj);
    }

    etResponse()
    {
        this$0 = MyWalletManager.this;
        super();
    }
}
