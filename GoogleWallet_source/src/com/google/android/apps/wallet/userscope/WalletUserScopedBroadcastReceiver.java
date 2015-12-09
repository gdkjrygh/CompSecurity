// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.userscope;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.google.android.apps.wallet.userscope:
//            UserInjector

public class WalletUserScopedBroadcastReceiver extends BroadcastReceiver
{

    public WalletUserScopedBroadcastReceiver()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        UserInjector.inject(this, context);
    }
}
