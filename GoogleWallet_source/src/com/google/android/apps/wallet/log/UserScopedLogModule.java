// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.log;

import android.app.Application;
import android.os.Build;
import com.google.android.apps.wallet.base.java.System;
import com.google.android.apps.wallet.config.cloudconfig.CloudConfigurationManager;
import com.google.android.apps.wallet.config.featurecontrol.FeatureSet;
import com.google.android.apps.wallet.device.DeviceInfoManager;
import com.google.android.apps.wallet.util.version.VersionUtils;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.google.android.apps.wallet.log:
//            WalletContextFactory

public class UserScopedLogModule
{

    public UserScopedLogModule()
    {
    }

    static BlockingQueue getEventLogQueue()
    {
        return new LinkedBlockingQueue(200);
    }

    static AtomicBoolean getEventLogUploadScheduled()
    {
        return new AtomicBoolean(false);
    }

    static WalletContextFactory getWalletContextFactory(Application application, CloudConfigurationManager cloudconfigurationmanager, DeviceInfoManager deviceinfomanager, System system, FeatureSet featureset, List list)
    {
        cloudconfigurationmanager = cloudconfigurationmanager.getCloudConfig();
        String s = VersionUtils.getVersionName(application);
        int i = VersionUtils.getVersionCode(application);
        return new WalletContextFactory(application, deviceinfomanager, featureset.toString(), cloudconfigurationmanager, system, list, s, i, Build.ID, Build.TAGS, android.os.Build.VERSION.RELEASE, android.os.Build.VERSION.SDK_INT);
    }

    static Executor getWalletEventLogExecutor()
    {
        return Executors.newSingleThreadExecutor();
    }
}
