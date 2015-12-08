// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a.a.a.a.b;

import android.content.Context;
import b.a.a.a.d;
import java.lang.reflect.Method;

// Referenced classes of package b.a.a.a.a.b:
//            g, b

final class e
    implements g
{

    private final Context a;

    public e(Context context)
    {
        a = context.getApplicationContext();
    }

    private static boolean a(Context context)
    {
        int i;
        try
        {
            i = ((Integer)Class.forName("com.google.android.gms.common.GooglePlayServicesUtil").getMethod("isGooglePlayServicesAvailable", new Class[] {
                android/content/Context
            }).invoke(null, new Object[] {
                context
            })).intValue();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return false;
        }
        return i == 0;
    }

    private String b()
    {
        String s;
        try
        {
            s = (String)Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient$Info").getMethod("getId", new Class[0]).invoke(d(), new Object[0]);
        }
        catch (Exception exception)
        {
            b.a.a.a.d.a();
            return null;
        }
        return s;
    }

    private boolean c()
    {
        boolean flag;
        try
        {
            flag = ((Boolean)Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient$Info").getMethod("isLimitAdTrackingEnabled", new Class[0]).invoke(d(), new Object[0])).booleanValue();
        }
        catch (Exception exception)
        {
            b.a.a.a.d.a();
            return false;
        }
        return flag;
    }

    private Object d()
    {
        Object obj;
        try
        {
            obj = Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient").getMethod("getAdvertisingIdInfo", new Class[] {
                android/content/Context
            }).invoke(null, new Object[] {
                a
            });
        }
        catch (Exception exception)
        {
            b.a.a.a.d.a();
            return null;
        }
        return obj;
    }

    public final b a()
    {
        if (a(a))
        {
            return new b(b(), c());
        } else
        {
            return null;
        }
    }
}
