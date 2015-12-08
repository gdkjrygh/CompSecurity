// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.android;

import android.content.Context;
import android.content.Intent;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import org.apache.http.impl.cookie.DateParseException;
import org.apache.http.impl.cookie.DateUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.millennialmedia.android:
//            MMJSObject, MMLog, MMJSResponse

class BridgeMMCalendar extends MMJSObject
{

    private static final String ADD_EVENT = "addEvent";
    private static final String TAG = com/millennialmedia/android/BridgeMMCalendar.getName();
    private static final String mraidCreateCalendarEventDateFormats[] = {
        "yyyy-MM-dd'T'HH:mmZZZ", "yyyy-MM-dd'T'HH:mm:ssZZZ"
    };
    private static final SimpleDateFormat rruleUntilDateFormat = new SimpleDateFormat("yyyyMMdd'T'HHmmss");

    BridgeMMCalendar()
    {
    }

    private String convertMraidDayToRRuleDay(int i)
    {
        switch (i)
        {
        default:
            return null;

        case 1: // '\001'
            return "MO";

        case 2: // '\002'
            return "TU";

        case 3: // '\003'
            return "WE";

        case 4: // '\004'
            return "TH";

        case 5: // '\005'
            return "FR";

        case 6: // '\006'
            return "SA";

        case 7: // '\007'
            return "SU";
        }
    }

    private String convertRecurrence(JSONObject jsonobject)
    {
        StringBuilder stringbuilder;
        StringBuilder stringbuilder1;
        stringbuilder = new StringBuilder();
        JSONArray jsonarray;
        int i;
        try
        {
            String s = jsonobject.getString("frequency");
            stringbuilder.append("FREQ=").append(s).append(";");
        }
        catch (JSONException jsonexception)
        {
            MMLog.d(TAG, "Unable to get calendar event recurrence frequency");
        }
        try
        {
            String s1 = rruleUntilDateFormat.format(DateUtils.parseDate(jsonobject.getString("expires"), mraidCreateCalendarEventDateFormats));
            stringbuilder.append("UNTIL=").append(s1).append(";");
        }
        catch (DateParseException dateparseexception)
        {
            MMLog.e(TAG, "Error parsing calendar event recurrence expiration date");
        }
        catch (JSONException jsonexception1)
        {
            MMLog.d(TAG, "Unable to get calendar event recurrence expiration date");
        }
        jsonarray = jsonobject.getJSONArray("daysInWeek");
        stringbuilder1 = new StringBuilder();
        i = 0;
_L2:
        if (i >= jsonarray.length())
        {
            break; /* Loop/switch isn't completed */
        }
        stringbuilder1.append(convertMraidDayToRRuleDay(jsonarray.getInt(i))).append(",");
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        try
        {
            stringbuilder.append("BYDAY=").append(stringbuilder1).append(";");
        }
        catch (JSONException jsonexception2)
        {
            MMLog.d(TAG, "Unable to get days in week");
        }
        try
        {
            String s2 = jsonobject.getString("daysInMonth").replaceAll("\\[", "").replaceAll("\\]", "");
            stringbuilder.append("BYMONTHDAY=").append(s2).append(";");
        }
        catch (JSONException jsonexception3)
        {
            MMLog.d(TAG, "Unable to get days in month");
        }
        try
        {
            String s3 = jsonobject.getString("monthsInYear:").replaceAll("\\[", "").replaceAll("\\]", "");
            stringbuilder.append("BYMONTH=").append(s3).append(";");
        }
        catch (JSONException jsonexception4)
        {
            MMLog.d(TAG, "Unable to get months in year:");
        }
        try
        {
            jsonobject = jsonobject.getString("daysInYear");
            stringbuilder.append("BYYEARDAY=").append(jsonobject).append(";");
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            MMLog.d(TAG, "Unable to get days in year");
        }
        return stringbuilder.toString().toUpperCase();
    }

