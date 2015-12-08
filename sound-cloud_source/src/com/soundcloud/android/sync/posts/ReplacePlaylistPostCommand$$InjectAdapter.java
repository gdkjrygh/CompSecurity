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
//            ReplacePlaylistPostCommand

public final class Q extends b
    implements a, Provider
{

    private b propeller;
    private b supertype;

    public final void attach(l l1)
    {
        propeller = l1.a("com.soundcloud.propeller.PropellerDatabase", com/soundcloud/android/sync/posts/ReplacePlaylistPostCommand, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.android.commands.LegacyCommand", com/soundcloud/android/sync/posts/ReplacePlaylistPostCommand, getClass().getClassLoader(), false);
    }

    public final ReplacePlaylistPostCommand get()
    {
        ReplacePlaylistPostCommand replaceplaylistpostcommand = new ReplacePlaylistPostCommand((PropellerDatabase)propeller.get());
        injectMembers(replaceplaylistpostcommand);
        return replaceplaylistpostcommand;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(propeller);
        set1.add(supertype);
    }

    public final void injectMembers(ReplacePlaylistPostCommand replaceplaylistpostcommand)
    {
        supertype.injectMembers(replaceplaylistpostcommand);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((ReplacePlaylistPostCommand)obj);
    }

    public Q()
    {
        super("com.soundcloud.android.sync.posts.ReplacePlaylistPostCommand", "members/com.soundcloud.android.sync.posts.ReplacePlaylistPostCommand", false, com/soundcloud/android/sync/posts/ReplacePlaylistPostCommand);
    }
}
