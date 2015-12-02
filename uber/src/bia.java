// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.wallet.MaskedWalletRequest;

public final class bia
{

    final MaskedWalletRequest a;

    private bia(MaskedWalletRequest maskedwalletrequest)
    {
        a = maskedwalletrequest;
        super();
    }

    public bia(MaskedWalletRequest maskedwalletrequest, byte byte0)
    {
        this(maskedwalletrequest);
    }

    public final bia a()
    {
        a.b = false;
        return this;
    }

    public final bia a(String s)
    {
        a.e = s;
        return this;
    }

    public final bia b()
    {
        a.c = false;
        return this;
    }

    public final bia b(String s)
    {
        a.f = s;
        return this;
    }

    public final bia c()
    {
        a.l = false;
        return this;
    }

    public final bia c(String s)
    {
        a.g = s;
        return this;
    }

    public final MaskedWalletRequest d()
    {
        return a;
    }
}
