// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.profile;

import com.soundcloud.android.search.LoadPlaylistLikedStatuses;
import com.soundcloud.android.users.UserRepository;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;
import rx.R;

// Referenced classes of package com.soundcloud.android.profile:
//            UserProfileOperations, ProfileApi, WriteMixedRecordsCommand

public final class I extends b
    implements Provider
{

    private b loadPlaylistLikedStatuses;
    private b profileApi;
    private b scheduler;
    private b userRepository;
    private b writeMixedRecordsCommand;

    public final void attach(l l1)
    {
        profileApi = l1.a("com.soundcloud.android.profile.ProfileApi", com/soundcloud/android/profile/UserProfileOperations, getClass().getClassLoader());
        scheduler = l1.a("@javax.inject.Named(value=HighPriority)/rx.Scheduler", com/soundcloud/android/profile/UserProfileOperations, getClass().getClassLoader());
        loadPlaylistLikedStatuses = l1.a("com.soundcloud.android.search.LoadPlaylistLikedStatuses", com/soundcloud/android/profile/UserProfileOperations, getClass().getClassLoader());
        userRepository = l1.a("com.soundcloud.android.users.UserRepository", com/soundcloud/android/profile/UserProfileOperations, getClass().getClassLoader());
        writeMixedRecordsCommand = l1.a("com.soundcloud.android.profile.WriteMixedRecordsCommand", com/soundcloud/android/profile/UserProfileOperations, getClass().getClassLoader());
    }

    public final UserProfileOperations get()
    {
        return new UserProfileOperations((ProfileApi)profileApi.get(), (R)scheduler.get(), (LoadPlaylistLikedStatuses)loadPlaylistLikedStatuses.get(), (UserRepository)userRepository.get(), (WriteMixedRecordsCommand)writeMixedRecordsCommand.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(profileApi);
        set.add(scheduler);
        set.add(loadPlaylistLikedStatuses);
        set.add(userRepository);
        set.add(writeMixedRecordsCommand);
    }

    public I()
    {
        super("com.soundcloud.android.profile.UserProfileOperations", "members/com.soundcloud.android.profile.UserProfileOperations", false, com/soundcloud/android/profile/UserProfileOperations);
    }
}
