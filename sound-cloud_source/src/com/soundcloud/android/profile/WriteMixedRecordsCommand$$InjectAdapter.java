// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.profile;

import com.soundcloud.android.commands.StorePlaylistsCommand;
import com.soundcloud.android.commands.StoreTracksCommand;
import com.soundcloud.android.commands.StoreUsersCommand;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.profile:
//            WriteMixedRecordsCommand

public final class  extends b
    implements a, Provider
{

    private b storePlaylistsCommand;
    private b storeTracksCommand;
    private b storeUsersCommand;
    private b supertype;

    public final void attach(l l1)
    {
        storeTracksCommand = l1.a("com.soundcloud.android.commands.StoreTracksCommand", com/soundcloud/android/profile/WriteMixedRecordsCommand, getClass().getClassLoader());
        storePlaylistsCommand = l1.a("com.soundcloud.android.commands.StorePlaylistsCommand", com/soundcloud/android/profile/WriteMixedRecordsCommand, getClass().getClassLoader());
        storeUsersCommand = l1.a("com.soundcloud.android.commands.StoreUsersCommand", com/soundcloud/android/profile/WriteMixedRecordsCommand, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.android.commands.Command", com/soundcloud/android/profile/WriteMixedRecordsCommand, getClass().getClassLoader(), false);
    }

    public final WriteMixedRecordsCommand get()
    {
        WriteMixedRecordsCommand writemixedrecordscommand = new WriteMixedRecordsCommand((StoreTracksCommand)storeTracksCommand.get(), (StorePlaylistsCommand)storePlaylistsCommand.get(), (StoreUsersCommand)storeUsersCommand.get());
        injectMembers(writemixedrecordscommand);
        return writemixedrecordscommand;
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

    public final void injectMembers(WriteMixedRecordsCommand writemixedrecordscommand)
    {
        supertype.injectMembers(writemixedrecordscommand);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((WriteMixedRecordsCommand)obj);
    }

    public ()
    {
        super("com.soundcloud.android.profile.WriteMixedRecordsCommand", "members/com.soundcloud.android.profile.WriteMixedRecordsCommand", false, com/soundcloud/android/profile/WriteMixedRecordsCommand);
    }
}
