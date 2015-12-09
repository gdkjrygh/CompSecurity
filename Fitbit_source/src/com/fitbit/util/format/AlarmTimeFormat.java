// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util.format;

import java.text.FieldPosition;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

public class AlarmTimeFormat extends SimpleDateFormat
{

    private static final long serialVersionUID = 0xe7dbdcd01741b98eL;
    private SimpleDateFormat innerFormat;

    public AlarmTimeFormat()
    {
        super("HH:mmZ", Locale.US);
        innerFormat = new SimpleDateFormat("HH:mmZ", Locale.US);
    }

    public StringBuffer format(Date date, StringBuffer stringbuffer, FieldPosition fieldposition)
    {
        return innerFormat.format(date, stringbuffer, fieldposition);
    }

    public Date parse(String s, ParsePosition parseposition)
    {
        try
        {
            GregorianCalendar gregoriancalendar = new GregorianCalendar();
            parseposition.setIndex(0);
            int i = Integer.parseInt(s.substring(0, 2));
            parseposition.setIndex(3);
            int j = Integer.parseInt(s.substring(3, 5));
            parseposition.setIndex(5);
            gregoriancalendar.setTimeZone(TimeZone.getTimeZone((new StringBuilder()).append("GMT").append(s.substring(5, 11)).toString()));
            gregoriancalendar.set(11, i);
            gregoriancalendar.set(13, 0);
            gregoriancalendar.set(14, 0);
            gregoriancalendar.set(12, j);
            s = gregoriancalendar.getTime();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        return s;
    }
}
