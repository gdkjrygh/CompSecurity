// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app;

import com.skype.android.inject.EventThread;
import com.skype.android.inject.LifecycleState;
import com.skype.android.inject.Proxy;
import com.skype.android.inject.ProxyEventListener;
import com.skype.android.wakeup.OnWakeupEvent;

// Referenced classes of package com.skype.android.app:
//            WakeupSchedulerAgent

final class this._cls0 extends ProxyEventListener
{

    final onEvent this$0;

    public final void onEvent(OnWakeupEvent onwakeupevent)
    {
        ((WakeupSchedulerAgent)tTarget()).onWakeup(onwakeupevent);
    }

    public final volatile void onEvent(Object obj)
    {
        onEvent((OnWakeupEvent)obj);
    }

    _cls9(Proxy proxy, Class class1, LifecycleState lifecyclestate, EventThread eventthread)
    {
        this$0 = this._cls0.this;
        super(proxy, class1, lifecyclestate, eventthread);
    }
}
