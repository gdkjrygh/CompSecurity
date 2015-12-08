// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player;

import com.nbcsports.liveextra.library.configuration.Configuration;
import com.nbcsports.liveextra.ui.main.core.AssetViewModel;
import com.squareup.picasso.Picasso;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.nbcsports.liveextra.ui.player:
//            ActionBarSponsorView

public final class ActionBarSponsorView_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider configProvider;
    private final Provider picassoProvider;
    private final MembersInjector supertypeInjector;
    private final Provider viewModelProvider;

    public ActionBarSponsorView_MembersInjector(MembersInjector membersinjector, Provider provider, Provider provider1, Provider provider2)
    {
        if (!$assertionsDisabled && membersinjector == null)
        {
            throw new AssertionError();
        }
        supertypeInjector = membersinjector;
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        }
        picassoProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        }
        viewModelProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        } else
        {
            configProvider = provider2;
            return;
        }
    }

    public static MembersInjector create(MembersInjector membersinjector, Provider provider, Provider provider1, Provider provider2)
    {
        return new ActionBarSponsorView_MembersInjector(membersinjector, provider, provider1, provider2);
    }

    public void injectMembers(ActionBarSponsorView actionbarsponsorview)
    {
        if (actionbarsponsorview == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            supertypeInjector.injectMembers(actionbarsponsorview);
            actionbarsponsorview.picasso = (Picasso)picassoProvider.get();
            actionbarsponsorview.viewModel = (AssetViewModel)viewModelProvider.get();
            actionbarsponsorview.config = (Configuration)configProvider.get();
            return;
        }
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((ActionBarSponsorView)obj);
    }

    static 
    {
        boolean flag;
        if (!com/nbcsports/liveextra/ui/player/ActionBarSponsorView_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
