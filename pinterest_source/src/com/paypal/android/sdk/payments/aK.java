// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.payments;

import com.paypal.android.sdk.aB;
import com.paypal.android.sdk.aE;
import com.paypal.android.sdk.bB;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

// Referenced classes of package com.paypal.android.sdk.payments:
//            PayPalService

final class aK
{

    private PayPalService a;
    private String b;

    public aK(PayPalService paypalservice)
    {
        a = paypalservice;
        b = Integer.toString((new GregorianCalendar()).getTimeZone().getRawOffset() / 1000 / 60);
    }

    public final bB a()
    {
        return a.c();
    }

    public final void a(aE ae)
    {
        a.a(ae);
    }

    public final String b()
    {
        return a.f();
    }

    public final aB c()
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
        return a.r();
    }
}
