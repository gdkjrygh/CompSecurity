// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util;

import android.text.TextUtils;
import com.skype.Account;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.GregorianCalendar;

public class SkypeCredit
{

    private Account a;
    private int b;
    private String c;
    private long d;

    public SkypeCredit(Account account)
    {
        a = account;
        a();
    }

    private static int a(long l)
    {
        l *= 1000L;
        GregorianCalendar gregoriancalendar = new GregorianCalendar();
        gregoriancalendar.setTimeInMillis(Calendar.getInstance().getTime().getTime());
        GregorianCalendar gregoriancalendar1 = new GregorianCalendar();
        gregoriancalendar1.setTimeInMillis(l);
        if (!gregoriancalendar1.after(gregoriancalendar))
        {
            return -1;
        }
        if (gregoriancalendar1.get(1) == gregoriancalendar.get(1))
        {
            return gregoriancalendar1.get(6) - gregoriancalendar.get(6);
        } else
        {
            return Math.round((float)(l - gregoriancalendar.getTimeInMillis()) / 8.64E+07F);
        }
    }

    public final void a()
    {
        b = a.getSkypeoutBalanceProp();
        c = a.getSkypeoutBalanceCurrencyProp();
        d = a.getCapabilityStatus(com.skype.Contact.CAPABILITY.CAPABILITY_SKYPEOUT).m_expiryTimestamp;
    }

    public final boolean b()
    {
        return b > 0;
    }

    public final int c()
    {
        return b;
    }

    public final long d()
    {
        return d;
    }

    public final boolean e()
    {
        return "FREECALL".equalsIgnoreCase(c);
    }

    public final boolean f()
    {
        int j = a(d);
        return j > 0 && j <= 30;
    }

    public final boolean g()
    {
        int j = a(d);
        return d > 0L && j < 0;
    }

    public final String h()
    {
        int j = b;
        String s = c;
        NumberFormat numberformat = i();
        float f1 = (float)j / 100F;
        if ("FREECALL".equalsIgnoreCase(s))
        {
            return numberformat.format(0L);
        } else
        {
            return numberformat.format(f1);
        }
    }

    public final NumberFormat i()
    {
        NumberFormat numberformat = NumberFormat.getCurrencyInstance();
        if (TextUtils.isEmpty(c) || "FREECALL".equalsIgnoreCase(c))
        {
            return numberformat;
        } else
        {
            numberformat.setCurrency(Currency.getInstance(c));
            return numberformat;
        }
    }
}
