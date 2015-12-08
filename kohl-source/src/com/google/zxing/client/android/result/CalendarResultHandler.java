// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.android.result;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.util.Log;
import com.google.zxing.client.result.CalendarParsedResult;
import com.google.zxing.client.result.ParsedResult;
import java.text.DateFormat;
import java.util.Date;

// Referenced classes of package com.google.zxing.client.android.result:
//            ResultHandler

public final class CalendarResultHandler extends ResultHandler
{

    private static final String TAG = com/google/zxing/client/android/result/CalendarResultHandler.getSimpleName();
    private static final int buttons[];

    public CalendarResultHandler(Activity activity, ParsedResult parsedresult)
    {
        super(activity, parsedresult);
    }

    private void addCalendarEvent(String s, Date date, boolean flag, Date date1, String s1, String s2, String as[])
    {
        Intent intent = new Intent("android.intent.action.INSERT");
        intent.setType("vnd.android.cursor.item/event");
        long l = date.getTime();
        intent.putExtra("beginTime", l);
        if (flag)
        {
            intent.putExtra("allDay", true);
        }
        if (date1 == null)
        {
            if (flag)
            {
                l += 0x5265c00L;
            }
        } else
        {
            l = date1.getTime();
        }
        intent.putExtra("endTime", l);
        intent.putExtra("title", s);
        intent.putExtra("eventLocation", s1);
        intent.putExtra("description", s2);
        if (as != null)
        {
            intent.putExtra("android.intent.extra.EMAIL", as);
        }
        try
        {
            rawLaunchIntent(intent);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.w(TAG, "No calendar app available that responds to android.intent.action.INSERT");
        }
        intent.setAction("android.intent.action.EDIT");
        launchIntent(intent);
    }

    private static String format(boolean flag, Date date)
    {
        if (date == null)
        {
            return null;
        }
        DateFormat dateformat;
        if (flag)
        {
            dateformat = DateFormat.getDateInstance(2);
        } else
        {
            dateformat = DateFormat.getDateTimeInstance(2, 2);
        }
        return dateformat.format(date);
    }

    public int getButtonCount()
    {
        return buttons.length;
    }

    public int getButtonText(int i)
    {
        return buttons[i];
    }

    public CharSequence getDisplayContents()
    {
        CalendarParsedResult calendarparsedresult = (CalendarParsedResult)getResult();
        StringBuilder stringbuilder = new StringBuilder(100);
        ParsedResult.maybeAppend(calendarparsedresult.getSummary(), stringbuilder);
        Date date2 = calendarparsedresult.getStart();
        ParsedResult.maybeAppend(format(calendarparsedresult.isStartAllDay(), date2), stringbuilder);
        Date date1 = calendarparsedresult.getEnd();
        if (date1 != null)
        {
            Date date = date1;
            if (calendarparsedresult.isEndAllDay())
            {
                date = date1;
                if (!date2.equals(date1))
                {
                    date = new Date(date1.getTime() - 0x5265c00L);
                }
            }
            ParsedResult.maybeAppend(format(calendarparsedresult.isEndAllDay(), date), stringbuilder);
        }
        ParsedResult.maybeAppend(calendarparsedresult.getLocation(), stringbuilder);
        ParsedResult.maybeAppend(calendarparsedresult.getOrganizer(), stringbuilder);
        ParsedResult.maybeAppend(calendarparsedresult.getAttendees(), stringbuilder);
        ParsedResult.maybeAppend(calendarparsedresult.getDescription(), stringbuilder);
        return stringbuilder.toString();
    }

    public int getDisplayTitle()
    {
        return com.google.zxing.client.android.R.string.result_calendar;
    }

    public void handleButtonPress(int i)
    {
        if (i == 0)
        {
            CalendarParsedResult calendarparsedresult = (CalendarParsedResult)getResult();
            String s1 = calendarparsedresult.getDescription();
            String s2 = calendarparsedresult.getOrganizer();
            String s = s1;
            if (s2 != null)
            {
                if (s1 == null)
                {
                    s = s2;
                } else
                {
                    s = (new StringBuilder()).append(s1).append('\n').append(s2).toString();
                }
            }
            addCalendarEvent(calendarparsedresult.getSummary(), calendarparsedresult.getStart(), calendarparsedresult.isStartAllDay(), calendarparsedresult.getEnd(), calendarparsedresult.getLocation(), s, calendarparsedresult.getAttendees());
        }
    }

    static 
    {
        buttons = (new int[] {
            com.google.zxing.client.android.R.string.button_add_calendar
        });
    }
}
