// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync.posts;

import com.soundcloud.propeller.PropellerDatabase;
import dagger.a.b;
import dagger.a.l;
import dagger.a.t;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.sync.posts:
//            PostsSyncModule, LoadLocalPostsCommand

public static final class setLibrary extends t
    implements Provider
{

    private b database;
    private final PostsSyncModule module;

    public final void attach(l l1)
    {
        database = l1.a("com.soundcloud.propeller.PropellerDatabase", com/soundcloud/android/sync/posts/PostsSyncModule, getClass().getClassLoader());
    }

    public final LoadLocalPostsCommand get()
    {
        return module.provideLoadLocalPlaylistPostsCommand((PropellerDatabase)database.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(database);
    }

    public (PostsSyncModule postssyncmodule)
    {
        super("@javax.inject.Named(value=LoadPlaylistPosts)/com.soundcloud.android.sync.posts.LoadLocalPostsCommand", false, "com.soundcloud.android.sync.posts.PostsSyncModule", "provideLoadLocalPlaylistPostsCommand");
        module = postssyncmodule;
        setLibrary(true);
    }
}
