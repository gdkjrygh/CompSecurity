// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.wallet.util;

import android.text.TextUtils;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;
import java.util.Locale;

public class DateUtils
{

    public static final String BIRTHDAT_FORMAT = "MM/dd";
    public static final String DATE_DASH_FORMAT = "yyyy-MM-dd";
    public static final String DATE_FORMAT = "MM/dd/yyyy";
    public static final String DATE_STRING_FORMAT = "MMM dd, yyyy";
    public static final String DATE_TIME_FORMAT = "yyyy-MM-dd'T'hh:mm:ss";
    public static final String DATE_TIME_STRING_FORMAT = "yyyy-MM-dd'T'hh:mm:ss.SSS";
    public static final String DATE_YEAR_FORMAT = "MM/dd/yy";
    public static final String MONTH_YEAR_FORMAT = "MMM, yyyy";

    public DateUtils()
    {
    }

    public static String convertStringToTitleCase(String s)
    {
        String s1 = s;
        if (!TextUtils.isEmpty(s))
        {
            s1 = (new StringBuilder()).append(Character.toUpperCase(s.charAt(0))).append(s.substring(1).toLowerCase()).toString();
        }
        return s1;
    }

    public static String formatPriceTxt(String s)
    {
        (new DecimalFormat("0.00")).format(Double.valueOf(s));
        return s.replaceFirst("\\.00+$", "");
    }

    public static String formatPriceTxtforkcTotal(Float float1)
    {
        Formatter formatter = new Formatter();
        float1 = formatter.format("%.2f", new Object[] {
            float1
        }).toString();
        formatter.close();
        return float1;
    }

    public static Long getDateInMiliSeconds(String s)
    {
        String s1 = s;
        if (s == null)
        {
            s1 = "1398402000000";
        }
        long l;
        try
        {
            l = (new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss", Locale.ENGLISH)).parse(s1).getTime();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return Long.valueOf(0L);
        }
        return Long.valueOf(l);
    }

    public static String prepareBirthDate(String s)
    {
        Date date;
        try
        {
            date = (new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH)).parse(s);
        }
        catch (ParseException parseexception)
        {
            parseexception.printStackTrace();
            return s;
        }
        return (new SimpleDateFormat("MM/dd", Locale.getDefault())).format(Long.valueOf(date.getTime()));
    }

    public static String prepareDate(String s)
    {
        String s1 = s;
        if (s == null)
        {
            s1 = "1398402000000";
        }
        s = new SimpleDateFormat("MMM dd, yyyy", Locale.getDefault());
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(Long.parseLong(s1));
        return s.format(calendar.getTime());
    }

    public static String prepareDateFromString(String s)
    {
        Object obj;
        try
        {
            obj = (new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss.SSS", Locale.ENGLISH)).parse(s);
            obj = (new SimpleDateFormat("MM/dd/yyyy", Locale.getDefault())).format(Long.valueOf(((Date) (obj)).getTime()));
        }
        catch (ParseException parseexception)
        {
            parseexception.printStackTrace();
            return s;
        }
        return ((String) (obj));
    }

    public static String prepareDateInNumberFormat(String s)
    {
        SimpleDateFormat simpledateformat = new SimpleDateFormat("MM/dd/yyyy", Locale.getDefault());
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(Long.parseLong(s));
        return simpledateformat.format(calendar.getTime());
    }

    public static String prepareDateWithFormat(String s)
    {
        Object obj;
        try
        {
            obj = (new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss.SSS", Locale.ENGLISH)).parse(s);
            obj = (new SimpleDateFormat("MMM dd, yyyy", Locale.getDefault())).format(Long.valueOf(((Date) (obj)).getTime()));
        }
        catch (ParseException parseexception)
        {
            Object obj1 = null;
            try
            {
                s = (new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss", Locale.ENGLISH)).parse(s);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                s.printStackTrace();
                s = obj1;
            }
            return (new SimpleDateFormat("MMM dd, yyyy", Locale.getDefault())).format(Long.valueOf(s.getTime()));
        }
        return ((String) (obj));
    }

    public static String prepareExpireDate(String s)
    {
        Date date;
        try
        {
            date = (new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH)).parse(s);
        }
        catch (ParseException parseexception)
        {
            parseexception.printStackTrace();
            return s;
        }
        return (new SimpleDateFormat("MM/dd/yyyy", Locale.getDefault())).format(Long.valueOf(date.getTime()));
    }

    public static String prepareMonthYearFromString(String s)
    {
        Object obj;
        try
        {
            obj = (new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH)).parse(s);
            obj = (new SimpleDateFormat("MM/dd/yy", Locale.getDefault())).format(Long.valueOf(((Date) (obj)).getTime()));
        }
        catch (ParseException parseexception)
        {
            parseexception.printStackTrace();
            return s;
        }
        return ((String) (obj));
    }
}
