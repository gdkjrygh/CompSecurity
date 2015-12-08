// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.richmedia.controller;

import android.app.AlertDialog;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.widget.SimpleAdapter;
import com.amobee.adsdk.Log;
import com.amobee.richmedia.view.AmobeeView;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import org.json.JSONException;
import org.json.JSONObject;

public class OrmmaCalendarController
{

    private static final int DAYS_IN_MONTH = 31;
    private static final int DAYS_IN_YEAR = 365;
    private static final int FIRST_MONTH = 1;
    private static final int FIRST_WEEK = 1;
    private static final String FIRST_WEEK_DAYS = "1,2,3,4,5,6,7";
    private static final int FOURTH_WEEK = 4;
    private static final String FOURTH_WEEK_DAYS = "22,23,24,25,26,27,28,29,30,31";
    private static final int LAST_MONTH = 12;
    private static final int SECOND_WEEK = 2;
    private static final String SECOND_WEEK_DAYS = "8,9,10,11,12,13,14";
    private static final int THIRD_WEEK = 3;
    private static final String THIRD_WEEK_DAYS = "15,16,17,18,19,20,21";
    private static final int WEEKS_IN_MONTH = 4;
    private String LOG_TAG;
    private Cursor cursor;
    private final String daysInWeek[] = {
        "SU", "MO", "TU", "WE", "TH", "FR", "SA"
    };
    private String description;
    private String end;
    private int eventsCount;
    private final String frequency[] = {
        "daily", "weekly", "monthly", "yearly"
    };
    private boolean isCalanderJustArrived;
    private String location;
    private Context mContext;
    private AmobeeView mOrmmaView;
    OrmmaController.RecurrenceProperties mRecurrenceProperties;
    private String recurrence;
    private String reminder;
    private String start;
    private String status;
    private String summary;
    private String transparency;

    OrmmaCalendarController(String s, Context context, AmobeeView amobeeview)
    {
        LOG_TAG = "";
        mContext = null;
        description = "";
        location = "";
        summary = "";
        start = "";
        end = "";
        status = "";
        transparency = "";
        recurrence = "";
        reminder = "";
        cursor = null;
        eventsCount = 0;
        isCalanderJustArrived = false;
        mOrmmaView = null;
        LOG_TAG = s;
        mContext = context;
        mOrmmaView = amobeeview;
    }

