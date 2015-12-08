// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.fragment;


// Referenced classes of package com.google.android.gms.wallet.fragment:
//            WalletFragmentOptions, WalletFragmentStyle

public final class <init>
{

    final WalletFragmentOptions akD;

    public WalletFragmentOptions build()
    {
        return akD;
    }

    public akD setEnvironment(int i)
    {
        WalletFragmentOptions.a(akD, i);
        return this;
    }

    public akD setFragmentStyle(int i)
    {
        WalletFragmentOptions.a(akD, (new WalletFragmentStyle()).setStyleResourceId(i));
        return this;
    }

    public sourceId setFragmentStyle(WalletFragmentStyle walletfragmentstyle)
    {
        WalletFragmentOptions.a(akD, walletfragmentstyle);
        return this;
    }

    public akD setMode(int i)
    {
        WalletFragmentOptions.c(akD, i);
        return this;
    }

    public akD setTheme(int i)
    {
        WalletFragmentOptions.b(akD, i);
        return this;
    }

    private (WalletFragmentOptions walletfragmentoptions)
    {
        akD = walletfragmentoptions;
        super();
    }

    akD(WalletFragmentOptions walletfragmentoptions, akD akd)
    {
        this(walletfragmentoptions);
    }
}
