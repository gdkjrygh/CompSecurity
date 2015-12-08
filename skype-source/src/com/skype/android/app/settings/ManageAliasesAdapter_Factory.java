// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.settings;

import com.skype.android.util.accessibility.AccessibilityUtil;
import dagger.MembersInjector;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.settings:
//            ManageAliasesAdapter

public final class ManageAliasesAdapter_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider accessibilityProvider;
    private final MembersInjector membersInjector;

    public ManageAliasesAdapter_Factory(MembersInjector membersinjector, Provider provider)
    {
        if (!$assertionsDisabled && membersinjector == null)
        {
            throw new AssertionError();
        }
        membersInjector = membersinjector;
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        } else
        {
            accessibilityProvider = provider;
            return;
        }
    }

    public static Factory create(MembersInjector membersinjector, Provider provider)
    {
        return new ManageAliasesAdapter_Factory(membersinjector, provider);
    }

    public final ManageAliasesAdapter get()
    {
        ManageAliasesAdapter managealiasesadapter = new ManageAliasesAdapter((AccessibilityUtil)accessibilityProvider.get());
        membersInjector.injectMembers(managealiasesadapter);
        return managealiasesadapter;
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/settings/ManageAliasesAdapter_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