    private void addCalendarEvent(int i, String s, String s1, String s2, String s3, String s4, String s5, 
            String s6, String s7, String s8)
    {
        s5 = mContext.getContentResolver();
        s7 = new ContentValues();
        s7.put("calendar_id", Integer.valueOf(i));
        s7.put("title", s);
        s7.put("description", s2);
        s7.put("dtstart", Long.valueOf(getTimeFromStringDateFormat(s3)));
        s7.put("hasAlarm", Integer.valueOf(1));
        if (s4.length() != 0) goto _L2; else goto _L1
_L1:
        s7.put("dtend", String.valueOf(getTimeFromStringDateFormat(s3) + 0x36ee80L));
_L9:
        s7.put("eventLocation", s1);
        if (mRecurrenceProperties != null)
        {
            s7.put("rrule", recurrencePropertiesString());
        }
        if (android.os.Build.VERSION.SDK_INT < 14) goto _L4; else goto _L3
_L3:
        s7.put("eventTimezone", TimeZone.getDefault().getID());
        s = s5.insert(android.provider.CalendarContract.Events.CONTENT_URI, s7);
_L10:
        if (s == null) goto _L6; else goto _L5
_L5:
        long l1;
        long l2;
        try
        {
            long l = Long.parseLong(s.getLastPathSegment());
            s = new ContentValues();
            s.put("event_id", Long.valueOf(l));
            s.put("method", Integer.valueOf(1));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.d(LOG_TAG, "Can't access calendar, exception message");
            mOrmmaView.raiseError("Create calendar event failed.", "createCalendarEvent");
            return;
        }
        l2 = 15L;
        i = s8.length();
        l1 = l2;
        if (i <= 0)
        {
            break MISSING_BLOCK_LABEL_252;
        }
        l1 = l2;
        l2 = Integer.parseInt(s8) * -1;
        l1 = l2;
        l2 /= 60000L;
        l1 = l2;
_L11:
        s.put("minutes", Long.valueOf(l1));
        if (android.os.Build.VERSION.SDK_INT < 14) goto _L8; else goto _L7
_L7:
        s5.insert(android.provider.CalendarContract.Reminders.CONTENT_URI, s);
_L6:
        Log.d(LOG_TAG, "Event added to calendar");
        return;
_L2:
        s7.put("dtend", Long.valueOf(getTimeFromStringDateFormat(s4)));
          goto _L9
_L4:
label0:
        {
            if (android.os.Build.VERSION.SDK_INT < 10)
            {
                break label0;
            }
            s7.put("transparency", s6);
            s = s5.insert(Uri.parse("content://com.android.calendar/events"), s7);
        }
          goto _L10
        s7.put("transparency", s6);
        s = s5.insert(Uri.parse("content://calendar/events"), s7);
          goto _L10
        s1;
        long l3 = l1;
        long l4 = getTimeFromStringDateFormat(s8);
        l3 = l1;
        l1 = (getTimeFromStringDateFormat(s3) - l4) * -1L;
        l3 = l1;
        try
        {
            l1 /= 60000L;
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            l1 = l3;
        }
          goto _L11
_L8:
label1:
        {
            if (android.os.Build.VERSION.SDK_INT < 10)
            {
                break label1;
            }
            s5.insert(Uri.parse("content://com.android.calendar/reminders"), s);
        }
          goto _L6
        s5.insert(Uri.parse("content://calendar/reminders"), s);
          goto _L6
    }

    private void addExceptioDates(int i)
    {
        ContentValues contentvalues;
        long l = i;
        contentvalues = new ContentValues();
        contentvalues.put("_id", Long.valueOf(l));
        contentvalues.put("calendar_id", cursor.getString(0));
        if (mRecurrenceProperties == null || mRecurrenceProperties.exceptionDates == null) goto _L2; else goto _L1
_L1:
        Object obj;
        int j;
        obj = "";
        j = 0;
_L6:
        if (j < mRecurrenceProperties.exceptionDates.length) goto _L4; else goto _L3
_L3:
        contentvalues.put("exdate", ((String) (obj)));
_L2:
        obj = mContext.getContentResolver();
        String s = (new StringBuilder("_id =")).append(i).toString();
        ((ContentResolver) (obj)).update(android.provider.CalendarContract.Events.CONTENT_URI, contentvalues, s, null);
        return;
_L4:
        Object obj1;
        try
        {
            obj1 = getDateFromStringDateFormat(mRecurrenceProperties.exceptionDates[j]);
            SimpleDateFormat simpledateformat = new SimpleDateFormat("yyyyMMdd HHmmss");
            simpledateformat.setTimeZone(TimeZone.getTimeZone("UTC"));
            obj1 = simpledateformat.format(((Date) (obj1)));
            obj1 = (new StringBuilder(String.valueOf(obj))).append(((String) (obj1)).replace(" ", "T")).append("Z").toString();
        }
        catch (Exception exception)
        {
            return;
        }
        obj = obj1;
        if (j < mRecurrenceProperties.exceptionDates.length - 1)
        {
            obj = (new StringBuilder(String.valueOf(obj1))).append(",").toString();
        }
        j++;
        if (true) goto _L6; else goto _L5
_L5:
    }

