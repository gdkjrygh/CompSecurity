// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson.internal.bind.util;

import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

public class ISO8601Utils
{

    private static final TimeZone TIMEZONE_UTC = TimeZone.getTimeZone("UTC");
    private static final String UTC_ID = "UTC";

    public ISO8601Utils()
    {
    }

    private static boolean checkOffset(String s, int i, char c)
    {
        return i < s.length() && s.charAt(i) == c;
    }

    public static String format(Date date)
    {
        return format(date, false, TIMEZONE_UTC);
    }

    public static String format(Date date, boolean flag)
    {
        return format(date, flag, TIMEZONE_UTC);
    }

    public static String format(Date date, boolean flag, TimeZone timezone)
    {
        GregorianCalendar gregoriancalendar = new GregorianCalendar(timezone, Locale.US);
        gregoriancalendar.setTime(date);
        int i;
        int j;
        if (flag)
        {
            i = 4;
        } else
        {
            i = 0;
        }
        if (timezone.getRawOffset() == 0)
        {
            j = 1;
        } else
        {
            j = 6;
        }
        date = new StringBuilder(j + (i + 19));
        padInt(date, gregoriancalendar.get(1), 4);
        date.append('-');
        padInt(date, gregoriancalendar.get(2) + 1, 2);
        date.append('-');
        padInt(date, gregoriancalendar.get(5), 2);
        date.append('T');
        padInt(date, gregoriancalendar.get(11), 2);
        date.append(':');
        padInt(date, gregoriancalendar.get(12), 2);
        date.append(':');
        padInt(date, gregoriancalendar.get(13), 2);
        if (flag)
        {
            date.append('.');
            padInt(date, gregoriancalendar.get(14), 3);
        }
        i = timezone.getOffset(gregoriancalendar.getTimeInMillis());
        if (i != 0)
        {
            j = Math.abs(i / 60000 / 60);
            int k = Math.abs((i / 60000) % 60);
            char c;
            if (i < 0)
            {
                c = '-';
            } else
            {
                c = '+';
            }
            date.append(c);
            padInt(date, j, 2);
            date.append(':');
            padInt(date, k, 2);
        } else
        {
            date.append('Z');
        }
        return date.toString();
    }

    private static int indexOfNonDigit(String s, int i)
    {
        for (; i < s.length(); i++)
        {
            char c = s.charAt(i);
            if (c < '0' || c > '9')
            {
                return i;
            }
        }

        return s.length();
    }

    private static void padInt(StringBuilder stringbuilder, int i, int j)
    {
        String s = Integer.toString(i);
        for (i = j - s.length(); i > 0; i--)
        {
            stringbuilder.append('0');
        }

        stringbuilder.append(s);
    }

