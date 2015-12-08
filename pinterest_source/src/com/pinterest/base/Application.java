// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.base;

import android.content.res.Configuration;
import com.pinterest.api.ApiClient;
import com.pinterest.api.ApiHttpClient;
import com.pinterest.api.model.MyUser;
import com.pinterest.api.remote.ExperimentsApi;
import com.pinterest.di.HasComponent;
import com.pinterest.di.components.ApplicationComponent;
import com.pinterest.di.components.DaggerApplicationComponent;
import com.pinterest.di.modules.ApplicationModule;
import com.pinterest.experiment.Experiments;
import com.pinterest.kit.application.PApplication;
import com.pinterest.kit.application.Resources;
import com.pinterest.reporting.CrashReporting;
import com.squareup.leakcanary.RefWatcher;
import io.branch.referral.Branch;

// Referenced classes of package com.pinterest.base:
//            ApplicationInfo, Device

public class Application extends PApplication
    implements HasComponent
{

    private static RefWatcher _refWatcher;
    private ApplicationComponent _applicationComponent;

    public Application()
    {
    }

    private void initializeComponent()
    {
        if (_applicationComponent != null)
        {
            return;
        } else
        {
            _applicationComponent = DaggerApplicationComponent.a().a(new ApplicationModule(this)).a();
            return;
        }
    }

    public static void watch(Object obj)
    {
    }

    public ApplicationComponent getComponent()
    {
        return _applicationComponent;
    }

    public volatile Object getComponent()
    {
        return getComponent();
    }

    protected void init()
    {
        super.init();
        CrashReporting.a(context(), ApplicationInfo.getVersionName(), Resources.string(0x7f0706f3));
        MyUser.get();
        Experiments.Z();
        ApplicationInfo.ensureInstallId();
        ApiHttpClient.initCookieStore(context());
        ApiClient.b(ApplicationInfo.getClientSecret());
        ApiClient.a(MyUser.getAccessToken());
        ApiClient.b();
        Device.init();
        if (ApplicationInfo.isPreinstalled())
        {
            ExperimentsApi.a("android_preinstall_telefonica2", null);
        }
        initializeComponent();
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        Device.onConfigurationChanged(configuration);
    }

    public void onCreate()
    {
        super.onCreate();
        Branch.c(this);
    }

    public void setApplicationComponent(ApplicationComponent applicationcomponent)
    {
        _applicationComponent = applicationcomponent;
    }
}
