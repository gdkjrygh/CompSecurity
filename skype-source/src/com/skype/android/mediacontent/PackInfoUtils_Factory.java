// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.mediacontent;

import com.skype.android.util.ImageCache;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.mediacontent:
//            PackInfoUtils

public final class PackInfoUtils_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider imageCacheProvider;

    public PackInfoUtils_Factory(Provider provider)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        } else
        {
            imageCacheProvider = provider;
            return;
        }
    }

    public static Factory create(Provider provider)
    {
        return new PackInfoUtils_Factory(provider);
    }

    public final PackInfoUtils get()
    {
        return new PackInfoUtils((ImageCache)imageCacheProvider.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/mediacontent/PackInfoUtils_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
