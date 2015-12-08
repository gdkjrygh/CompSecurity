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
//            LoadLocalPostsCommand

public final class  extends b
    implements a, Provider
{

    private b database;
    private b resourceType;
    private b supertype;

    public final void attach(l l1)
    {
        database = l1.a("com.soundcloud.propeller.PropellerDatabase", com/soundcloud/android/sync/posts/LoadLocalPostsCommand, getClass().getClassLoader());
        resourceType = l1.a("java.lang.Integer", com/soundcloud/android/sync/posts/LoadLocalPostsCommand, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.android.commands.LegacyCommand", com/soundcloud/android/sync/posts/LoadLocalPostsCommand, getClass().getClassLoader(), false);
    }

    public final LoadLocalPostsCommand get()
    {
        LoadLocalPostsCommand loadlocalpostscommand = new LoadLocalPostsCommand((PropellerDatabase)database.get(), ((Integer)resourceType.get()).intValue());
        injectMembers(loadlocalpostscommand);
        return loadlocalpostscommand;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(database);
        set.add(resourceType);
        set1.add(supertype);
    }

    public final void injectMembers(LoadLocalPostsCommand loadlocalpostscommand)
    {
        supertype.injectMembers(loadlocalpostscommand);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((LoadLocalPostsCommand)obj);
    }

    public ()
    {
        super("com.soundcloud.android.sync.posts.LoadLocalPostsCommand", "members/com.soundcloud.android.sync.posts.LoadLocalPostsCommand", false, com/soundcloud/android/sync/posts/LoadLocalPostsCommand);
    }
}
