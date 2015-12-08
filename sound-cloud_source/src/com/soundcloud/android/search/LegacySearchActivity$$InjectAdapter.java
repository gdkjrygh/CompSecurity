// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.search;

import com.soundcloud.android.actionbar.SearchActionBarController;
import com.soundcloud.android.main.PlayerController;
import com.soundcloud.android.playback.PlaybackInitiator;
import com.soundcloud.android.view.screen.BaseLayoutHelper;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.search:
//            LegacySearchActivity

public final class  extends b
    implements a, Provider
{

    private b baseLayoutHelper;
    private b playbackInitiator;
    private b playerController;
    private b searchActionBarController;
    private b supertype;

    public final void attach(l l1)
    {
        playerController = l1.a("com.soundcloud.android.main.PlayerController", com/soundcloud/android/search/LegacySearchActivity, getClass().getClassLoader());
        searchActionBarController = l1.a("com.soundcloud.android.actionbar.SearchActionBarController", com/soundcloud/android/search/LegacySearchActivity, getClass().getClassLoader());
        baseLayoutHelper = l1.a("com.soundcloud.android.view.screen.BaseLayoutHelper", com/soundcloud/android/search/LegacySearchActivity, getClass().getClassLoader());
        playbackInitiator = l1.a("com.soundcloud.android.playback.PlaybackInitiator", com/soundcloud/android/search/LegacySearchActivity, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.android.main.ScActivity", com/soundcloud/android/search/LegacySearchActivity, getClass().getClassLoader(), false);
    }

    public final LegacySearchActivity get()
    {
        LegacySearchActivity legacysearchactivity = new LegacySearchActivity();
        injectMembers(legacysearchactivity);
        return legacysearchactivity;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set1.add(playerController);
        set1.add(searchActionBarController);
        set1.add(baseLayoutHelper);
        set1.add(playbackInitiator);
        set1.add(supertype);
    }

    public final void injectMembers(LegacySearchActivity legacysearchactivity)
    {
        legacysearchactivity.playerController = (PlayerController)playerController.get();
        legacysearchactivity.searchActionBarController = (SearchActionBarController)searchActionBarController.get();
        legacysearchactivity.baseLayoutHelper = (BaseLayoutHelper)baseLayoutHelper.get();
        legacysearchactivity.playbackInitiator = (PlaybackInitiator)playbackInitiator.get();
        supertype.injectMembers(legacysearchactivity);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((LegacySearchActivity)obj);
    }

    public ()
    {
        super("com.soundcloud.android.search.LegacySearchActivity", "members/com.soundcloud.android.search.LegacySearchActivity", false, com/soundcloud/android/search/LegacySearchActivity);
    }
}
