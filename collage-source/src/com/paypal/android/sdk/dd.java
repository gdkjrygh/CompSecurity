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
//            de

public final class dd
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

    private static int a(Locale locale, Currency currency)
    {
        if (f == null)
        {
            f = NumberFormat.getCurrencyInstance(locale);
        }
        f.setCurrency(currency);
        return f.format(1234.5599999999999D).indexOf("1") == 0 ? 1 : 0;
    }

    public static String a(double d1, String s)
    {
        return a(d1, s, (DecimalFormat)NumberFormat.getInstance(c));
    }

    private static String a(double d1, String s, DecimalFormat decimalformat)
    {
        String s1 = "#######0";
        boolean flag;
        if (b.indexOf(s.toUpperCase(Locale.US)) == -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        s = s1;
        if (flag)
        {
            s = "#####0.00";
        }
        decimalformat.applyPattern(s);
        return decimalformat.format(d1);
    }

    public static String a(double d1, Currency currency)
    {
        DecimalFormat decimalformat;
        String s;
        boolean flag;
        if (a(currency).equals(","))
        {
            decimalformat = (DecimalFormat)NumberFormat.getInstance(d);
        } else
        {
            decimalformat = (DecimalFormat)NumberFormat.getInstance(c);
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
        decimalformat.applyPattern(currency);
        return decimalformat.format(d1);
    }

    private static String a(Currency currency)
    {
        DecimalFormat decimalformat = new DecimalFormat("0.00");
        decimalformat.setCurrency(currency);
        if (decimalformat.format(1.5600000000000001D).indexOf(".") > 0)
        {
            return ".";
        } else
        {
            return ",";
        }
    }

    public static String a(Locale locale, double d1, Currency currency)
    {
        return a(locale, d1, currency, true);
    }

    private static String a(Locale locale, double d1, Currency currency, boolean flag)
    {
        String s;
        String s1;
        StringBuilder stringbuilder;
        boolean flag1;
        if (a(locale, currency) == 0)
        {
            flag1 = true;
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
            break MISSING_BLOCK_LABEL_178;
        }
        locale = (new StringBuilder(" ")).append(s).toString();
_L5:
        currency = currency.append(locale);
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_150;
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

    public static String a(Locale locale, String s, double d1, String s1, boolean flag)
    {
        String s2 = Currency.getInstance(s1).getSymbol();
        StringBuilder stringbuilder;
        boolean flag1;
        if (a(locale, Currency.getInstance(s1)) == 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        stringbuilder = new StringBuilder();
        if (flag1)
        {
            locale = (new StringBuilder()).append(s2).append(" ").toString();
        } else
        {
            locale = "";
        }
        stringbuilder = stringbuilder.append(locale);
        if (s.equalsIgnoreCase("AU"))
        {
            locale = "AUD";
        } else
        if (s.equalsIgnoreCase("GB"))
        {
            locale = "GBP";
        } else
        if (s.equalsIgnoreCase("UK"))
        {
            locale = "GBP";
        } else
        if (s.equalsIgnoreCase("CA"))
        {
            locale = "CAD";
        } else
        if (s.equalsIgnoreCase("AT"))
        {
            locale = "EUR";
        } else
        if (s.equalsIgnoreCase("CZ"))
        {
            locale = "CZK";
        } else
        if (s.equalsIgnoreCase("DK"))
        {
            locale = "DKK";
        } else
        if (s.equalsIgnoreCase("FR"))
        {
            locale = "EUR";
        } else
        if (s.equalsIgnoreCase("DE"))
        {
            locale = "EUR";
        } else
        if (s.equalsIgnoreCase("HU"))
        {
            locale = "HUF";
        } else
        if (s.equalsIgnoreCase("IE"))
        {
            locale = "EUR";
        } else
        if (s.equalsIgnoreCase("IT"))
        {
            locale = "EUR";
        } else
        if (s.equalsIgnoreCase("NL"))
        {
            locale = "EUR";
        } else
        if (s.equalsIgnoreCase("PL"))
        {
            locale = "PLN";
        } else
        if (s.equalsIgnoreCase("PT"))
        {
            locale = "EUR";
        } else
        if (s.equalsIgnoreCase("ES"))
        {
            locale = "EUR";
        } else
        if (s.equalsIgnoreCase("SE"))
        {
            locale = "SEK";
        } else
        {
label0:
            {
                if (s.equalsIgnoreCase("ZA"))
                {
                    break label0;
                }
                if (s.equalsIgnoreCase("NZ"))
                {
                    locale = "NZD";
                } else
                if (s.equalsIgnoreCase("LT"))
                {
                    locale = "EUR";
                } else
                if (s.equalsIgnoreCase("JP"))
                {
                    locale = "JPY";
                } else
                if (s.equalsIgnoreCase("BR"))
                {
                    locale = "BRL";
                } else
                if (s.equalsIgnoreCase("MY"))
                {
                    locale = "MYR";
                } else
                if (s.equalsIgnoreCase("MX"))
                {
                    locale = "MXN";
                } else
                {
                    if (!s.equalsIgnoreCase("RU"))
                    {
                        break label0;
                    }
                    locale = "RUB";
                }
            }
        }
_L1:
        if (a(Currency.getInstance(locale)).equals(","))
        {
            locale = (DecimalFormat)NumberFormat.getInstance(d);
        } else
        {
            locale = (DecimalFormat)NumberFormat.getInstance(c);
        }
        s = stringbuilder.append(a(d1, s1, ((DecimalFormat) (locale))));
        if (!flag1)
        {
            locale = (new StringBuilder()).append(" ").append(s2).toString();
        } else
        {
            locale = "";
        }
        return s.append(locale).toString();
        locale = "USD";
          goto _L1
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
        Collections.sort(e, new de());
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
        if (flag && BigDecimal.ZERO.compareTo(bigdecimal) != -1)
        {
            Log.e("paypal.sdk", "The specified amount must be greater than zero.");
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
