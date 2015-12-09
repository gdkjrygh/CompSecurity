// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.init;

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
import java.util.concurrent.Executor;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.init:
//            CombinedBackgroundInitializerTask

final class this._cls0
    implements Runnable
{

    final CombinedBackgroundInitializerTask this$0;

    public final void run()
    {
        CombinedBackgroundInitializerTask.access$100(CombinedBackgroundInitializerTask.this).execute(CombinedBackgroundInitializerTask.access$000(CombinedBackgroundInitializerTask.this));
        if (CombinedBackgroundInitializerTask.access$200(CombinedBackgroundInitializerTask.this).isFeatureEnabled(Feature.USE_ANDROID_GCM))
        {
            CombinedBackgroundInitializerTask.access$100(CombinedBackgroundInitializerTask.this).execute(new Runnable() {

                final CombinedBackgroundInitializerTask._cls1 this$1;

                public final void run()
                {
                    ((GcmRegistrar)CombinedBackgroundInitializerTask.access$300(this$0).get()).register();
                }

            
            {
                this$1 = CombinedBackgroundInitializerTask._cls1.this;
                super();
            }
            });
        }
        CombinedBackgroundInitializerTask.access$100(CombinedBackgroundInitializerTask.this).execute(new Runnable() {

            final CombinedBackgroundInitializerTask._cls1 this$1;

            public final void run()
            {
                SystemClock.sleep(CombinedBackgroundInitializerTask.access$400(this$0).longValue());
                ((GeofencingClient)CombinedBackgroundInitializerTask.access$600(this$0).get()).start(CombinedBackgroundInitializerTask.access$500(this$0));
            }

            
            {
                this$1 = CombinedBackgroundInitializerTask._cls1.this;
                super();
            }
        });
        CombinedBackgroundInitializerTask.access$100(CombinedBackgroundInitializerTask.this).execute(new Runnable() {

            final CombinedBackgroundInitializerTask._cls1 this$1;

            public final void run()
            {
                ((ExperimentsUpdater)CombinedBackgroundInitializerTask.access$700(this$0).get()).updateExperiments();
            }

            
            {
                this$1 = CombinedBackgroundInitializerTask._cls1.this;
                super();
            }
        });
        CombinedBackgroundInitializerTask.access$100(CombinedBackgroundInitializerTask.this).execute(new Runnable() {

            final CombinedBackgroundInitializerTask._cls1 this$1;

            public final void run()
            {
                SystemClock.sleep(CombinedBackgroundInitializerTask.access$400(this$0).longValue());
                int i = ((PreferenceClient)CombinedBackgroundInitializerTask.access$800(this$0).get()).updateDeviceInfo();
                if (i != 0)
                {
                    try
                    {
                        WLog.w(CombinedBackgroundInitializerTask.access$900(), (new StringBuilder(55)).append("updateDeviceInfo() resulted with CallError: ").append(i).toString());
                    }
                    catch (RpcException rpcexception)
                    {
                        WLog.w(CombinedBackgroundInitializerTask.access$900(), "updateDeviceInfo() caught RpcException", rpcexception);
                    }
                }
                ((LocalePreferenceUpdater)CombinedBackgroundInitializerTask.access$1000(this$0).get()).register();
                return;
            }

            
            {
                this$1 = CombinedBackgroundInitializerTask._cls1.this;
                super();
            }
        });
    }

    _cls4.this._cls1()
    {
        this$0 = CombinedBackgroundInitializerTask.this;
        super();
    }
}
