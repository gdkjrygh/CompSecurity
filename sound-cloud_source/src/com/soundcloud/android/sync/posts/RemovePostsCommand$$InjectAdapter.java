// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync.posts;

import com.soundcloud.propeller.PropellerDatabase;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.sync.posts:
//            RemovePostsCommand

public final class I extends b
    implements a, Provider
{

    private b database;
    private b supertype;

    public final void attach(l l1)
    {
        database = l1.a("com.soundcloud.propeller.PropellerDatabase", com/soundcloud/android/sync/posts/RemovePostsCommand, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.android.commands.DefaultWriteStorageCommand", com/soundcloud/android/sync/posts/RemovePostsCommand, getClass().getClassLoader(), false);
    }

    public final RemovePostsCommand get()
    {
        RemovePostsCommand removepostscommand = new RemovePostsCommand((PropellerDatabase)database.get());
        injectMembers(removepostscommand);
        return removepostscommand;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(database);
        set1.add(supertype);
    }

    public final void injectMembers(RemovePostsCommand removepostscommand)
    {
        supertype.injectMembers(removepostscommand);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((RemovePostsCommand)obj);
    }

    public I()
    {
        super("com.soundcloud.android.sync.posts.RemovePostsCommand", "members/com.soundcloud.android.sync.posts.RemovePostsCommand", false, com/soundcloud/android/sync/posts/RemovePostsCommand);
    }
}
