// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.signin;

import com.skype.android.util.HttpUtil;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.signin:
//            LinkingGetAccounts

public final class LinkingGetAccounts_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider httpUtilProvider;

    public LinkingGetAccounts_Factory(Provider provider)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        } else
        {
            httpUtilProvider = provider;
            return;
        }
    }

    public static Factory create(Provider provider)
    {
        return new LinkingGetAccounts_Factory(provider);
    }

    public final LinkingGetAccounts get()
    {
        return new LinkingGetAccounts((HttpUtil)httpUtilProvider.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/signin/LinkingGetAccounts_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
