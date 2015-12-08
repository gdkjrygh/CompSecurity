// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.google.android.gms.ads.AdListener;
import java.util.concurrent.Future;
import org.json.JSONObject;

// Referenced classes of package com.google.ads:
//            i, d, h, c

public class j extends i
{

    private final com.google.ads.formats.NativeAppInstallAd.OnAppInstallAdLoadedListener a;

    public j(Context context, h h, AdListener adlistener, com.google.ads.formats.NativeAppInstallAd.OnAppInstallAdLoadedListener onappinstalladloadedlistener)
    {
        super(context, h, adlistener);
        a = onappinstalladloadedlistener;
    }

    protected void a(d d1)
    {
        a.onAppInstallAdLoaded(d1);
    }

    protected volatile void a(Object obj)
    {
        a((d)obj);
    }

    protected c b(JSONObject jsonobject)
    {
        return f(jsonobject);
    }

    protected d f(JSONObject jsonobject)
    {
        Future future = d(jsonobject);
        Future future1 = a(jsonobject, "image", true);
        Future future2 = a(jsonobject, "app_icon", true);
        double d1 = jsonobject.optDouble("rating", -1D);
        Double double1;
        String s;
        if (d1 < 0.0D)
        {
            double1 = null;
        } else
        {
            double1 = Double.valueOf(d1);
        }
        s = e(jsonobject);
        a(s, future);
        return new d(jsonobject.getString("headline"), (Drawable)future1.get(), jsonobject.getString("body"), (Drawable)future2.get(), jsonobject.getString("call_to_action"), double1, jsonobject.optString("store"), jsonobject.optString("price"), (Drawable)future.get(), s);
    }
}
