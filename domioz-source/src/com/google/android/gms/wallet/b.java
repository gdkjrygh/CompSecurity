// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;


// Referenced classes of package com.google.android.gms.wallet:
//            FullWalletRequest, Cart

public final class b
{

    final FullWalletRequest a;

    private b(FullWalletRequest fullwalletrequest)
    {
        a = fullwalletrequest;
        super();
    }

    b(FullWalletRequest fullwalletrequest, byte byte0)
    {
        this(fullwalletrequest);
    }

    public final FullWalletRequest a()
    {
        return a;
    }

    public final b a(Cart cart)
    {
        a.c = cart;
        return this;
    }

    public final b a(String s)
    {
        a.a = s;
        return this;
    }
}
