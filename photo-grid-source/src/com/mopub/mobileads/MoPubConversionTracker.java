// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mobileads;

import android.content.Context;
import android.content.SharedPreferences;
import com.mopub.common.SharedPreferencesHelper;
import com.mopub.common.logging.MoPubLog;
import com.mopub.network.TrackingRequest;

// Referenced classes of package com.mopub.mobileads:
//            v, u

public class MoPubConversionTracker
{

    private Context a;
    private String b;
    private SharedPreferences c;
    private String d;

    public MoPubConversionTracker()
    {
    }

    static String a(MoPubConversionTracker mopubconversiontracker)
    {
        return mopubconversiontracker.b;
    }

    static SharedPreferences b(MoPubConversionTracker mopubconversiontracker)
    {
        return mopubconversiontracker.c;
    }

    static String c(MoPubConversionTracker mopubconversiontracker)
    {
        return mopubconversiontracker.d;
    }

    static Context d(MoPubConversionTracker mopubconversiontracker)
    {
        return mopubconversiontracker.a;
    }

    public void reportAppOpen(Context context)
    {
        if (context == null)
        {
            return;
        }
        a = context;
        d = a.getPackageName();
        b = (new StringBuilder()).append(d).append(" tracked").toString();
        c = SharedPreferencesHelper.getSharedPreferences(a);
        if (!c.getBoolean(b, false))
        {
            TrackingRequest.makeTrackingHttpRequest((new v(this, (byte)0)).generateUrlString("ads.mopub.com"), a, new u(this));
            return;
        } else
        {
            MoPubLog.d("Conversion already tracked");
            return;
        }
    }
}
