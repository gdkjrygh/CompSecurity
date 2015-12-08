// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.android.vending.billing.IInAppBillingService;

final class anV extends aoo
{

    private final String e;

    anV(String s)
    {
        super(aot.e);
        e = s;
    }

    protected final String a()
    {
        return null;
    }

    final void a(IInAppBillingService iinappbillingservice, String s)
    {
        if (!b(iinappbillingservice.b(3, s, e)))
        {
            anK.a();
            a(new Object());
        }
    }
}
