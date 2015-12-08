// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.push;

import android.app.Application;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.push:
//            PushManagerProvider, SkypePushListener

public final class PushManagerProvider_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider contextProvider;
    private final Provider skypePushListenerProvider;

    public PushManagerProvider_Factory(Provider provider, Provider provider1)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        }
        contextProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        } else
        {
            skypePushListenerProvider = provider1;
            return;
        }
    }

    public static Factory create(Provider provider, Provider provider1)
    {
        return new PushManagerProvider_Factory(provider, provider1);
    }

    public final PushManagerProvider get()
    {
        return new PushManagerProvider((Application)contextProvider.get(), (SkypePushListener)skypePushListenerProvider.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/push/PushManagerProvider_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
