// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.managers;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.tinder.utils.ad;
import com.tinder.utils.v;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.tinder.managers:
//            ManagerLiveRail

class put extends HashMap
{

    final put a;

    tFoundException(tFoundException tfoundexception)
        throws RuntimeException, Error
    {
        int i;
        i = 0;
        a = tfoundexception;
        super();
        put("LR_WIDTH", String.valueOf(ad.a(a.a.a)));
        put("LR_HEIGHT", String.valueOf(ad.b(a.a.a)));
        put("LR_FORMAT", "video/webm");
        put("LR_SCHEMA", "vast2");
        put("LR_ADTYPE", "3");
        tfoundexception = AdvertisingIdClient.getAdvertisingIdInfo(a.a.a);
        put("LR_IDFA", tfoundexception.getId());
        if (!tfoundexception.isLimitAdTrackingEnabled())
        {
            i = 1;
        }
        put("LR_IDFA_FLAG", String.valueOf(i));
_L1:
        put("LR_OS", "Android");
        put("LR_OS_VERSION", android.os.E);
        put("LR_BUNDLE", "com.cardify.tinder");
        put("LR_APPNAME", a.a.a.getResources().getString(0x7f060062));
        try
        {
            put("LR_APPVERS", a.a.a.getPackageManager().getPackageInfo(a.a.a.getPackageName(), 0).versionName);
        }
        // Misplaced declaration of an exception variable
        catch (tFoundException tfoundexception)
        {
            put("LR_APPVERS", "837");
        }
        put("LR_CARRIER", ((TelephonyManager)a.a.a.getSystemService("phone")).getNetworkOperatorName());
        put("LR_MAKE", Build.MANUFACTURER);
        put("LR_MODEL", Build.MODEL);
        put("LR_PUBLISHER_ID", "94567");
        return;
        tfoundexception;
        v.a("Failed to connect to Google Play Services", tfoundexception);
          goto _L1
        tfoundexception;
        v.a("A recoverable Google Play Services issue occured", tfoundexception);
          goto _L1
        tfoundexception;
        v.a("Google Play Services are not available", tfoundexception);
          goto _L1
    }

    // Unreferenced inner class com/tinder/managers/ManagerLiveRail$1

/* anonymous class */
    final class ManagerLiveRail._cls1
        implements com.tinder.utils.e.b
    {

        final ManagerLiveRail a;

        public final void a()
        {
            Object obj = new ManagerLiveRail._cls1._cls1(this);
            StringBuilder stringbuilder = new StringBuilder();
            stringbuilder.append(ManagerLiveRail.b());
            for (obj = ((HashMap) (obj)).entrySet().iterator(); ((Iterator) (obj)).hasNext(); stringbuilder.append('&'))
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (obj)).next();
                stringbuilder.append((String)entry.getKey());
                stringbuilder.append('=');
                stringbuilder.append(URLEncoder.encode((String)entry.getValue()).replace("+", "%20"));
            }

            stringbuilder.deleteCharAt(stringbuilder.length() - 1);
            ManagerLiveRail.a(a, stringbuilder.toString());
            ManagerLiveRail.a(a);
        }

            
            {
                a = managerliverail;
                super();
            }
    }

}
