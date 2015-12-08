// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.search;

import com.soundcloud.android.playback.PlaybackInitiator;
import com.soundcloud.android.playback.ui.view.PlaybackToastHelper;
import com.soundcloud.rx.eventbus.EventBus;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Random;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.search:
//            PlayFromVoiceSearchActivity, SearchOperations

public final class  extends b
    implements a, Provider
{

    private b eventBus;
    private b playbackInitiator;
    private b playbackToastHelper;
    private b random;
    private b searchOperations;

    public final void attach(l l1)
    {
        searchOperations = l1.a("com.soundcloud.android.search.SearchOperations", com/soundcloud/android/search/PlayFromVoiceSearchActivity, getClass().getClassLoader());
        playbackInitiator = l1.a("com.soundcloud.android.playback.PlaybackInitiator", com/soundcloud/android/search/PlayFromVoiceSearchActivity, getClass().getClassLoader());
        random = l1.a("java.util.Random", com/soundcloud/android/search/PlayFromVoiceSearchActivity, getClass().getClassLoader());
        eventBus = l1.a("com.soundcloud.rx.eventbus.EventBus", com/soundcloud/android/search/PlayFromVoiceSearchActivity, getClass().getClassLoader());
        playbackToastHelper = l1.a("com.soundcloud.android.playback.ui.view.PlaybackToastHelper", com/soundcloud/android/search/PlayFromVoiceSearchActivity, getClass().getClassLoader());
    }

    public final PlayFromVoiceSearchActivity get()
    {
        PlayFromVoiceSearchActivity playfromvoicesearchactivity = new PlayFromVoiceSearchActivity();
        injectMembers(playfromvoicesearchactivity);
        return playfromvoicesearchactivity;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set1.add(searchOperations);
        set1.add(playbackInitiator);
        set1.add(random);
        set1.add(eventBus);
        set1.add(playbackToastHelper);
    }

    public final void injectMembers(PlayFromVoiceSearchActivity playfromvoicesearchactivity)
    {
        playfromvoicesearchactivity.searchOperations = (SearchOperations)searchOperations.get();
        playfromvoicesearchactivity.playbackInitiator = (PlaybackInitiator)playbackInitiator.get();
        playfromvoicesearchactivity.random = (Random)random.get();
        playfromvoicesearchactivity.eventBus = (EventBus)eventBus.get();
        playfromvoicesearchactivity.playbackToastHelper = (PlaybackToastHelper)playbackToastHelper.get();
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((PlayFromVoiceSearchActivity)obj);
    }

    public ()
    {
        super("com.soundcloud.android.search.PlayFromVoiceSearchActivity", "members/com.soundcloud.android.search.PlayFromVoiceSearchActivity", false, com/soundcloud/android/search/PlayFromVoiceSearchActivity);
    }
}
