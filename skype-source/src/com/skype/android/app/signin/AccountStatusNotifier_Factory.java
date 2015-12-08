// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.signin;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.signin:
//            AccountStatusNotifier

public final class AccountStatusNotifier_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider contextProvider;

    public AccountStatusNotifier_Factory(Provider provider)
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
        return new AccountStatusNotifier_Factory(provider);
    }

    public final AccountStatusNotifier get()
    {
        return new AccountStatusNotifier((Context)contextProvider.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/signin/AccountStatusNotifier_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