    private Date getDateFromStringDateFormat(String s)
    {
        String s1;
        String as[];
        int i;
        s1 = s.replace("T", " ");
        as = new String[10];
        as[0] = "yyyy-MM-dd";
        as[1] = "yyyy-MM-dd HH:mm";
        as[2] = "yyyy-MM-dd HH:mm:ss";
        as[3] = "yyyy-MM-dd HH:mm:ss.SSS";
        as[4] = "yyyy-MM-dd HH:mmZ";
        as[5] = "yyyy-MM-dd HH:mm:ssZ";
        as[6] = "yyyy-MM-dd HH:mm:ss.SSSZ";
        as[7] = "yyyy-MM-dd HH:mmZZZZZ";
        as[8] = "yyyy-MM-dd HH:mm:ssZZZZZ";
        as[9] = "yyyy-MM-dd HH:mm:ss.SSSZZZZZ";
        s = "";
        i = as.length - 1;
_L2:
        if (i < 0)
        {
            Log.d(LOG_TAG, (new StringBuilder("Can't Parse date, ParseException message: ")).append(s).toString());
            mOrmmaView.raiseError("Valid date required.", "createCalendarEvent");
            return null;
        }
        s = new SimpleDateFormat(as[i]);
        s.setTimeZone(TimeZone.getTimeZone("UTC"));
        s = s.parse(s1);
        return s;
        s;
        s = "parse exception: bad date format";
        i--;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private long getTimeFromStringDateFormat(String s)
    {
        s = getDateFromStringDateFormat(s);
        if (s != null)
        {
            return s.getTime();
        } else
        {
            return -1L;
        }
    }

    private String recurrencePropertiesString()
    {
        Object obj1 = "";
        if (mRecurrenceProperties == null) goto _L2; else goto _L1
_L1:
        Object obj;
        obj = obj1;
        if (mRecurrenceProperties.frequency != null)
        {
            obj = obj1;
            if (validFrequency(mRecurrenceProperties.frequency))
            {
                obj = (new StringBuilder(String.valueOf(""))).append("FREQ=").append(mRecurrenceProperties.frequency.toUpperCase()).append(";").toString();
            }
        }
        obj1 = obj;
        if (mRecurrenceProperties.expires != null)
        {
            Date date = getDateFromStringDateFormat(mRecurrenceProperties.expires);
            obj1 = obj;
            if (date != null)
            {
                obj1 = new SimpleDateFormat("yyyyMMdd HHmmss");
                ((SimpleDateFormat) (obj1)).setTimeZone(TimeZone.getTimeZone("UTC"));
                obj1 = (new StringBuilder(String.valueOf(((SimpleDateFormat) (obj1)).format(date)))).append("Z").toString().replace(" ", "T");
                obj1 = (new StringBuilder(String.valueOf(obj))).append("UNTIL=").append(((String) (obj1))).append(";").toString();
            }
        }
        obj = obj1;
        if (mRecurrenceProperties.daysInWeek == null) goto _L4; else goto _L3
_L3:
        obj = obj1;
        if (!((String) (obj1)).contains("WEEKLY")) goto _L4; else goto _L5
_L5:
        Object obj3;
        int i;
        obj3 = "";
        i = 0;
_L41:
        if (i < mRecurrenceProperties.daysInWeek.length) goto _L7; else goto _L6
_L6:
        obj = obj1;
        if (!((String) (obj3)).equals(""))
        {
            obj = (new StringBuilder(String.valueOf(obj1))).append("BYDAY=").append(((String) (obj3))).append(";").toString();
        }
_L4:
        obj1 = obj;
        if (((String) (obj)).contains("WEEKLY"))
        {
            obj1 = obj;
            if (!((String) (obj)).contains("BYDAY"))
            {
                obj1 = getDateFromStringDateFormat(start);
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(((Date) (obj1)));
                obj1 = (new StringBuilder(String.valueOf(obj))).append("BYDAY=").append(daysInWeek[calendar.get(7) - 1]).append(";").toString();
            }
        }
        obj = obj1;
        if (mRecurrenceProperties.daysInYear == null) goto _L9; else goto _L8
_L8:
        obj = obj1;
        if (!((String) (obj1)).contains("YEARLY")) goto _L9; else goto _L10
_L10:
        Object obj2;
        obj2 = "";
        i = 0;
_L30:
        if (i < mRecurrenceProperties.daysInYear.length) goto _L12; else goto _L11
_L11:
        obj = obj1;
        if (!((String) (obj2)).equals(""))
        {
            obj = (new StringBuilder(String.valueOf(obj1))).append("BYYEARDAY=").append(((String) (obj2))).append(";").toString();
        }
_L9:
        obj1 = obj;
        if (mRecurrenceProperties.monthsInYear == null) goto _L14; else goto _L13
_L13:
        obj1 = obj;
        if (!((String) (obj)).contains("YEARLY")) goto _L14; else goto _L15
_L15:
        obj2 = "";
        i = 0;
_L31:
        if (i < mRecurrenceProperties.monthsInYear.length) goto _L17; else goto _L16
_L16:
        obj1 = obj;
        if (!((String) (obj2)).equals(""))
        {
            obj1 = (new StringBuilder(String.valueOf(obj))).append("BYMONTH=").append(((String) (obj2))).append(";").toString();
        }
_L14:
        obj3 = "";
        obj = obj3;
        obj2 = obj1;
        if (mRecurrenceProperties.weeksInMonth == null) goto _L19; else goto _L18
_L18:
        obj = obj3;
        obj2 = obj1;
        if (!((String) (obj1)).contains("MONTHLY")) goto _L19; else goto _L20
_L20:
        i = 0;
        obj = obj3;
_L37:
        if (i < mRecurrenceProperties.weeksInMonth.length) goto _L22; else goto _L21
_L21:
        if ((mRecurrenceProperties.daysInMonth == null || mRecurrenceProperties.daysInMonth.length == 0) && !((String) (obj)).equals(""))
        {
            obj2 = (new StringBuilder(String.valueOf(obj1))).append("BYMONTHDAY=").append(((String) (obj))).append(";").toString();
        } else
        {
            obj = (new StringBuilder(",")).append(((String) (obj))).toString();
            obj2 = obj1;
        }
_L19:
        obj1 = obj2;
        if (mRecurrenceProperties.daysInMonth == null) goto _L24; else goto _L23
_L23:
        obj1 = obj2;
        if (!((String) (obj2)).contains("MONTHLY")) goto _L24; else goto _L25
_L25:
        obj3 = "";
        i = 0;
_L39:
        if (i < mRecurrenceProperties.daysInMonth.length) goto _L27; else goto _L26
_L26:
        if (!((String) (obj3)).equals("")) goto _L29; else goto _L28
_L28:
        obj1 = obj2;
        if (((String) (obj)).equals("")) goto _L24; else goto _L29
_L29:
        obj1 = (new StringBuilder(String.valueOf(obj2))).append("BYMONTHDAY=").append(((String) (obj3))).append(((String) (obj))).append(";").toString();
_L24:
        obj = obj1;
        if (!validFrequency(mRecurrenceProperties.frequency))
        {
            obj = obj1;
            if (!((String) (obj1)).equals(""))
            {
                obj = (new StringBuilder(String.valueOf(obj1))).append("FREQ=DAILY;").toString();
            }
        }
        obj1 = obj;
        if (!((String) (obj)).equals(""))
        {
            if (mRecurrenceProperties.interval > 0)
            {
                obj1 = (new StringBuilder(String.valueOf(obj))).append("INTERVAL=").append(mRecurrenceProperties.interval).append(";").toString();
            } else
            {
                obj1 = (new StringBuilder(String.valueOf(obj))).append("INTERVAL=1;").toString();
            }
        }
        return ((String) (obj1));
_L7:
        obj2 = obj3;
        obj3 = (new StringBuilder(String.valueOf(obj3))).append(daysInWeek[mRecurrenceProperties.daysInWeek[i]]).toString();
        obj = obj3;
        obj2 = obj3;
        if (i != mRecurrenceProperties.daysInWeek.length - 1)
        {
            obj2 = obj3;
            try
            {
                obj = (new StringBuilder(String.valueOf(obj3))).append(",").toString();
            }
            catch (Exception exception)
            {
                exception = ((Exception) (obj2));
            }
        }
        i++;
        obj3 = obj;
        continue; /* Loop/switch isn't completed */
_L12:
        obj = obj2;
        if (mRecurrenceProperties.daysInYear[i] <= 365)
        {
            obj = obj2;
            if (mRecurrenceProperties.daysInYear[i] > -365)
            {
                if (mRecurrenceProperties.daysInYear[i] < 0)
                {
                    mRecurrenceProperties.daysInYear[i] = (short)(mRecurrenceProperties.daysInYear[i] + 365);
                }
                obj2 = (new StringBuilder(String.valueOf(obj2))).append(mRecurrenceProperties.daysInYear[i]).toString();
                obj = obj2;
                if (i != mRecurrenceProperties.daysInYear.length - 1)
                {
                    obj = (new StringBuilder(String.valueOf(obj2))).append(",").toString();
                }
            }
        }
        i++;
        obj2 = obj;
          goto _L30
_L17:
        obj1 = obj2;
        if (mRecurrenceProperties.monthsInYear[i] <= 12)
        {
            obj1 = obj2;
            if (1 <= mRecurrenceProperties.monthsInYear[i])
            {
                obj2 = (new StringBuilder(String.valueOf(obj2))).append(mRecurrenceProperties.monthsInYear[i]).toString();
                obj1 = obj2;
                if (i != mRecurrenceProperties.monthsInYear.length - 1)
                {
                    obj1 = (new StringBuilder(String.valueOf(obj2))).append(",").toString();
                }
            }
        }
        i++;
        obj2 = obj1;
          goto _L31
_L22:
        if (mRecurrenceProperties.weeksInMonth[i] >= -3 && mRecurrenceProperties.weeksInMonth[i] <= 4 && mRecurrenceProperties.weeksInMonth[i] <= 0)
        {
            mRecurrenceProperties.weeksInMonth[i] = (short)(mRecurrenceProperties.weeksInMonth[i] + 4);
        }
        mRecurrenceProperties.weeksInMonth[i];
        JVM INSTR tableswitch 1 4: default 1324
    //                   1 1385
    //                   2 1408
    //                   3 1431
    //                   4 1454;
           goto _L32 _L33 _L34 _L35 _L36
_L32:
        break; /* Loop/switch isn't completed */
_L36:
        break MISSING_BLOCK_LABEL_1454;
_L38:
        obj2 = obj;
        if (i != mRecurrenceProperties.weeksInMonth.length - 1)
        {
            obj2 = obj;
            if (!((String) (obj)).endsWith(","))
            {
                obj2 = (new StringBuilder(String.valueOf(obj))).append(",").toString();
            }
        }
        i++;
        obj = obj2;
          goto _L37
_L33:
        obj = (new StringBuilder(String.valueOf(obj))).append("1,2,3,4,5,6,7").toString();
          goto _L38
_L34:
        obj = (new StringBuilder(String.valueOf(obj))).append("8,9,10,11,12,13,14").toString();
          goto _L38
_L35:
        obj = (new StringBuilder(String.valueOf(obj))).append("15,16,17,18,19,20,21").toString();
          goto _L38
        obj = (new StringBuilder(String.valueOf(obj))).append("22,23,24,25,26,27,28,29,30,31").toString();
          goto _L38
_L27:
        obj1 = obj3;
        if (mRecurrenceProperties.daysInMonth[i] > -31)
        {
            obj1 = obj3;
            if (mRecurrenceProperties.daysInMonth[i] <= 31)
            {
                if (mRecurrenceProperties.daysInMonth[i] <= 0)
                {
                    mRecurrenceProperties.daysInMonth[i] = (short)(mRecurrenceProperties.daysInMonth[i] + 31);
                }
                obj3 = (new StringBuilder(String.valueOf(obj3))).append(mRecurrenceProperties.daysInMonth[i]).toString();
                obj1 = obj3;
                if (i != mRecurrenceProperties.daysInMonth.length - 1)
                {
                    obj1 = (new StringBuilder(String.valueOf(obj3))).append(",").toString();
                }
            }
        }
        i++;
        obj3 = obj1;
          goto _L39
_L2:
        return null;
        if (true) goto _L41; else goto _L40
_L40:
    }

    private void showCalendarIntent14()
    {
        Object obj;
        String s;
        Intent intent;
        if (-1L == getTimeFromStringDateFormat(start))
        {
            mOrmmaView.raiseError("Valid date required.", "createCalendarEvent");
            return;
        }
        eventsCount = mContext.getContentResolver().query(android.provider.CalendarContract.Events.CONTENT_URI, new String[] {
            "_id"
        }, null, null, null).getCount();
        s = recurrencePropertiesString();
        intent = (new Intent("android.intent.action.INSERT")).addFlags(0x10000000).setData(android.provider.CalendarContract.Events.CONTENT_URI).putExtra("beginTime", getTimeFromStringDateFormat(start)).putExtra("title", description).putExtra("description", summary).putExtra("eventLocation", location);
        if (-1L != getTimeFromStringDateFormat(end))
        {
            intent.putExtra("endTime", getTimeFromStringDateFormat(end));
        }
        obj = "";
        if (mRecurrenceProperties == null || mRecurrenceProperties.exceptionDates == null) goto _L2; else goto _L1
_L1:
        int i = 0;
_L6:
        if (i < mRecurrenceProperties.exceptionDates.length) goto _L4; else goto _L3
_L3:
        intent.putExtra("exdate", ((String) (obj)));
_L2:
        if (s != null)
        {
            intent.putExtra("rrule", s);
            Log.d(LOG_TAG, (new StringBuilder("calander rrule:")).append(s).toString());
        }
        try
        {
            mContext.startActivity(intent);
            if (mOrmmaView.parentView != null)
            {
                mOrmmaView.parentView.raiseOnLeavingApplication();
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return;
        }
        break; /* Loop/switch isn't completed */
_L4:
        Object obj1 = getDateFromStringDateFormat(mRecurrenceProperties.exceptionDates[i]);
        SimpleDateFormat simpledateformat = new SimpleDateFormat("yyyyMMdd HHmmss");
        simpledateformat.setTimeZone(TimeZone.getTimeZone("UTC"));
        obj1 = simpledateformat.format(((Date) (obj1)));
        obj1 = (new StringBuilder(String.valueOf(obj))).append(((String) (obj1)).replace(" ", "T")).append("Z").toString();
        obj = obj1;
        if (i < mRecurrenceProperties.exceptionDates.length - 1)
        {
            obj = (new StringBuilder(String.valueOf(obj1))).append(",").toString();
        }
        i++;
        if (true) goto _L6; else goto _L5
_L5:
        mOrmmaView.raiseOnLeavingApplication();
        return;
    }

    private void showCalendarWithCursor()
    {
        if (cursor.getCount() != 1) goto _L2; else goto _L1
_L1:
        addCalendarEvent(cursor.getInt(0), description, location, summary, start, end, status, transparency, recurrence, reminder);
_L4:
        cursor.close();
        return;
_L2:
        final ArrayList entries = new ArrayList();
        int i = 0;
        do
        {
label0:
            {
                if (i < cursor.getCount())
                {
                    break label0;
                }
                android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(mContext);
                builder.setTitle("Choose Calendar to save event to");
                builder.setSingleChoiceItems(new SimpleAdapter(mContext, entries, 0x109000d, new String[] {
                    "NAME", "EMAILID"
                }, new int[] {
                    0x1020014, 0x1020015
                }), -1, new android.content.DialogInterface.OnClickListener() {

                    final OrmmaCalendarController this$0;
                    private final List val$entries;

                    public void onClick(DialogInterface dialoginterface, int j)
                    {
                        Map map = (Map)entries.get(j);
                        addCalendarEvent(Integer.parseInt((String)map.get("ID")), description, location, summary, start, end, status, transparency, recurrence, reminder);
                        dialoginterface.cancel();
                    }

            
            {
                this$0 = OrmmaCalendarController.this;
                entries = list;
                super();
            }
                });
                builder.create().show();
            }
            if (true)
            {
                continue;
            }
            HashMap hashmap = new HashMap();
            hashmap.put("ID", cursor.getString(0));
            hashmap.put("NAME", cursor.getString(1));
            hashmap.put("EMAILID", cursor.getString(2));
            entries.add(hashmap);
            cursor.moveToNext();
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void showNotification()
    {
        android.content.DialogInterface.OnClickListener onclicklistener = new android.content.DialogInterface.OnClickListener() {

            final OrmmaCalendarController this$0;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                showCalendarWithCursor();
            }

            
            {
                this$0 = OrmmaCalendarController.this;
                super();
            }
        };
        android.content.DialogInterface.OnClickListener onclicklistener1 = new android.content.DialogInterface.OnClickListener() {

            final OrmmaCalendarController this$0;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                mOrmmaView.raiseError("Create calendar event canceled by the user.", "createCalendarEvent");
            }

            
            {
                this$0 = OrmmaCalendarController.this;
                super();
            }
        };
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(mContext);
        builder.setTitle((new StringBuilder(String.valueOf(description))).append(" - Calendar Event").toString());
        String s1 = (new StringBuilder("Description: ")).append(summary).append("\n").append("Start date: ").append(start).toString();
        String s = s1;
        if (end.length() > 0)
        {
            s = (new StringBuilder(String.valueOf(s1))).append("\nEnd date: ").append(end).toString();
        }
        builder.setMessage(s);
        builder.setPositiveButton("yes", onclicklistener);
        builder.setNegativeButton("no", onclicklistener1);
        builder.show();
    }

    private boolean validFrequency(String s)
    {
        int i = 0;
        do
        {
            if (i >= frequency.length)
            {
                return false;
            }
            if (frequency[i].equalsIgnoreCase(s))
            {
                return true;
            }
            i++;
        } while (true);
    }

    public void createCalendarEvent(String s, OrmmaController.RecurrenceProperties recurrenceproperties)
    {
        mRecurrenceProperties = recurrenceproperties;
        try
        {
            s = new JSONObject(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return;
        }
        if (!s.isNull("description"))
        {
            description = s.getString("description");
            if (!s.isNull("location"))
            {
                location = s.getString("location");
            }
            if (!s.isNull("summary"))
            {
                summary = s.getString("summary");
            }
            if (!s.isNull("start"))
            {
                start = s.getString("start");
                if (-1L == getTimeFromStringDateFormat(start))
                {
                    mOrmmaView.raiseError("Valid date required.", "createCalendarEvent");
                    return;
                }
                break MISSING_BLOCK_LABEL_153;
            }
            break MISSING_BLOCK_LABEL_139;
        }
        try
        {
            mOrmmaView.raiseError("Valid description required.", "createCalendarEvent");
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        break MISSING_BLOCK_LABEL_237;
        mOrmmaView.raiseError("Valid date required.", "createCalendarEvent");
        return;
        if (!s.isNull("end"))
        {
            end = s.getString("end");
        }
        if (!s.isNull("status"))
        {
            status = s.getString("status");
        }
        if (!s.isNull("transparency"))
        {
            transparency = s.getString("transparency");
        }
        if (!s.isNull("reminder"))
        {
            reminder = s.getString("reminder");
        }
        s = mContext.getContentResolver();
        recurrenceproperties = new String[3];
        recurrenceproperties[0] = "_id";
        recurrenceproperties[1] = "displayName";
        recurrenceproperties[2] = "_sync_account";
        if (android.os.Build.VERSION.SDK_INT < 14) goto _L2; else goto _L1
_L1:
        cursor = s.query(android.provider.CalendarContract.Calendars.CONTENT_URI, new String[] {
            "_id", "calendar_displayName", "account_name"
        }, null, null, null);
_L9:
        if (cursor != null && (cursor == null || cursor.moveToFirst())) goto _L4; else goto _L3
_L3:
        Log.d(LOG_TAG, "No calendar account found");
        mOrmmaView.raiseError("Calendar is not supported.", "createCalendarEvent");
        if (cursor != null)
        {
            cursor.close();
        }
          goto _L5
_L2:
        if (android.os.Build.VERSION.SDK_INT >= 10)
        {
            cursor = s.query(Uri.parse("content://com.android.calendar/calendars"), recurrenceproperties, null, null, null);
            continue; /* Loop/switch isn't completed */
        }
          goto _L6
_L7:
        return;
_L6:
        cursor = s.query(Uri.parse("content://calendar/calendars"), recurrenceproperties, null, null, null);
        continue; /* Loop/switch isn't completed */
_L4:
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            showCalendarIntent14();
            continue; /* Loop/switch isn't completed */
        }
        try
        {
            showNotification();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            mOrmmaView.raiseError("Calendar is not supported.", "createCalendarEvent");
            Log.d(LOG_TAG, "createEvent exception ");
        }
        if (true) goto _L7; else goto _L5
_L5:
        return;
        if (true) goto _L9; else goto _L8
_L8:
    }

    public boolean isEventSaved()
    {
        int j;
        if (android.os.Build.VERSION.SDK_INT < 14 && android.os.Build.VERSION.SDK_INT >= 10)
        {
            return false;
        }
        if (!isCalanderJustArrived)
        {
            isCalanderJustArrived = true;
            return false;
        }
        j = 0;
        isCalanderJustArrived = false;
        if (eventsCount == 0) goto _L2; else goto _L1
_L1:
        ContentResolver contentresolver;
        Object obj;
        contentresolver = mContext.getContentResolver();
        obj = contentresolver.query(android.provider.CalendarContract.Events.CONTENT_URI, new String[] {
            "_id"
        }, null, null, null);
        ((Cursor) (obj)).moveToFirst();
        int i = 0;
_L9:
        if (i < ((Cursor) (obj)).getCount()) goto _L4; else goto _L3
_L3:
        if (((Cursor) (obj)).getCount() <= eventsCount) goto _L6; else goto _L5
_L5:
        long l = j;
        obj = new ContentValues();
        ((ContentValues) (obj)).put("event_id", Long.valueOf(l));
        ((ContentValues) (obj)).put("method", Integer.valueOf(1));
        long l1 = 15L;
        i = reminder.length();
        l = l1;
        if (i <= 0)
        {
            break MISSING_BLOCK_LABEL_201;
        }
        l = l1;
        l1 = Integer.parseInt(reminder) * -1;
        l = l1;
        l1 /= 60000L;
        l = l1;
_L7:
        ((ContentValues) (obj)).put("minutes", Long.valueOf(l));
        contentresolver.insert(android.provider.CalendarContract.Reminders.CONTENT_URI, ((ContentValues) (obj)));
        return true;
_L4:
        int k;
        if (i != ((Cursor) (obj)).getCount() - 1)
        {
            break MISSING_BLOCK_LABEL_284;
        }
        k = Integer.parseInt(((Cursor) (obj)).getString(0));
        j = k;
        if (mRecurrenceProperties == null)
        {
            break MISSING_BLOCK_LABEL_284;
        }
        j = k;
        if (mRecurrenceProperties.exceptionDates == null)
        {
            break MISSING_BLOCK_LABEL_284;
        }
        addExceptioDates(k);
        j = k;
        ((Cursor) (obj)).moveToNext();
        i++;
        continue; /* Loop/switch isn't completed */
        Exception exception1;
        exception1;
        l1 = l;
        long l2 = getTimeFromStringDateFormat(reminder);
        l1 = l;
        l = (getTimeFromStringDateFormat(start) - l2) * -1L;
        l1 = l;
        Exception exception;
        try
        {
            l /= 60000L;
        }
        catch (Exception exception2)
        {
            l = l1;
        }
        if (true) goto _L7; else goto _L6
_L6:
        mOrmmaView.raiseError("Create calendar event canceled by the user.", "createCalendarEvent");
        return true;
_L2:
        return false;
        exception;
        (new StringBuilder(String.valueOf(exception.getMessage()))).append(" ").toString();
        return false;
        if (true) goto _L9; else goto _L8
_L8:
    }












}
