// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;


// Referenced classes of package com.google.android.gms.wallet:
//            MaskedWalletRequest, Cart

public final class d
{

    final MaskedWalletRequest a;

    private d(MaskedWalletRequest maskedwalletrequest)
    {
        a = maskedwalletrequest;
        super();
    }

    d(MaskedWalletRequest maskedwalletrequest, byte byte0)
    {
        this(maskedwalletrequest);
    }

    public final d a()
    {
        a.b = true;
        return this;
    }

    public final d a(Cart cart)
    {
        a.h = cart;
        return this;
    }

    public final d a(String s)
    {
        a.e = s;
        return this;
    }

    public final d b()
    {
        a.c = false;
        return this;
    }

    public final d b(String s)
    {
        a.f = s;
        return this;
    }

    public final MaskedWalletRequest c()
    {
        return a;
    }

    public final d c(String s)
    {
        a.g = s;
        return this;
    }
}
