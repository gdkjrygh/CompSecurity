// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.plastic;

import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.eventbus.EventHandler;
import com.google.android.apps.wallet.eventbus.RegistrationCallback;
import com.google.android.apps.wallet.refresh.RequestRefreshEvent;

// Referenced classes of package com.google.android.apps.wallet.plastic:
//            PlasticCardModelPublisher

final class this._cls1
    implements EventHandler
{

    final handleEvent this$1;

    private void handleEvent(RequestRefreshEvent requestrefreshevent)
    {
        PlasticCardModelPublisher.access$100(_fld0);
    }

    public final volatile void handleEvent(Object obj)
    {
        handleEvent((RequestRefreshEvent)obj);
    }

    is._cls0()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/google/android/apps/wallet/plastic/PlasticCardModelPublisher$1

/* anonymous class */
    final class PlasticCardModelPublisher._cls1
        implements RegistrationCallback
    {

        final PlasticCardModelPublisher this$0;

        public final void handleRegistration(Object obj)
        {
            if (!PlasticCardModelPublisher.access$000(PlasticCardModelPublisher.this))
            {
                PlasticCardModelPublisher.access$002(PlasticCardModelPublisher.this, true);
                PlasticCardModelPublisher.access$200(PlasticCardModelPublisher.this).register(this, com/google/android/apps/wallet/refresh/RequestRefreshEvent, new PlasticCardModelPublisher._cls1._cls1());
            }
            PlasticCardModelPublisher.access$300(PlasticCardModelPublisher.this, obj);
        }

            
            {
                this$0 = PlasticCardModelPublisher.this;
                super();
            }
    }

}
