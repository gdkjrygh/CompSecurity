// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.inject;

import android.content.res.Resources;
import dagger.internal.Factory;

// Referenced classes of package com.skype.android.inject:
//            ApplicationModule

public final class ApplicationModule_ResourcesFactory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final ApplicationModule module;

    public ApplicationModule_ResourcesFactory(ApplicationModule applicationmodule)
    {
        if (!$assertionsDisabled && applicationmodule == null)
        {
            throw new AssertionError();
        } else
        {
            module = applicationmodule;
            return;
        }
    }

    public static Factory create(ApplicationModule applicationmodule)
    {
        return new ApplicationModule_ResourcesFactory(applicationmodule);
    }

    public final Resources get()
    {
        Resources resources = module.resources();
        if (resources == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        } else
        {
            return resources;
        }
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/inject/ApplicationModule_ResourcesFactory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
