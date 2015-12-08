// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.common;

import android.telephony.PhoneNumberUtils;
import com.dominos.android.sdk.core.models.LabsOrder;
import com.dominos.android.sdk.core.models.LabsPayment;
import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

// Referenced classes of package com.dominos.android.sdk.common:
//            StringHelper

public final class ExtrasUtil
{

    private static final String AM_STRING = "am";
    private static final String PM_STRING = "pm";

    public ExtrasUtil()
    {
    }

    public static boolean containsExpiredCreditCard(LabsOrder labsorder)
    {
        boolean flag;
        labsorder = labsorder.getPaymentList().iterator();
        flag = false;
_L2:
        LabsPayment labspayment;
        if (!labsorder.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        labspayment = (LabsPayment)labsorder.next();
        if (!StringHelper.equals(labspayment.getPaymentType(), "CreditCardToken"))
        {
            continue; /* Loop/switch isn't completed */
        }
        boolean flag1 = (new SimpleDateFormat("MMyy")).parse(labspayment.getExpiration()).before(new Date());
        if (flag1)
        {
            flag = true;
        }
        continue; /* Loop/switch isn't completed */
        ParseException parseexception;
        parseexception;
        flag = false;
        if (true) goto _L2; else goto _L1
_L1:
        return flag;
    }

    public static String formatPrice(Double double1)
    {
        if (double1 == null || double1.doubleValue() < 0.0D)
        {
            return "$-.--";
        } else
        {
            return String.format(Locale.US, "$%.2f", new Object[] {
                double1
            });
        }
    }

    public static String getFormattedDate(String s)
    {
        SimpleDateFormat simpledateformat = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
        Object obj = new DateFormatSymbols(Locale.US);
        ((DateFormatSymbols) (obj)).setWeekdays(new String[] {
            "", "SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"
        });
        obj = new SimpleDateFormat("EEEE MM/dd", ((DateFormatSymbols) (obj)));
        try
        {
            s = ((SimpleDateFormat) (obj)).format(simpledateformat.parse(s));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return "";
        }
        return s;
    }

    public static String getFormattedPhoneNumber(String s)
    {
        return PhoneNumberUtils.formatNumber(s);
    }

    public static String getTimeString(long l)
    {
        if (l == 0L)
        {
            return "";
        }
        GregorianCalendar gregoriancalendar = new GregorianCalendar();
        gregoriancalendar.setTimeInMillis(l);
        int j = gregoriancalendar.get(10);
        int i = j;
        if (j == 0)
        {
            i = 12;
        }
        String s = (new StringBuilder()).append(i).append(":").toString();
        i = gregoriancalendar.get(12);
        if (i < 10)
        {
            s = (new StringBuilder()).append(s).append("0").append(i).toString();
        } else
        {
            s = (new StringBuilder()).append(s).append(i).toString();
        }
        switch (gregoriancalendar.get(9))
        {
        default:
            return s;

        case 0: // '\0'
            return (new StringBuilder()).append(s).append("am").toString();

        case 1: // '\001'
            return (new StringBuilder()).append(s).append("pm").toString();
        }
    }

    public static boolean isSupportedPayment(LabsOrder labsorder)
    {
        for (labsorder = labsorder.getPaymentList().iterator(); labsorder.hasNext();)
        {
            LabsPayment labspayment = (LabsPayment)labsorder.next();
            if (StringHelper.equals(labspayment.getPaymentType(), "CreditCardToken") || StringHelper.equals(labspayment.getPaymentType(), "Cash"))
            {
                return true;
            }
        }

        return false;
    }

    public static String removeDashes(String s)
    {
        return s.replaceAll("\\-", "");
    }
}
