// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync.likes;

import com.soundcloud.propeller.PropellerDatabase;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.sync.likes:
//            LoadLikesPendingRemovalCommand

public final class  extends b
    implements a, Provider
{

    private b database;
    private b supertype;

    public final void attach(l l1)
    {
        database = l1.a("com.soundcloud.propeller.PropellerDatabase", com/soundcloud/android/sync/likes/LoadLikesPendingRemovalCommand, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.android.commands.LegacyCommand", com/soundcloud/android/sync/likes/LoadLikesPendingRemovalCommand, getClass().getClassLoader(), false);
    }

    public final LoadLikesPendingRemovalCommand get()
    {
        LoadLikesPendingRemovalCommand loadlikespendingremovalcommand = new LoadLikesPendingRemovalCommand((PropellerDatabase)database.get());
        injectMembers(loadlikespendingremovalcommand);
        return loadlikespendingremovalcommand;
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

    public final void injectMembers(LoadLikesPendingRemovalCommand loadlikespendingremovalcommand)
    {
        supertype.injectMembers(loadlikespendingremovalcommand);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((LoadLikesPendingRemovalCommand)obj);
    }

    public ()
    {
        super("com.soundcloud.android.sync.likes.LoadLikesPendingRemovalCommand", "members/com.soundcloud.android.sync.likes.LoadLikesPendingRemovalCommand", false, com/soundcloud/android/sync/likes/LoadLikesPendingRemovalCommand);
    }
}
