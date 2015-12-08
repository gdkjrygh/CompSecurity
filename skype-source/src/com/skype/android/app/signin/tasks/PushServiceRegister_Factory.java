// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.signin.tasks;

import android.content.Context;
import com.skype.android.push.PushMessageRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.signin.tasks:
//            e

public final class PushServiceRegister_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider contextProvider;
    private final Provider repositoryProvider;

    public PushServiceRegister_Factory(Provider provider, Provider provider1)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        }
        contextProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        } else
        {
            repositoryProvider = provider1;
            return;
        }
    }

    public static Factory create(Provider provider, Provider provider1)
    {
        return new PushServiceRegister_Factory(provider, provider1);
    }

    public final e get()
    {
        return new e((Context)contextProvider.get(), (PushMessageRepository)repositoryProvider.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/signin/tasks/PushServiceRegister_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
