// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.profile;

import com.soundcloud.android.playlists.PlaylistPostStorage;
import com.soundcloud.android.sync.SyncInitiator;
import com.soundcloud.android.sync.SyncStateStorage;
import com.soundcloud.android.users.UserAssociationStorage;
import com.soundcloud.android.utils.NetworkConnectionHelper;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;
import rx.R;

// Referenced classes of package com.soundcloud.android.profile:
//            MyProfileOperations, LikesStorage, PostsStorage

public final class  extends b
    implements Provider
{

    private b likesStorage;
    private b networkConnectionHelper;
    private b playlistPostStorage;
    private b postsStorage;
    private b scheduler;
    private b syncInitiator;
    private b syncStateStorage;
    private b userAssociationStorage;

    public final void attach(l l1)
    {
        likesStorage = l1.a("com.soundcloud.android.profile.LikesStorage", com/soundcloud/android/profile/MyProfileOperations, getClass().getClassLoader());
        postsStorage = l1.a("com.soundcloud.android.profile.PostsStorage", com/soundcloud/android/profile/MyProfileOperations, getClass().getClassLoader());
        playlistPostStorage = l1.a("com.soundcloud.android.playlists.PlaylistPostStorage", com/soundcloud/android/profile/MyProfileOperations, getClass().getClassLoader());
        syncStateStorage = l1.a("com.soundcloud.android.sync.SyncStateStorage", com/soundcloud/android/profile/MyProfileOperations, getClass().getClassLoader());
        syncInitiator = l1.a("com.soundcloud.android.sync.SyncInitiator", com/soundcloud/android/profile/MyProfileOperations, getClass().getClassLoader());
        networkConnectionHelper = l1.a("com.soundcloud.android.utils.NetworkConnectionHelper", com/soundcloud/android/profile/MyProfileOperations, getClass().getClassLoader());
        userAssociationStorage = l1.a("com.soundcloud.android.users.UserAssociationStorage", com/soundcloud/android/profile/MyProfileOperations, getClass().getClassLoader());
        scheduler = l1.a("@javax.inject.Named(value=HighPriority)/rx.Scheduler", com/soundcloud/android/profile/MyProfileOperations, getClass().getClassLoader());
    }

    public final MyProfileOperations get()
    {
        return new MyProfileOperations((LikesStorage)likesStorage.get(), (PostsStorage)postsStorage.get(), (PlaylistPostStorage)playlistPostStorage.get(), (SyncStateStorage)syncStateStorage.get(), (SyncInitiator)syncInitiator.get(), (NetworkConnectionHelper)networkConnectionHelper.get(), (UserAssociationStorage)userAssociationStorage.get(), (R)scheduler.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(likesStorage);
        set.add(postsStorage);
        set.add(playlistPostStorage);
        set.add(syncStateStorage);
        set.add(syncInitiator);
        set.add(networkConnectionHelper);
        set.add(userAssociationStorage);
        set.add(scheduler);
    }

    public ()
    {
        super("com.soundcloud.android.profile.MyProfileOperations", "members/com.soundcloud.android.profile.MyProfileOperations", false, com/soundcloud/android/profile/MyProfileOperations);
    }
}
