// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.answers;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import io.fabric.sdk.android.c;
import io.fabric.sdk.android.i;
import io.fabric.sdk.android.services.b.b;
import io.fabric.sdk.android.services.c.a;
import io.fabric.sdk.android.services.common.h;
import io.fabric.sdk.android.services.common.n;
import io.fabric.sdk.android.services.common.s;
import io.fabric.sdk.android.services.d.m;
import io.fabric.sdk.android.services.d.q;
import io.fabric.sdk.android.services.d.t;
import io.fabric.sdk.android.services.events.l;
import java.io.File;
import java.util.Map;
import java.util.UUID;

// Referenced classes of package com.crashlytics.android.answers:
//            SessionAnalyticsFilesManager, SessionEventTransform, SessionEventMetadata, AutoSessionAnalyticsManager, 
//            SessionAnalyticsManager, EventAttributes

public class Answers extends i
{

    static final String CRASHLYTICS_API_ENDPOINT = "com.crashlytics.ApiEndpoint";
    static final long FIRST_LAUNCH_INTERVAL_IN_MS = 0x36ee80L;
    static final String PREFKEY_ANALYTICS_LAUNCHED = "analytics_launched";
    static final String SESSION_ANALYTICS_FILE_EXTENSION = ".tap";
    static final String SESSION_ANALYTICS_FILE_NAME = "session_analytics.tap";
    private static final String SESSION_ANALYTICS_TO_SEND_DIR = "session_analytics_to_send";
    public static final String TAG = "Answers";
    private long installedAt;
    private io.fabric.sdk.android.services.c.b preferenceStore;
    SessionAnalyticsManager sessionAnalyticsManager;
    private String versionCode;
    private String versionName;

    public Answers()
    {
    }

    public static Answers getInstance()
    {
        return (Answers)c.a(com/crashlytics/android/answers/Answers);
    }

    private void initializeSessionAnalytics(Context context)
    {
        SessionAnalyticsFilesManager sessionanalyticsfilesmanager;
        Object obj;
        Object obj1;
        sessionanalyticsfilesmanager = new SessionAnalyticsFilesManager(context, new SessionEventTransform(), new s(), new l(getContext(), getSdkDirectory(), "session_analytics.tap", "session_analytics_to_send"));
        Object obj2 = getIdManager();
        Object obj3 = ((n) (obj2)).g();
        obj = context.getPackageName();
        obj1 = ((n) (obj2)).b();
        String s1 = (String)((Map) (obj3)).get(io.fabric.sdk.android.services.common.n.a.d);
        String s2 = (String)((Map) (obj3)).get(io.fabric.sdk.android.services.common.n.a.g);
        obj3 = (String)((Map) (obj3)).get(io.fabric.sdk.android.services.common.n.a.c);
        String s3 = h.m(context);
        String s4 = ((n) (obj2)).d();
        obj2 = ((n) (obj2)).e();
        obj = new SessionEventMetadata(((String) (obj)), UUID.randomUUID().toString(), ((String) (obj1)), s1, s2, ((String) (obj3)), s3, s4, ((String) (obj2)), versionCode, versionName);
        obj1 = (Application)getContext().getApplicationContext();
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_273;
        }
        if (android.os.Build.VERSION.SDK_INT < 14)
        {
            break MISSING_BLOCK_LABEL_273;
        }
        sessionAnalyticsManager = AutoSessionAnalyticsManager.build(((Application) (obj1)), ((SessionEventMetadata) (obj)), sessionanalyticsfilesmanager, new b(c.h()));
_L2:
        if (isFirstLaunch(installedAt))
        {
            c.h().a("Answers", "First launch");
            sessionAnalyticsManager.onInstall();
            preferenceStore.a(preferenceStore.b().putBoolean("analytics_launched", true));
            return;
        }
        break MISSING_BLOCK_LABEL_304;
        sessionAnalyticsManager = SessionAnalyticsManager.build(context, ((SessionEventMetadata) (obj)), sessionanalyticsfilesmanager, new b(c.h()));
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        h.a(context, "Crashlytics failed to initialize session analytics.", exception);
    }

    protected Boolean doInBackground()
    {
        Context context = getContext();
        initializeSessionAnalytics(context);
        t t1;
        try
        {
            t1 = q.a().b();
        }
        catch (Exception exception)
        {
            c.h().e("Answers", "Error dealing with settings", exception);
            return Boolean.valueOf(false);
        }
        if (t1 != null)
        {
            break MISSING_BLOCK_LABEL_26;
        }
        return Boolean.valueOf(false);
        if (t1.d.d)
        {
            sessionAnalyticsManager.setAnalyticsSettingsData(t1.e, getOverridenSpiEndpoint());
            return Boolean.valueOf(true);
        }
        h.a(context, "Disabling analytics collection based on settings flag value.");
        sessionAnalyticsManager.disable();
        return Boolean.valueOf(false);
    }

    protected volatile Object doInBackground()
    {
        return doInBackground();
    }

    boolean getAnalyticsLaunched()
    {
        return preferenceStore.a().getBoolean("analytics_launched", false);
    }

    public String getIdentifier()
    {
        return "com.crashlytics.sdk.android:answers";
    }

    String getOverridenSpiEndpoint()
    {
        return h.b(getContext(), "com.crashlytics.ApiEndpoint");
    }

    File getSdkDirectory()
    {
        return (new a(this)).a();
    }

    public String getVersion()
    {
        return "1.2.2.56";
    }

    boolean installedRecently(long l1)
    {
        return System.currentTimeMillis() - l1 < 0x36ee80L;
    }

    boolean isFirstLaunch(long l1)
    {
        return !getAnalyticsLaunched() && installedRecently(l1);
    }

    public void logEvent(String s1)
    {
        logEvent(s1, new EventAttributes());
    }

    public void logEvent(String s1, EventAttributes eventattributes)
    {
        if (s1 == null)
        {
            throw new NullPointerException("eventName must not be null");
        }
        if (eventattributes == null)
        {
            throw new NullPointerException("attributes must not be null");
        }
        if (sessionAnalyticsManager != null)
        {
            sessionAnalyticsManager.onCustom(s1, eventattributes.attributes);
        }
    }

    public void onException(io.fabric.sdk.android.services.common.i.a a1)
    {
        if (sessionAnalyticsManager != null)
        {
            sessionAnalyticsManager.onCrash(a1.a());
        }
    }

    public void onException(io.fabric.sdk.android.services.common.i.b b1)
    {
        if (sessionAnalyticsManager != null)
        {
            sessionAnalyticsManager.onError(b1.a());
        }
    }

    protected boolean onPreExecute()
    {
        Context context;
        PackageInfo packageinfo;
        preferenceStore = new io.fabric.sdk.android.services.c.c(this);
        context = getContext();
        packageinfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        versionCode = Integer.toString(packageinfo.versionCode);
        String s1;
        if (packageinfo.versionName == null)
        {
            s1 = "0.0";
        } else
        {
            try
            {
                s1 = packageinfo.versionName;
            }
            catch (Exception exception)
            {
                c.h().e("Answers", "Error setting up app properties", exception);
                return false;
            }
        }
        versionName = s1;
        if (android.os.Build.VERSION.SDK_INT >= 9)
        {
            installedAt = packageinfo.firstInstallTime;
            break MISSING_BLOCK_LABEL_133;
        }
        installedAt = (new File(context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).sourceDir)).lastModified();
        return true;
    }
}
