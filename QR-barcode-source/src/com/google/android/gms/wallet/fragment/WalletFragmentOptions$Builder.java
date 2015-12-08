// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.fragment;


// Referenced classes of package com.google.android.gms.wallet.fragment:
//            WalletFragmentOptions, WalletFragmentStyle

public final class <init>
{

    final WalletFragmentOptions aun;

    public WalletFragmentOptions build()
    {
        return aun;
    }

    public aun setEnvironment(int i)
    {
        WalletFragmentOptions.a(aun, i);
        return this;
    }

    public aun setFragmentStyle(int i)
    {
        WalletFragmentOptions.a(aun, (new WalletFragmentStyle()).setStyleResourceId(i));
        return this;
    }

    public sourceId setFragmentStyle(WalletFragmentStyle walletfragmentstyle)
    {
        WalletFragmentOptions.a(aun, walletfragmentstyle);
        return this;
    }

    public aun setMode(int i)
    {
        WalletFragmentOptions.c(aun, i);
        return this;
    }

    public aun setTheme(int i)
    {
        WalletFragmentOptions.b(aun, i);
        return this;
    }

    private (WalletFragmentOptions walletfragmentoptions)
    {
        aun = walletfragmentoptions;
        super();
    }

    aun(WalletFragmentOptions walletfragmentoptions, aun aun1)
    {
        this(walletfragmentoptions);
    }
}
