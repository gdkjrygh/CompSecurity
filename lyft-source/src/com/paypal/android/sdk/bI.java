// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk;

import android.util.Log;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Currency;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

// Referenced classes of package com.paypal.android.sdk:
//            bJ

public final class bI
{

    private static List a = Arrays.asList(new String[] {
        "AUD", "BRL", "CAD", "CHF", "CZK", "DKK", "EUR", "GBP", "HKD", "HUF", 
        "ILS", "JPY", "MXN", "MYR", "NOK", "NZD", "PHP", "PLN", "RUB", "SEK", 
        "SGD", "THB", "TWD", "TRY", "USD"
    });
    private static String b = "JPY, HUF, TWD";
    private static final Locale c;
    private static final Locale d;
    private static List e = null;
    private static NumberFormat f = null;

    public static String a(double d1, Currency currency)
    {
        Object obj = new DecimalFormat("0.00");
        ((DecimalFormat) (obj)).setCurrency(currency);
        String s;
        boolean flag;
        if (((DecimalFormat) (obj)).format(1.5600000000000001D).indexOf(".") > 0)
        {
            obj = ".";
        } else
        {
            obj = ",";
        }
        if (((String) (obj)).equals(","))
        {
            obj = (DecimalFormat)NumberFormat.getInstance(d);
        } else
        {
            obj = (DecimalFormat)NumberFormat.getInstance(c);
        }
        s = "#######0";
        if (b.indexOf(currency.getCurrencyCode().toUpperCase(Locale.US)) == -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        currency = s;
        if (flag)
        {
            currency = "#####0.00";
        }
        ((DecimalFormat) (obj)).applyPattern(currency);
        return ((DecimalFormat) (obj)).format(d1);
    }

    public static String a(Locale locale, double d1, Currency currency)
    {
        return a(locale, d1, currency, true);
    }

    private static String a(Locale locale, double d1, Currency currency, boolean flag)
    {
        boolean flag2 = true;
        if (f == null)
        {
            f = NumberFormat.getCurrencyInstance(locale);
        }
        f.setCurrency(currency);
        String s;
        String s1;
        StringBuilder stringbuilder;
        boolean flag1;
        if (f.format(1234.5599999999999D).indexOf("1") != 0)
        {
            flag1 = false;
        } else
        {
            flag1 = true;
        }
        if (!flag1)
        {
            flag1 = flag2;
        } else
        {
            flag1 = false;
        }
        s = currency.getSymbol();
        s1 = currency.getCurrencyCode();
        try
        {
            stringbuilder = new StringBuilder();
        }
        // Misplaced declaration of an exception variable
        catch (Locale locale)
        {
            return "";
        }
        if (flag1) goto _L2; else goto _L1
_L1:
        locale = (new StringBuilder()).append(s1).append(" ").toString();
_L4:
        stringbuilder = stringbuilder.append(locale);
        if (flag1)
        {
            locale = s;
        } else
        {
            locale = "";
        }
        currency = stringbuilder.append(locale).append(a(d1, currency));
        if (flag1)
        {
            break MISSING_BLOCK_LABEL_225;
        }
        locale = (new StringBuilder(" ")).append(s).toString();
_L5:
        currency = currency.append(locale);
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_191;
        }
        locale = (new StringBuilder(" ")).append(s1).toString();
_L3:
        return currency.append(locale).toString();
        locale = "";
          goto _L3
_L2:
        locale = "";
          goto _L4
        locale = "";
          goto _L5
    }

    public static boolean a(String s)
    {
        if (s == null)
        {
            return false;
        }
        boolean flag;
        try
        {
            s = Currency.getInstance(s);
            if (e != null)
            {
                break MISSING_BLOCK_LABEL_84;
            }
            e = new ArrayList();
            String s1;
            for (Iterator iterator = a.iterator(); iterator.hasNext(); e.add(Currency.getInstance(s1)))
            {
                s1 = (String)iterator.next();
            }

        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return false;
        }
        Collections.sort(e, new bJ());
        flag = e.contains(s);
        return flag;
    }

    public static boolean a(BigDecimal bigdecimal, String s, boolean flag)
    {
        if (bigdecimal == null)
        {
            Log.e("paypal.sdk", "The specified amount is null.");
            return false;
        }
        if (a(s) && Arrays.asList(new String[] {
    "HUF", "JPY", "TWD"
}).contains(s) && bigdecimal.scale() > 0)
        {
            Log.e("paypal.sdk", (new StringBuilder("The specified currency (")).append(s).append(") does not support fractional amounts.").toString());
            return false;
        } else
        {
            return true;
        }
    }

    static 
    {
        c = Locale.US;
        d = Locale.GERMANY;
    }
}
