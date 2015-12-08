// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync.likes;

import com.soundcloud.propeller.PropellerDatabase;
import dagger.a.b;
import dagger.a.l;
import dagger.a.t;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.sync.likes:
//            LikesSyncModule, RemoveLikesCommand

public static final class setLibrary extends t
    implements Provider
{

    private b database;
    private final LikesSyncModule module;

    public final void attach(l l1)
    {
        database = l1.a("com.soundcloud.propeller.PropellerDatabase", com/soundcloud/android/sync/likes/LikesSyncModule, getClass().getClassLoader());
    }

    public final RemoveLikesCommand get()
    {
        return module.provideRemoveTrackLikesCommand((PropellerDatabase)database.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(database);
    }

    public (LikesSyncModule likessyncmodule)
    {
        super("@javax.inject.Named(value=RemoveTrackLikes)/com.soundcloud.android.sync.likes.RemoveLikesCommand", false, "com.soundcloud.android.sync.likes.LikesSyncModule", "provideRemoveTrackLikesCommand");
        module = likessyncmodule;
        setLibrary(true);
    }
}
