// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a.a.a.a.b;

import a.a.a.a.f;
import a.a.a.a.s;
import android.content.Context;
import java.lang.reflect.Method;

// Referenced classes of package a.a.a.a.a.b:
//            i, b

final class e
    implements i
{

    private final Context a;

    public e(Context context)
    {
        a = context.getApplicationContext();
    }

    private static boolean a(Context context)
    {
        int j;
        try
        {
            j = ((Integer)Class.forName("com.google.android.gms.common.GooglePlayServicesUtil").getMethod("isGooglePlayServicesAvailable", new Class[] {
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
        return j == 0;
    }

    private String b()
    {
        String s1;
        try
        {
            s1 = (String)Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient$Info").getMethod("getId", new Class[0]).invoke(d(), new Object[0]);
        }
        catch (Exception exception)
        {
            f.d().b("Fabric", "Could not call getId on com.google.android.gms.ads.identifier.AdvertisingIdClient$Info");
            return null;
        }
        return s1;
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
            f.d().b("Fabric", "Could not call isLimitAdTrackingEnabled on com.google.android.gms.ads.identifier.AdvertisingIdClient$Info");
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
            f.d().b("Fabric", "Could not call getAdvertisingIdInfo on com.google.android.gms.ads.identifier.AdvertisingIdClient");
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
