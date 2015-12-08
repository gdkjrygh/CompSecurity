// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.main;

import com.soundcloud.android.ads.AdPlayerController;
import com.soundcloud.android.playback.ui.SlidingPlayerController;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.main:
//            PlayerController

public final class A extends b
    implements a, Provider
{

    private b adPlayerController;
    private b playerController;
    private b supertype;

    public final void attach(l l1)
    {
        playerController = l1.a("com.soundcloud.android.playback.ui.SlidingPlayerController", com/soundcloud/android/main/PlayerController, getClass().getClassLoader());
        adPlayerController = l1.a("com.soundcloud.android.ads.AdPlayerController", com/soundcloud/android/main/PlayerController, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.lightcycle.ActivityLightCycleDispatcher", com/soundcloud/android/main/PlayerController, getClass().getClassLoader(), false);
    }

    public final PlayerController get()
    {
        PlayerController playercontroller = new PlayerController((SlidingPlayerController)playerController.get(), (AdPlayerController)adPlayerController.get());
        injectMembers(playercontroller);
        return playercontroller;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(playerController);
        set.add(adPlayerController);
        set1.add(supertype);
    }

    public final void injectMembers(PlayerController playercontroller)
    {
        supertype.injectMembers(playercontroller);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((PlayerController)obj);
    }

    public A()
    {
        super("com.soundcloud.android.main.PlayerController", "members/com.soundcloud.android.main.PlayerController", false, com/soundcloud/android/main/PlayerController);
    }
}
