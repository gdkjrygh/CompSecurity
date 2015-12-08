// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.configuration;

import com.soundcloud.android.accounts.AccountOperations;
import com.soundcloud.android.offline.OfflineContentOperations;
import com.soundcloud.android.rx.RxUtils;
import com.soundcloud.android.rx.observers.DefaultSubscriber;
import rx.Y;
import rx.b;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.configuration:
//            DeviceManagementStorage, ConfigurationOperations, Configuration, DeviceManagement

public class ConfigurationManager
{
    private class ConfigurationSubscriber extends DefaultSubscriber
    {

        final ConfigurationManager this$0;

        public void onNext(Configuration configuration)
        {
            if (configuration.deviceManagement.isNotAuthorized())
            {
                deviceManagementStorage.setDeviceConflict();
                fireAndForget(accountOperations.logout().flatMap(clearOfflineContent));
                return;
            } else
            {
                configurationOperations.saveConfiguration(configuration);
                return;
            }
        }

        public volatile void onNext(Object obj)
        {
            onNext((Configuration)obj);
        }

        private ConfigurationSubscriber()
        {
            this$0 = ConfigurationManager.this;
            super();
        }

        ConfigurationSubscriber(_cls1 _pcls1)
        {
            this();
        }
    }


    private static final String TAG = "Configuration";
    private final AccountOperations accountOperations;
    private final f clearOfflineContent = new _cls1();
    private final ConfigurationOperations configurationOperations;
    private final DeviceManagementStorage deviceManagementStorage;
    private final OfflineContentOperations offlineContentOperations;
    private Y subscription;

    public ConfigurationManager(ConfigurationOperations configurationoperations, OfflineContentOperations offlinecontentoperations, AccountOperations accountoperations, DeviceManagementStorage devicemanagementstorage)
    {
        subscription = RxUtils.invalidSubscription();
        configurationOperations = configurationoperations;
        offlineContentOperations = offlinecontentoperations;
        accountOperations = accountoperations;
        deviceManagementStorage = devicemanagementstorage;
    }

    public void clearDeviceConflict()
    {
        deviceManagementStorage.clearDeviceConflict();
    }

    public boolean shouldDisplayDeviceConflict()
    {
        return deviceManagementStorage.hadDeviceConflict();
    }

    public void update()
    {
        subscription.unsubscribe();
        subscription = configurationOperations.update().subscribe(new ConfigurationSubscriber(null));
    }

    public void updateUntilPlanChanged()
    {
        subscription.unsubscribe();
        subscription = configurationOperations.updateUntilPlanChanged().subscribe(new ConfigurationSubscriber(null));
    }






    private class _cls1
        implements f
    {

        final ConfigurationManager this$0;

        public volatile Object call(Object obj)
        {
            return call((Void)obj);
        }

        public b call(Void void1)
        {
            return offlineContentOperations.clearOfflineContent();
        }

        _cls1()
        {
            this$0 = ConfigurationManager.this;
            super();
        }
    }

}
