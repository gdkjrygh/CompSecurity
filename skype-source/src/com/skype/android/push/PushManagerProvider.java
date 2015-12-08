// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.push;

import android.app.Application;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.push:
//            PushManager, c, SkypePushListener

public class PushManagerProvider
    implements Provider
{

    private PushManager pushManager;

    public PushManagerProvider(Application application, SkypePushListener skypepushlistener)
    {
        pushManager = PushManager.getInstance(application);
        pushManager.setConfiguration(new c());
        pushManager.addListener(skypepushlistener);
    }

    public PushManager get()
    {
        return pushManager;
    }

    public volatile Object get()
    {
        return get();
    }
}
