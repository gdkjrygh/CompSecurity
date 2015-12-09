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

final class this._cls0
    implements RegistrationCallback
{

    final PlasticCardModelPublisher this$0;

    public final void handleRegistration(Object obj)
    {
        if (!PlasticCardModelPublisher.access$000(PlasticCardModelPublisher.this))
        {
            PlasticCardModelPublisher.access$002(PlasticCardModelPublisher.this, true);
            PlasticCardModelPublisher.access$200(PlasticCardModelPublisher.this).register(this, com/google/android/apps/wallet/refresh/RequestRefreshEvent, new EventHandler() {

                final PlasticCardModelPublisher._cls1 this$1;

                private void handleEvent(RequestRefreshEvent requestrefreshevent)
                {
                    PlasticCardModelPublisher.access$100(this$0);
                }

                public final volatile void handleEvent(Object obj1)
                {
                    handleEvent((RequestRefreshEvent)obj1);
                }

            
            {
                this$1 = PlasticCardModelPublisher._cls1.this;
                super();
            }
            });
        }
        PlasticCardModelPublisher.access$300(PlasticCardModelPublisher.this, obj);
    }

    _cls1.this._cls1()
    {
        this$0 = PlasticCardModelPublisher.this;
        super();
    }
}
