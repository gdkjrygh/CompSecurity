// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.sync;

import com.skype.android.app.OnForegroundChanged;
import com.skype.android.inject.EventThread;
import com.skype.android.inject.LifecycleState;
import com.skype.android.inject.Proxy;
import com.skype.android.inject.ProxyEventListener;

// Referenced classes of package com.skype.android.sync:
//            ContactsIngestManager

public class onEventOnForegroundChanged extends Proxy
{

    private ProxyEventListener onEventOnForegroundChanged;

    public void clearViews()
    {
        super.clearViews();
    }

    public void injectViews()
    {
        super.injectViews();
    }

    public _cls1.this._cls0(ContactsIngestManager contactsingestmanager)
    {
        super(contactsingestmanager);
        onEventOnForegroundChanged = new ProxyEventListener(this, com/skype/android/app/OnForegroundChanged, null, null) {

            final ContactsIngestManager..Proxy this$0;

            public final void onEvent(OnForegroundChanged onforegroundchanged)
            {
                ((ContactsIngestManager)getTarget()).onEvent(onforegroundchanged);
            }

            public final volatile void onEvent(Object obj)
            {
                onEvent((OnForegroundChanged)obj);
            }

            
            {
                this$0 = ContactsIngestManager..Proxy.this;
                super(proxy1, class1, lifecyclestate, eventthread);
            }
        };
        addListener(onEventOnForegroundChanged);
    }
}
