// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import com.admarvel.android.util.Logging;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.Date;

// Referenced classes of package com.admarvel.android.ads:
//            AdMarvelWebView, Version, AdMarvelInternalWebView

private static class format
    implements Runnable
{

    private final WeakReference adMarvelInternalWebViewReference;
    private final WeakReference adMarvelWebViewReference;
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
        AdMarvelInternalWebView admarvelinternalwebview;
        obj = (AdMarvelWebView)adMarvelWebViewReference.get();
        admarvelinternalwebview = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get();
        if (obj != null && admarvelinternalwebview != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        ContentResolver contentresolver = ((AdMarvelWebView) (obj)).getContext().getContentResolver();
        Object obj1 = contentresolver.query(Uri.parse((new StringBuilder(String.valueOf(getCalendarBaseURI()))).append("calendars").toString()), new String[] {
            "_id", "displayname"
        }, null, null, null);
        if (obj1 == null) goto _L4; else goto _L3
_L3:
        obj = obj1;
        if (!((Cursor) (obj1)).moveToFirst()) goto _L4; else goto _L5
_L5:
        obj = obj1;
        Object obj3 = new String[((Cursor) (obj1)).getCount()];
        obj = obj1;
        Object obj2 = new int[((Cursor) (obj1)).getCount()];
        int i = 0;
_L12:
        obj = obj1;
        if (i < obj3.length) goto _L7; else goto _L6
_L6:
        obj = obj1;
        obj3 = new ContentValues();
        obj = obj1;
        ((ContentValues) (obj3)).put("calendar_id", Integer.valueOf(obj2[0]));
        obj = obj1;
        if (mTiltle == null)
        {
            break MISSING_BLOCK_LABEL_190;
        }
        obj = obj1;
        ((ContentValues) (obj3)).put("title", mTiltle);
        obj = obj1;
        if (mDescription == null)
        {
            break MISSING_BLOCK_LABEL_212;
        }
        obj = obj1;
        ((ContentValues) (obj3)).put("description", mDescription);
        obj = obj1;
        if (mLocation == null)
        {
            break MISSING_BLOCK_LABEL_234;
        }
        obj = obj1;
        ((ContentValues) (obj3)).put("eventLocation", mLocation);
        obj = obj1;
        if (startDate == null)
        {
            break MISSING_BLOCK_LABEL_256;
        }
        obj = obj1;
        ((ContentValues) (obj3)).put("dtstart", startDate);
        obj = obj1;
        if (endDate == null)
        {
            break MISSING_BLOCK_LABEL_278;
        }
        obj = obj1;
        ((ContentValues) (obj3)).put("dtend", endDate);
        obj = obj1;
        if (mAllDay == null)
        {
            break MISSING_BLOCK_LABEL_334;
        }
        obj = obj1;
        if (mAllDay.toLowerCase().equals("true"))
        {
            break MISSING_BLOCK_LABEL_321;
        }
        obj = obj1;
        if (!mAllDay.toLowerCase().equals("yes"))
        {
            break MISSING_BLOCK_LABEL_334;
        }
        obj = obj1;
        ((ContentValues) (obj3)).put("allDay", Integer.valueOf(1));
        obj = obj1;
        if (mReminder > 0)
        {
            break MISSING_BLOCK_LABEL_356;
        }
        obj = obj1;
        ((ContentValues) (obj3)).put("hasAlarm", Integer.valueOf(1));
        obj = obj1;
        if (mTimeZone == null)
        {
            break MISSING_BLOCK_LABEL_390;
        }
        obj = obj1;
        if (mTimeZone.length() <= 0)
        {
            break MISSING_BLOCK_LABEL_390;
        }
        obj = obj1;
        ((ContentValues) (obj3)).put("eventTimezone", mTimeZone);
        obj = obj1;
        Object obj4 = Uri.parse((new StringBuilder(String.valueOf(getCalendarBaseURI()))).append("events").toString());
        obj = obj1;
        obj2 = Uri.parse((new StringBuilder(String.valueOf(getCalendarBaseURI()))).append("reminders").toString());
        obj = obj1;
        obj3 = contentresolver.insert(((Uri) (obj4)), ((ContentValues) (obj3)));
        if (obj3 == null) goto _L9; else goto _L8
_L8:
        obj = obj1;
        if (mReminder > 0)
        {
            break MISSING_BLOCK_LABEL_548;
        }
        obj = obj1;
        obj4 = new ContentValues();
        obj = obj1;
        ((ContentValues) (obj4)).put("event_id", Long.valueOf(Long.parseLong(((Uri) (obj3)).getLastPathSegment())));
        obj = obj1;
        ((ContentValues) (obj4)).put("method", Integer.valueOf(1));
        obj = obj1;
        ((ContentValues) (obj4)).put("minutes", Integer.valueOf(Math.abs(mReminder)));
        obj = obj1;
        contentresolver.insert(((Uri) (obj2)), ((ContentValues) (obj4)));
        obj = obj1;
        if (mCallback == null) goto _L4; else goto _L10
_L10:
        obj = obj1;
        if (mCallback.length() <= 0) goto _L4; else goto _L11
_L11:
        obj = obj1;
        admarvelinternalwebview.loadUrl((new StringBuilder("javascript:")).append(mCallback).append("(\"YES\")").toString());
_L4:
        if (obj1 != null)
        {
            ((Cursor) (obj1)).close();
            return;
        }
          goto _L1
_L7:
        obj = obj1;
        obj2[i] = ((Cursor) (obj1)).getInt(0);
        obj = obj1;
        obj3[i] = ((Cursor) (obj1)).getString(1);
        obj = obj1;
        ((Cursor) (obj1)).moveToNext();
        i++;
          goto _L12
_L9:
        obj = obj1;
        if (mCallback == null) goto _L4; else goto _L13
_L13:
        obj = obj1;
        if (mCallback.length() <= 0) goto _L4; else goto _L14
_L14:
        obj = obj1;
        admarvelinternalwebview.loadUrl((new StringBuilder("javascript:")).append(mCallback).append("(\"NO\")").toString());
          goto _L4
        Exception exception;
        exception;
_L18:
        obj = obj1;
        if (mCallback == null)
        {
            break MISSING_BLOCK_LABEL_771;
        }
        obj = obj1;
        if (mCallback.length() <= 0)
        {
            break MISSING_BLOCK_LABEL_771;
        }
        obj = obj1;
        admarvelinternalwebview.loadUrl((new StringBuilder("javascript:")).append(mCallback).append("(\"NO\")").toString());
        obj = obj1;
        exception.printStackTrace();
        if (obj1 == null) goto _L1; else goto _L15
_L15:
        ((Cursor) (obj1)).close();
        return;
        obj1;
        obj = null;
_L17:
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        throw obj1;
        obj1;
        if (true) goto _L17; else goto _L16
_L16:
        exception;
        obj1 = null;
          goto _L18
    }

    public (AdMarvelInternalWebView admarvelinternalwebview, AdMarvelWebView admarvelwebview, String s, String s1, String s2)
    {
        format = new SimpleDateFormat("yyyyMMddhhmm");
        startDate = null;
        endDate = null;
        mReminder = 1;
        adMarvelWebViewReference = new WeakReference(admarvelwebview);
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
        Logging.log(Log.getStackTraceString(admarvelinternalwebview));
        return;
    }

    public mDescription(AdMarvelInternalWebView admarvelinternalwebview, AdMarvelWebView admarvelwebview, String s, String s1, String s2, String s3, String s4, 
            String s5, int i)
    {
        format = new SimpleDateFormat("yyyyMMddhhmm");
        startDate = null;
        endDate = null;
        mReminder = 1;
        adMarvelWebViewReference = new WeakReference(admarvelwebview);
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

    public format(AdMarvelInternalWebView admarvelinternalwebview, AdMarvelWebView admarvelwebview, String s, String s1, String s2, String s3, String s4, 
            String s5, int i, String s6, String s7, String s8, String s9, int j, 
            int k, String s10)
    {
        format = new SimpleDateFormat("yyyyMMddhhmm");
        startDate = null;
        endDate = null;
        mReminder = 1;
        adMarvelWebViewReference = new WeakReference(admarvelwebview);
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
