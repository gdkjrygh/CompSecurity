// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.crash;

import com.skype.android.concurrent.AsyncService;
import com.skype.android.util.HttpUtil;
import com.skype.android.util.NetworkUtil;
import com.skype.android.util.TimeUtil;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.crash:
//            DumpUploader

public final class DumpUploader_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider asyncProvider;
    private final Provider httpUtilProvider;
    private final Provider networkUtilProvider;
    private final Provider timeUtilProvider;

    public DumpUploader_Factory(Provider provider, Provider provider1, Provider provider2, Provider provider3)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        }
        asyncProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        }
        httpUtilProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        }
        networkUtilProvider = provider2;
        if (!$assertionsDisabled && provider3 == null)
        {
            throw new AssertionError();
        } else
        {
            timeUtilProvider = provider3;
            return;
        }
    }

    public static Factory create(Provider provider, Provider provider1, Provider provider2, Provider provider3)
    {
        return new DumpUploader_Factory(provider, provider1, provider2, provider3);
    }

    public final DumpUploader get()
    {
        return new DumpUploader((AsyncService)asyncProvider.get(), (HttpUtil)httpUtilProvider.get(), (NetworkUtil)networkUtilProvider.get(), (TimeUtil)timeUtilProvider.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/crash/DumpUploader_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
