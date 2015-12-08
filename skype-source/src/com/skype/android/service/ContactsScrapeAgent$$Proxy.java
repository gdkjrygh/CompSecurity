// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.service;

import com.skype.android.config.ecs.OnEcsDone;
import com.skype.android.inject.EventThread;
import com.skype.android.inject.LifecycleState;
import com.skype.android.inject.Proxy;
import com.skype.android.inject.ProxyEventListener;

// Referenced classes of package com.skype.android.service:
//            ContactsScrapeAgent

public class onEventOnEcsDone extends com.skype.android.app.oxy
{

    private ProxyEventListener onEventOnEcsDone;

    public void clearViews()
    {
        super.oxy();
    }

    public void injectViews()
    {
        super.oxy();
    }

    public _cls1.this._cls0(ContactsScrapeAgent contactsscrapeagent)
    {
        super(contactsscrapeagent);
        onEventOnEcsDone = new ProxyEventListener(this, com/skype/android/config/ecs/OnEcsDone, null, null) {

            final ContactsScrapeAgent..Proxy this$0;

            public final void onEvent(OnEcsDone onecsdone)
            {
                ((ContactsScrapeAgent)getTarget()).onEvent(onecsdone);
            }

            public final volatile void onEvent(Object obj)
            {
                onEvent((OnEcsDone)obj);
            }

            
            {
                this$0 = ContactsScrapeAgent..Proxy.this;
                super(proxy1, class1, lifecyclestate, eventthread);
            }
        };
        addListener(onEventOnEcsDone);
    }
}
