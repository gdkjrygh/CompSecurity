// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.common;

import com.google.b.ac;
import com.google.b.w;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

// Referenced classes of package com.dominos.android.sdk.common:
//            StringHelper

public class NumberUtil
{

    public NumberUtil()
    {
    }

    public static double convertJsonToDouble(w w1)
    {
        if ((w1 instanceof ac) && w1.j().k())
        {
            return w1.d();
        }
        double d;
        try
        {
            d = NumberFormat.getInstance(Locale.US).parse(w1.c()).doubleValue();
        }
        // Misplaced declaration of an exception variable
        catch (w w1)
        {
            return -1D;
        }
        return d;
    }

    public static String formatPhoneNumber(String s)
    {
        String s1 = s;
        if (s != null)
        {
            s1 = s;
            if (s.matches("\\d{3}-\\d{3}-\\d{4}"))
            {
                s1 = (new StringBuilder("(")).append(s.substring(0, 3)).append(") ").append(s.substring(4)).toString();
            }
        }
        return s1;
    }

    public static String formatPostalCode(String s)
    {
        return StringHelper.replace(s, "-", "");
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

    public static Double getRatio(int i, int j)
    {
        if (j != 0)
        {
            return Double.valueOf((double)i / (double)j);
        } else
        {
            return Double.valueOf(0.0D);
        }
    }

    public static boolean isDouble(String s)
    {
        return s != null && s.matches("^[0-9]+(\\.[0-9]+)?$");
    }

    public static boolean isInteger(String s)
    {
        return s != null && s.matches("^[0-9]+");
    }

    public static boolean isNegative(Double double1)
    {
        return double1 != null && double1.doubleValue() < 0.0D;
    }

    public static boolean isNegative(String s)
    {
        return s != null && s.matches("[-]\\d+");
    }

    public static boolean isNonNegativeDouble(Double double1)
    {
        return double1 != null && !isNegative(double1);
    }

    public static boolean isNonNegativeInt(Integer integer)
    {
        return integer != null && isNonNegativeDouble(Double.valueOf(integer.doubleValue()));
    }

    public static boolean isNumber(String s)
    {
        return isInteger(s) || isDouble(s);
    }

    public static boolean isPositive(Double double1)
    {
        return double1 != null && double1.doubleValue() > 0.0D;
    }

    public static boolean isPositive(String s)
    {
        return s != null && s.matches("[+]?\\d+");
    }

    public static boolean isZero(String s)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (s != null)
        {
            flag = flag1;
            if (isNumber(s))
            {
                flag = flag1;
                if (Double.valueOf(Double.parseDouble(s)).compareTo(Double.valueOf(0.0D)) == 0)
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public String doubleToCurrencyString(Double double1)
    {
        return (new DecimalFormat("#0.00", new DecimalFormatSymbols(Locale.US))).format(double1);
    }

    public double doubleToFormattedDouble(Double double1)
    {
        NumberFormat numberformat = NumberFormat.getInstance(Locale.ENGLISH);
        numberformat.setMaximumFractionDigits(2);
        numberformat.setGroupingUsed(false);
        return Double.parseDouble(numberformat.format(double1));
    }
}
