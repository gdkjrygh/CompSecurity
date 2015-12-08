// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android;

import com.skype.android.inject.ObjectInterfaceFinder;
import com.skype.android.util.accessibility.AccessibilityUtil;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android:
//            SkypeListFragment, SkypeFragment

public final class SkypeListFragment_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider accessibilityUtilProvider;
    private final Provider objectInterfaceFinderProvider;

    public SkypeListFragment_MembersInjector(Provider provider, Provider provider1)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        }
        objectInterfaceFinderProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        } else
        {
            accessibilityUtilProvider = provider1;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1)
    {
        return new SkypeListFragment_MembersInjector(provider, provider1);
    }

    public static void injectAccessibilityUtil(SkypeListFragment skypelistfragment, Provider provider)
    {
        skypelistfragment.accessibilityUtil = (AccessibilityUtil)provider.get();
    }

    public final void injectMembers(SkypeListFragment skypelistfragment)
    {
        if (skypelistfragment == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            skypelistfragment.objectInterfaceFinder = (ObjectInterfaceFinder)objectInterfaceFinderProvider.get();
            skypelistfragment.accessibilityUtil = (AccessibilityUtil)accessibilityUtilProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((SkypeListFragment)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/SkypeListFragment_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
