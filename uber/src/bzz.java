// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.paypal.android.sdk.payments.PayPalService;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

final class bzz
{

    private PayPalService a;
    private String b;

    public bzz(PayPalService paypalservice)
    {
        a = paypalservice;
        b = Integer.toString((new GregorianCalendar()).getTimeZone().getRawOffset() / 1000 / 60);
    }

    public final buq a()
    {
        return a.c();
    }

    public final void a(bqz bqz)
    {
        a.a(bqz);
    }

    public final String b()
    {
        return a.f();
    }

    public final bsv c()
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
