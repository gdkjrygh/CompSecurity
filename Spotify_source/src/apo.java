// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Looper;
import android.util.Log;
import com.facebook.FacebookException;

public class apo
{

    private static final String d = apo.getCanonicalName();
    private static final Uri e = Uri.parse("content://com.facebook.katana.provider.AttributionIdProvider");
    private static apo g;
    public String a;
    public String b;
    boolean c;
    private long f;

    public apo()
    {
    }

    public static apo a(Context context)
    {
        apo apo1;
        if (g != null && System.currentTimeMillis() - g.f < 0x36ee80L)
        {
            return g;
        }
        apo1 = b(context);
        int i;
        int j;
        int k;
        try
        {
            context = context.getContentResolver().query(e, new String[] {
                "aid", "androidid", "limit_tracking"
            }, null, null, null);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.d(d, (new StringBuilder("Caught unexpected exception in getAttributionId(): ")).append(context.toString()).toString());
            return null;
        }
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_210;
        }
        if (!context.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_210;
        }
        i = context.getColumnIndex("aid");
        j = context.getColumnIndex("androidid");
        k = context.getColumnIndex("limit_tracking");
        apo1.a = context.getString(i);
        if (j <= 0 || k <= 0)
        {
            break MISSING_BLOCK_LABEL_162;
        }
        if (apo1.b == null)
        {
            apo1.b = context.getString(j);
            apo1.c = Boolean.parseBoolean(context.getString(k));
        }
        context.close();
        apo1.f = System.currentTimeMillis();
        g = apo1;
        return apo1;
        return apo1;
    }

    private static apo b(Context context)
    {
        apo apo1 = new apo();
        if (Looper.myLooper() == Looper.getMainLooper())
        {
            throw new FacebookException("getAndroidId cannot be called on the main thread.");
        }
          goto _L1
_L4:
        return apo1;
_L1:
        Object obj = arp.a("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", new Class[] {
            android/content/Context
        });
        if (obj == null)
        {
            return apo1;
        }
        obj = arp.a(null, ((java.lang.reflect.Method) (obj)), new Object[] {
            context
        });
        if ((obj instanceof Integer) && ((Integer)obj).intValue() == 0) goto _L3; else goto _L2
_L3:
        obj = arp.a("com.google.android.gms.ads.identifier.AdvertisingIdClient", "getAdvertisingIdInfo", new Class[] {
            android/content/Context
        });
        if (obj == null)
        {
            return apo1;
        }
        context = ((Context) (arp.a(null, ((java.lang.reflect.Method) (obj)), new Object[] {
            context
        })));
        if (context == null)
        {
            return apo1;
        }
        java.lang.reflect.Method method;
        obj = arp.a(context.getClass(), "getId", new Class[0]);
        method = arp.a(context.getClass(), "isLimitAdTrackingEnabled", new Class[0]);
        if (obj != null && method != null)
        {
            try
            {
                apo1.b = (String)arp.a(context, ((java.lang.reflect.Method) (obj)), new Object[0]);
                apo1.c = ((Boolean)arp.a(context, method, new Object[0])).booleanValue();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                arp.a("android_id", context);
            }
        } else
        {
            return apo1;
        }
        if (true) goto _L4; else goto _L2
_L2:
        return apo1;
    }

}
