// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import io.fabric.sdk.android.services.common.ApiKey;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.common.DeliveryMechanism;
import io.fabric.sdk.android.services.common.IdManager;
import io.fabric.sdk.android.services.network.DefaultHttpRequestFactory;
import io.fabric.sdk.android.services.network.HttpRequestFactory;
import io.fabric.sdk.android.services.settings.AppRequestData;
import io.fabric.sdk.android.services.settings.AppSettingsData;
import io.fabric.sdk.android.services.settings.CreateAppSpiCall;
import io.fabric.sdk.android.services.settings.IconRequest;
import io.fabric.sdk.android.services.settings.Settings;
import io.fabric.sdk.android.services.settings.SettingsData;
import io.fabric.sdk.android.services.settings.UpdateAppSpiCall;
import java.util.Collection;

// Referenced classes of package io.fabric.sdk.android:
//            Kit, Fabric, Logger

class Onboarding extends Kit
{

    private final Collection a;
    private final HttpRequestFactory g = new DefaultHttpRequestFactory();
    private PackageManager h;
    private String i;
    private PackageInfo j;
    private String k;
    private String l;
    private String m;
    private String n;
    private String o;

    public Onboarding(Collection collection)
    {
        a = collection;
    }

    private AppRequestData a(IconRequest iconrequest, Collection collection)
    {
        Object obj = C();
        String s = (new ApiKey()).a(((Context) (obj)));
        obj = CommonUtils.a(new String[] {
            CommonUtils.m(((Context) (obj)))
        });
        int i1 = DeliveryMechanism.a(m).a();
        return new AppRequestData(s, B().c(), l, k, ((String) (obj)), n, i1, o, "0", iconrequest, collection);
    }

    private boolean a(AppSettingsData appsettingsdata, IconRequest iconrequest, Collection collection)
    {
        iconrequest = a(iconrequest, collection);
        return (new UpdateAppSpiCall(this, e(), appsettingsdata.c, g)).a(iconrequest);
    }

    private boolean a(String s, AppSettingsData appsettingsdata, Collection collection)
    {
        boolean flag = true;
        if (!"new".equals(appsettingsdata.b)) goto _L2; else goto _L1
_L1:
        if (!b(s, appsettingsdata, collection)) goto _L4; else goto _L3
_L3:
        flag = Settings.a().d();
_L6:
        return flag;
_L4:
        Fabric.g().d("Fabric", "Failed to create app with Crashlytics service.", null);
        return false;
_L2:
        if ("configured".equals(appsettingsdata.b))
        {
            return Settings.a().d();
        }
        if (appsettingsdata.e)
        {
            Fabric.g().a("Fabric", "Server says an update is required - forcing a full App update.");
            c(s, appsettingsdata, collection);
            return true;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    private boolean b(String s, AppSettingsData appsettingsdata, Collection collection)
    {
        s = a(IconRequest.a(C(), s), collection);
        return (new CreateAppSpiCall(this, e(), appsettingsdata.c, g)).a(s);
    }

    private boolean c(String s, AppSettingsData appsettingsdata, Collection collection)
    {
        return a(appsettingsdata, IconRequest.a(C(), s), collection);
    }

    protected boolean a()
    {
        m = B().h();
        h = C().getPackageManager();
        i = C().getPackageName();
        j = h.getPackageInfo(i, 0);
        k = Integer.toString(j.versionCode);
        if (j.versionName != null)
        {
            break MISSING_BLOCK_LABEL_123;
        }
        String s = "0.0";
_L1:
        try
        {
            l = s;
            n = h.getApplicationLabel(C().getApplicationInfo()).toString();
            o = Integer.toString(C().getApplicationInfo().targetSdkVersion);
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            Fabric.g().d("Fabric", "Failed init", namenotfoundexception);
            return false;
        }
        return true;
        s = j.versionName;
          goto _L1
    }

    protected Boolean b()
    {
        boolean flag;
        String s = CommonUtils.k(C());
        SettingsData settingsdata;
        try
        {
            Settings.a().a(this, f, g, k, l, e()).c();
            settingsdata = Settings.a().b();
        }
        catch (Exception exception)
        {
            Fabric.g().d("Fabric", "Error dealing with settings", exception);
            exception = null;
        }
        if (settingsdata == null) goto _L2; else goto _L1
_L1:
        flag = a(s, settingsdata.a, a);
_L4:
        return Boolean.valueOf(flag);
        Exception exception1;
        exception1;
        Fabric.g().d("Fabric", "Error performing auto configuration.", exception1);
_L2:
        flag = false;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public String c()
    {
        return "io.fabric.sdk.android:fabric";
    }

    public String d()
    {
        return "1.3.1.42";
    }

    String e()
    {
        return CommonUtils.b(C(), "com.crashlytics.ApiEndpoint");
    }

    protected Object z()
    {
        return b();
    }
}
