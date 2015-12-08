// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync.likes;

import com.soundcloud.android.api.ApiClient;
import dagger.a.b;
import dagger.a.l;
import dagger.a.t;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.sync.likes:
//            LikesSyncModule, PushLikesCommand

public static final class setLibrary extends t
    implements Provider
{

    private b apiClient;
    private final LikesSyncModule module;

    public final void attach(l l1)
    {
        apiClient = l1.a("com.soundcloud.android.api.ApiClient", com/soundcloud/android/sync/likes/LikesSyncModule, getClass().getClassLoader());
    }

    public final PushLikesCommand get()
    {
        return module.providePlaylistLikeAdditionsPushCommand((ApiClient)apiClient.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(apiClient);
    }

    public (LikesSyncModule likessyncmodule)
    {
        super("@javax.inject.Named(value=PlaylistLikeAdditions)/com.soundcloud.android.sync.likes.PushLikesCommand<com.soundcloud.android.sync.likes.ApiLike>", false, "com.soundcloud.android.sync.likes.LikesSyncModule", "providePlaylistLikeAdditionsPushCommand");
        module = likessyncmodule;
        setLibrary(true);
    }
}
