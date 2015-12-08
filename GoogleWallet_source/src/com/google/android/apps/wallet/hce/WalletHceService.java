// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.hce;

import android.nfc.cardemulation.HostApduService;
import android.os.Bundle;
import com.google.android.apps.wallet.hce.tap.WalletHceContext;
import com.google.android.apps.wallet.userscope.UserInjector;

public class WalletHceService extends HostApduService
{

    public WalletHceService()
    {
    }

    private WalletHceContext getWalletHceContext()
    {
        return (WalletHceContext)UserInjector.get(com/google/android/apps/wallet/hce/tap/WalletHceContext, this);
    }

    public void onCreate()
    {
        super.onCreate();
        getWalletHceContext().initialize();
    }

    public void onDeactivated(int i)
    {
        getWalletHceContext().onDeactivated(this);
    }

    public void onDestroy()
    {
        super.onDestroy();
        getWalletHceContext().quiesce();
    }

    public byte[] processCommandApdu(byte abyte0[], Bundle bundle)
    {
        getWalletHceContext().processCommandApdu(abyte0, this);
        return null;
    }
}
