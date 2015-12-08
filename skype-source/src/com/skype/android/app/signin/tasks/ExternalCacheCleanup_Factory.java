// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.signin.tasks;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.signin.tasks:
//            ExternalCacheCleanup

public final class ExternalCacheCleanup_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider contextProvider;

    public ExternalCacheCleanup_Factory(Provider provider)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        } else
        {
            contextProvider = provider;
            return;
        }
    }

    public static Factory create(Provider provider)
    {
        return new ExternalCacheCleanup_Factory(provider);
    }

    public final ExternalCacheCleanup get()
    {
        return new ExternalCacheCleanup((Context)contextProvider.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/signin/tasks/ExternalCacheCleanup_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
