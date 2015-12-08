// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.service;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import me.lyft.android.application.polling.IAppProcess;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.infrastructure.service:
//            IAppProcessRegistry

public class AppProcessRegistry
    implements IAppProcessRegistry
{

    private List appServiceListeners;

    public transient AppProcessRegistry(IAppProcess aiappprocess[])
    {
        appServiceListeners = Arrays.asList(aiappprocess);
    }

    public void onServiceCreated()
    {
        for (Iterator iterator = appServiceListeners.iterator(); iterator.hasNext(); ((IAppProcess)iterator.next()).onServiceCreated()) { }
    }

    public void onServiceDestroyed()
    {
        for (Iterator iterator = appServiceListeners.iterator(); iterator.hasNext(); ((IAppProcess)iterator.next()).onServiceDestroyed()) { }
    }

    public void setErrorHandler(Action1 action1)
    {
        for (Iterator iterator = appServiceListeners.iterator(); iterator.hasNext(); ((IAppProcess)iterator.next()).setErrorHandler(action1)) { }
    }
}
