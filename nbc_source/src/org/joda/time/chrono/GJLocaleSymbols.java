// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.chrono;

import java.text.DateFormatSymbols;
import java.util.Locale;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeUtils;
import org.joda.time.IllegalFieldValueException;

class GJLocaleSymbols
{

    private static ConcurrentMap cCache = new ConcurrentHashMap();
    private final String iDaysOfWeek[];
    private final String iEras[];
    private final String iHalfday[];
    private final int iMaxDayOfWeekLength;
    private final int iMaxEraLength;
    private final int iMaxHalfdayLength;
    private final int iMaxMonthLength;
    private final int iMaxShortDayOfWeekLength;
    private final int iMaxShortMonthLength;
    private final String iMonths[];
    private final TreeMap iParseDaysOfWeek;
    private final TreeMap iParseEras;
    private final TreeMap iParseMonths;
    private final String iShortDaysOfWeek[];
    private final String iShortMonths[];

    private GJLocaleSymbols(Locale locale)
    {
        DateFormatSymbols dateformatsymbols = DateTimeUtils.getDateFormatSymbols(locale);
        iEras = dateformatsymbols.getEras();
        iDaysOfWeek = realignDaysOfWeek(dateformatsymbols.getWeekdays());
        iShortDaysOfWeek = realignDaysOfWeek(dateformatsymbols.getShortWeekdays());
        iMonths = realignMonths(dateformatsymbols.getMonths());
        iShortMonths = realignMonths(dateformatsymbols.getShortMonths());
        iHalfday = dateformatsymbols.getAmPmStrings();
        Integer ainteger[] = new Integer[13];
        for (int i = 0; i < 13; i++)
        {
            ainteger[i] = Integer.valueOf(i);
        }

        iParseEras = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        addSymbols(iParseEras, iEras, ainteger);
        if ("en".equals(locale.getLanguage()))
        {
            iParseEras.put("BCE", ainteger[0]);
            iParseEras.put("CE", ainteger[1]);
        }
        iParseDaysOfWeek = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        addSymbols(iParseDaysOfWeek, iDaysOfWeek, ainteger);
        addSymbols(iParseDaysOfWeek, iShortDaysOfWeek, ainteger);
        addNumerals(iParseDaysOfWeek, 1, 7, ainteger);
        iParseMonths = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        addSymbols(iParseMonths, iMonths, ainteger);
        addSymbols(iParseMonths, iShortMonths, ainteger);
        addNumerals(iParseMonths, 1, 12, ainteger);
        iMaxEraLength = maxLength(iEras);
        iMaxDayOfWeekLength = maxLength(iDaysOfWeek);
        iMaxShortDayOfWeekLength = maxLength(iShortDaysOfWeek);
        iMaxMonthLength = maxLength(iMonths);
        iMaxShortMonthLength = maxLength(iShortMonths);
        iMaxHalfdayLength = maxLength(iHalfday);
    }

    private static void addNumerals(TreeMap treemap, int i, int j, Integer ainteger[])
    {
        for (; i <= j; i++)
        {
            treemap.put(String.valueOf(i).intern(), ainteger[i]);
        }

    }

    private static void addSymbols(TreeMap treemap, String as[], Integer ainteger[])
    {
        int i = as.length;
        do
        {
            int j = i - 1;
            if (j < 0)
            {
                break;
            }
            String s = as[j];
            i = j;
            if (s != null)
            {
                treemap.put(s, ainteger[j]);
                i = j;
            }
        } while (true);
    }

    static GJLocaleSymbols forLocale(Locale locale)
    {
        GJLocaleSymbols gjlocalesymbols;
label0:
        {
            Locale locale1 = locale;
            if (locale == null)
            {
                locale1 = Locale.getDefault();
            }
            gjlocalesymbols = (GJLocaleSymbols)cCache.get(locale1);
            locale = gjlocalesymbols;
            if (gjlocalesymbols == null)
            {
                gjlocalesymbols = new GJLocaleSymbols(locale1);
                locale = (GJLocaleSymbols)cCache.putIfAbsent(locale1, gjlocalesymbols);
                if (locale == null)
                {
                    break label0;
                }
            }
            return locale;
        }
        return gjlocalesymbols;
    }

    private static int maxLength(String as[])
    {
        int i = 0;
        int j = as.length;
        do
        {
            j--;
            if (j < 0)
            {
                break;
            }
            String s = as[j];
            if (s != null)
            {
                int k = s.length();
                if (k > i)
                {
                    i = k;
                }
            }
        } while (true);
        return i;
    }

    private static String[] realignDaysOfWeek(String as[])
    {
        String as1[] = new String[8];
        int i = 1;
        while (i < 8) 
        {
            int j;
            if (i < 7)
            {
                j = i + 1;
            } else
            {
                j = 1;
            }
            as1[i] = as[j];
            i++;
        }
        return as1;
    }

    private static String[] realignMonths(String as[])
    {
        String as1[] = new String[13];
        for (int i = 1; i < 13; i++)
        {
            as1[i] = as[i - 1];
        }

        return as1;
    }

    public int dayOfWeekTextToValue(String s)
    {
        Integer integer = (Integer)iParseDaysOfWeek.get(s);
        if (integer != null)
        {
            return integer.intValue();
        } else
        {
            throw new IllegalFieldValueException(DateTimeFieldType.dayOfWeek(), s);
        }
    }

    public String dayOfWeekValueToShortText(int i)
    {
        return iShortDaysOfWeek[i];
    }

    public String dayOfWeekValueToText(int i)
    {
        return iDaysOfWeek[i];
    }

    public int eraTextToValue(String s)
    {
        Integer integer = (Integer)iParseEras.get(s);
        if (integer != null)
        {
            return integer.intValue();
        } else
        {
            throw new IllegalFieldValueException(DateTimeFieldType.era(), s);
        }
    }

    public String eraValueToText(int i)
    {
        return iEras[i];
    }

    public int getDayOfWeekMaxShortTextLength()
    {
        return iMaxShortDayOfWeekLength;
    }

    public int getDayOfWeekMaxTextLength()
    {
        return iMaxDayOfWeekLength;
    }

    public int getEraMaxTextLength()
    {
        return iMaxEraLength;
    }

    public int getHalfdayMaxTextLength()
    {
        return iMaxHalfdayLength;
    }

    public int getMonthMaxShortTextLength()
    {
        return iMaxShortMonthLength;
    }

    public int getMonthMaxTextLength()
    {
        return iMaxMonthLength;
    }

    public int halfdayTextToValue(String s)
    {
        String as[] = iHalfday;
        int i = as.length;
        do
        {
            int j = i - 1;
            if (j >= 0)
            {
                i = j;
                if (as[j].equalsIgnoreCase(s))
                {
                    return j;
                }
            } else
            {
                throw new IllegalFieldValueException(DateTimeFieldType.halfdayOfDay(), s);
            }
        } while (true);
    }

    public String halfdayValueToText(int i)
    {
        return iHalfday[i];
    }

    public int monthOfYearTextToValue(String s)
    {
        Integer integer = (Integer)iParseMonths.get(s);
        if (integer != null)
        {
            return integer.intValue();
        } else
        {
            throw new IllegalFieldValueException(DateTimeFieldType.monthOfYear(), s);
        }
    }

    public String monthOfYearValueToShortText(int i)
    {
        return iShortMonths[i];
    }

    public String monthOfYearValueToText(int i)
    {
        return iMonths[i];
    }

}
