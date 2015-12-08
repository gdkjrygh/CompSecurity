// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android;

import android.app.Application;
import com.skype.SkyLib;
import com.skype.android.analytics.AnalyticsPersistentStorage;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.skype.android:
//            SkypeModule

public final class SkypeModule_SkyLibFactory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider applicationProvider;
    private final SkypeModule module;
    private final Provider storageProvider;

    public SkypeModule_SkyLibFactory(SkypeModule skypemodule, Provider provider, Provider provider1)
    {
        if (!$assertionsDisabled && skypemodule == null)
        {
            throw new AssertionError();
        }
        module = skypemodule;
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        }
        applicationProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        } else
        {
            storageProvider = provider1;
            return;
        }
    }

    public static Factory create(SkypeModule skypemodule, Provider provider, Provider provider1)
    {
        return new SkypeModule_SkyLibFactory(skypemodule, provider, provider1);
    }

    public final SkyLib get()
    {
        SkyLib skylib = SkypeModule.a((Application)applicationProvider.get(), (AnalyticsPersistentStorage)storageProvider.get());
        if (skylib == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        } else
        {
            return skylib;
        }
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/SkypeModule_SkyLibFactory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
