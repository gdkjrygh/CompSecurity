// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android;

import com.skype.android.skylib.PcmHostCallback;
import com.skype.android.skylib.SkyLibInitializer;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.skype.android:
//            SkypeModule

public final class SkypeModule_PcmHostCallbackFactory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider initializerProvider;
    private final SkypeModule module;

    public SkypeModule_PcmHostCallbackFactory(SkypeModule skypemodule, Provider provider)
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
        return new SkypeModule_PcmHostCallbackFactory(skypemodule, provider);
    }

    public final PcmHostCallback get()
    {
        PcmHostCallback pcmhostcallback = SkypeModule.b((SkyLibInitializer)initializerProvider.get());
        if (pcmhostcallback == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        } else
        {
            return pcmhostcallback;
        }
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/SkypeModule_PcmHostCallbackFactory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
