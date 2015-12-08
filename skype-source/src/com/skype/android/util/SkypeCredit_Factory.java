// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util;

import com.skype.Account;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.util:
//            SkypeCredit

public final class SkypeCredit_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider accountProvider;

    public SkypeCredit_Factory(Provider provider)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        } else
        {
            accountProvider = provider;
            return;
        }
    }

    public static Factory create(Provider provider)
    {
        return new SkypeCredit_Factory(provider);
    }

    public final SkypeCredit get()
    {
        return new SkypeCredit((Account)accountProvider.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/util/SkypeCredit_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
