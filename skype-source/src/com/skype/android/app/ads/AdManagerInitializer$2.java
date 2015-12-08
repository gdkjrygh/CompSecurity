// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.ads;

import com.skype.Account;
import java.util.logging.Logger;

// Referenced classes of package com.skype.android.app.ads:
//            AdManagerInitializer

final class val.account
    implements Runnable
{

    final AdManagerInitializer this$0;
    final Account val$account;

    public final void run()
    {
        AdManagerInitializer.access$200().info("initializeAdComponent ");
        AdManagerInitializer.access$300(AdManagerInitializer.this, val$account);
    }

    ()
    {
        this$0 = final_admanagerinitializer;
        val$account = Account.this;
        super();
    }
}
