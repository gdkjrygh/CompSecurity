// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.wallet.Cart;
import com.google.android.gms.wallet.LineItem;
import java.util.ArrayList;

public final class bhx
{

    final Cart a;

    private bhx(Cart cart)
    {
        a = cart;
        super();
    }

    public bhx(Cart cart, byte byte0)
    {
        this(cart);
    }

    public final bhx a(LineItem lineitem)
    {
        a.c.add(lineitem);
        return this;
    }

    public final bhx a(String s)
    {
        a.a = s;
        return this;
    }

    public final Cart a()
    {
        return a;
    }

    public final bhx b(String s)
    {
        a.b = s;
        return this;
    }
}
