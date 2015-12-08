// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobileapptracker;

import android.content.Context;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;

// Referenced classes of package com.mobileapptracker:
//            MATParameters, MobileAppTracker

class b
    implements Runnable
{

    final MATParameters a;
    private final WeakReference b;

    public void run()
    {
        String s;
        int i;
        boolean flag;
        try
        {
            Object obj = Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient").getDeclaredMethod("getAdvertisingIdInfo", new Class[] {
                android/content/Context
            }).invoke(null, new Object[] {
                b.get()
            });
            s = (String)Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient$Info").getDeclaredMethod("getId", new Class[0]).invoke(obj, new Object[0]);
            flag = ((Boolean)Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient$Info").getDeclaredMethod("isLimitAdTrackingEnabled", new Class[0]).invoke(obj, new Object[0])).booleanValue();
            if (MATParameters.a(a).e != null)
            {
                break MISSING_BLOCK_LABEL_133;
            }
            a.p(s);
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
            Log.d("MobileAppTracker", "MAT SDK failed to get Google Advertising Id, collecting ANDROID_ID instead");
            if (MATParameters.a(a).e == null)
            {
                a.c(android.provider.ing(((Context)b.get()).getContentResolver(), "android_id"));
            }
            MATParameters.a(a).a(android.provider.ing(((Context)b.get()).getContentResolver(), "android_id"));
            return;
        }
        if (flag)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        a.q(Integer.toString(i));
        MATParameters.a(a).a(s, flag);
        return;
    }

    public (MATParameters matparameters, Context context)
    {
        a = matparameters;
        super();
        b = new WeakReference(context);
    }
}
