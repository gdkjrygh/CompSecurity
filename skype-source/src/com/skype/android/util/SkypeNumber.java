// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util;

import com.skype.Account;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class SkypeNumber
{

    private long a;

    public SkypeNumber(Account account)
    {
        a = (long)account.getCapabilityStatus(com.skype.Contact.CAPABILITY.CAPABILITY_SKYPEIN).m_expiryTimestamp * 1000L;
    }

    private static int a(long l)
    {
        GregorianCalendar gregoriancalendar;
label0:
        {
            int i = -1;
            gregoriancalendar = new GregorianCalendar();
            gregoriancalendar.setTimeInMillis(Calendar.getInstance().getTime().getTime());
            GregorianCalendar gregoriancalendar1 = new GregorianCalendar();
            gregoriancalendar1.setTimeInMillis(l);
            if (gregoriancalendar1.after(gregoriancalendar))
            {
                if (gregoriancalendar1.get(1) != gregoriancalendar.get(1))
                {
                    break label0;
                }
                i = gregoriancalendar1.get(6) - gregoriancalendar.get(6);
            }
            return i;
        }
        return Math.round((float)(l - gregoriancalendar.getTimeInMillis()) / 8.64E+07F);
    }

    public final boolean a()
    {
        int i = a(a);
        return 0L < a && i > 0 && i <= 30;
    }

    public final boolean b()
    {
        return 0L < a && a(a) <= 0;
    }
}
