// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android;

import com.skype.android.push.PushManager;
import com.skype.android.push.PushManagerProvider;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.skype.android:
//            SkypeModule

public final class SkypeModule_PushManagerFactory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final SkypeModule module;
    private final Provider providerProvider;

    public SkypeModule_PushManagerFactory(SkypeModule skypemodule, Provider provider)
    {
        if (!$assertionsDisabled && skypemodule == null)
        {
            throw new AssertionError();
        }
        module = skypemodule;
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        } else
        {
            providerProvider = provider;
            return;
        }
    }

    public static Factory create(SkypeModule skypemodule, Provider provider)
    {
        return new SkypeModule_PushManagerFactory(skypemodule, provider);
    }

    public final PushManager get()
    {
        PushManager pushmanager = SkypeModule.a((PushManagerProvider)providerProvider.get());
        if (pushmanager == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        } else
        {
            return pushmanager;
        }
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/SkypeModule_PushManagerFactory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
