// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android;

import com.skype.android.skylib.SkyLibInitializer;
import com.skype.pcmhost.PcmHost;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.skype.android:
//            SkypeModule

public final class SkypeModule_PcmHostFactory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider initializerProvider;
    private final SkypeModule module;

    public SkypeModule_PcmHostFactory(SkypeModule skypemodule, Provider provider)
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
            initializerProvider = provider;
            return;
        }
    }

    public static Factory create(SkypeModule skypemodule, Provider provider)
    {
        return new SkypeModule_PcmHostFactory(skypemodule, provider);
    }

    public final PcmHost get()
    {
        PcmHost pcmhost = SkypeModule.a((SkyLibInitializer)initializerProvider.get());
        if (pcmhost == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        } else
        {
            return pcmhost;
        }
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/SkypeModule_PcmHostFactory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
