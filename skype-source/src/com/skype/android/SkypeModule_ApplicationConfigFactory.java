// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android;

import com.skype.android.config.ApplicationConfig;
import dagger.internal.Factory;

// Referenced classes of package com.skype.android:
//            SkypeModule

public final class SkypeModule_ApplicationConfigFactory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final SkypeModule module;

    public SkypeModule_ApplicationConfigFactory(SkypeModule skypemodule)
    {
        if (!$assertionsDisabled && skypemodule == null)
        {
            throw new AssertionError();
        } else
        {
            module = skypemodule;
            return;
        }
    }

    public static Factory create(SkypeModule skypemodule)
    {
        return new SkypeModule_ApplicationConfigFactory(skypemodule);
    }

    public final ApplicationConfig get()
    {
        ApplicationConfig applicationconfig = SkypeModule.c();
        if (applicationconfig == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        } else
        {
            return applicationconfig;
        }
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/SkypeModule_ApplicationConfigFactory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
