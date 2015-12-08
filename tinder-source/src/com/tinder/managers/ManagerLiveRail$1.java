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

final class a
    implements com.tinder.utils.._cls1
{

    final ManagerLiveRail a;

    public final void a()
    {
        Object obj = new HashMap() {

            final ManagerLiveRail._cls1 a;

            
                throws RuntimeException, Error
            {
                int i;
                i = 0;
                a = ManagerLiveRail._cls1.this;
                super();
                put("LR_WIDTH", String.valueOf(ad.a(a.a.a)));
                put("LR_HEIGHT", String.valueOf(ad.b(a.a.a)));
                put("LR_FORMAT", "video/webm");
                put("LR_SCHEMA", "vast2");
                put("LR_ADTYPE", "3");
                _pcls1 = AdvertisingIdClient.getAdvertisingIdInfo(a.a.a);
                put("LR_IDFA", getId());
                if (!isLimitAdTrackingEnabled())
                {
                    i = 1;
                }
                put("LR_IDFA_FLAG", String.valueOf(i));
_L1:
                put("LR_OS", "Android");
                put("LR_OS_VERSION", android.os.Build.VERSION.RELEASE);
                put("LR_BUNDLE", "com.cardify.tinder");
                put("LR_APPNAME", a.a.a.getResources().getString(0x7f060062));
                try
                {
                    put("LR_APPVERS", a.a.a.getPackageManager().getPackageInfo(a.a.a.getPackageName(), 0).versionName);
                }
                // Misplaced declaration of an exception variable
                catch (ManagerLiveRail._cls1 _pcls1)
                {
                    put("LR_APPVERS", "837");
                }
                put("LR_CARRIER", ((TelephonyManager)a.a.a.getSystemService("phone")).getNetworkOperatorName());
                put("LR_MAKE", Build.MANUFACTURER);
                put("LR_MODEL", Build.MODEL);
                put("LR_PUBLISHER_ID", "94567");
                return;
                _pcls1;
                v.a("Failed to connect to Google Play Services", ManagerLiveRail._cls1.this);
                  goto _L1
                _pcls1;
                v.a("A recoverable Google Play Services issue occured", ManagerLiveRail._cls1.this);
                  goto _L1
                _pcls1;
                v.a("Google Play Services are not available", ManagerLiveRail._cls1.this);
                  goto _L1
            }
        };
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(ManagerLiveRail.b());
        for (obj = ((HashMap) (obj)).entrySet().iterator(); ((Iterator) (obj)).hasNext(); stringbuilder.append('&'))
        {
            java.util.iveRail._cls1 _lcls1 = (java.util.nd)((Iterator) (obj)).next();
            stringbuilder.append((String)_lcls1.nd());
            stringbuilder.append('=');
            stringbuilder.append(URLEncoder.encode((String)_lcls1.()).replace("+", "%20"));
        }

        stringbuilder.deleteCharAt(stringbuilder.length() - 1);
        ManagerLiveRail.a(a, stringbuilder.toString());
        ManagerLiveRail.a(a);
    }

    _cls1.put(ManagerLiveRail managerliverail)
    {
        a = managerliverail;
        super();
    }
}
