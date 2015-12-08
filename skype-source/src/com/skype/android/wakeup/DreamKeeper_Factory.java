// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.wakeup;

import com.skype.SkyLib;
import com.skype.android.app.BackgroundMode;
import com.skype.android.event.EventBus;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.wakeup:
//            DreamKeeper

public final class DreamKeeper_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider backgroundModeProvider;
    private final Provider eventBusProvider;
    private final Provider libProvider;

    public DreamKeeper_Factory(Provider provider, Provider provider1, Provider provider2)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        }
        backgroundModeProvider = provider;
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
            eventBusProvider = provider2;
            return;
        }
    }

    public static Factory create(Provider provider, Provider provider1, Provider provider2)
    {
        return new DreamKeeper_Factory(provider, provider1, provider2);
    }

    public final DreamKeeper get()
    {
        return new DreamKeeper((BackgroundMode)backgroundModeProvider.get(), (SkyLib)libProvider.get(), (EventBus)eventBusProvider.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/wakeup/DreamKeeper_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
