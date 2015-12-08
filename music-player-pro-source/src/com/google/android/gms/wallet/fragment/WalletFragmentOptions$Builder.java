// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.fragment;


// Referenced classes of package com.google.android.gms.wallet.fragment:
//            WalletFragmentOptions, WalletFragmentStyle

public final class <init>
{

    final WalletFragmentOptions awx;

    public WalletFragmentOptions build()
    {
        return awx;
    }

    public awx setEnvironment(int i)
    {
        WalletFragmentOptions.a(awx, i);
        return this;
    }

    public awx setFragmentStyle(int i)
    {
        WalletFragmentOptions.a(awx, (new WalletFragmentStyle()).setStyleResourceId(i));
        return this;
    }

    public sourceId setFragmentStyle(WalletFragmentStyle walletfragmentstyle)
    {
        WalletFragmentOptions.a(awx, walletfragmentstyle);
        return this;
    }

    public awx setMode(int i)
    {
        WalletFragmentOptions.c(awx, i);
        return this;
    }

    public awx setTheme(int i)
    {
        WalletFragmentOptions.b(awx, i);
        return this;
    }

    private (WalletFragmentOptions walletfragmentoptions)
    {
        awx = walletfragmentoptions;
        super();
    }

    awx(WalletFragmentOptions walletfragmentoptions, awx awx1)
    {
        this(walletfragmentoptions);
    }
}
