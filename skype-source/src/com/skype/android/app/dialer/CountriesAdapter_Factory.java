// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.dialer;

import android.app.Activity;
import com.skype.SkyLib;
import com.skype.android.util.ContactUtil;
import dagger.MembersInjector;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.dialer:
//            CountriesAdapter

public final class CountriesAdapter_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider contactUtilProvider;
    private final Provider contextProvider;
    private final Provider libProvider;
    private final MembersInjector membersInjector;

    public CountriesAdapter_Factory(MembersInjector membersinjector, Provider provider, Provider provider1, Provider provider2)
    {
        if (!$assertionsDisabled && membersinjector == null)
        {
            throw new AssertionError();
        }
        membersInjector = membersinjector;
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        }
        contextProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        }
        libProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        } else
        {
            contactUtilProvider = provider2;
            return;
        }
    }

    public static Factory create(MembersInjector membersinjector, Provider provider, Provider provider1, Provider provider2)
    {
        return new CountriesAdapter_Factory(membersinjector, provider, provider1, provider2);
    }

    public final CountriesAdapter get()
    {
        CountriesAdapter countriesadapter = new CountriesAdapter((Activity)contextProvider.get(), (SkyLib)libProvider.get(), (ContactUtil)contactUtilProvider.get());
        membersInjector.injectMembers(countriesadapter);
        return countriesadapter;
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/dialer/CountriesAdapter_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
