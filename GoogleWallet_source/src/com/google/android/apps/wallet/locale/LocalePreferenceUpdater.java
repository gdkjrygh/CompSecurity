// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.locale;

import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.preferences.PreferenceClient;
import com.google.android.apps.wallet.rpc.RpcException;
import dagger.Lazy;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.google.android.apps.wallet.locale:
//            LocaleChangedEvent

public class LocalePreferenceUpdater
{

    private static final String TAG = com/google/android/apps/wallet/locale/LocalePreferenceUpdater.getSimpleName();
    private final EventBus eventBus;
    private final Lazy executor;
    private final Lazy preferenceClient;
    private final AtomicBoolean registered = new AtomicBoolean();
    private final Runnable updateInfoRunnable = new Runnable() {

        final LocalePreferenceUpdater this$0;

        public final void run()
        {
            try
            {
                ((PreferenceClient)preferenceClient.get()).updateDeviceInfo();
                return;
            }
            catch (RpcException rpcexception)
            {
                WLog.e(LocalePreferenceUpdater.TAG, "Error calling updateDeviceInfo", rpcexception);
            }
        }

            
            {
                this$0 = LocalePreferenceUpdater.this;
                super();
            }
    };

    public LocalePreferenceUpdater(EventBus eventbus, Lazy lazy, Lazy lazy1)
    {
        eventBus = eventbus;
        executor = lazy;
        preferenceClient = lazy1;
    }

    void onLocaleChange(LocaleChangedEvent localechangedevent)
    {
        ((Executor)executor.get()).execute(updateInfoRunnable);
    }

    public final void register()
    {
        if (!registered.compareAndSet(false, true))
        {
            return;
        } else
        {
            eventBus.register(this);
            return;
        }
    }



}
