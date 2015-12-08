// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Looper;
import android.util.Log;
import com.facebook.FacebookException;

// Referenced classes of package com.facebook.internal:
//            Utility

public class AttributionIdentifiers
{

    private static final String ANDROID_ID_COLUMN_NAME = "androidid";
    private static final String ATTRIBUTION_ID_COLUMN_NAME = "aid";
    private static final String ATTRIBUTION_ID_CONTENT_PROVIDER = "com.facebook.katana.provider.AttributionIdProvider";
    private static final String ATTRIBUTION_ID_CONTENT_PROVIDER_WAKIZASHI = "com.facebook.wakizashi.provider.AttributionIdProvider";
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
        if (context.getPackageManager().resolveContentProvider("com.facebook.katana.provider.AttributionIdProvider", 0) == null) goto _L2; else goto _L1
_L1:
        Object obj = Uri.parse("content://com.facebook.katana.provider.AttributionIdProvider");
_L9:
        if (obj == null)
        {
            if (false)
            {
                throw new NullPointerException();
            } else
            {
                return attributionidentifiers;
            }
        }
          goto _L3
_L2:
        Exception exception;
        int i;
        int j;
        int k;
        boolean flag;
        if (context.getPackageManager().resolveContentProvider("com.facebook.wakizashi.provider.AttributionIdProvider", 0) != null)
        {
            obj = Uri.parse("content://com.facebook.wakizashi.provider.AttributionIdProvider");
            continue; /* Loop/switch isn't completed */
        }
        obj = null;
        continue; /* Loop/switch isn't completed */
_L3:
        obj = context.getContentResolver().query(((Uri) (obj)), new String[] {
            "aid", "androidid", "limit_tracking"
        }, null, null, null);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_141;
        }
        context = ((Context) (obj));
        flag = ((Cursor) (obj)).moveToFirst();
        if (flag)
        {
            break MISSING_BLOCK_LABEL_153;
        }
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        return attributionidentifiers;
        context = ((Context) (obj));
        k = ((Cursor) (obj)).getColumnIndex("aid");
        context = ((Context) (obj));
        j = ((Cursor) (obj)).getColumnIndex("androidid");
        context = ((Context) (obj));
        i = ((Cursor) (obj)).getColumnIndex("limit_tracking");
        context = ((Context) (obj));
        attributionidentifiers.attributionId = ((Cursor) (obj)).getString(k);
        if (j <= 0 || i <= 0)
        {
            break MISSING_BLOCK_LABEL_250;
        }
        context = ((Context) (obj));
        if (attributionidentifiers.getAndroidAdvertiserId() != null)
        {
            break MISSING_BLOCK_LABEL_250;
        }
        context = ((Context) (obj));
        attributionidentifiers.androidAdvertiserId = ((Cursor) (obj)).getString(j);
        context = ((Context) (obj));
        attributionidentifiers.limitTracking = Boolean.parseBoolean(((Cursor) (obj)).getString(i));
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        attributionidentifiers.fetchTime = System.currentTimeMillis();
        recentlyFetchedIdentifiers = attributionidentifiers;
        return attributionidentifiers;
        exception;
        obj = null;
_L7:
        context = ((Context) (obj));
        Log.d(TAG, (new StringBuilder()).append("Caught unexpected exception in getAttributionId(): ").append(exception.toString()).toString());
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        return null;
        obj;
        context = null;
_L5:
        if (context != null)
        {
            context.close();
        }
        throw obj;
        obj;
        if (true) goto _L5; else goto _L4
_L4:
        exception;
        if (true) goto _L7; else goto _L6
_L6:
        if (true) goto _L9; else goto _L8
_L8:
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
