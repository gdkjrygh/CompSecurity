// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat.picker;

import com.skype.android.inject.EventThread;
import com.skype.android.inject.LifecycleState;
import com.skype.android.inject.Proxy;
import com.skype.android.inject.ProxyEventListener;
import com.skype.android.mediacontent.OnMediaContentReady;

// Referenced classes of package com.skype.android.app.chat.picker:
//            AbstractPickerTab

public class onEventOnMediaContentReady extends Proxy
{

    private ProxyEventListener onEventOnMediaContentReady;

    public void clearViews()
    {
        super.clearViews();
    }

    public void injectViews()
    {
        super.injectViews();
    }

    public _cls1.this._cls0(AbstractPickerTab abstractpickertab)
    {
        super(abstractpickertab);
        onEventOnMediaContentReady = new ProxyEventListener(this, com/skype/android/mediacontent/OnMediaContentReady, null, EventThread.MAIN) {

            final AbstractPickerTab..Proxy this$0;

            public final void onEvent(OnMediaContentReady onmediacontentready)
            {
                ((AbstractPickerTab)getTarget()).onEvent(onmediacontentready);
            }

            public final volatile void onEvent(Object obj)
            {
                onEvent((OnMediaContentReady)obj);
            }

            
            {
                this$0 = AbstractPickerTab..Proxy.this;
                super(proxy1, class1, lifecyclestate, eventthread);
            }
        };
        addListener(onEventOnMediaContentReady);
    }
}
