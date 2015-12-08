// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.policies;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import com.soundcloud.android.configuration.FeatureOperations;
import com.soundcloud.android.offline.OfflineContentOperations;
import com.soundcloud.android.rx.observers.DefaultSubscriber;
import com.soundcloud.android.utils.CurrentDateProvider;
import com.soundcloud.android.utils.DateProvider;
import com.soundcloud.android.utils.NetworkConnectionHelper;
import com.soundcloud.lightcycle.DefaultActivityLightCycle;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.soundcloud.android.policies:
//            PolicySettingsStorage, GoBackOnlineDialogPresenter

public class PolicyUpdateController extends DefaultActivityLightCycle
{

    static final int OFFLINE_DAYS_ERROR_THRESHOLD = 30;
    static final int OFFLINE_DAYS_WARNING_THRESHOLD = 27;
    private final NetworkConnectionHelper connectionHelper;
    private final DateProvider dateProvider;
    private final FeatureOperations featureOperations;
    private final GoBackOnlineDialogPresenter goBackOnlineDialogPresenter;
    private final OfflineContentOperations offlineContentOperations;
    private final PolicySettingsStorage policySettingsStorage;

    public PolicyUpdateController(FeatureOperations featureoperations, OfflineContentOperations offlinecontentoperations, PolicySettingsStorage policysettingsstorage, CurrentDateProvider currentdateprovider, GoBackOnlineDialogPresenter gobackonlinedialogpresenter, NetworkConnectionHelper networkconnectionhelper)
    {
        featureOperations = featureoperations;
        offlineContentOperations = offlinecontentoperations;
        policySettingsStorage = policysettingsstorage;
        dateProvider = currentdateprovider;
        goBackOnlineDialogPresenter = gobackonlinedialogpresenter;
        connectionHelper = networkconnectionhelper;
    }

    private boolean shouldCheckPolicyUpdates()
    {
        long l = policySettingsStorage.getLastPolicyCheckTime();
        long l1 = dateProvider.getCurrentTime();
        return TimeUnit.MILLISECONDS.toDays(l1 - l) > 0L;
    }

    private boolean shouldDeleteOfflineContent(Long long1)
    {
        return TimeUnit.MILLISECONDS.toDays(dateProvider.getCurrentTime() - long1.longValue()) >= 30L;
    }

    private boolean shouldNotifyUser(Long long1)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (!connectionHelper.isNetworkConnected())
        {
            flag = flag1;
            if (TimeUnit.MILLISECONDS.toDays(dateProvider.getCurrentTime() - long1.longValue()) >= 27L)
            {
                flag = true;
            }
        }
        return flag;
    }

    public volatile void onResume(Activity activity)
    {
        onResume((AppCompatActivity)activity);
    }

    public void onResume(AppCompatActivity appcompatactivity)
    {
        if (featureOperations.isOfflineContentEnabled() && shouldCheckPolicyUpdates())
        {
            long l = policySettingsStorage.getPolicyUpdateTime();
            if (shouldNotifyUser(Long.valueOf(l)))
            {
                goBackOnlineDialogPresenter.show(appcompatactivity, l);
                policySettingsStorage.setLastPolicyCheckTime(dateProvider.getCurrentTime());
                if (shouldDeleteOfflineContent(Long.valueOf(l)))
                {
                    DefaultSubscriber.fireAndForget(offlineContentOperations.clearOfflineContent());
                }
            }
        }
    }
}