    public MMJSResponse addEvent(Map map)
    {
        MMLog.d(TAG, (new StringBuilder()).append("addEvent parameters: ").append(map).toString());
        if (android.os.Build.VERSION.SDK_INT < 14) goto _L2; else goto _L1
_L1:
        if (map == null || map.get("parameters") == null) goto _L4; else goto _L3
_L3:
        Object obj;
        String s;
        String s1;
        String s2;
        String s3;
        String s4;
        String s5;
        Date date;
        Date date1;
        s = null;
        s3 = null;
        date = null;
        date1 = null;
        obj = null;
        s4 = null;
        s2 = null;
        s5 = null;
        s1 = null;
        Object obj1;
        JSONException jsonexception;
        JSONObject jsonobject;
        try
        {
            jsonobject = new JSONObject((String)map.get("parameters"));
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            MMLog.e(TAG, "Unable to parse calendar addEvent parameters");
            return MMJSResponse.responseWithError("Calendar Event Creation Failed.  Invalid parameters");
        }
        obj1 = jsonobject.getString("description");
        obj = obj1;
_L14:
        obj1 = jsonobject.getString("summary");
        s = ((String) (obj1));
_L5:
        obj1 = jsonobject.getString("transparency");
        s1 = ((String) (obj1));
_L6:
        obj1 = jsonobject.getString("reminder");
        s2 = ((String) (obj1));
_L7:
        obj1 = jsonobject.getString("location");
        s3 = ((String) (obj1));
_L8:
        obj1 = jsonobject.getString("status");
        s4 = ((String) (obj1));
_L9:
        obj1 = convertRecurrence(jsonobject.getJSONObject("recurrence"));
        s5 = ((String) (obj1));
_L10:
        obj1 = DateUtils.parseDate(jsonobject.getString("start"), mraidCreateCalendarEventDateFormats);
        date = ((Date) (obj1));
_L11:
        obj1 = DateUtils.parseDate(jsonobject.getString("end"), mraidCreateCalendarEventDateFormats);
        date1 = ((Date) (obj1));
_L12:
        MMLog.d(TAG, String.format("Creating calendar event: title: %s, location: %s, start: %s, end: %s, status: %s, summary: %s, rrule: %s", new Object[] {
            obj, s3, date, date1, s4, s, s5
        }));
        if (obj == null || date == null)
        {
            MMLog.e(TAG, "Description and start must be provided to create calendar event.");
            return MMJSResponse.responseWithError("Calendar Event Creation Failed.  Minimum parameters not provided");
        }
        break MISSING_BLOCK_LABEL_460;
        jsonexception;
        MMLog.e(TAG, "Unable to get calendar event description");
        continue; /* Loop/switch isn't completed */
        Object obj2;
        obj2;
        MMLog.d(TAG, "Unable to get calendar event description");
          goto _L5
        obj2;
        MMLog.d(TAG, "Unable to get calendar event transparency");
          goto _L6
        obj2;
        MMLog.d(TAG, "Unable to get calendar event reminder");
          goto _L7
        obj2;
        MMLog.d(TAG, "Unable to get calendar event location");
          goto _L8
        obj2;
        MMLog.d(TAG, "Unable to get calendar event status");
          goto _L9
        obj2;
        MMLog.d(TAG, "Unable to get calendar event recurrence");
          goto _L10
        obj2;
        MMLog.e(TAG, "Error parsing calendar event start date");
          goto _L11
        obj2;
        MMLog.e(TAG, "Unable to get calendar event start date");
          goto _L11
        obj2;
        MMLog.e(TAG, "Error parsing calendar event end date");
          goto _L12
        obj2;
        MMLog.d(TAG, "Unable to get calendar event end date");
          goto _L12
        Intent intent = (new Intent("android.intent.action.INSERT")).setData(android.provider.CalendarContract.Events.CONTENT_URI);
        if (date != null)
        {
            intent.putExtra("beginTime", date.getTime());
        }
        if (date1 != null)
        {
            intent.putExtra("endTime", date1.getTime());
        }
        if (obj != null)
        {
            intent.putExtra("title", ((String) (obj)));
        }
        if (s != null)
        {
            intent.putExtra("description", s);
        }
        if (s3 != null)
        {
            intent.putExtra("eventLocation", s3);
        }
        if (s5 != null)
        {
            intent.putExtra("rrule", s5);
        }
        if (s4 != null)
        {
            MMLog.w(TAG, "Calendar addEvent does not support status");
        }
        if (s1 != null)
        {
            MMLog.w(TAG, "Calendar addEvent does not support transparency");
        }
        if (s2 != null)
        {
            MMLog.w(TAG, "Calendar addEvent does not support reminder");
        }
        obj = (Context)contextRef.get();
        if (obj != null)
        {
            Utils.IntentUtils.startActivity(((Context) (obj)), intent);
            MMSDK.Event.intentStarted(((Context) (obj)), "calendar", getAdImplId((String)map.get("PROPERTY_EXPANDING")));
            return MMJSResponse.responseWithSuccess("Calendar Event Created");
        }
_L4:
        return null;
_L2:
        return MMJSResponse.responseWithError("Not supported");
        if (true) goto _L14; else goto _L13
_L13:
    }

    MMJSResponse executeCommand(String s, Map map)
    {
        MMJSResponse mmjsresponse = null;
        if ("addEvent".equals(s))
        {
            mmjsresponse = addEvent(map);
        }
        return mmjsresponse;
    }

}
