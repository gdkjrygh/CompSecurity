// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import dagger.internal.Factory;
import dagger.internal.b;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.chat:
//            NotificationRouter

public final class NotificationRouter_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider handleProvider;
    private final Provider wearProvider;

    public NotificationRouter_Factory(Provider provider, Provider provider1)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        }
        handleProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        } else
        {
            wearProvider = provider1;
            return;
        }
    }

    public static Factory create(Provider provider, Provider provider1)
    {
        return new NotificationRouter_Factory(provider, provider1);
    }

    public final NotificationRouter get()
    {
        return new NotificationRouter(b.a(handleProvider), b.a(wearProvider));
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/chat/NotificationRouter_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
