// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.main;

import com.skype.android.config.ecs.EcsConfiguration;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.main:
//            HubPagerAdapterMaterial

public final class HubPagerAdapterMaterial_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider configurationProvider;

    public HubPagerAdapterMaterial_MembersInjector(Provider provider)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        } else
        {
            configurationProvider = provider;
            return;
        }
    }

    public static MembersInjector create(Provider provider)
    {
        return new HubPagerAdapterMaterial_MembersInjector(provider);
    }

    public static void injectConfiguration(HubPagerAdapterMaterial hubpageradaptermaterial, Provider provider)
    {
        hubpageradaptermaterial.configuration = (EcsConfiguration)provider.get();
    }

    public final void injectMembers(HubPagerAdapterMaterial hubpageradaptermaterial)
    {
        if (hubpageradaptermaterial == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            hubpageradaptermaterial.configuration = (EcsConfiguration)configurationProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((HubPagerAdapterMaterial)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/main/HubPagerAdapterMaterial_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
