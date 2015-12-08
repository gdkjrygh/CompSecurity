// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.common;

import android.content.Context;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import java.lang.reflect.Method;

// Referenced classes of package io.fabric.sdk.android.services.common:
//            AdvertisingInfoStrategy, AdvertisingInfo

class AdvertisingInfoReflectionStrategy
    implements AdvertisingInfoStrategy
{

    private final Context a;

    public AdvertisingInfoReflectionStrategy(Context context)
    {
        a = context.getApplicationContext();
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
            Fabric.g().c("Fabric", "Could not call getId on com.google.android.gms.ads.identifier.AdvertisingIdClient$Info");
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
            Fabric.g().c("Fabric", "Could not call isLimitAdTrackingEnabled on com.google.android.gms.ads.identifier.AdvertisingIdClient$Info");
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
            Fabric.g().c("Fabric", "Could not call getAdvertisingIdInfo on com.google.android.gms.ads.identifier.AdvertisingIdClient");
            return null;
        }
        return obj;
    }

    public AdvertisingInfo a()
    {
        if (a(a))
        {
            return new AdvertisingInfo(b(), c());
        } else
        {
            return null;
        }
    }

    boolean a(Context context)
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
}
