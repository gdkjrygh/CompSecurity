// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.Date;

// Referenced classes of package com.admarvel.android.ads:
//            AdMarvelActivity, Version, AdMarvelInternalWebView

private static class format
    implements Runnable
{

    private final WeakReference adMarvelActivityReference;
    private final WeakReference adMarvelInternalWebViewReference;
    Long endDate;
    SimpleDateFormat format;
    String mAllDay;
    String mCallback;
    String mDescription;
    String mLocation;
    int mReminder;
    String mTiltle;
    String mTimeZone;
    Long startDate;

    String getCalendarBaseURI()
    {
        if (Version.getAndroidSDKVersion() >= 8)
        {
            return "content://com.android.calendar/";
        } else
        {
            return "content://calendar/";
        }
    }

    public void run()
    {
        Object obj;
        Cursor cursor;
        AdMarvelInternalWebView admarvelinternalwebview;
        Cursor cursor1;
        cursor = null;
        cursor1 = null;
        if (adMarvelActivityReference != null)
        {
            obj = (AdMarvelActivity)adMarvelActivityReference.get();
        } else
        {
            obj = null;
        }
        if (adMarvelInternalWebViewReference != null)
        {
            admarvelinternalwebview = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get();
        } else
        {
            admarvelinternalwebview = null;
        }
        if (obj != null && admarvelinternalwebview != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        ContentResolver contentresolver;
        contentresolver = ((AdMarvelActivity) (obj)).getContentResolver();
        obj = cursor1;
        cursor1 = contentresolver.query(Uri.parse((new StringBuilder(String.valueOf(getCalendarBaseURI()))).append("calendars").toString()), new String[] {
            "_id", "displayname"
        }, null, null, null);
        if (cursor1 == null) goto _L4; else goto _L3
_L3:
        obj = cursor1;
        cursor = cursor1;
        if (!cursor1.moveToFirst()) goto _L4; else goto _L5
_L5:
        obj = cursor1;
        cursor = cursor1;
        Object obj2 = new String[cursor1.getCount()];
        obj = cursor1;
        cursor = cursor1;
        Object obj1 = new int[cursor1.getCount()];
        int i = 0;
_L12:
        obj = cursor1;
        cursor = cursor1;
        if (i < obj2.length) goto _L7; else goto _L6
_L6:
        obj = cursor1;
        cursor = cursor1;
        obj2 = new ContentValues();
        obj = cursor1;
        cursor = cursor1;
        ((ContentValues) (obj2)).put("calendar_id", Integer.valueOf(obj1[0]));
        obj = cursor1;
        cursor = cursor1;
        if (mTiltle == null)
        {
            break MISSING_BLOCK_LABEL_256;
        }
        obj = cursor1;
        cursor = cursor1;
        ((ContentValues) (obj2)).put("title", mTiltle);
        obj = cursor1;
        cursor = cursor1;
        if (mDescription == null)
        {
            break MISSING_BLOCK_LABEL_286;
        }
        obj = cursor1;
        cursor = cursor1;
        ((ContentValues) (obj2)).put("description", mDescription);
        obj = cursor1;
        cursor = cursor1;
        if (mLocation == null)
        {
            break MISSING_BLOCK_LABEL_316;
        }
        obj = cursor1;
        cursor = cursor1;
        ((ContentValues) (obj2)).put("eventLocation", mLocation);
        obj = cursor1;
        cursor = cursor1;
        if (startDate == null)
        {
            break MISSING_BLOCK_LABEL_346;
        }
        obj = cursor1;
        cursor = cursor1;
        ((ContentValues) (obj2)).put("dtstart", startDate);
        obj = cursor1;
        cursor = cursor1;
        if (endDate == null)
        {
            break MISSING_BLOCK_LABEL_376;
        }
        obj = cursor1;
        cursor = cursor1;
        ((ContentValues) (obj2)).put("dtend", endDate);
        obj = cursor1;
        cursor = cursor1;
        if (mAllDay == null)
        {
            break MISSING_BLOCK_LABEL_448;
        }
        obj = cursor1;
        cursor = cursor1;
        if (mAllDay.toLowerCase().equals("true"))
        {
            break MISSING_BLOCK_LABEL_431;
        }
        obj = cursor1;
        cursor = cursor1;
        if (!mAllDay.toLowerCase().equals("yes"))
        {
            break MISSING_BLOCK_LABEL_448;
        }
        obj = cursor1;
        cursor = cursor1;
        ((ContentValues) (obj2)).put("allDay", Integer.valueOf(1));
        obj = cursor1;
        cursor = cursor1;
        if (mReminder > 0)
        {
            break MISSING_BLOCK_LABEL_478;
        }
        obj = cursor1;
        cursor = cursor1;
        ((ContentValues) (obj2)).put("hasAlarm", Integer.valueOf(1));
        obj = cursor1;
        cursor = cursor1;
        if (mTimeZone == null)
        {
            break MISSING_BLOCK_LABEL_524;
        }
        obj = cursor1;
        cursor = cursor1;
        if (mTimeZone.length() <= 0)
        {
            break MISSING_BLOCK_LABEL_524;
        }
        obj = cursor1;
        cursor = cursor1;
        ((ContentValues) (obj2)).put("eventTimezone", mTimeZone);
        obj = cursor1;
        cursor = cursor1;
        Object obj3 = Uri.parse((new StringBuilder(String.valueOf(getCalendarBaseURI()))).append("events").toString());
        obj = cursor1;
        cursor = cursor1;
        obj1 = Uri.parse((new StringBuilder(String.valueOf(getCalendarBaseURI()))).append("reminders").toString());
        obj = cursor1;
        cursor = cursor1;
        obj2 = contentresolver.insert(((Uri) (obj3)), ((ContentValues) (obj2)));
        if (obj2 == null) goto _L9; else goto _L8
_L8:
        obj = cursor1;
        cursor = cursor1;
        if (mReminder > 0)
        {
            break MISSING_BLOCK_LABEL_720;
        }
        obj = cursor1;
        cursor = cursor1;
        obj3 = new ContentValues();
        obj = cursor1;
        cursor = cursor1;
        ((ContentValues) (obj3)).put("event_id", Long.valueOf(Long.parseLong(((Uri) (obj2)).getLastPathSegment())));
        obj = cursor1;
        cursor = cursor1;
        ((ContentValues) (obj3)).put("method", Integer.valueOf(1));
        obj = cursor1;
        cursor = cursor1;
        ((ContentValues) (obj3)).put("minutes", Integer.valueOf(Math.abs(mReminder)));
        obj = cursor1;
        cursor = cursor1;
        contentresolver.insert(((Uri) (obj1)), ((ContentValues) (obj3)));
        obj = cursor1;
        cursor = cursor1;
        if (mCallback == null) goto _L4; else goto _L10
_L10:
        obj = cursor1;
        cursor = cursor1;
        if (mCallback.length() <= 0) goto _L4; else goto _L11
_L11:
        obj = cursor1;
        cursor = cursor1;
        admarvelinternalwebview.loadUrl((new StringBuilder("javascript:")).append(mCallback).append("(\"YES\")").toString());
_L4:
        if (cursor1 != null)
        {
            cursor1.close();
            return;
        }
          goto _L1
_L7:
        obj = cursor1;
        cursor = cursor1;
        obj1[i] = cursor1.getInt(0);
        obj = cursor1;
        cursor = cursor1;
        obj2[i] = cursor1.getString(1);
        obj = cursor1;
        cursor = cursor1;
        cursor1.moveToNext();
        i++;
          goto _L12
_L9:
        obj = cursor1;
        cursor = cursor1;
        if (mCallback == null) goto _L4; else goto _L13
_L13:
        obj = cursor1;
        cursor = cursor1;
        if (mCallback.length() <= 0) goto _L4; else goto _L14
_L14:
        obj = cursor1;
        cursor = cursor1;
        admarvelinternalwebview.loadUrl((new StringBuilder("javascript:")).append(mCallback).append("(\"NO\")").toString());
          goto _L4
        Exception exception1;
        exception1;
        cursor = ((Cursor) (obj));
        if (mCallback == null)
        {
            break MISSING_BLOCK_LABEL_978;
        }
        cursor = ((Cursor) (obj));
        if (mCallback.length() <= 0)
        {
            break MISSING_BLOCK_LABEL_978;
        }
        cursor = ((Cursor) (obj));
        admarvelinternalwebview.loadUrl((new StringBuilder("javascript:")).append(mCallback).append("(\"NO\")").toString());
        cursor = ((Cursor) (obj));
        exception1.printStackTrace();
        if (obj == null) goto _L1; else goto _L15
_L15:
        ((Cursor) (obj)).close();
        return;
        Exception exception;
        exception;
        if (cursor != null)
        {
            cursor.close();
        }
        throw exception;
    }

    public (AdMarvelInternalWebView admarvelinternalwebview, AdMarvelActivity admarvelactivity, String s, String s1, String s2)
    {
        format = new SimpleDateFormat("yyyyMMddhhmm");
        startDate = null;
        endDate = null;
        mReminder = 1;
        adMarvelActivityReference = new WeakReference(admarvelactivity);
        adMarvelInternalWebViewReference = new WeakReference(admarvelinternalwebview);
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_100;
        }
        startDate = Long.valueOf(format.parse(s).getTime());
        endDate = Long.valueOf(format.parse(s).getTime() + 0x36ee80L);
        mTiltle = s1;
        mDescription = s2;
        return;
        admarvelinternalwebview;
        admarvelinternalwebview.printStackTrace();
        return;
    }

    public mDescription(AdMarvelInternalWebView admarvelinternalwebview, AdMarvelActivity admarvelactivity, String s, String s1, String s2, String s3, String s4, 
            String s5, int i)
    {
        format = new SimpleDateFormat("yyyyMMddhhmm");
        startDate = null;
        endDate = null;
        mReminder = 1;
        adMarvelActivityReference = new WeakReference(admarvelactivity);
        adMarvelInternalWebViewReference = new WeakReference(admarvelinternalwebview);
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_78;
        }
        startDate = Long.valueOf(format.parse(s).getTime());
        if (s5 == null)
        {
            break MISSING_BLOCK_LABEL_141;
        }
        endDate = Long.valueOf(format.parse(s5).getTime());
_L1:
        mTiltle = s1;
        mDescription = s2;
        mLocation = s3;
        mAllDay = s4;
        if (i <= 0)
        {
            try
            {
                mReminder = i / 60;
                return;
            }
            // Misplaced declaration of an exception variable
            catch (AdMarvelInternalWebView admarvelinternalwebview)
            {
                admarvelinternalwebview.printStackTrace();
            }
        }
        break MISSING_BLOCK_LABEL_171;
        endDate = Long.valueOf(format.parse(s).getTime() + 0x36ee80L);
          goto _L1
    }

    public format(AdMarvelInternalWebView admarvelinternalwebview, AdMarvelActivity admarvelactivity, String s, String s1, String s2, String s3, String s4, 
            String s5, int i, String s6, String s7, String s8, String s9, int j, 
            int k, String s10)
    {
        format = new SimpleDateFormat("yyyyMMddhhmm");
        startDate = null;
        endDate = null;
        mReminder = 1;
        adMarvelActivityReference = new WeakReference(admarvelactivity);
        adMarvelInternalWebViewReference = new WeakReference(admarvelinternalwebview);
        if (s != null)
        {
            try
            {
                startDate = Long.valueOf(format.parse(s).getTime());
            }
            // Misplaced declaration of an exception variable
            catch (AdMarvelInternalWebView admarvelinternalwebview)
            {
                admarvelinternalwebview.printStackTrace();
                return;
            }
        }
        if (s5 == null)
        {
            break MISSING_BLOCK_LABEL_166;
        }
        endDate = Long.valueOf(format.parse(s5).getTime());
_L1:
        mTiltle = s1;
        mDescription = s2;
        mLocation = s3;
        mAllDay = s4;
        if (i > 0)
        {
            break MISSING_BLOCK_LABEL_140;
        }
        mReminder = i / 60;
        if (s6 == null)
        {
            break MISSING_BLOCK_LABEL_159;
        }
        if (s6.length() > 0)
        {
            mTimeZone = s6;
        }
        mCallback = s10;
        return;
        endDate = Long.valueOf(format.parse(s).getTime() + 0x36ee80L);
          goto _L1
    }
}
