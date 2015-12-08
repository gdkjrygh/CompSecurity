// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Looper;
import android.util.Log;
import com.facebook.l;

// Referenced classes of package com.facebook.internal:
//            aw

public class a
{

    private static final String a = com/facebook/internal/a.getCanonicalName();
    private static final Uri b = Uri.parse("content://com.facebook.katana.provider.AttributionIdProvider");
    private static a g;
    private String c;
    private String d;
    private boolean e;
    private long f;

    public a()
    {
    }

    public static a a(Context context)
    {
        a a1;
        if (g != null && System.currentTimeMillis() - g.f < 0x36ee80L)
        {
            return g;
        }
        a1 = b(context);
        Cursor cursor = context.getContentResolver().query(b, new String[] {
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
        return a1;
        context = cursor;
        int i = cursor.getColumnIndex("aid");
        context = cursor;
        int j = cursor.getColumnIndex("androidid");
        context = cursor;
        int k = cursor.getColumnIndex("limit_tracking");
        context = cursor;
        a1.c = cursor.getString(i);
        if (j <= 0 || k <= 0)
        {
            break MISSING_BLOCK_LABEL_194;
        }
        context = cursor;
        if (a1.d != null)
        {
            break MISSING_BLOCK_LABEL_194;
        }
        context = cursor;
        a1.d = cursor.getString(j);
        context = cursor;
        a1.e = Boolean.parseBoolean(cursor.getString(k));
        if (cursor != null)
        {
            cursor.close();
        }
        a1.f = System.currentTimeMillis();
        g = a1;
        return a1;
        Exception exception1;
        exception1;
        cursor = null;
_L4:
        context = cursor;
        Log.d(a, (new StringBuilder("Caught unexpected exception in getAttributionId(): ")).append(exception1.toString()).toString());
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

    private static a b(Context context)
    {
        a a1 = new a();
        if (Looper.myLooper() == Looper.getMainLooper())
        {
            throw new l("getAndroidId cannot be called on the main thread.");
        }
          goto _L1
_L4:
        return a1;
_L1:
        Object obj = aw.a("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", new Class[] {
            android/content/Context
        });
        if (obj == null)
        {
            return a1;
        }
        obj = aw.a(null, ((java.lang.reflect.Method) (obj)), new Object[] {
            context
        });
        if ((obj instanceof Integer) && ((Integer)obj).intValue() == 0) goto _L3; else goto _L2
_L3:
        obj = aw.a("com.google.android.gms.ads.identifier.AdvertisingIdClient", "getAdvertisingIdInfo", new Class[] {
            android/content/Context
        });
        if (obj == null)
        {
            return a1;
        }
        context = ((Context) (aw.a(null, ((java.lang.reflect.Method) (obj)), new Object[] {
            context
        })));
        if (context == null)
        {
            return a1;
        }
        java.lang.reflect.Method method;
        obj = aw.a(context.getClass(), "getId", new Class[0]);
        method = aw.a(context.getClass(), "isLimitAdTrackingEnabled", new Class[0]);
        if (obj != null && method != null)
        {
            try
            {
                a1.d = (String)aw.a(context, ((java.lang.reflect.Method) (obj)), new Object[0]);
                a1.e = ((Boolean)aw.a(context, method, new Object[0])).booleanValue();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                aw.a("android_id", context);
            }
        } else
        {
            return a1;
        }
        if (true) goto _L4; else goto _L2
_L2:
        return a1;
    }

    public final String a()
    {
        return c;
    }

    public final String b()
    {
        return d;
    }

    public final boolean c()
    {
        return e;
    }

}
