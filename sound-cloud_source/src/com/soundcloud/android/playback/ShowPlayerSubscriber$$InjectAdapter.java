// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback;

import com.soundcloud.android.playback.ui.view.PlaybackToastHelper;
import com.soundcloud.rx.eventbus.EventBus;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.playback:
//            ShowPlayerSubscriber

public final class I extends b
    implements a, Provider
{

    private b eventBus;
    private b playbackToastHelper;
    private b supertype;

    public final void attach(l l1)
    {
        eventBus = l1.a("com.soundcloud.rx.eventbus.EventBus", com/soundcloud/android/playback/ShowPlayerSubscriber, getClass().getClassLoader());
        playbackToastHelper = l1.a("com.soundcloud.android.playback.ui.view.PlaybackToastHelper", com/soundcloud/android/playback/ShowPlayerSubscriber, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.android.rx.observers.DefaultSubscriber", com/soundcloud/android/playback/ShowPlayerSubscriber, getClass().getClassLoader(), false);
    }

    public final ShowPlayerSubscriber get()
    {
        ShowPlayerSubscriber showplayersubscriber = new ShowPlayerSubscriber((EventBus)eventBus.get(), (PlaybackToastHelper)playbackToastHelper.get());
        injectMembers(showplayersubscriber);
        return showplayersubscriber;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(eventBus);
        set.add(playbackToastHelper);
        set1.add(supertype);
    }

    public final void injectMembers(ShowPlayerSubscriber showplayersubscriber)
    {
        supertype.injectMembers(showplayersubscriber);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((ShowPlayerSubscriber)obj);
    }

    public I()
    {
        super("com.soundcloud.android.playback.ShowPlayerSubscriber", "members/com.soundcloud.android.playback.ShowPlayerSubscriber", false, com/soundcloud/android/playback/ShowPlayerSubscriber);
    }
}