    public static Date parse(String s, ParsePosition parseposition)
    {
        int j = parseposition.getIndex();
        int i = j + 4;
        int l1 = parseInt(s, j, i);
        if (checkOffset(s, i, '-'))
        {
            i++;
        }
        j = i + 2;
        int i2 = parseInt(s, i, j);
        char c;
        Object obj1;
        int k;
        int l;
        int k1;
        Object obj;
        Object obj2;
        String s1;
        String s2;
        int i1;
        int j2;
        int k2;
        boolean flag;
        if (checkOffset(s, j, '-'))
        {
            i = j + 1;
        } else
        {
            i = j;
        }
        j = i + 2;
        j2 = parseInt(s, i, j);
        flag = checkOffset(s, j, 'T');
        if (flag)
        {
            break MISSING_BLOCK_LABEL_139;
        }
        if (s.length() <= j)
        {
            obj = new GregorianCalendar(l1, i2 - 1, j2);
            parseposition.setIndex(j);
            return ((Calendar) (obj)).getTime();
        }
        if (!flag) goto _L2; else goto _L1
_L1:
        j++;
        i = j + 2;
        l = parseInt(s, j, i);
        if (checkOffset(s, i, ':'))
        {
            i++;
        }
        j = i + 2;
        k = parseInt(s, i, j);
        i = j;
        if (checkOffset(s, j, ':'))
        {
            i = j + 1;
        }
        if (s.length() <= i) goto _L4; else goto _L3
_L3:
        j = s.charAt(i);
        if (j == 90 || j == 43 || j == 45) goto _L4; else goto _L5
_L5:
        j = i + 2;
        i1 = parseInt(s, i, j);
        i = i1;
        if (i1 > 59)
        {
            i = i1;
            if (i1 < 63)
            {
                i = 59;
            }
        }
        if (!checkOffset(s, j, '.')) goto _L7; else goto _L6
_L6:
        i1 = j + 1;
        k1 = indexOfNonDigit(s, i1 + 1);
        k2 = Math.min(k1, i1 + 3);
        j = parseInt(s, i1, k2);
        break MISSING_BLOCK_LABEL_348;
_L17:
        if (s.length() <= i)
        {
            throw new IllegalArgumentException("No time zone indicator");
        }
          goto _L8
        obj1;
_L16:
label0:
        {
            if (s == null)
            {
                s = null;
            } else
            {
                s = (new StringBuilder("\"")).append(s).append("'").toString();
            }
            s1 = ((Exception) (obj1)).getMessage();
            if (s1 != null)
            {
                obj2 = s1;
                if (!s1.isEmpty())
                {
                    break label0;
                }
            }
            obj2 = (new StringBuilder("(")).append(obj1.getClass().getName()).append(")").toString();
        }
        s = new ParseException((new StringBuilder("Failed to parse date [")).append(s).append("]: ").append(((String) (obj2))).toString(), parseposition.getIndex());
        s.initCause(((Throwable) (obj1)));
        throw s;
_L8:
        c = s.charAt(i);
        if (c != 'Z') goto _L10; else goto _L9
_L9:
        obj1 = TIMEZONE_UTC;
        i++;
_L13:
        obj1 = new GregorianCalendar(((TimeZone) (obj1)));
        ((Calendar) (obj1)).setLenient(false);
        ((Calendar) (obj1)).set(1, l1);
        ((Calendar) (obj1)).set(2, i2 - 1);
        ((Calendar) (obj1)).set(5, j2);
        ((Calendar) (obj1)).set(11, j1);
        ((Calendar) (obj1)).set(12, l);
        ((Calendar) (obj1)).set(13, k);
        ((Calendar) (obj1)).set(14, j);
        parseposition.setIndex(i);
        return ((Calendar) (obj1)).getTime();
_L18:
        obj1 = s.substring(i);
        k1 = i + ((String) (obj1)).length();
        if (!"+0000".equals(obj1) && !"+00:00".equals(obj1)) goto _L12; else goto _L11
_L11:
        obj1 = TIMEZONE_UTC;
        i = k1;
          goto _L13
_L12:
        s1 = (new StringBuilder("GMT")).append(((String) (obj1))).toString();
        obj2 = TimeZone.getTimeZone(s1);
        s2 = ((TimeZone) (obj2)).getID();
        obj1 = obj2;
        i = k1;
        if (s2.equals(s1)) goto _L13; else goto _L14
_L14:
        obj1 = obj2;
        i = k1;
        if (s2.replace(":", "").equals(s1)) goto _L13; else goto _L15
_L15:
        throw new IndexOutOfBoundsException((new StringBuilder("Mismatching time zone indicator: ")).append(s1).append(" given, resolves to ").append(((TimeZone) (obj2)).getID()).toString());
_L19:
        throw new IndexOutOfBoundsException((new StringBuilder("Invalid time zone indicator '")).append(c).append("'").toString());
        obj1;
          goto _L16
_L7:
        j1 = l;
        l = i;
        i = j;
        k1 = k;
        j = 0;
        k = l;
        l = k1;
          goto _L17
_L4:
        j1 = k;
        k1 = l;
        j = 0;
        k = 0;
        l = j1;
        j1 = k1;
          goto _L17
_L2:
        k1 = 0;
        k = 0;
        l = 0;
        j1 = 0;
        i = j;
        j = k1;
          goto _L17
        int j1;
        switch (k2 - i1)
        {
        case 2: // '\002'
            j *= 10;
            break;

        case 1: // '\001'
            j *= 100;
            break;
        }
        j1 = l;
        l = i;
        i = k1;
        k1 = k;
        k = l;
        l = k1;
          goto _L17
_L10:
        if (c != '+' && c != '-') goto _L19; else goto _L18
        obj1;
          goto _L16
    }

    private static int parseInt(String s, int i, int j)
    {
        if (i < 0 || j > s.length() || i > j)
        {
            throw new NumberFormatException(s);
        }
        int k = 0;
        int l;
        if (i < j)
        {
            l = i + 1;
            k = Character.digit(s.charAt(i), 10);
            if (k < 0)
            {
                throw new NumberFormatException((new StringBuilder("Invalid number: ")).append(s.substring(i, j)).toString());
            }
            k = -k;
        } else
        {
            l = i;
        }
        for (; l < j; l++)
        {
            int i1 = Character.digit(s.charAt(l), 10);
            if (i1 < 0)
            {
                throw new NumberFormatException((new StringBuilder("Invalid number: ")).append(s.substring(i, j)).toString());
            }
            k = k * 10 - i1;
        }

        return -k;
    }

}
