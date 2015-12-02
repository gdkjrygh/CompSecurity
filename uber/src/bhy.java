// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.wallet.Cart;
import com.google.android.gms.wallet.FullWalletRequest;

public final class bhy
{

    final FullWalletRequest a;

    private bhy(FullWalletRequest fullwalletrequest)
    {
        a = fullwalletrequest;
        super();
    }

    public bhy(FullWalletRequest fullwalletrequest, byte byte0)
    {
        this(fullwalletrequest);
    }

    public final bhy a(Cart cart)
    {
        a.c = cart;
        return this;
    }

    public final bhy a(String s)
    {
        a.a = s;
        return this;
    }

    public final FullWalletRequest a()
    {
        return a;
    }

    public final bhy b(String s)
    {
        a.b = s;
        return this;
    }
}
