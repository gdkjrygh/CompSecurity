// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague;

import com.google.gson.Gson;
import com.nbcsports.liveextra.content.overlay.OverlayContentService;
import com.nbcsports.liveextra.ui.main.core.AssetViewModel;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.nbcsports.liveextra.ui.player.premierleague:
//            PremierLeagueEngine

public final class PremierLeagueEngine_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider gsonProvider;
    private final Provider overlayContentServiceProvider;
    private final Provider viewModelProvider;

    public PremierLeagueEngine_MembersInjector(Provider provider, Provider provider1, Provider provider2)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        }
        gsonProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        }
        overlayContentServiceProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        } else
        {
            viewModelProvider = provider2;
            return;
        }
    }

    public static MembersInjector create(Provider provider, Provider provider1, Provider provider2)
    {
        return new PremierLeagueEngine_MembersInjector(provider, provider1, provider2);
    }

    public void injectMembers(PremierLeagueEngine premierleagueengine)
    {
        if (premierleagueengine == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            premierleagueengine.gson = (Gson)gsonProvider.get();
            premierleagueengine.overlayContentService = (OverlayContentService)overlayContentServiceProvider.get();
            premierleagueengine.viewModel = (AssetViewModel)viewModelProvider.get();
            return;
        }
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((PremierLeagueEngine)obj);
    }

    static 
    {
        boolean flag;
        if (!com/nbcsports/liveextra/ui/player/premierleague/PremierLeagueEngine_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
