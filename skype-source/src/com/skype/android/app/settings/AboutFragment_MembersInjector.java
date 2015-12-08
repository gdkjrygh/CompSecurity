// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.settings;

import com.skype.android.SkypeFragment_MembersInjector;
import com.skype.android.app.NavigationUrl;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.settings:
//            AboutFragment

public final class AboutFragment_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider navigationUrlProvider;
    private final Provider objectInterfaceFinderProvider;

    public AboutFragment_MembersInjector(Provider provider, Provider provider1)
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
            navigationUrlProvider = provider1;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1)
    {
        return new AboutFragment_MembersInjector(provider, provider1);
    }

    public static void injectNavigationUrl(AboutFragment aboutfragment, Provider provider)
    {
        aboutfragment.navigationUrl = (NavigationUrl)provider.get();
    }

    public final void injectMembers(AboutFragment aboutfragment)
    {
        if (aboutfragment == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            SkypeFragment_MembersInjector.injectObjectInterfaceFinder(aboutfragment, objectInterfaceFinderProvider);
            aboutfragment.navigationUrl = (NavigationUrl)navigationUrlProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((AboutFragment)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/settings/AboutFragment_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
