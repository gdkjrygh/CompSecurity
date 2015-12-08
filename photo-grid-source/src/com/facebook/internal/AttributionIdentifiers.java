// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Looper;
import com.facebook.FacebookException;

// Referenced classes of package com.facebook.internal:
//            Utility

public class AttributionIdentifiers
{

    private static final String ANDROID_ID_COLUMN_NAME = "androidid";
    private static final String ATTRIBUTION_ID_COLUMN_NAME = "aid";
    private static final Uri ATTRIBUTION_ID_CONTENT_URI = Uri.parse("content://com.facebook.katana.provider.AttributionIdProvider");
    private static final int CONNECTION_RESULT_SUCCESS = 0;
    private static final long IDENTIFIER_REFRESH_INTERVAL_MILLIS = 0x36ee80L;
    private static final String LIMIT_TRACKING_COLUMN_NAME = "limit_tracking";
    private static final String TAG = com/facebook/internal/AttributionIdentifiers.getCanonicalName();
    private static AttributionIdentifiers recentlyFetchedIdentifiers;
    private String androidAdvertiserId;
    private String attributionId;
    private long fetchTime;
    private boolean limitTracking;

    public AttributionIdentifiers()
    {
    }

    private static AttributionIdentifiers getAndroidId(Context context)
    {
        AttributionIdentifiers attributionidentifiers = new AttributionIdentifiers();
        if (Looper.myLooper() == Looper.getMainLooper())
        {
            throw new FacebookException("getAndroidId cannot be called on the main thread.");
        }
          goto _L1
_L4:
        return attributionidentifiers;
_L1:
        Object obj = Utility.getMethodQuietly("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", new Class[] {
            android/content/Context
        });
        if (obj == null)
        {
            return attributionidentifiers;
        }
        obj = Utility.invokeMethodQuietly(null, ((java.lang.reflect.Method) (obj)), new Object[] {
            context
        });
        if ((obj instanceof Integer) && ((Integer)obj).intValue() == 0) goto _L3; else goto _L2
_L3:
        obj = Utility.getMethodQuietly("com.google.android.gms.ads.identifier.AdvertisingIdClient", "getAdvertisingIdInfo", new Class[] {
            android/content/Context
        });
        if (obj == null)
        {
            return attributionidentifiers;
        }
        context = ((Context) (Utility.invokeMethodQuietly(null, ((java.lang.reflect.Method) (obj)), new Object[] {
            context
        })));
        if (context == null)
        {
            return attributionidentifiers;
        }
        java.lang.reflect.Method method;
        obj = Utility.getMethodQuietly(context.getClass(), "getId", new Class[0]);
        method = Utility.getMethodQuietly(context.getClass(), "isLimitAdTrackingEnabled", new Class[0]);
        if (obj != null && method != null)
        {
            try
            {
                attributionidentifiers.androidAdvertiserId = (String)Utility.invokeMethodQuietly(context, ((java.lang.reflect.Method) (obj)), new Object[0]);
                attributionidentifiers.limitTracking = ((Boolean)Utility.invokeMethodQuietly(context, method, new Object[0])).booleanValue();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                Utility.logd("android_id", context);
            }
        } else
        {
            return attributionidentifiers;
        }
        if (true) goto _L4; else goto _L2
_L2:
        return attributionidentifiers;
    }

    public static AttributionIdentifiers getAttributionIdentifiers(Context context)
    {
        AttributionIdentifiers attributionidentifiers;
        if (recentlyFetchedIdentifiers != null && System.currentTimeMillis() - recentlyFetchedIdentifiers.fetchTime < 0x36ee80L)
        {
            return recentlyFetchedIdentifiers;
        }
        attributionidentifiers = getAndroidId(context);
        Cursor cursor = context.getContentResolver().query(ATTRIBUTION_ID_CONTENT_URI, new String[] {
            "aid", "androidid", "limit_tracking"
        }, null, null, null);
        if (cursor == null)
        {
            break MISSING_BLOCK_LABEL_84;
        }
        context = cursor;
        boolean flag = cursor.moveToFirst();
        if (flag)
        {
            break MISSING_BLOCK_LABEL_96;
        }
        if (cursor != null)
        {
            cursor.close();
        }
        return attributionidentifiers;
        context = cursor;
        int i = cursor.getColumnIndex("aid");
        context = cursor;
        int j = cursor.getColumnIndex("androidid");
        context = cursor;
        int k = cursor.getColumnIndex("limit_tracking");
        context = cursor;
        attributionidentifiers.attributionId = cursor.getString(i);
        if (j <= 0 || k <= 0)
        {
            break MISSING_BLOCK_LABEL_194;
        }
        context = cursor;
        if (attributionidentifiers.getAndroidAdvertiserId() != null)
        {
            break MISSING_BLOCK_LABEL_194;
        }
        context = cursor;
        attributionidentifiers.androidAdvertiserId = cursor.getString(j);
        context = cursor;
        attributionidentifiers.limitTracking = Boolean.parseBoolean(cursor.getString(k));
        if (cursor != null)
        {
            cursor.close();
        }
        attributionidentifiers.fetchTime = System.currentTimeMillis();
        recentlyFetchedIdentifiers = attributionidentifiers;
        return attributionidentifiers;
        Exception exception1;
        exception1;
        cursor = null;
_L4:
        context = cursor;
        (new StringBuilder("Caught unexpected exception in getAttributionId(): ")).append(exception1.toString());
        if (cursor != null)
        {
            cursor.close();
        }
        return null;
        Exception exception;
        exception;
        context = null;
_L2:
        if (context != null)
        {
            context.close();
        }
        throw exception;
        exception;
        if (true) goto _L2; else goto _L1
_L1:
        exception1;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public String getAndroidAdvertiserId()
    {
        return androidAdvertiserId;
    }

    public String getAttributionId()
    {
        return attributionId;
    }

    public boolean isTrackingLimited()
    {
        return limitTracking;
    }

}
