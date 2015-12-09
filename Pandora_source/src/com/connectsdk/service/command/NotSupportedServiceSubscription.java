// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.connectsdk.service.command;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.connectsdk.service.command:
//            ServiceSubscription

public class NotSupportedServiceSubscription
    implements ServiceSubscription
{

    private List listeners;

    public NotSupportedServiceSubscription()
    {
        listeners = new ArrayList();
    }

    public Object addListener(Object obj)
    {
        listeners.add(obj);
        return obj;
    }

    public List getListeners()
    {
        return listeners;
    }

    public void removeListener(Object obj)
    {
        listeners.remove(obj);
    }

    public void unsubscribe()
    {
    }
}
