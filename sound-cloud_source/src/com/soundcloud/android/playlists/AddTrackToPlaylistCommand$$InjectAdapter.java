// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playlists;

import com.soundcloud.android.utils.CurrentDateProvider;
import com.soundcloud.propeller.PropellerDatabase;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.playlists:
//            AddTrackToPlaylistCommand

public final class  extends b
    implements a, Provider
{

    private b dateProvider;
    private b propeller;
    private b supertype;

    public final void attach(l l1)
    {
        propeller = l1.a("com.soundcloud.propeller.PropellerDatabase", com/soundcloud/android/playlists/AddTrackToPlaylistCommand, getClass().getClassLoader());
        dateProvider = l1.a("com.soundcloud.android.utils.CurrentDateProvider", com/soundcloud/android/playlists/AddTrackToPlaylistCommand, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.android.commands.WriteStorageCommand", com/soundcloud/android/playlists/AddTrackToPlaylistCommand, getClass().getClassLoader(), false);
    }

    public final AddTrackToPlaylistCommand get()
    {
        AddTrackToPlaylistCommand addtracktoplaylistcommand = new AddTrackToPlaylistCommand((PropellerDatabase)propeller.get(), (CurrentDateProvider)dateProvider.get());
        injectMembers(addtracktoplaylistcommand);
        return addtracktoplaylistcommand;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(propeller);
        set.add(dateProvider);
        set1.add(supertype);
    }

    public final void injectMembers(AddTrackToPlaylistCommand addtracktoplaylistcommand)
    {
        supertype.injectMembers(addtracktoplaylistcommand);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((AddTrackToPlaylistCommand)obj);
    }

    public ()
    {
        super("com.soundcloud.android.playlists.AddTrackToPlaylistCommand", "members/com.soundcloud.android.playlists.AddTrackToPlaylistCommand", false, com/soundcloud/android/playlists/AddTrackToPlaylistCommand);
    }
}
