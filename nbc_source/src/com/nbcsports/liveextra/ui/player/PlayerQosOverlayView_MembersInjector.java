// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player;

import com.adobe.mediacore.MediaPlayer;
import dagger.MembersInjector;
import javax.inject.Provider;

// Referenced classes of package com.nbcsports.liveextra.ui.player:
//            PlayerQosOverlayView, PlayerPresenter

public final class PlayerQosOverlayView_MembersInjector
    implements MembersInjector
{

    static final boolean $assertionsDisabled;
    private final Provider playerProvider;
    private final Provider presenterProvider;
    private final MembersInjector supertypeInjector;

    public PlayerQosOverlayView_MembersInjector(MembersInjector membersinjector, Provider provider, Provider provider1)
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
        playerProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        } else
        {
            presenterProvider = provider1;
            return;
        }
    }

    public static MembersInjector create(MembersInjector membersinjector, Provider provider, Provider provider1)
    {
        return new PlayerQosOverlayView_MembersInjector(membersinjector, provider, provider1);
    }

    public void injectMembers(PlayerQosOverlayView playerqosoverlayview)
    {
        if (playerqosoverlayview == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            supertypeInjector.injectMembers(playerqosoverlayview);
            playerqosoverlayview.player = (MediaPlayer)playerProvider.get();
            playerqosoverlayview.presenter = (PlayerPresenter)presenterProvider.get();
            return;
        }
    }

    public volatile void injectMembers(Object obj)
    {
        injectMembers((PlayerQosOverlayView)obj);
    }

    static 
    {
        boolean flag;
        if (!com/nbcsports/liveextra/ui/player/PlayerQosOverlayView_MembersInjector.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
