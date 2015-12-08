// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.signin.tasks;

import android.app.Application;
import com.skype.Account;
import com.skype.android.config.ApplicationConfig;
import com.skype.android.config.ConfigUpdater;
import com.skype.android.config.web.SamsungGalaxyStoreUpdater;
import com.skype.android.config.web.WebConfigUpdater;
import com.skype.android.res.Urls;

// Referenced classes of package com.skype.android.app.signin.tasks:
//            AccountTask

final class a
    implements AccountTask
{

    private ApplicationConfig appConfig;
    private Application application;
    private ConfigUpdater configUpdater;
    private Urls urls;
    private WebConfigUpdater webConfigUpdater;

    public a(Application application1, ApplicationConfig applicationconfig, ConfigUpdater configupdater, WebConfigUpdater webconfigupdater, Urls urls1)
    {
        application = application1;
        appConfig = applicationconfig;
        configUpdater = configupdater;
        webConfigUpdater = webconfigupdater;
        urls = urls1;
    }

    public final void onLogin(Account account)
    {
        try
        {
            if (SamsungGalaxyStoreUpdater.isUpdatableFromStore(application))
            {
                (new SamsungGalaxyStoreUpdater(application, appConfig, configUpdater)).checkVersionInfo();
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (Account account)
        {
            throw new RuntimeException(account);
        }
        if (webConfigUpdater.updateVersionInfo(urls.a(com.skype.android.res.Urls.Type.q)))
        {
            configUpdater.saveLocalConfig();
            appConfig.sendConfigUpdatedEvent();
            return;
        }
    }

    public final void onLogout(Account account)
    {
        configUpdater.saveLocalConfig();
    }
}
