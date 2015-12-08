// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playlists;

import com.soundcloud.android.accounts.AccountOperations;
import com.soundcloud.android.utils.CurrentDateProvider;
import com.soundcloud.propeller.rx.PropellerRx;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.playlists:
//            PlaylistTracksStorage

public final class  extends b
    implements Provider
{

    private b accountOperations;
    private b dateProvider;
    private b propellerRx;

    public final void attach(l l1)
    {
        propellerRx = l1.a("com.soundcloud.propeller.rx.PropellerRx", com/soundcloud/android/playlists/PlaylistTracksStorage, getClass().getClassLoader());
        dateProvider = l1.a("com.soundcloud.android.utils.CurrentDateProvider", com/soundcloud/android/playlists/PlaylistTracksStorage, getClass().getClassLoader());
        accountOperations = l1.a("com.soundcloud.android.accounts.AccountOperations", com/soundcloud/android/playlists/PlaylistTracksStorage, getClass().getClassLoader());
    }

    public final PlaylistTracksStorage get()
    {
        return new PlaylistTracksStorage((PropellerRx)propellerRx.get(), (CurrentDateProvider)dateProvider.get(), (AccountOperations)accountOperations.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(propellerRx);
        set.add(dateProvider);
        set.add(accountOperations);
    }

    public ()
    {
        super("com.soundcloud.android.playlists.PlaylistTracksStorage", "members/com.soundcloud.android.playlists.PlaylistTracksStorage", false, com/soundcloud/android/playlists/PlaylistTracksStorage);
    }
}
