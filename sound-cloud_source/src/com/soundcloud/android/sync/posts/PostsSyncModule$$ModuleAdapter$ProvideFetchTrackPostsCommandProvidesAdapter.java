// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync.posts;

import com.soundcloud.android.api.ApiClient;
import dagger.a.b;
import dagger.a.l;
import dagger.a.t;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.sync.posts:
//            PostsSyncModule, FetchPostsCommand

public static final class setLibrary extends t
    implements Provider
{

    private b apiClient;
    private final PostsSyncModule module;

    public final void attach(l l1)
    {
        apiClient = l1.a("com.soundcloud.android.api.ApiClient", com/soundcloud/android/sync/posts/PostsSyncModule, getClass().getClassLoader());
    }

    public final FetchPostsCommand get()
    {
        return module.provideFetchTrackPostsCommand((ApiClient)apiClient.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(apiClient);
    }

    public (PostsSyncModule postssyncmodule)
    {
        super("@javax.inject.Named(value=FetchTrackPosts)/com.soundcloud.android.sync.posts.FetchPostsCommand", false, "com.soundcloud.android.sync.posts.PostsSyncModule", "provideFetchTrackPostsCommand");
        module = postssyncmodule;
        setLibrary(true);
    }
}
