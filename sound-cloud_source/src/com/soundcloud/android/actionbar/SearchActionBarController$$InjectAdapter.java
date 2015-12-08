// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.actionbar;

import com.soundcloud.android.api.legacy.PublicApi;
import com.soundcloud.android.playback.PlaybackInitiator;
import com.soundcloud.android.search.suggestions.ShortcutsStorage;
import com.soundcloud.rx.eventbus.EventBus;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.actionbar:
//            SearchActionBarController

public final class  extends b
    implements a, Provider
{

    private b eventBus;
    private b expandPlayerSubscriberProvider;
    private b playbackInitiator;
    private b publicCloudAPI;
    private b shortcutsStorage;
    private b supertype;

    public final void attach(l l1)
    {
        publicCloudAPI = l1.a("com.soundcloud.android.api.legacy.PublicApi", com/soundcloud/android/actionbar/SearchActionBarController, getClass().getClassLoader());
        playbackInitiator = l1.a("com.soundcloud.android.playback.PlaybackInitiator", com/soundcloud/android/actionbar/SearchActionBarController, getClass().getClassLoader());
        eventBus = l1.a("com.soundcloud.rx.eventbus.EventBus", com/soundcloud/android/actionbar/SearchActionBarController, getClass().getClassLoader());
        expandPlayerSubscriberProvider = l1.a("javax.inject.Provider<com.soundcloud.android.playback.ExpandPlayerSubscriber>", com/soundcloud/android/actionbar/SearchActionBarController, getClass().getClassLoader());
        shortcutsStorage = l1.a("com.soundcloud.android.search.suggestions.ShortcutsStorage", com/soundcloud/android/actionbar/SearchActionBarController, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.lightcycle.DefaultActivityLightCycle", com/soundcloud/android/actionbar/SearchActionBarController, getClass().getClassLoader(), false);
    }

    public final SearchActionBarController get()
    {
        SearchActionBarController searchactionbarcontroller = new SearchActionBarController((PublicApi)publicCloudAPI.get(), (PlaybackInitiator)playbackInitiator.get(), (EventBus)eventBus.get(), (Provider)expandPlayerSubscriberProvider.get(), (ShortcutsStorage)shortcutsStorage.get());
        injectMembers(searchactionbarcontroller);
        return searchactionbarcontroller;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(publicCloudAPI);
        set.add(playbackInitiator);
        set.add(eventBus);
        set.add(expandPlayerSubscriberProvider);
        set.add(shortcutsStorage);
        set1.add(supertype);
    }

    public final void injectMembers(SearchActionBarController searchactionbarcontroller)
    {
        supertype.injectMembers(searchactionbarcontroller);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((SearchActionBarController)obj);
    }

    public ()
    {
        super("com.soundcloud.android.actionbar.SearchActionBarController", "members/com.soundcloud.android.actionbar.SearchActionBarController", false, com/soundcloud/android/actionbar/SearchActionBarController);
    }
}
