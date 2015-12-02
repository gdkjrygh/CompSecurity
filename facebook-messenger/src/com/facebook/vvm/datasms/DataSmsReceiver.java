// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.vvm.datasms;

import android.app.IntentService;
import android.content.Intent;
import android.telephony.TelephonyManager;
import com.facebook.analytics.av;
import com.facebook.analytics.cb;
import com.facebook.inject.t;
import com.facebook.prefs.shared.d;
import com.facebook.prefs.shared.e;
import com.facebook.vvm.a.a;
import com.facebook.vvm.a.c;
import com.facebook.vvm.annotations.IsVvmSmsDetailedReportingEnabledForUser;
import com.facebook.vvm.annotations.IsVvmSmsReportingEnabledForUser;

public class DataSmsReceiver extends IntentService
{

    private av a;
    private TelephonyManager b;
    private d c;
    private boolean d;
    private boolean e;

    public DataSmsReceiver()
    {
        super("DataSmsReceiver");
    }

    private void a(a a1)
    {
        while (!d || c.a(c.b, false)) 
        {
            return;
        }
        cb cb1 = (new cb("vvm_sms_reporting_data")).b("country_iso_code", b.getNetworkCountryIso()).b("carrier", b.getNetworkOperatorName());
        if (e)
        {
            cb1.b("application_directed_string", a1.toString()).b("telephonenumber", b.getLine1Number());
        }
        a.b(cb1);
        c.b().a(c.b, true).a();
    }

    public void onCreate()
    {
        super.onCreate();
        t t1 = t.a(this);
        a = (av)t1.a(com/facebook/analytics/av);
        b = (TelephonyManager)t1.a(android/telephony/TelephonyManager);
        c = (d)t1.a(com/facebook/prefs/shared/d);
        d = ((Boolean)t1.b(java/lang/Boolean, com/facebook/vvm/annotations/IsVvmSmsReportingEnabledForUser).b()).booleanValue();
        e = ((Boolean)t1.b(java/lang/Boolean, com/facebook/vvm/annotations/IsVvmSmsDetailedReportingEnabledForUser).b()).booleanValue();
    }

    public final void onHandleIntent(Intent intent)
    {
        if (intent != null)
        {
            if ((intent = (a)intent.getSerializableExtra("application_directed_string")) != null)
            {
                a(intent);
                return;
            }
        }
    }
}
