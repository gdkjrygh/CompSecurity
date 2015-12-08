// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.gcm;

import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.google.android.gms.iid.InstanceID;
import java.io.IOException;
import me.lyft.android.LyftApplication;
import me.lyft.android.analytics.Analytics;
import me.lyft.android.analytics.DeveloperEvent;
import me.lyft.android.common.Strings;
import me.lyft.android.logging.L;

// Referenced classes of package me.lyft.android.infrastructure.gcm:
//            IGcmIdService

public class GcmIdService
    implements IGcmIdService
{

    private static final String GCM_APP_VERSION_CODE = "gcm_app_version_code";
    private static final String GCM_REGISTRATION_ID = "gcm_registration_id";
    private static final String PREFERENCES_NAME = "GCMRegistrar";
    private LyftApplication app;
    private SharedPreferences preferences;

    public GcmIdService(LyftApplication lyftapplication)
    {
        app = lyftapplication;
    }

    private int getAppVersion()
    {
        int i;
        try
        {
            i = app.getPackageManager().getPackageInfo(app.getPackageName(), 0).versionCode;
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            throw new RuntimeException((new StringBuilder()).append("Could not get package name: ").append(namenotfoundexception).toString());
        }
        return i;
    }

    private SharedPreferences getPreferences()
    {
        if (preferences == null)
        {
            preferences = app.getSharedPreferences("GCMRegistrar", 0);
        }
        return preferences;
    }

    private String getStoredRegistrationId()
    {
        String s = getPreferences().getString("gcm_registration_id", "");
        if (Strings.isNullOrEmpty(s))
        {
            L.d("Registration not found.", new Object[0]);
            s = "";
        } else
        if (getPreferences().getInt("gcm_app_version_code", 0x80000000) != getAppVersion())
        {
            L.i("App version changed.", new Object[0]);
            return "";
        }
        return s;
    }

    private String registerInGCM()
    {
        String s;
        try
        {
            s = InstanceID.b(app).a(app.getString(0x7f070180), "GCM", null);
        }
        catch (IOException ioexception)
        {
            Analytics.track((new DeveloperEvent("gcm_not_available")).setLabel(ioexception.getMessage()));
            return null;
        }
        return s;
    }

    private void storeRegistrationId(String s)
    {
        int i = getAppVersion();
        L.i((new StringBuilder()).append("Saving regId on app version ").append(i).toString(), new Object[0]);
        android.content.SharedPreferences.Editor editor = getPreferences().edit();
        editor.putString("gcm_registration_id", s);
        editor.putInt("gcm_app_version_code", i);
        editor.commit();
    }

    public String getRegistrationId()
    {
        String s1 = getStoredRegistrationId();
        String s = s1;
        if (Strings.isNullOrEmpty(s1))
        {
            s = registerInGCM();
            storeRegistrationId(s);
        }
        return s;
    }

    public void removeStoredRegistrationId()
    {
        getPreferences().edit().remove("gcm_registration_id").commit();
    }
}
