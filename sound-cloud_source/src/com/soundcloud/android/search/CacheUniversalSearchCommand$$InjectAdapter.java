// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.search;

import com.soundcloud.android.commands.StorePlaylistsCommand;
import com.soundcloud.android.commands.StoreTracksCommand;
import com.soundcloud.android.commands.StoreUsersCommand;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.search:
//            CacheUniversalSearchCommand

public final class  extends b
    implements a, Provider
{

    private b storePlaylistsCommand;
    private b storeTracksCommand;
    private b storeUsersCommand;
    private b supertype;

    public final void attach(l l1)
    {
        storeTracksCommand = l1.a("com.soundcloud.android.commands.StoreTracksCommand", com/soundcloud/android/search/CacheUniversalSearchCommand, getClass().getClassLoader());
        storePlaylistsCommand = l1.a("com.soundcloud.android.commands.StorePlaylistsCommand", com/soundcloud/android/search/CacheUniversalSearchCommand, getClass().getClassLoader());
        storeUsersCommand = l1.a("com.soundcloud.android.commands.StoreUsersCommand", com/soundcloud/android/search/CacheUniversalSearchCommand, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.android.commands.LegacyCommand", com/soundcloud/android/search/CacheUniversalSearchCommand, getClass().getClassLoader(), false);
    }

    public final CacheUniversalSearchCommand get()
    {
        CacheUniversalSearchCommand cacheuniversalsearchcommand = new CacheUniversalSearchCommand((StoreTracksCommand)storeTracksCommand.get(), (StorePlaylistsCommand)storePlaylistsCommand.get(), (StoreUsersCommand)storeUsersCommand.get());
        injectMembers(cacheuniversalsearchcommand);
        return cacheuniversalsearchcommand;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(storeTracksCommand);
        set.add(storePlaylistsCommand);
        set.add(storeUsersCommand);
        set1.add(supertype);
    }

    public final void injectMembers(CacheUniversalSearchCommand cacheuniversalsearchcommand)
    {
        supertype.injectMembers(cacheuniversalsearchcommand);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((CacheUniversalSearchCommand)obj);
    }

    public ()
    {
        super("com.soundcloud.android.search.CacheUniversalSearchCommand", "members/com.soundcloud.android.search.CacheUniversalSearchCommand", false, com/soundcloud/android/search/CacheUniversalSearchCommand);
    }
}
