// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync.posts;

import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.sync.posts:
//            MyPostsSyncer, PostsSyncer

public final class  extends b
    implements Provider
{

    private b playlistPostsSyncer;
    private b trackPostsSyncer;

    public final void attach(l l1)
    {
        trackPostsSyncer = l1.a("@javax.inject.Named(value=MyTrackPostsSyncer)/com.soundcloud.android.sync.posts.PostsSyncer", com/soundcloud/android/sync/posts/MyPostsSyncer, getClass().getClassLoader());
        playlistPostsSyncer = l1.a("@javax.inject.Named(value=MyPlaylistPostsSyncer)/com.soundcloud.android.sync.posts.PostsSyncer", com/soundcloud/android/sync/posts/MyPostsSyncer, getClass().getClassLoader());
    }

    public final MyPostsSyncer get()
    {
        return new MyPostsSyncer((PostsSyncer)trackPostsSyncer.get(), (PostsSyncer)playlistPostsSyncer.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(trackPostsSyncer);
        set.add(playlistPostsSyncer);
    }

    public ()
    {
        super("com.soundcloud.android.sync.posts.MyPostsSyncer", "members/com.soundcloud.android.sync.posts.MyPostsSyncer", false, com/soundcloud/android/sync/posts/MyPostsSyncer);
    }
}
