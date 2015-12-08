// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra;

import dagger.internal.Factory;

// Referenced classes of package com.nbcsports.liveextra:
//            ApplicationModule

public final class ApplicationModule_ConfigurationUrlFactory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final ApplicationModule module;

    public ApplicationModule_ConfigurationUrlFactory(ApplicationModule applicationmodule)
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
        return new ApplicationModule_ConfigurationUrlFactory(applicationmodule);
    }

    public volatile Object get()
    {
        return get();
    }

    public String get()
    {
        String s = module.configurationUrl();
        if (s == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        } else
        {
            return s;
        }
    }

    static 
    {
        boolean flag;
        if (!com/nbcsports/liveextra/ApplicationModule_ConfigurationUrlFactory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
