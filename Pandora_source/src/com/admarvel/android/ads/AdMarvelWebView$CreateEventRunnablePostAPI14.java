// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

// Referenced classes of package com.admarvel.android.ads:
//            AdMarvelWebView, AdMarvelInternalWebView

private static class mAvailability
    implements Runnable
{

    private final WeakReference adMarvelInternalWebViewReference;
    private final WeakReference adMarvelWebViewReference;
    Long endDate;
    SimpleDateFormat format;
    String mAllDay;
    int mAvailability;
    String mCallback;
    String mDescription;
    String mExceptionDates;
    String mLocation;
    String mRecurrenceRule;
    int mReminder;
    int mStatus;
    String mTiltle;
    String mTimeZone;
    Long startDate;

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
        Object obj1 = contentresolver.query(android.provider.stAPI14.adMarvelInternalWebViewReference, new String[] {
            "_id", "calendar_displayName"
        }, null, null, null);
        if (obj1 == null) goto _L4; else goto _L3
_L3:
        obj = obj1;
        if (!((Cursor) (obj1)).moveToFirst()) goto _L4; else goto _L5
_L5:
        obj = obj1;
        Object obj4 = new String[((Cursor) (obj1)).getCount()];
        obj = obj1;
        Object obj3 = new int[((Cursor) (obj1)).getCount()];
        int i = 0;
_L13:
        obj = obj1;
        if (i < obj4.length) goto _L7; else goto _L6
_L6:
        obj = obj1;
        obj4 = new ContentValues();
        obj = obj1;
        ((ContentValues) (obj4)).put("calendar_id", Integer.valueOf(obj3[0]));
        obj = obj1;
        if (mTiltle == null)
        {
            break MISSING_BLOCK_LABEL_168;
        }
        obj = obj1;
        ((ContentValues) (obj4)).put("title", mTiltle);
        obj = obj1;
        if (mDescription == null)
        {
            break MISSING_BLOCK_LABEL_190;
        }
        obj = obj1;
        ((ContentValues) (obj4)).put("description", mDescription);
        obj = obj1;
        if (mLocation == null)
        {
            break MISSING_BLOCK_LABEL_212;
        }
        obj = obj1;
        ((ContentValues) (obj4)).put("eventLocation", mLocation);
        obj = obj1;
        if (startDate == null)
        {
            break MISSING_BLOCK_LABEL_234;
        }
        obj = obj1;
        ((ContentValues) (obj4)).put("dtstart", startDate);
        obj = obj1;
        if (endDate == null)
        {
            break MISSING_BLOCK_LABEL_256;
        }
        obj = obj1;
        ((ContentValues) (obj4)).put("dtend", endDate);
        obj = obj1;
        if (mAllDay == null)
        {
            break MISSING_BLOCK_LABEL_312;
        }
        obj = obj1;
        if (mAllDay.toLowerCase().equals("true"))
        {
            break MISSING_BLOCK_LABEL_299;
        }
        obj = obj1;
        if (!mAllDay.toLowerCase().equals("yes"))
        {
            break MISSING_BLOCK_LABEL_312;
        }
        obj = obj1;
        ((ContentValues) (obj4)).put("allDay", Integer.valueOf(1));
        obj = obj1;
        if (mReminder > 0)
        {
            break MISSING_BLOCK_LABEL_334;
        }
        obj = obj1;
        ((ContentValues) (obj4)).put("hasAlarm", Integer.valueOf(1));
        obj = obj1;
        if (mTimeZone == null) goto _L9; else goto _L8
_L8:
        obj = obj1;
        if (mTimeZone.length() <= 0) goto _L9; else goto _L10
_L10:
        obj = obj1;
        ((ContentValues) (obj4)).put("eventTimezone", mTimeZone);
_L14:
        obj = obj1;
        if (mRecurrenceRule == null)
        {
            break MISSING_BLOCK_LABEL_402;
        }
        obj = obj1;
        if (mRecurrenceRule.length() <= 0)
        {
            break MISSING_BLOCK_LABEL_402;
        }
        obj = obj1;
        ((ContentValues) (obj4)).put("rrule", mRecurrenceRule);
        obj = obj1;
        if (mExceptionDates == null)
        {
            break MISSING_BLOCK_LABEL_436;
        }
        obj = obj1;
        if (mExceptionDates.length() <= 0)
        {
            break MISSING_BLOCK_LABEL_436;
        }
        obj = obj1;
        ((ContentValues) (obj4)).put("exdate", mExceptionDates);
        obj = obj1;
        ((ContentValues) (obj4)).put("eventStatus", Integer.valueOf(mStatus));
        obj = obj1;
        ((ContentValues) (obj4)).put("availability", Integer.valueOf(mAvailability));
        obj = obj1;
        obj3 = contentresolver.insert(android.provider.stAPI14.mAvailability, ((ContentValues) (obj4)));
        if (obj3 == null) goto _L12; else goto _L11
_L11:
        obj = obj1;
        if (mReminder > 0)
        {
            break MISSING_BLOCK_LABEL_572;
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
        contentresolver.insert(android.provider.stAPI14.mReminder, ((ContentValues) (obj4)));
        obj = obj1;
        if (mCallback == null)
        {
            break MISSING_BLOCK_LABEL_626;
        }
        obj = obj1;
        if (mCallback.length() <= 0)
        {
            break MISSING_BLOCK_LABEL_626;
        }
        obj = obj1;
        admarvelinternalwebview.loadUrl((new StringBuilder("javascript:")).append(mCallback).append("(\"YES\")").toString());
_L17:
        if (obj1 != null)
        {
            ((Cursor) (obj1)).close();
            return;
        }
          goto _L1
_L7:
        obj = obj1;
        obj3[i] = ((Cursor) (obj1)).getInt(0);
        obj = obj1;
        obj4[i] = ((Cursor) (obj1)).getString(1);
        obj = obj1;
        ((Cursor) (obj1)).moveToNext();
        i++;
          goto _L13
_L9:
        obj = obj1;
        ((ContentValues) (obj4)).put("eventTimezone", TimeZone.getDefault().getID());
          goto _L14
        Object obj2;
        obj2;
_L22:
        obj = obj1;
        ((Exception) (obj2)).printStackTrace();
        obj = obj1;
        if (mCallback == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = obj1;
        if (mCallback.length() <= 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = obj1;
        admarvelinternalwebview.loadUrl((new StringBuilder("javascript:")).append(mCallback).append("(\"NO\")").toString());
        if (obj1 == null) goto _L1; else goto _L15
_L15:
        ((Cursor) (obj1)).close();
        return;
_L12:
        obj = obj1;
        if (mCallback == null) goto _L17; else goto _L16
_L16:
        obj = obj1;
        if (mCallback.length() <= 0) goto _L17; else goto _L18
_L18:
        obj = obj1;
        admarvelinternalwebview.loadUrl((new StringBuilder("javascript:")).append(mCallback).append("(\"NO\")").toString());
          goto _L17
        obj2;
        obj1 = obj;
        obj = obj2;
_L21:
        if (obj1 != null)
        {
            ((Cursor) (obj1)).close();
        }
        throw obj;
_L4:
        obj = obj1;
        if (mCallback == null) goto _L17; else goto _L19
_L19:
        obj = obj1;
        if (mCallback.length() <= 0) goto _L17; else goto _L20
_L20:
        obj = obj1;
        admarvelinternalwebview.loadUrl((new StringBuilder("javascript:")).append(mCallback).append("(\"NO\")").toString());
          goto _L17
        obj;
        obj1 = null;
          goto _L21
        obj2;
        obj1 = null;
          goto _L22
    }

    public (AdMarvelInternalWebView admarvelinternalwebview, AdMarvelWebView admarvelwebview, String s, String s1, String s2)
    {
        format = new SimpleDateFormat("yyyyMMddhhmm");
        startDate = null;
        endDate = null;
        mReminder = 1;
        mStatus = 0;
        mAvailability = 0;
        adMarvelWebViewReference = new WeakReference(admarvelwebview);
        adMarvelInternalWebViewReference = new WeakReference(admarvelinternalwebview);
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_110;
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

    public mDescription(AdMarvelInternalWebView admarvelinternalwebview, AdMarvelWebView admarvelwebview, String s, String s1, String s2, String s3, String s4, 
            String s5, int i)
    {
        format = new SimpleDateFormat("yyyyMMddhhmm");
        startDate = null;
        endDate = null;
        mReminder = 1;
        mStatus = 0;
        mAvailability = 0;
        adMarvelWebViewReference = new WeakReference(admarvelwebview);
        adMarvelInternalWebViewReference = new WeakReference(admarvelinternalwebview);
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_88;
        }
        startDate = Long.valueOf(format.parse(s).getTime());
        if (s5 == null)
        {
            break MISSING_BLOCK_LABEL_151;
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
        break MISSING_BLOCK_LABEL_181;
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
        mStatus = 0;
        mAvailability = 0;
        adMarvelWebViewReference = new WeakReference(admarvelwebview);
        adMarvelInternalWebViewReference = new WeakReference(admarvelinternalwebview);
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_88;
        }
        startDate = Long.valueOf(format.parse(s).getTime());
        if (s5 == null) goto _L2; else goto _L1
_L1:
        endDate = Long.valueOf(format.parse(s5).getTime());
_L11:
        mTiltle = s1;
        mDescription = s2;
        mLocation = s3;
        mAllDay = s4;
        if (i > 0)
        {
            break MISSING_BLOCK_LABEL_150;
        }
        mReminder = i / 60;
        if (s6 == null) goto _L4; else goto _L3
_L3:
        i = s6.length();
        if (i <= 0) goto _L4; else goto _L5
_L5:
        boolean flag = false;
        admarvelinternalwebview = s6.split(":");
        if (admarvelinternalwebview.length != 2) goto _L7; else goto _L6
_L6:
        if (!admarvelinternalwebview[0].startsWith("+")) goto _L9; else goto _L8
_L8:
        i = Integer.parseInt(admarvelinternalwebview[0].substring(1)) * 60 + Integer.parseInt(admarvelinternalwebview[1]);
_L13:
        admarvelinternalwebview = TimeZone.getAvailableIDs(i * 60 * 1000);
        if (admarvelinternalwebview == null) goto _L4; else goto _L10
_L10:
        if (admarvelinternalwebview.length > 0)
        {
            mTimeZone = admarvelinternalwebview[0];
        }
          goto _L4
_L2:
        endDate = Long.valueOf(format.parse(s).getTime() + 0x36ee80L);
          goto _L11
_L4:
        try
        {
            mRecurrenceRule = s8;
            mExceptionDates = s9;
            mCallback = s10;
            mStatus = j;
            mAvailability = k;
            return;
        }
        // Misplaced declaration of an exception variable
        catch (AdMarvelInternalWebView admarvelinternalwebview)
        {
            admarvelinternalwebview.printStackTrace();
        }
        return;
_L9:
        i = ((flag) ? 1 : 0);
        if (!admarvelinternalwebview[0].startsWith("-")) goto _L13; else goto _L12
_L12:
        i = (Integer.parseInt(admarvelinternalwebview[0].substring(1)) * 60 + Integer.parseInt(admarvelinternalwebview[1])) * -1;
          goto _L13
_L7:
        i = ((flag) ? 1 : 0);
        if (admarvelinternalwebview.length != 1) goto _L13; else goto _L14
_L14:
        if (!admarvelinternalwebview[0].startsWith("+"))
        {
            break MISSING_BLOCK_LABEL_389;
        }
        i = Integer.parseInt(admarvelinternalwebview[0].substring(1)) * 60;
          goto _L13
        i = ((flag) ? 1 : 0);
        if (!admarvelinternalwebview[0].startsWith("-")) goto _L13; else goto _L15
_L15:
        i = Integer.parseInt(admarvelinternalwebview[0].substring(1));
        i = i * 60 * -1;
          goto _L13
        admarvelinternalwebview;
        admarvelinternalwebview.printStackTrace();
          goto _L4
    }
}
