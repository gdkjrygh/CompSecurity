// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Bundle;
import com.google.android.gms.common.internal.zzu;

// Referenced classes of package com.google.android.gms.wallet:
//            PaymentMethodTokenizationParameters

public final class <init>
{

    final PaymentMethodTokenizationParameters a;

    public <init> a(int i)
    {
        a.a = i;
        return this;
    }

    public a a(String s, String s1)
    {
        zzu.a(s, "Tokenization parameter name must not be empty");
        zzu.a(s1, "Tokenization parameter value must not be empty");
        a.b.putString(s, s1);
        return this;
    }

    public PaymentMethodTokenizationParameters a()
    {
        return a;
    }

    private (PaymentMethodTokenizationParameters paymentmethodtokenizationparameters)
    {
        a = paymentmethodtokenizationparameters;
        super();
    }

    a(PaymentMethodTokenizationParameters paymentmethodtokenizationparameters, a a1)
    {
        this(paymentmethodtokenizationparameters);
    }
}
