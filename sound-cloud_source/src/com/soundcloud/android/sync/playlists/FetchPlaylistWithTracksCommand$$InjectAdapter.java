// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync.playlists;

import com.soundcloud.android.api.ApiClient;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.sync.playlists:
//            FetchPlaylistWithTracksCommand

public final class Y extends b
    implements a, Provider
{

    private b apiClient;
    private b supertype;

    public final void attach(l l1)
    {
        apiClient = l1.a("com.soundcloud.android.api.ApiClient", com/soundcloud/android/sync/playlists/FetchPlaylistWithTracksCommand, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.android.commands.LegacyCommand", com/soundcloud/android/sync/playlists/FetchPlaylistWithTracksCommand, getClass().getClassLoader(), false);
    }

    public final FetchPlaylistWithTracksCommand get()
    {
        FetchPlaylistWithTracksCommand fetchplaylistwithtrackscommand = new FetchPlaylistWithTracksCommand((ApiClient)apiClient.get());
        injectMembers(fetchplaylistwithtrackscommand);
        return fetchplaylistwithtrackscommand;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(apiClient);
        set1.add(supertype);
    }

    public final void injectMembers(FetchPlaylistWithTracksCommand fetchplaylistwithtrackscommand)
    {
        supertype.injectMembers(fetchplaylistwithtrackscommand);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((FetchPlaylistWithTracksCommand)obj);
    }

    public Y()
    {
        super("com.soundcloud.android.sync.playlists.FetchPlaylistWithTracksCommand", "members/com.soundcloud.android.sync.playlists.FetchPlaylistWithTracksCommand", false, com/soundcloud/android/sync/playlists/FetchPlaylistWithTracksCommand);
    }
}
