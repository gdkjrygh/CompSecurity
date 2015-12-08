// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.inject;

import android.os.Bundle;
import com.skype.android.event.EventBus;

// Referenced classes of package com.skype.android.inject:
//            LifecycleListener, EventSubscriberBinder, LifecycleState

public class SubscriberLifecycleListener
    implements LifecycleListener
{

    private EventSubscriberBinder eventBinder;

    public SubscriberLifecycleListener(EventBus eventbus, Object obj)
    {
        eventBinder = new EventSubscriberBinder(eventbus, obj);
    }

    public void onCreate(Bundle bundle)
    {
        eventBinder.bind(LifecycleState.CREATED);
    }

    public void onDestroy()
    {
        eventBinder.unbind(LifecycleState.CREATED);
    }

    public void onPause()
    {
        eventBinder.unbind(LifecycleState.RESUMED);
    }

    public void onResume()
    {
        eventBinder.bind(LifecycleState.RESUMED);
    }

    public void onStart()
    {
        eventBinder.bind(LifecycleState.STARTED);
    }

    public void onStop()
    {
        eventBinder.unbind(LifecycleState.STARTED);
    }
}
