// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.payments;

import com.paypal.android.sdk.aq;

// Referenced classes of package com.paypal.android.sdk.payments:
//            PayPalService

final class al
{

    Integer a;
    String b;

    al(PayPalService paypalservice, String s, Integer integer, String s1)
    {
        b = s;
        a = integer;
    }

    final boolean a()
    {
        return a != null && a.equals(Integer.valueOf(401));
    }

    final boolean b()
    {
        return a() && b.equals("2fa_required");
    }

    final boolean c()
    {
        return b.equals(aq.b.toString());
    }
}
