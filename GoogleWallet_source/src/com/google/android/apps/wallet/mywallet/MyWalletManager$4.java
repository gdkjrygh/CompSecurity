// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.mywallet;

import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.mywallet:
//            MyWalletManager, MyWalletStorageManager

final class this._cls0
    implements Callable
{

    final MyWalletManager this$0;

    private com.google.wallet.proto.api..FetchMyWalletResponse call()
        throws Exception
    {
        return (com.google.wallet.proto.api..FetchMyWalletResponse)MyWalletManager.access$500(MyWalletManager.this).get(new com.google.wallet.proto.api..FetchMyWalletResponse());
    }

    public final volatile Object call()
        throws Exception
    {
        return call();
    }

    etResponse()
    {
        this$0 = MyWalletManager.this;
        super();
    }
}
