// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.settings;

import com.skype.android.app.shortcircuit.ShortCircuitProfileWebClient;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.settings:
//            ManageAliasesAdapter

public final class ManageAliasesAdapter_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider scProfileWebClientProvider;

    public ManageAliasesAdapter_MembersInjector(Provider provider)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        } else
        {
            scProfileWebClientProvider = provider;
            return;
        }
    }

    public static MembersInjector create(Provider provider)
    {
        return new ManageAliasesAdapter_MembersInjector(provider);
    }

    public static void injectScProfileWebClient(ManageAliasesAdapter managealiasesadapter, Provider provider)
    {
        managealiasesadapter.scProfileWebClient = (ShortCircuitProfileWebClient)provider.get();
    }

    public final void injectMembers(ManageAliasesAdapter managealiasesadapter)
    {
        if (managealiasesadapter == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            managealiasesadapter.scProfileWebClient = (ShortCircuitProfileWebClient)scProfileWebClientProvider.get();
            return;
        }
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((ManageAliasesAdapter)obj);
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/settings/ManageAliasesAdapter_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
