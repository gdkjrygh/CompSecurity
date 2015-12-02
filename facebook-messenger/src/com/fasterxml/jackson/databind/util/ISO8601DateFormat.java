// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.util;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

// Referenced classes of package com.fasterxml.jackson.databind.util:
//            ISO8601Utils

public class ISO8601DateFormat extends DateFormat
{

    private static Calendar CALENDAR = new GregorianCalendar();
    private static NumberFormat NUMBER_FORMAT = new DecimalFormat();
    private static final long serialVersionUID = 1L;

    public ISO8601DateFormat()
    {
        numberFormat = NUMBER_FORMAT;
        calendar = CALENDAR;
    }

    public Object clone()
    {
        return this;
    }

    public StringBuffer format(Date date, StringBuffer stringbuffer, FieldPosition fieldposition)
    {
        stringbuffer.append(ISO8601Utils.format(date));
        return stringbuffer;
    }

    public Date parse(String s, ParsePosition parseposition)
    {
        parseposition.setIndex(s.length());
        return ISO8601Utils.parse(s);
    }

}
