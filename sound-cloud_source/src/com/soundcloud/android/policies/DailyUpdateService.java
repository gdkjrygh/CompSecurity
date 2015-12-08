// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.policies;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.ads.AdIdHelper;
import com.soundcloud.android.configuration.ConfigurationManager;
import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.events.PolicyUpdateEvent;
import com.soundcloud.android.utils.CurrentDateProvider;
import com.soundcloud.rx.eventbus.EventBus;
import dagger.b;
import java.util.List;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.soundcloud.android.policies:
//            PolicyOperations, PolicySettingsStorage

public class DailyUpdateService extends IntentService
{

    public static final String ACTION_START = "action_start_update";
    public static final String TAG = "DailyUpdate";
    AdIdHelper adIdHelper;
    ConfigurationManager configurationManager;
    CurrentDateProvider dateProvider;
    EventBus eventBus;
    PolicyOperations policyOperations;
    PolicySettingsStorage policySettingsStorage;

    public DailyUpdateService()
    {
        super("DailyUpdate");
        SoundCloudApplication.getObjectGraph().a(this);
    }

    DailyUpdateService(PolicyOperations policyoperations, PolicySettingsStorage policysettingsstorage, ConfigurationManager configurationmanager, AdIdHelper adidhelper, CurrentDateProvider currentdateprovider, EventBus eventbus)
    {
        super("DailyUpdate");
        policyOperations = policyoperations;
        policySettingsStorage = policysettingsstorage;
        configurationManager = configurationmanager;
        adIdHelper = adidhelper;
        dateProvider = currentdateprovider;
        eventBus = eventbus;
    }

    private static Intent createIntent(Context context, String s)
    {
        context = new Intent(context, com/soundcloud/android/policies/DailyUpdateService);
        context.setAction(s);
        return context;
    }

    public static void start(Context context)
    {
        context.startService(createIntent(context, "action_start_update"));
    }

    private void updateTrackPolicies()
    {
        List list = policyOperations.updateTrackPolicies();
        if (!list.isEmpty())
        {
            policySettingsStorage.setPolicyUpdateTime(dateProvider.getCurrentTime());
            eventBus.publish(EventQueue.POLICY_UPDATES, PolicyUpdateEvent.success(list));
            return;
        } else
        {
            long l = TimeUnit.MILLISECONDS.toDays(dateProvider.getCurrentTime() - policySettingsStorage.getPolicyUpdateTime());
            (new StringBuilder("Last successful policy update was ")).append(l).append(" days ago");
            return;
        }
    }

    protected void onHandleIntent(Intent intent)
    {
        if ("action_start_update".equals(intent.getAction()))
        {
            updateTrackPolicies();
            configurationManager.update();
            adIdHelper.init();
        }
    }
}
