// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playlists;

import com.soundcloud.android.configuration.FeatureOperations;
import com.soundcloud.android.properties.ApplicationProperties;
import com.soundcloud.rx.eventbus.EventBus;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.playlists:
//            CreatePlaylistDialogFragment, PlaylistOperations

public final class  extends b
    implements a, Provider
{

    private b eventBus;
    private b featureOperations;
    private b playlistOperations;
    private b properties;

    public final void attach(l l1)
    {
        playlistOperations = l1.a("com.soundcloud.android.playlists.PlaylistOperations", com/soundcloud/android/playlists/CreatePlaylistDialogFragment, getClass().getClassLoader());
        eventBus = l1.a("com.soundcloud.rx.eventbus.EventBus", com/soundcloud/android/playlists/CreatePlaylistDialogFragment, getClass().getClassLoader());
        properties = l1.a("com.soundcloud.android.properties.ApplicationProperties", com/soundcloud/android/playlists/CreatePlaylistDialogFragment, getClass().getClassLoader());
        featureOperations = l1.a("com.soundcloud.android.configuration.FeatureOperations", com/soundcloud/android/playlists/CreatePlaylistDialogFragment, getClass().getClassLoader());
    }

    public final CreatePlaylistDialogFragment get()
    {
        CreatePlaylistDialogFragment createplaylistdialogfragment = new CreatePlaylistDialogFragment();
        injectMembers(createplaylistdialogfragment);
        return createplaylistdialogfragment;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set1.add(playlistOperations);
        set1.add(eventBus);
        set1.add(properties);
        set1.add(featureOperations);
    }

    public final void injectMembers(CreatePlaylistDialogFragment createplaylistdialogfragment)
    {
        createplaylistdialogfragment.playlistOperations = (PlaylistOperations)playlistOperations.get();
        createplaylistdialogfragment.eventBus = (EventBus)eventBus.get();
        createplaylistdialogfragment.properties = (ApplicationProperties)properties.get();
        createplaylistdialogfragment.featureOperations = (FeatureOperations)featureOperations.get();
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((CreatePlaylistDialogFragment)obj);
    }

    public ()
    {
        super("com.soundcloud.android.playlists.CreatePlaylistDialogFragment", "members/com.soundcloud.android.playlists.CreatePlaylistDialogFragment", false, com/soundcloud/android/playlists/CreatePlaylistDialogFragment);
    }
}
