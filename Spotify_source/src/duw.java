// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Application;
import android.os.AsyncTask;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.spotify.mobile.android.spotlets.ads.AdEventReporter;
import java.io.IOException;

public final class duw extends AsyncTask
{

    private final Application a;

    public duw(Application application)
    {
        ctz.a(application);
        a = application;
    }

    private transient duq a()
    {
        Object obj;
        String s;
        int i;
        SystemClock.elapsedRealtime();
        obj = null;
        s = "";
        i = 3;
_L3:
        if (i <= 0) goto _L2; else goto _L1
_L1:
        String s1;
        String s2;
        Object obj1;
        Object obj2;
        Object obj3;
        String s3;
        obj3 = obj;
        s3 = s;
        obj1 = obj;
        s1 = s;
        obj2 = obj;
        s2 = s;
        com.google.android.gms.ads.identifier.AdvertisingIdClient.Info info = AdvertisingIdClient.getAdvertisingIdInfo(a);
        obj3 = obj;
        s3 = s;
        obj1 = obj;
        s1 = s;
        obj2 = obj;
        s2 = s;
        s = info.getId();
        obj3 = obj;
        s3 = s;
        obj1 = obj;
        s1 = s;
        obj2 = obj;
        s2 = s;
        obj = Boolean.valueOf(info.isLimitAdTrackingEnabled());
        obj3 = obj;
        s3 = s;
        obj1 = obj;
        s1 = s;
        obj2 = obj;
        s2 = s;
        SystemClock.elapsedRealtime();
_L4:
        i = 0;
          goto _L3
        obj;
        i--;
        obj = obj3;
        s = s3;
          goto _L3
_L2:
        return new duq(s, ((Boolean) (obj)));
        obj;
        obj = obj1;
        s = s1;
          goto _L4
        IOException ioexception;
        ioexception;
        ioexception = ((IOException) (obj2));
        s = s2;
          goto _L4
    }

    protected final Object doInBackground(Object aobj[])
    {
        return a();
    }

    protected final void onPostExecute(Object obj)
    {
        duq duq1 = (duq)obj;
        obj = duq1.a;
        if (TextUtils.isEmpty(duq1.a))
        {
            obj = "";
        } else
        {
            obj = new String(hcz.a(hda.b(duq1.a.getBytes())));
        }
        ((AdEventReporter)dmz.a(com/spotify/mobile/android/spotlets/ads/AdEventReporter)).a("/dc_rdid", ((String) (obj)));
        if (duq1.b != null)
        {
            AdEventReporter adeventreporter = (AdEventReporter)dmz.a(com/spotify/mobile/android/spotlets/ads/AdEventReporter);
            if (duq1.b.booleanValue())
            {
                obj = "1";
            } else
            {
                obj = "0";
            }
            adeventreporter.a("/dc_lat", ((String) (obj)));
        }
    }
}
