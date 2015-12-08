// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player;

import com.adobe.mediacore.MediaPlayer;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.nbcsports.liveextra.ui.player:
//            AltCamPresenter, AltCamOverlay, PlayerPresenter

public final class AltCamOverlay_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider playerPresenterProvider;
    private final Provider playerProvider;
    private final Provider presenterProvider;
    private final MembersInjector supertypeInjector;

    public AltCamOverlay_MembersInjector(MembersInjector membersinjector, Provider provider, Provider provider1, Provider provider2)
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
        presenterProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        }
        playerPresenterProvider = provider1;
        if (!$assertionsDisabled && provider2 == null)
        {
            throw new AssertionError();
        } else
        {
            playerProvider = provider2;
            return;
        }
    }

    public static MembersInjector create(MembersInjector membersinjector, Provider provider, Provider provider1, Provider provider2)
    {
        return new AltCamOverlay_MembersInjector(membersinjector, provider, provider1, provider2);
    }

    public void injectMembers(AltCamOverlay altcamoverlay)
    {
        if (altcamoverlay == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            supertypeInjector.injectMembers(altcamoverlay);
            altcamoverlay.presenter = (AltCamPresenter)presenterProvider.get();
            altcamoverlay.playerPresenter = (PlayerPresenter)playerPresenterProvider.get();
            altcamoverlay.player = (MediaPlayer)playerProvider.get();
            return;
        }
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((AltCamOverlay)obj);
    }

    static 
    {
        boolean flag;
        if (!com/nbcsports/liveextra/ui/player/AltCamOverlay_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
