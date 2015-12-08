// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android;

import android.app.Application;
import com.skype.SkyLib;
import com.skype.Translator;
import com.skype.android.skylib.ObjectIdMap;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.skype.android:
//            SkypeModule

public final class SkypeModule_GetTranslatorFactory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider contextProvider;
    private final Provider libProvider;
    private final Provider mapProvider;
    private final SkypeModule module;

    public SkypeModule_GetTranslatorFactory(SkypeModule skypemodule, Provider provider, Provider provider1, Provider provider2)
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
        contextProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        }
        libProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        } else
        {
            mapProvider = provider2;
            return;
        }
    }

    public static Factory create(SkypeModule skypemodule, Provider provider, Provider provider1, Provider provider2)
    {
        return new SkypeModule_GetTranslatorFactory(skypemodule, provider, provider1, provider2);
    }

    public final Translator get()
    {
        return SkypeModule.a((Application)contextProvider.get(), (SkyLib)libProvider.get(), (ObjectIdMap)mapProvider.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/SkypeModule_GetTranslatorFactory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
