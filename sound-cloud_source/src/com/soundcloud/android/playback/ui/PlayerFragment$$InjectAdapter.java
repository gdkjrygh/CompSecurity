// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.ui;

import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.playback.ui:
//            PlayerFragment, PlayerPresenter

public final class  extends b
    implements a, Provider
{

    private b controller;
    private b supertype;

    public final void attach(l l1)
    {
        controller = l1.a("com.soundcloud.android.playback.ui.PlayerPresenter", com/soundcloud/android/playback/ui/PlayerFragment, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.lightcycle.LightCycleSupportFragment", com/soundcloud/android/playback/ui/PlayerFragment, getClass().getClassLoader(), false);
    }

    public final PlayerFragment get()
    {
        PlayerFragment playerfragment = new PlayerFragment();
        injectMembers(playerfragment);
        return playerfragment;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set1.add(controller);
        set1.add(supertype);
    }

    public final void injectMembers(PlayerFragment playerfragment)
    {
        playerfragment.controller = (PlayerPresenter)controller.get();
        supertype.injectMembers(playerfragment);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((PlayerFragment)obj);
    }

    public ()
    {
        super("com.soundcloud.android.playback.ui.PlayerFragment", "members/com.soundcloud.android.playback.ui.PlayerFragment", false, com/soundcloud/android/playback/ui/PlayerFragment);
    }
}
