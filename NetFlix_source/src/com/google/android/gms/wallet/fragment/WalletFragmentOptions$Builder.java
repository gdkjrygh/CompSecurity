// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.fragment;


// Referenced classes of package com.google.android.gms.wallet.fragment:
//            WalletFragmentOptions, WalletFragmentStyle

public final class <init>
{

    final WalletFragmentOptions acS;

    public WalletFragmentOptions build()
    {
        return acS;
    }

    public acS setEnvironment(int i)
    {
        WalletFragmentOptions.a(acS, i);
        return this;
    }

    public acS setFragmentStyle(int i)
    {
        WalletFragmentOptions.a(acS, (new WalletFragmentStyle()).setStyleResourceId(i));
        return this;
    }

    public sourceId setFragmentStyle(WalletFragmentStyle walletfragmentstyle)
    {
        WalletFragmentOptions.a(acS, walletfragmentstyle);
        return this;
    }

    public acS setMode(int i)
    {
        WalletFragmentOptions.c(acS, i);
        return this;
    }

    public acS setTheme(int i)
    {
        WalletFragmentOptions.b(acS, i);
        return this;
    }

    private (WalletFragmentOptions walletfragmentoptions)
    {
        acS = walletfragmentoptions;
        super();
    }

    acS(WalletFragmentOptions walletfragmentoptions, acS acs)
    {
        this(walletfragmentoptions);
    }
}
