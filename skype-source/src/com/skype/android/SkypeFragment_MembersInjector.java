// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android;

import com.skype.android.inject.ObjectInterfaceFinder;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android:
//            SkypeFragment

public final class SkypeFragment_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider objectInterfaceFinderProvider;

    public SkypeFragment_MembersInjector(Provider provider)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        } else
        {
            objectInterfaceFinderProvider = provider;
            return;
        }
    }

    public static MembersInjector create(Provider provider)
    {
        return new SkypeFragment_MembersInjector(provider);
    }

    public static void injectObjectInterfaceFinder(SkypeFragment skypefragment, Provider provider)
    {
        skypefragment.objectInterfaceFinder = (ObjectInterfaceFinder)provider.get();
    }

    public final void injectMembers(SkypeFragment skypefragment)
    {
        if (skypefragment == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            skypefragment.objectInterfaceFinder = (ObjectInterfaceFinder)objectInterfaceFinderProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((SkypeFragment)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/SkypeFragment_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
