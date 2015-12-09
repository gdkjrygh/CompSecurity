// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.wallet:
//            Cart, LineItem

public final class a
{

    final Cart a;

    private a(Cart cart)
    {
        a = cart;
        super();
    }

    a(Cart cart, byte byte0)
    {
        this(cart);
    }

    public final Cart a()
    {
        return a;
    }

    public final a a(LineItem lineitem)
    {
        a.c.add(lineitem);
        return this;
    }

    public final a a(String s)
    {
        a.a = s;
        return this;
    }

    public final a b(String s)
    {
        a.b = s;
        return this;
    }
}
