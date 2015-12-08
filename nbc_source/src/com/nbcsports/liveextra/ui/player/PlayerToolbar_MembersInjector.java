// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player;

import com.nbcsports.liveextra.library.tve.AuthService;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.nbcsports.liveextra.ui.player:
//            PlayerToolbar, PlayerPresenter

public final class PlayerToolbar_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider passProvider;
    private final Provider playerPresenterProvider;
    private final MembersInjector supertypeInjector;

    public PlayerToolbar_MembersInjector(MembersInjector membersinjector, Provider provider, Provider provider1)
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
        passProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        } else
        {
            playerPresenterProvider = provider1;
            return;
        }
    }

    public static MembersInjector create(MembersInjector membersinjector, Provider provider, Provider provider1)
    {
        return new PlayerToolbar_MembersInjector(membersinjector, provider, provider1);
    }

    public void injectMembers(PlayerToolbar playertoolbar)
    {
        if (playertoolbar == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            supertypeInjector.injectMembers(playertoolbar);
            playertoolbar.pass = (AuthService)passProvider.get();
            playertoolbar.playerPresenter = (PlayerPresenter)playerPresenterProvider.get();
            return;
        }
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((PlayerToolbar)obj);
    }

    static 
    {
        boolean flag;
        if (!com/nbcsports/liveextra/ui/player/PlayerToolbar_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
