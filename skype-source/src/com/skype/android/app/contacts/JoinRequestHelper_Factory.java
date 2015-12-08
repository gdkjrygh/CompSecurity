// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.contacts;

import android.app.Application;
import com.skype.SkyLib;
import com.skype.android.app.token.SkypeTokenAccess;
import com.skype.android.concurrent.AsyncService;
import com.skype.android.skylib.ObjectIdMap;
import com.skype.android.util.HttpUtil;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.contacts:
//            JoinRequestHelper

public final class JoinRequestHelper_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider applicationProvider;
    private final Provider asyncServiceProvider;
    private final Provider httpUtilProvider;
    private final Provider libProvider;
    private final Provider mapProvider;
    private final Provider skypeTokenAccessProvider;

    public JoinRequestHelper_Factory(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        }
        httpUtilProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        }
        skypeTokenAccessProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        }
        libProvider = provider2;
        if (!$assertionsDisabled && provider3 == null)
        {
            throw new AssertionError();
        }
        mapProvider = provider3;
        if (!$assertionsDisabled && provider4 == null)
        {
            throw new AssertionError();
        }
        asyncServiceProvider = provider4;
        if (!$assertionsDisabled && provider5 == null)
        {
            throw new AssertionError();
        } else
        {
            applicationProvider = provider5;
            return;
        }
    }

    public static Factory create(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5)
    {
        return new JoinRequestHelper_Factory(provider, provider1, provider2, provider3, provider4, provider5);
    }

    public final JoinRequestHelper get()
    {
        return new JoinRequestHelper((HttpUtil)httpUtilProvider.get(), (SkypeTokenAccess)skypeTokenAccessProvider.get(), (SkyLib)libProvider.get(), (ObjectIdMap)mapProvider.get(), (AsyncService)asyncServiceProvider.get(), (Application)applicationProvider.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/contacts/JoinRequestHelper_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
