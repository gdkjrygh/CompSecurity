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
//            PushPlaylistAdditionsCommand

public final class  extends b
    implements a, Provider
{

    private b apiClient;
    private b supertype;

    public final void attach(l l1)
    {
        apiClient = l1.a("com.soundcloud.android.api.ApiClient", com/soundcloud/android/sync/playlists/PushPlaylistAdditionsCommand, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.android.commands.LegacyCommand", com/soundcloud/android/sync/playlists/PushPlaylistAdditionsCommand, getClass().getClassLoader(), false);
    }

    public final PushPlaylistAdditionsCommand get()
    {
        PushPlaylistAdditionsCommand pushplaylistadditionscommand = new PushPlaylistAdditionsCommand((ApiClient)apiClient.get());
        injectMembers(pushplaylistadditionscommand);
        return pushplaylistadditionscommand;
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

    public final void injectMembers(PushPlaylistAdditionsCommand pushplaylistadditionscommand)
    {
        supertype.injectMembers(pushplaylistadditionscommand);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((PushPlaylistAdditionsCommand)obj);
    }

    public ()
    {
        super("com.soundcloud.android.sync.playlists.PushPlaylistAdditionsCommand", "members/com.soundcloud.android.sync.playlists.PushPlaylistAdditionsCommand", false, com/soundcloud/android/sync/playlists/PushPlaylistAdditionsCommand);
    }
}
