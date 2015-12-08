// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android;

import com.skype.android.inject.ObjectInterfaceFinder;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android:
//            SkypeFragment, SkypePreferenceFragment

public final class SkypePreferenceFragment_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider objectInterfaceFinderProvider;

    public SkypePreferenceFragment_MembersInjector(Provider provider)
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
        return new SkypePreferenceFragment_MembersInjector(provider);
    }

    public final void injectMembers(SkypePreferenceFragment skypepreferencefragment)
    {
        if (skypepreferencefragment == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            skypepreferencefragment.objectInterfaceFinder = (ObjectInterfaceFinder)objectInterfaceFinderProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((SkypePreferenceFragment)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/SkypePreferenceFragment_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
