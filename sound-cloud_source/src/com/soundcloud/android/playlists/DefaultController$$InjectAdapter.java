// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playlists;

import com.soundcloud.rx.eventbus.EventBus;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.playlists:
//            DefaultController, InlinePlaylistTracksAdapter

public final class  extends b
    implements a, Provider
{

    private b eventBus;
    private b itemAdapter;
    private b supertype;

    public final void attach(l l1)
    {
        itemAdapter = l1.a("com.soundcloud.android.playlists.InlinePlaylistTracksAdapter", com/soundcloud/android/playlists/DefaultController, getClass().getClassLoader());
        eventBus = l1.a("com.soundcloud.rx.eventbus.EventBus", com/soundcloud/android/playlists/DefaultController, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.android.playlists.PlaylistDetailsController", com/soundcloud/android/playlists/DefaultController, getClass().getClassLoader(), false);
    }

    public final DefaultController get()
    {
        DefaultController defaultcontroller = new DefaultController((InlinePlaylistTracksAdapter)itemAdapter.get(), (EventBus)eventBus.get());
        injectMembers(defaultcontroller);
        return defaultcontroller;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(itemAdapter);
        set.add(eventBus);
        set1.add(supertype);
    }

    public final void injectMembers(DefaultController defaultcontroller)
    {
        supertype.injectMembers(defaultcontroller);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((DefaultController)obj);
    }

    public ()
    {
        super("com.soundcloud.android.playlists.DefaultController", "members/com.soundcloud.android.playlists.DefaultController", false, com/soundcloud/android/playlists/DefaultController);
    }
}
