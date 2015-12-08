// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.search;

import com.soundcloud.android.api.ApiClientRx;
import com.soundcloud.android.commands.StorePlaylistsCommand;
import com.soundcloud.android.utils.NetworkConnectionHelper;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;
import rx.R;

// Referenced classes of package com.soundcloud.android.search:
//            PlaylistDiscoveryOperations, PlaylistTagStorage

public final class  extends b
    implements Provider
{

    private b apiClientRx;
    private b connectionHelper;
    private b scheduler;
    private b storePlaylistsCommand;
    private b tagStorage;

    public final void attach(l l1)
    {
        apiClientRx = l1.a("com.soundcloud.android.api.ApiClientRx", com/soundcloud/android/search/PlaylistDiscoveryOperations, getClass().getClassLoader());
        connectionHelper = l1.a("com.soundcloud.android.utils.NetworkConnectionHelper", com/soundcloud/android/search/PlaylistDiscoveryOperations, getClass().getClassLoader());
        tagStorage = l1.a("com.soundcloud.android.search.PlaylistTagStorage", com/soundcloud/android/search/PlaylistDiscoveryOperations, getClass().getClassLoader());
        storePlaylistsCommand = l1.a("com.soundcloud.android.commands.StorePlaylistsCommand", com/soundcloud/android/search/PlaylistDiscoveryOperations, getClass().getClassLoader());
        scheduler = l1.a("@javax.inject.Named(value=HighPriority)/rx.Scheduler", com/soundcloud/android/search/PlaylistDiscoveryOperations, getClass().getClassLoader());
    }

    public final PlaylistDiscoveryOperations get()
    {
        return new PlaylistDiscoveryOperations((ApiClientRx)apiClientRx.get(), (NetworkConnectionHelper)connectionHelper.get(), (PlaylistTagStorage)tagStorage.get(), (StorePlaylistsCommand)storePlaylistsCommand.get(), (R)scheduler.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(apiClientRx);
        set.add(connectionHelper);
        set.add(tagStorage);
        set.add(storePlaylistsCommand);
        set.add(scheduler);
    }

    public ()
    {
        super("com.soundcloud.android.search.PlaylistDiscoveryOperations", "members/com.soundcloud.android.search.PlaylistDiscoveryOperations", false, com/soundcloud/android/search/PlaylistDiscoveryOperations);
    }
}
