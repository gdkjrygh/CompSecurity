// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.payments;

import com.paypal.android.sdk.ah;
import com.paypal.android.sdk.cl;
import com.paypal.android.sdk.ed;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

// Referenced classes of package com.paypal.android.sdk.payments:
//            PayPalService

final class ao
{

    private PayPalService a;
    private String b;

    public ao(PayPalService paypalservice)
    {
        a = paypalservice;
        b = Integer.toString((new GregorianCalendar()).getTimeZone().getRawOffset() / 1000 / 60);
    }

    public final ed a()
    {
        return a.c();
    }

    public final void a(ah ah)
    {
        a.a(ah);
    }

    public final String b()
    {
        return a.f();
    }

    public final cl c()
    {
        return a.b();
    }

    public final String d()
    {
        return a.e();
    }

    public final String e()
    {
        return b;
    }

    public final String f()
    {
        return a.v();
    }
}
