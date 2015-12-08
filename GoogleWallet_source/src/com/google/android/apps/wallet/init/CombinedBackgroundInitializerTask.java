// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.init;

import android.app.Application;
import android.os.SystemClock;
import com.google.android.apps.wallet.config.featurecontrol.Feature;
import com.google.android.apps.wallet.config.featurecontrol.FeatureManager;
import com.google.android.apps.wallet.geofencing.api.GeofencingClient;
import com.google.android.apps.wallet.globalresources.ExperimentsUpdater;
import com.google.android.apps.wallet.locale.LocalePreferenceUpdater;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.notifications.GcmRegistrar;
import com.google.android.apps.wallet.preferences.PreferenceClient;
import com.google.android.apps.wallet.rpc.RpcException;
import dagger.Lazy;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.init:
//            EagerSingletonInitializer

public class CombinedBackgroundInitializerTask
    implements Callable
{

    private static final String TAG = com/google/android/apps/wallet/init/CombinedBackgroundInitializerTask.getSimpleName();
    private final Application application;
    private final EagerSingletonInitializer eagerSingletonInitializer;
    private final Executor executor;
    private final Lazy experimentsUpdater;
    private final FeatureManager featureManager;
    private final Lazy gcmRegistrar;
    private final Provider geofencingClient;
    private final Provider localePreferenceUpdater;
    private final Provider preferenceClient;
    private final Long sleepTimeMillis;

    public CombinedBackgroundInitializerTask(Application application1, Executor executor1, EagerSingletonInitializer eagersingletoninitializer, Provider provider, Provider provider1, Provider provider2, Long long1, 
            FeatureManager featuremanager, Lazy lazy, Lazy lazy1)
    {
        application = application1;
        executor = executor1;
        sleepTimeMillis = long1;
        eagerSingletonInitializer = eagersingletoninitializer;
        geofencingClient = provider;
        preferenceClient = provider1;
        localePreferenceUpdater = provider2;
        featureManager = featuremanager;
        experimentsUpdater = lazy1;
        gcmRegistrar = lazy;
    }

    private Void call()
    {
        executor.execute(new Runnable() {

            final CombinedBackgroundInitializerTask this$0;

            public final void run()
            {
                executor.execute(eagerSingletonInitializer);
                if (featureManager.isFeatureEnabled(Feature.USE_ANDROID_GCM))
                {
                    executor.execute(new Runnable() {

                        final _cls1 this$1;

                        public final void run()
                        {
                            ((GcmRegistrar)gcmRegistrar.get()).register();
                        }

            
            {
                this$1 = _cls1.this;
                super();
            }
                    });
                }
                executor.execute(new Runnable() {

                    final _cls1 this$1;

                    public final void run()
                    {
                        SystemClock.sleep(sleepTimeMillis.longValue());
                        ((GeofencingClient)geofencingClient.get()).start(application);
                    }

            
            {
                this$1 = _cls1.this;
                super();
            }
                });
                executor.execute(new Runnable() {

                    final _cls1 this$1;

                    public final void run()
                    {
                        ((ExperimentsUpdater)experimentsUpdater.get()).updateExperiments();
                    }

            
            {
                this$1 = _cls1.this;
                super();
            }
                });
                executor.execute(new Runnable() {

                    final _cls1 this$1;

                    public final void run()
                    {
                        SystemClock.sleep(sleepTimeMillis.longValue());
                        int i = ((PreferenceClient)preferenceClient.get()).updateDeviceInfo();
                        if (i != 0)
                        {
                            try
                            {
                                WLog.w(CombinedBackgroundInitializerTask.TAG, (new StringBuilder(55)).append("updateDeviceInfo() resulted with CallError: ").append(i).toString());
                            }
                            catch (RpcException rpcexception)
                            {
                                WLog.w(CombinedBackgroundInitializerTask.TAG, "updateDeviceInfo() caught RpcException", rpcexception);
                            }
                        }
                        ((LocalePreferenceUpdater)localePreferenceUpdater.get()).register();
                        return;
                    }

            
            {
                this$1 = _cls1.this;
                super();
            }
                });
            }

            
            {
                this$0 = CombinedBackgroundInitializerTask.this;
                super();
            }
        });
        return null;
    }

    public volatile Object call()
        throws Exception
    {
        return call();
    }












}
