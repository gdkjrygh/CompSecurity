// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android;

import com.skype.SkyLib;
import com.skype.android.telemetry.SCTManager;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.skype.android:
//            SkypeModule

public final class SkypeModule_SctManagerFactory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider libProvider;
    private final SkypeModule module;

    public SkypeModule_SctManagerFactory(SkypeModule skypemodule, Provider provider)
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
            libProvider = provider;
            return;
        }
    }

    public static Factory create(SkypeModule skypemodule, Provider provider)
    {
        return new SkypeModule_SctManagerFactory(skypemodule, provider);
    }

    public final SCTManager get()
    {
        SCTManager sctmanager = SkypeModule.c((SkyLib)libProvider.get());
        if (sctmanager == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        } else
        {
            return sctmanager;
        }
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/SkypeModule_SctManagerFactory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
