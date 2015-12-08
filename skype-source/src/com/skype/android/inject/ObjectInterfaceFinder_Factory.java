// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.inject;

import com.skype.android.skylib.ObjectIdMap;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.inject:
//            ObjectInterfaceFinder

public final class ObjectInterfaceFinder_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider mapProvider;

    public ObjectInterfaceFinder_Factory(Provider provider)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        } else
        {
            mapProvider = provider;
            return;
        }
    }

    public static Factory create(Provider provider)
    {
        return new ObjectInterfaceFinder_Factory(provider);
    }

    public final ObjectInterfaceFinder get()
    {
        return new ObjectInterfaceFinder((ObjectIdMap)mapProvider.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/inject/ObjectInterfaceFinder_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
