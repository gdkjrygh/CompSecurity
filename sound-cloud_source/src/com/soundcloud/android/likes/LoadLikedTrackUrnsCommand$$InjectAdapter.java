// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.likes;

import com.soundcloud.propeller.PropellerDatabase;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.likes:
//            LoadLikedTrackUrnsCommand

public final class  extends b
    implements a, Provider
{

    private b database;
    private b supertype;

    public final void attach(l l1)
    {
        database = l1.a("com.soundcloud.propeller.PropellerDatabase", com/soundcloud/android/likes/LoadLikedTrackUrnsCommand, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.android.commands.LegacyCommand", com/soundcloud/android/likes/LoadLikedTrackUrnsCommand, getClass().getClassLoader(), false);
    }

    public final LoadLikedTrackUrnsCommand get()
    {
        LoadLikedTrackUrnsCommand loadlikedtrackurnscommand = new LoadLikedTrackUrnsCommand((PropellerDatabase)database.get());
        injectMembers(loadlikedtrackurnscommand);
        return loadlikedtrackurnscommand;
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

    public final void injectMembers(LoadLikedTrackUrnsCommand loadlikedtrackurnscommand)
    {
        supertype.injectMembers(loadlikedtrackurnscommand);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((LoadLikedTrackUrnsCommand)obj);
    }

    public ()
    {
        super("com.soundcloud.android.likes.LoadLikedTrackUrnsCommand", "members/com.soundcloud.android.likes.LoadLikedTrackUrnsCommand", false, com/soundcloud/android/likes/LoadLikedTrackUrnsCommand);
    }
}
