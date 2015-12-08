// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.search;

import android.content.res.Resources;
import com.soundcloud.rx.eventbus.EventBus;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.search:
//            PlaylistTagsPresenter

public final class  extends b
    implements Provider
{

    private b eventBus;
    private b resources;

    public final void attach(l l1)
    {
        resources = l1.a("android.content.res.Resources", com/soundcloud/android/search/PlaylistTagsPresenter, getClass().getClassLoader());
        eventBus = l1.a("com.soundcloud.rx.eventbus.EventBus", com/soundcloud/android/search/PlaylistTagsPresenter, getClass().getClassLoader());
    }

    public final PlaylistTagsPresenter get()
    {
        return new PlaylistTagsPresenter((Resources)resources.get(), (EventBus)eventBus.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(resources);
        set.add(eventBus);
    }

    public ()
    {
        super("com.soundcloud.android.search.PlaylistTagsPresenter", "members/com.soundcloud.android.search.PlaylistTagsPresenter", false, com/soundcloud/android/search/PlaylistTagsPresenter);
    }
}
