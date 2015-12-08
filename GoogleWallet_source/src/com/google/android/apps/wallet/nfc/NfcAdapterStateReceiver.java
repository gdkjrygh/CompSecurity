// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.nfc;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.wallet.userscope.WalletUserScopedBroadcastReceiver;

// Referenced classes of package com.google.android.apps.wallet.nfc:
//            NfcAdapterStateEventPublisher

public class NfcAdapterStateReceiver extends WalletUserScopedBroadcastReceiver
{

    NfcAdapterStateEventPublisher eventPublisher;

    public NfcAdapterStateReceiver()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        super.onReceive(context, intent);
        eventPublisher.updateNfcAdapterState();
    }
}
