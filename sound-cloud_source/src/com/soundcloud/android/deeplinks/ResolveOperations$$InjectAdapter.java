// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.deeplinks;

import com.soundcloud.android.api.ApiClient;
import com.soundcloud.android.commands.StorePlaylistsCommand;
import com.soundcloud.android.commands.StoreTracksCommand;
import com.soundcloud.android.commands.StoreUsersCommand;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;
import rx.R;

// Referenced classes of package com.soundcloud.android.deeplinks:
//            ResolveOperations

public final class  extends b
    implements Provider
{

    private b apiClient;
    private b scheduler;
    private b storePlaylistsCommand;
    private b storeTracksCommand;
    private b storeUsersCommand;

    public final void attach(l l1)
    {
        apiClient = l1.a("com.soundcloud.android.api.ApiClient", com/soundcloud/android/deeplinks/ResolveOperations, getClass().getClassLoader());
        scheduler = l1.a("@javax.inject.Named(value=HighPriority)/rx.Scheduler", com/soundcloud/android/deeplinks/ResolveOperations, getClass().getClassLoader());
        storeTracksCommand = l1.a("com.soundcloud.android.commands.StoreTracksCommand", com/soundcloud/android/deeplinks/ResolveOperations, getClass().getClassLoader());
        storePlaylistsCommand = l1.a("com.soundcloud.android.commands.StorePlaylistsCommand", com/soundcloud/android/deeplinks/ResolveOperations, getClass().getClassLoader());
        storeUsersCommand = l1.a("com.soundcloud.android.commands.StoreUsersCommand", com/soundcloud/android/deeplinks/ResolveOperations, getClass().getClassLoader());
    }

    public final ResolveOperations get()
    {
        return new ResolveOperations((ApiClient)apiClient.get(), (R)scheduler.get(), (StoreTracksCommand)storeTracksCommand.get(), (StorePlaylistsCommand)storePlaylistsCommand.get(), (StoreUsersCommand)storeUsersCommand.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(apiClient);
        set.add(scheduler);
        set.add(storeTracksCommand);
        set.add(storePlaylistsCommand);
        set.add(storeUsersCommand);
    }

    public ()
    {
        super("com.soundcloud.android.deeplinks.ResolveOperations", "members/com.soundcloud.android.deeplinks.ResolveOperations", false, com/soundcloud/android/deeplinks/ResolveOperations);
    }
}
