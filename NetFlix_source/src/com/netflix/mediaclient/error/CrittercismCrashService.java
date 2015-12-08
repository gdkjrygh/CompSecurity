// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.error;

import android.app.Application;
import android.os.Build;
import com.crittercism.app.Crittercism;
import com.crittercism.app.CrittercismConfig;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.repository.SecurityRepository;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.netflix.mediaclient.error:
//            CrashReportingService

public class CrittercismCrashService
    implements CrashReportingService
{

    private static final String TAG = "nf_crash";

    public CrittercismCrashService()
    {
    }

    private void storeNotNull(JSONObject jsonobject, String s, String s1)
        throws JSONException
    {
        if (s1 != null)
        {
            jsonobject.put(s, s1);
            return;
        } else
        {
            jsonobject.put(s, "N/A");
            return;
        }
    }

    public void init(Application application)
    {
        Log.d("nf_crash", "Init Crittercism...");
        CrittercismConfig crittercismconfig = new CrittercismConfig();
        crittercismconfig.setNdkCrashReportingEnabled(true);
        Crittercism.initialize(application, SecurityRepository.getCrittercismAppId(), crittercismconfig);
        application = new JSONObject();
        try
        {
            application.put("android", android.os.Build.VERSION.SDK_INT);
            storeNotNull(application, "oem", Build.MANUFACTURER);
            storeNotNull(application, "model", Build.MODEL);
        }
        // Misplaced declaration of an exception variable
        catch (Application application)
        {
            Log.e("nf_crash", "Failed to put esn to crittercism json?", application);
            return;
        }
        Crittercism.setMetadata(application);
        Log.d("nf_crash", "Init Crittercism done.");
    }
}
