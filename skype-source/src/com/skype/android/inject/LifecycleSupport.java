// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.inject;

import android.os.Bundle;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.skype.android.inject:
//            LifecycleListener

public class LifecycleSupport
    implements LifecycleListener
{

    private Set listeners;

    public transient LifecycleSupport(LifecycleListener alifecyclelistener[])
    {
        listeners = new HashSet();
        Collections.addAll(listeners, alifecyclelistener);
    }

    public void addListener(LifecycleListener lifecyclelistener)
    {
        if (lifecyclelistener == null)
        {
            throw new IllegalArgumentException("null listener");
        } else
        {
            listeners.add(lifecyclelistener);
            return;
        }
    }

    public void onCreate(Bundle bundle)
    {
        for (Iterator iterator = listeners.iterator(); iterator.hasNext(); ((LifecycleListener)iterator.next()).onCreate(bundle)) { }
    }

    public void onDestroy()
    {
        for (Iterator iterator = listeners.iterator(); iterator.hasNext(); ((LifecycleListener)iterator.next()).onDestroy()) { }
    }

    public void onPause()
    {
        for (Iterator iterator = listeners.iterator(); iterator.hasNext(); ((LifecycleListener)iterator.next()).onPause()) { }
    }

    public void onResume()
    {
        for (Iterator iterator = listeners.iterator(); iterator.hasNext(); ((LifecycleListener)iterator.next()).onResume()) { }
    }

    public void onStart()
    {
        for (Iterator iterator = listeners.iterator(); iterator.hasNext(); ((LifecycleListener)iterator.next()).onStart()) { }
    }

    public void onStop()
    {
        for (Iterator iterator = listeners.iterator(); iterator.hasNext(); ((LifecycleListener)iterator.next()).onStop()) { }
    }
}
