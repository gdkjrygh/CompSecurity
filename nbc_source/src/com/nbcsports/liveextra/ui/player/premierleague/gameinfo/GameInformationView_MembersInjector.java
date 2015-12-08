// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.gameinfo;

import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.nbcsports.liveextra.ui.player.premierleague.gameinfo:
//            GameInfoPresenter, GameInformationView

public final class GameInformationView_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider presenterProvider;
    private final MembersInjector supertypeInjector;

    public GameInformationView_MembersInjector(MembersInjector membersinjector, Provider provider)
    {
        if (!$assertionsDisabled && membersinjector == null)
        {
            throw new AssertionError();
        }
        supertypeInjector = membersinjector;
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        } else
        {
            presenterProvider = provider;
            return;
        }
    }

    public static MembersInjector create(MembersInjector membersinjector, Provider provider)
    {
        return new GameInformationView_MembersInjector(membersinjector, provider);
    }

    public void injectMembers(GameInformationView gameinformationview)
    {
        if (gameinformationview == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            supertypeInjector.injectMembers(gameinformationview);
            gameinformationview.presenter = (GameInfoPresenter)presenterProvider.get();
            return;
        }
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((GameInformationView)obj);
    }

    static 
    {
        boolean flag;
        if (!com/nbcsports/liveextra/ui/player/premierleague/gameinfo/GameInformationView_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
