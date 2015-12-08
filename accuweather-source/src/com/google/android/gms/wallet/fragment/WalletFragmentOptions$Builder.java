// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.fragment;


// Referenced classes of package com.google.android.gms.wallet.fragment:
//            WalletFragmentOptions, WalletFragmentStyle

public final class <init>
{

    final WalletFragmentOptions akA;

    public WalletFragmentOptions build()
    {
        return akA;
    }

    public akA setEnvironment(int i)
    {
        WalletFragmentOptions.a(akA, i);
        return this;
    }

    public akA setFragmentStyle(int i)
    {
        WalletFragmentOptions.a(akA, (new WalletFragmentStyle()).setStyleResourceId(i));
        return this;
    }

    public sourceId setFragmentStyle(WalletFragmentStyle walletfragmentstyle)
    {
        WalletFragmentOptions.a(akA, walletfragmentstyle);
        return this;
    }

    public akA setMode(int i)
    {
        WalletFragmentOptions.c(akA, i);
        return this;
    }

    public akA setTheme(int i)
    {
        WalletFragmentOptions.b(akA, i);
        return this;
    }

    private (WalletFragmentOptions walletfragmentoptions)
    {
        akA = walletfragmentoptions;
        super();
    }

    akA(WalletFragmentOptions walletfragmentoptions, akA aka)
    {
        this(walletfragmentoptions);
    }
}
