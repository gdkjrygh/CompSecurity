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
//            PushPlaylistRemovalsCommand

public final class  extends b
    implements a, Provider
{

    private b apiClient;
    private b supertype;

    public final void attach(l l1)
    {
        apiClient = l1.a("com.soundcloud.android.api.ApiClient", com/soundcloud/android/sync/playlists/PushPlaylistRemovalsCommand, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.android.commands.LegacyCommand", com/soundcloud/android/sync/playlists/PushPlaylistRemovalsCommand, getClass().getClassLoader(), false);
    }

    public final PushPlaylistRemovalsCommand get()
    {
        PushPlaylistRemovalsCommand pushplaylistremovalscommand = new PushPlaylistRemovalsCommand((ApiClient)apiClient.get());
        injectMembers(pushplaylistremovalscommand);
        return pushplaylistremovalscommand;
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

    public final void injectMembers(PushPlaylistRemovalsCommand pushplaylistremovalscommand)
    {
        supertype.injectMembers(pushplaylistremovalscommand);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((PushPlaylistRemovalsCommand)obj);
    }

    public ()
    {
        super("com.soundcloud.android.sync.playlists.PushPlaylistRemovalsCommand", "members/com.soundcloud.android.sync.playlists.PushPlaylistRemovalsCommand", false, com/soundcloud/android/sync/playlists/PushPlaylistRemovalsCommand);
    }
}
