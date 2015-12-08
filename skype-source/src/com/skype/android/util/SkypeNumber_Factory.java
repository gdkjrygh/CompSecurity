// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util;

import com.skype.Account;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.util:
//            SkypeNumber

public final class SkypeNumber_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider accountProvider;

    public SkypeNumber_Factory(Provider provider)
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
        return new SkypeNumber_Factory(provider);
    }

    public final SkypeNumber get()
    {
        return new SkypeNumber((Account)accountProvider.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/util/SkypeNumber_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
