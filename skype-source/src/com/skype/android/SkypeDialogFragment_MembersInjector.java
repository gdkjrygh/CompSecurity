// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android;

import com.skype.android.inject.ObjectInterfaceFinder;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android:
//            SkypeDialogFragment

public final class SkypeDialogFragment_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider objectInterfaceFinderProvider;

    public SkypeDialogFragment_MembersInjector(Provider provider)
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
        return new SkypeDialogFragment_MembersInjector(provider);
    }

    public static void injectObjectInterfaceFinder(SkypeDialogFragment skypedialogfragment, Provider provider)
    {
        skypedialogfragment.objectInterfaceFinder = (ObjectInterfaceFinder)provider.get();
    }

    public final void injectMembers(SkypeDialogFragment skypedialogfragment)
    {
        if (skypedialogfragment == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            skypedialogfragment.objectInterfaceFinder = (ObjectInterfaceFinder)objectInterfaceFinderProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((SkypeDialogFragment)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/SkypeDialogFragment_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
