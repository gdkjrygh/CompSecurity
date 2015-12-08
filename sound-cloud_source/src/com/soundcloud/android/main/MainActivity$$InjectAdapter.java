// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.main;

import com.soundcloud.android.actionbar.ActionBarHelper;
import com.soundcloud.android.cast.CastConnectionHelper;
import com.soundcloud.android.facebookinvites.FacebookInvitesController;
import com.soundcloud.android.gcm.GcmManager;
import com.soundcloud.android.playback.PlaySessionController;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.main:
//            MainActivity, MainTabsPresenter, PlayerController

public final class ntroller extends b
    implements a, Provider
{

    private b actionBarHelper;
    private b castConnectionHelper;
    private b facebookInvitesController;
    private b gcmManager;
    private b mainPresenter;
    private b playSessionController;
    private b playerController;
    private b supertype;

    public final void attach(l l1)
    {
        playSessionController = l1.a("com.soundcloud.android.playback.PlaySessionController", com/soundcloud/android/main/MainActivity, getClass().getClassLoader());
        castConnectionHelper = l1.a("com.soundcloud.android.cast.CastConnectionHelper", com/soundcloud/android/main/MainActivity, getClass().getClassLoader());
        mainPresenter = l1.a("com.soundcloud.android.main.MainTabsPresenter", com/soundcloud/android/main/MainActivity, getClass().getClassLoader());
        playerController = l1.a("com.soundcloud.android.main.PlayerController", com/soundcloud/android/main/MainActivity, getClass().getClassLoader());
        actionBarHelper = l1.a("com.soundcloud.android.actionbar.ActionBarHelper", com/soundcloud/android/main/MainActivity, getClass().getClassLoader());
        gcmManager = l1.a("com.soundcloud.android.gcm.GcmManager", com/soundcloud/android/main/MainActivity, getClass().getClassLoader());
        facebookInvitesController = l1.a("com.soundcloud.android.facebookinvites.FacebookInvitesController", com/soundcloud/android/main/MainActivity, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.android.main.ScActivity", com/soundcloud/android/main/MainActivity, getClass().getClassLoader(), false);
    }

    public final MainActivity get()
    {
        MainActivity mainactivity = new MainActivity();
        injectMembers(mainactivity);
        return mainactivity;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set1.add(playSessionController);
        set1.add(castConnectionHelper);
        set1.add(mainPresenter);
        set1.add(playerController);
        set1.add(actionBarHelper);
        set1.add(gcmManager);
        set1.add(facebookInvitesController);
        set1.add(supertype);
    }

    public final void injectMembers(MainActivity mainactivity)
    {
        mainactivity.playSessionController = (PlaySessionController)playSessionController.get();
        mainactivity.castConnectionHelper = (CastConnectionHelper)castConnectionHelper.get();
        mainactivity.mainPresenter = (MainTabsPresenter)mainPresenter.get();
        mainactivity.playerController = (PlayerController)playerController.get();
        mainactivity.actionBarHelper = (ActionBarHelper)actionBarHelper.get();
        mainactivity.gcmManager = (GcmManager)gcmManager.get();
        mainactivity.facebookInvitesController = (FacebookInvitesController)facebookInvitesController.get();
        supertype.injectMembers(mainactivity);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((MainActivity)obj);
    }

    public ntroller()
    {
        super("com.soundcloud.android.main.MainActivity", "members/com.soundcloud.android.main.MainActivity", false, com/soundcloud/android/main/MainActivity);
    }
}
