// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.log;


// Referenced classes of package com.google.android.apps.wallet.log:
//            WalletEventLogger

final class this._cls0
    implements Runnable
{

    final WalletEventLogger this$0;

    public final void run()
    {
        do
        {
            pollForNewEvent();
        } while (true);
    }

    ()
    {
        this$0 = WalletEventLogger.this;
        super();
    }
}
