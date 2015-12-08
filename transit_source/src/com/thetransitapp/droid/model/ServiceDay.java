// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid.model;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class ServiceDay
    implements Serializable
{

    private static final long serialVersionUID = 0x3610c56dfc9d46ccL;
    private Date date;

    public ServiceDay()
    {
        date = getMidnight(new Date());
    }

    public ServiceDay(int i)
    {
        Calendar calendar = Calendar.getInstance();
        calendar.add(6, i);
        date = getMidnight(calendar.getTime());
    }

    public ServiceDay(String s)
    {
        Date date2 = new Date();
        Date date1 = date2;
        if (s != null)
        {
            try
            {
                date1 = (new SimpleDateFormat("yyyy-MM-dd")).parse(s);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                date1 = date2;
            }
        }
        date = getMidnight(date1);
    }

    public static List getActiveServiceDates()
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new ServiceDay());
        int i = Calendar.getInstance().get(11);
        if (i < 8)
        {
            arraylist.add(new ServiceDay(-1));
        } else
        if (i >= 22)
        {
            arraylist.add(new ServiceDay(1));
            return arraylist;
        }
        return arraylist;
    }

    private Date getMidnight(Date date1)
    {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date1);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTime();
    }

    public static List getNextWeekServiceDates()
    {
        ArrayList arraylist = new ArrayList();
        int i = 0;
        do
        {
            if (i > 7)
            {
                return arraylist;
            }
            arraylist.add(new ServiceDay(i));
            i++;
        } while (true);
    }

    public boolean equals(Object obj)
    {
        if (!(obj instanceof ServiceDay))
        {
            return false;
        } else
        {
            obj = (ServiceDay)obj;
            return date.equals(((ServiceDay) (obj)).date);
        }
    }

    public Date getDate()
    {
        return date;
    }

    public Date getDate(String s)
    {
        int i = 0;
        int j = Integer.parseInt(s.substring(0, s.indexOf(":")));
        if (j > 23)
        {
            i = 0 + 1;
        }
_L2:
        Calendar calendar;
        try
        {
            s = (new SimpleDateFormat("HH:mm")).parse(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s = new Date();
        }
        calendar = Calendar.getInstance();
        calendar.setTime(s);
        s = Calendar.getInstance();
        s.setTime(date);
        s.set(11, calendar.get(11));
        s.set(12, calendar.get(12));
        s.add(6, i);
        return s.getTime();
        NumberFormatException numberformatexception;
        numberformatexception;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public int hashCode()
    {
        return date.hashCode();
    }
}
