// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.res;

import android.app.Application;
import android.media.AudioManager;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.res:
//            Sounds, Vibration

public final class Sounds_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider audioManagerProvider;
    private final Provider contextProvider;
    private final Provider vibrationProvider;

    public Sounds_Factory(Provider provider, Provider provider1, Provider provider2)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        }
        contextProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        }
        audioManagerProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        } else
        {
            vibrationProvider = provider2;
            return;
        }
    }

    public static Factory create(Provider provider, Provider provider1, Provider provider2)
    {
        return new Sounds_Factory(provider, provider1, provider2);
    }

    public final Sounds get()
    {
        return new Sounds((Application)contextProvider.get(), (AudioManager)audioManagerProvider.get(), (Vibration)vibrationProvider.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/res/Sounds_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
