// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.b;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Looper;
import android.util.Log;
import com.facebook.m;

// Referenced classes of package com.facebook.b:
//            al

public class d
{

    private static final String a = com/facebook/b/d.getCanonicalName();
    private static d f;
    private String b;
    private String c;
    private boolean d;
    private long e;

    public d()
    {
    }

    public static d a(Context context)
    {
        d d1;
        if (f != null && System.currentTimeMillis() - f.e < 0x36ee80L)
        {
            return f;
        }
        d1 = b(context);
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
                return d1;
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
        return d1;
        context = ((Context) (obj));
        k = ((Cursor) (obj)).getColumnIndex("aid");
        context = ((Context) (obj));
        i = ((Cursor) (obj)).getColumnIndex("androidid");
        context = ((Context) (obj));
        j = ((Cursor) (obj)).getColumnIndex("limit_tracking");
        context = ((Context) (obj));
        d1.b = ((Cursor) (obj)).getString(k);
        if (i <= 0 || j <= 0)
        {
            break MISSING_BLOCK_LABEL_250;
        }
        context = ((Context) (obj));
        if (d1.b() != null)
        {
            break MISSING_BLOCK_LABEL_250;
        }
        context = ((Context) (obj));
        d1.c = ((Cursor) (obj)).getString(i);
        context = ((Context) (obj));
        d1.d = Boolean.parseBoolean(((Cursor) (obj)).getString(j));
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        d1.e = System.currentTimeMillis();
        f = d1;
        return d1;
        exception;
        obj = null;
_L7:
        context = ((Context) (obj));
        Log.d(a, (new StringBuilder()).append("Caught unexpected exception in getAttributionId(): ").append(exception.toString()).toString());
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

    private static d b(Context context)
    {
        d d1 = new d();
        if (Looper.myLooper() == Looper.getMainLooper())
        {
            throw new m("getAndroidId cannot be called on the main thread.");
        }
          goto _L1
_L4:
        return d1;
_L1:
        Object obj = al.a("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", new Class[] {
            android/content/Context
        });
        if (obj == null)
        {
            return d1;
        }
        obj = al.a(null, ((java.lang.reflect.Method) (obj)), new Object[] {
            context
        });
        if ((obj instanceof Integer) && ((Integer)obj).intValue() == 0) goto _L3; else goto _L2
_L3:
        obj = al.a("com.google.android.gms.ads.identifier.AdvertisingIdClient", "getAdvertisingIdInfo", new Class[] {
            android/content/Context
        });
        if (obj == null)
        {
            return d1;
        }
        context = ((Context) (al.a(null, ((java.lang.reflect.Method) (obj)), new Object[] {
            context
        })));
        if (context == null)
        {
            return d1;
        }
        java.lang.reflect.Method method;
        obj = al.a(context.getClass(), "getId", new Class[0]);
        method = al.a(context.getClass(), "isLimitAdTrackingEnabled", new Class[0]);
        if (obj != null && method != null)
        {
            try
            {
                d1.c = (String)al.a(context, ((java.lang.reflect.Method) (obj)), new Object[0]);
                d1.d = ((Boolean)al.a(context, method, new Object[0])).booleanValue();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                al.a("android_id", context);
            }
        } else
        {
            return d1;
        }
        if (true) goto _L4; else goto _L2
_L2:
        return d1;
    }

    public String a()
    {
        return b;
    }

    public String b()
    {
        return c;
    }

    public boolean c()
    {
        return d;
    }

}
