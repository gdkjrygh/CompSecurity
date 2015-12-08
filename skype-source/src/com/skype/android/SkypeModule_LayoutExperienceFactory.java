// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android;

import android.content.Context;
import com.skype.android.app.LayoutExperience;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.skype.android:
//            SkypeModule

public final class SkypeModule_LayoutExperienceFactory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider contextProvider;
    private final SkypeModule module;

    public SkypeModule_LayoutExperienceFactory(SkypeModule skypemodule, Provider provider)
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
            contextProvider = provider;
            return;
        }
    }

    public static Factory create(SkypeModule skypemodule, Provider provider)
    {
        return new SkypeModule_LayoutExperienceFactory(skypemodule, provider);
    }

    public final LayoutExperience get()
    {
        return SkypeModule.b((Context)contextProvider.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/SkypeModule_LayoutExperienceFactory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
