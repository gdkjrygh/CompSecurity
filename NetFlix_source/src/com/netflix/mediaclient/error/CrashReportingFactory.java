// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.error;

import android.content.Context;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.util.PreferenceUtils;

// Referenced classes of package com.netflix.mediaclient.error:
//            CrittercismCrashService, NccpCrashService, CrashReportingService

public class CrashReportingFactory
{

    public static final int CRITTERCISM = 1;
    public static final int NCCP = 0;
    private static final String TAG = "nf_crash";

    private CrashReportingFactory()
    {
    }

    public static CrashReportingService getCrashService(Context context)
    {
        context = PreferenceUtils.getStringPref(context, "reporting_service", null);
        boolean flag = true;
        int i = ((flag) ? 1 : 0);
        if (context != null)
        {
            try
            {
                i = Integer.parseInt(context);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                Log.w("nf_crash", "");
                i = ((flag) ? 1 : 0);
            }
        }
        switch (i)
        {
        default:
            Log.d("nf_crash", "Default, use CRITTERCISM for crash reporting");
            return new CrittercismCrashService();

        case 0: // '\0'
            Log.d("nf_crash", "Use NCCP for crash reporting");
            return new NccpCrashService();

        case 1: // '\001'
            Log.d("nf_crash", "Use CRITTERCISM for crash reporting");
            break;
        }
        return new CrittercismCrashService();
    }
}
