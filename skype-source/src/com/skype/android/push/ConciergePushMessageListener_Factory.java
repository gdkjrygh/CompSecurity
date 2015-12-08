// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.push;

import android.app.Application;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.push:
//            ConciergePushMessageListener

public final class ConciergePushMessageListener_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider contextProvider;

    public ConciergePushMessageListener_Factory(Provider provider)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        } else
        {
            contextProvider = provider;
            return;
        }
    }

    public static Factory create(Provider provider)
    {
        return new ConciergePushMessageListener_Factory(provider);
    }

    public final ConciergePushMessageListener get()
    {
        return new ConciergePushMessageListener((Application)contextProvider.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/push/ConciergePushMessageListener_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
