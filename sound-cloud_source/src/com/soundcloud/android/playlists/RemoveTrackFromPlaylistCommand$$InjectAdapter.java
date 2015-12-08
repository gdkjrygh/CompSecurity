// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playlists;

import com.soundcloud.propeller.PropellerDatabase;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.playlists:
//            RemoveTrackFromPlaylistCommand

public final class  extends b
    implements a, Provider
{

    private b propeller;
    private b supertype;

    public final void attach(l l1)
    {
        propeller = l1.a("com.soundcloud.propeller.PropellerDatabase", com/soundcloud/android/playlists/RemoveTrackFromPlaylistCommand, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.android.commands.WriteStorageCommand", com/soundcloud/android/playlists/RemoveTrackFromPlaylistCommand, getClass().getClassLoader(), false);
    }

    public final RemoveTrackFromPlaylistCommand get()
    {
        RemoveTrackFromPlaylistCommand removetrackfromplaylistcommand = new RemoveTrackFromPlaylistCommand((PropellerDatabase)propeller.get());
        injectMembers(removetrackfromplaylistcommand);
        return removetrackfromplaylistcommand;
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

    public final void injectMembers(RemoveTrackFromPlaylistCommand removetrackfromplaylistcommand)
    {
        supertype.injectMembers(removetrackfromplaylistcommand);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((RemoveTrackFromPlaylistCommand)obj);
    }

    public ()
    {
        super("com.soundcloud.android.playlists.RemoveTrackFromPlaylistCommand", "members/com.soundcloud.android.playlists.RemoveTrackFromPlaylistCommand", false, com/soundcloud/android/playlists/RemoveTrackFromPlaylistCommand);
    }
}
