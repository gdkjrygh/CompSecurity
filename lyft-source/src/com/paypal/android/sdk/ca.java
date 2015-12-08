// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk;


// Referenced classes of package com.paypal.android.sdk:
//            ch, bm, bh, c

public final class ca extends ch
{

    private String a;

    public ca(bh bh, c c1, String s, String s1)
    {
        super(bm.h, bh, c1, s);
        a = s1;
    }

    public final String b()
    {
        return a;
    }

    public final void c()
    {
    }

    public final void d()
    {
        b(n());
    }

    public final String e()
    {
        return "mockDeleteCreditCardResponse";
    }
}
