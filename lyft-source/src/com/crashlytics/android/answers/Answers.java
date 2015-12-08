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
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Kit;
import io.fabric.sdk.android.Logger;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.common.IdManager;
import io.fabric.sdk.android.services.common.SystemCurrentTimeProvider;
import io.fabric.sdk.android.services.events.GZIPQueueFileEventStorage;
import io.fabric.sdk.android.services.network.DefaultHttpRequestFactory;
import io.fabric.sdk.android.services.persistence.FileStoreImpl;
import io.fabric.sdk.android.services.persistence.PreferenceStore;
import io.fabric.sdk.android.services.persistence.PreferenceStoreImpl;
import io.fabric.sdk.android.services.settings.FeaturesSettingsData;
import io.fabric.sdk.android.services.settings.Settings;
import io.fabric.sdk.android.services.settings.SettingsData;
import java.io.File;
import java.util.Map;
import java.util.UUID;

// Referenced classes of package com.crashlytics.android.answers:
//            SessionAnalyticsFilesManager, SessionEventTransform, SessionEventMetadata, AutoSessionAnalyticsManager, 
//            SessionAnalyticsManager

public class Answers extends Kit
{

    SessionAnalyticsManager a;
    private String g;
    private String h;
    private PreferenceStore i;
    private long j;

    public Answers()
    {
    }

    private void a(Context context)
    {
        SessionAnalyticsFilesManager sessionanalyticsfilesmanager;
        Object obj;
        Object obj1;
        sessionanalyticsfilesmanager = new SessionAnalyticsFilesManager(context, new SessionEventTransform(), new SystemCurrentTimeProvider(), new GZIPQueueFileEventStorage(C(), h(), "session_analytics.tap", "session_analytics_to_send"));
        Object obj2 = B();
        Object obj3 = ((IdManager) (obj2)).g();
        obj = context.getPackageName();
        obj1 = ((IdManager) (obj2)).b();
        String s = (String)((Map) (obj3)).get(io.fabric.sdk.android.services.common.IdManager.DeviceIdentifierType.d);
        String s1 = (String)((Map) (obj3)).get(io.fabric.sdk.android.services.common.IdManager.DeviceIdentifierType.g);
        obj3 = (String)((Map) (obj3)).get(io.fabric.sdk.android.services.common.IdManager.DeviceIdentifierType.c);
        String s2 = CommonUtils.m(context);
        String s3 = ((IdManager) (obj2)).d();
        obj2 = ((IdManager) (obj2)).e();
        obj = new SessionEventMetadata(((String) (obj)), UUID.randomUUID().toString(), ((String) (obj1)), s, s1, ((String) (obj3)), s2, s3, ((String) (obj2)), g, h);
        obj1 = (Application)C().getApplicationContext();
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_273;
        }
        if (android.os.Build.VERSION.SDK_INT < 14)
        {
            break MISSING_BLOCK_LABEL_273;
        }
        a = AutoSessionAnalyticsManager.a(((Application) (obj1)), ((SessionEventMetadata) (obj)), sessionanalyticsfilesmanager, new DefaultHttpRequestFactory(Fabric.g()));
_L2:
        if (a(j))
        {
            Fabric.g().a("Answers", "First launch");
            a.b();
            i.a(i.b().putBoolean("analytics_launched", true));
            return;
        }
        break MISSING_BLOCK_LABEL_304;
        a = SessionAnalyticsManager.a(context, ((SessionEventMetadata) (obj)), sessionanalyticsfilesmanager, new DefaultHttpRequestFactory(Fabric.g()));
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        CommonUtils.a(context, "Crashlytics failed to initialize session analytics.", exception);
    }

    public static Answers b()
    {
        return (Answers)Fabric.a(com/crashlytics/android/answers/Answers);
    }

    public void a(io.fabric.sdk.android.services.common.Crash.FatalException fatalexception)
    {
        if (a != null)
        {
            a.a(fatalexception.a());
        }
    }

    public void a(io.fabric.sdk.android.services.common.Crash.LoggedException loggedexception)
    {
        if (a != null)
        {
            a.b(loggedexception.a());
        }
    }

    protected boolean a()
    {
        Context context;
        PackageInfo packageinfo;
        i = new PreferenceStoreImpl(this);
        context = C();
        packageinfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        g = Integer.toString(packageinfo.versionCode);
        String s;
        if (packageinfo.versionName == null)
        {
            s = "0.0";
        } else
        {
            try
            {
                s = packageinfo.versionName;
            }
            catch (Exception exception)
            {
                Fabric.g().d("Answers", "Error setting up app properties", exception);
                return false;
            }
        }
        h = s;
        if (android.os.Build.VERSION.SDK_INT >= 9)
        {
            j = packageinfo.firstInstallTime;
            break MISSING_BLOCK_LABEL_132;
        }
        j = (new File(context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).sourceDir)).lastModified();
        return true;
    }

    boolean a(long l)
    {
        return !g() && b(l);
    }

    boolean b(long l)
    {
        return System.currentTimeMillis() - l < 0x36ee80L;
    }

    public String c()
    {
        return "com.crashlytics.sdk.android:answers";
    }

    public String d()
    {
        return "1.2.0.42";
    }

    protected Boolean e()
    {
        Context context = C();
        a(context);
        SettingsData settingsdata;
        try
        {
            settingsdata = Settings.a().b();
        }
        catch (Exception exception)
        {
            Fabric.g().d("Answers", "Error dealing with settings", exception);
            return Boolean.valueOf(false);
        }
        if (settingsdata != null)
        {
            break MISSING_BLOCK_LABEL_26;
        }
        return Boolean.valueOf(false);
        if (settingsdata.d.d)
        {
            a.a(settingsdata.e, f());
            return Boolean.valueOf(true);
        }
        CommonUtils.a(context, "Disabling analytics collection based on settings flag value.");
        a.a();
        return Boolean.valueOf(false);
    }

    String f()
    {
        return CommonUtils.b(C(), "com.crashlytics.ApiEndpoint");
    }

    boolean g()
    {
        return i.a().getBoolean("analytics_launched", false);
    }

    File h()
    {
        return (new FileStoreImpl(this)).a();
    }

    protected Object z()
    {
        return e();
    }
}
