// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playlists;

import com.soundcloud.android.tracks.PlaylistTrackItemRenderer;
import com.soundcloud.rx.eventbus.EventBus;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.playlists:
//            SplitScreenController

public final class  extends b
    implements a, Provider
{

    private b eventBus;
    private b supertype;
    private b trackRenderer;

    public final void attach(l l1)
    {
        trackRenderer = l1.a("com.soundcloud.android.tracks.PlaylistTrackItemRenderer", com/soundcloud/android/playlists/SplitScreenController, getClass().getClassLoader());
        eventBus = l1.a("com.soundcloud.rx.eventbus.EventBus", com/soundcloud/android/playlists/SplitScreenController, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.android.playlists.PlaylistDetailsController", com/soundcloud/android/playlists/SplitScreenController, getClass().getClassLoader(), false);
    }

    public final SplitScreenController get()
    {
        SplitScreenController splitscreencontroller = new SplitScreenController((PlaylistTrackItemRenderer)trackRenderer.get(), (EventBus)eventBus.get());
        injectMembers(splitscreencontroller);
        return splitscreencontroller;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(trackRenderer);
        set.add(eventBus);
        set1.add(supertype);
    }

    public final void injectMembers(SplitScreenController splitscreencontroller)
    {
        supertype.injectMembers(splitscreencontroller);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((SplitScreenController)obj);
    }

    public ()
    {
        super("com.soundcloud.android.playlists.SplitScreenController", "members/com.soundcloud.android.playlists.SplitScreenController", false, com/soundcloud/android/playlists/SplitScreenController);
    }
}
