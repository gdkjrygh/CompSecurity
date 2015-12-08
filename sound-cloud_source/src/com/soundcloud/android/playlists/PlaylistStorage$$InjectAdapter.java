// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playlists;

import com.soundcloud.android.accounts.AccountOperations;
import com.soundcloud.propeller.PropellerDatabase;
import com.soundcloud.propeller.rx.PropellerRx;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.playlists:
//            PlaylistStorage

public final class  extends b
    implements Provider
{

    private b accountOperations;
    private b propeller;
    private b propellerRx;

    public final void attach(l l1)
    {
        propeller = l1.a("com.soundcloud.propeller.PropellerDatabase", com/soundcloud/android/playlists/PlaylistStorage, getClass().getClassLoader());
        propellerRx = l1.a("com.soundcloud.propeller.rx.PropellerRx", com/soundcloud/android/playlists/PlaylistStorage, getClass().getClassLoader());
        accountOperations = l1.a("com.soundcloud.android.accounts.AccountOperations", com/soundcloud/android/playlists/PlaylistStorage, getClass().getClassLoader());
    }

    public final PlaylistStorage get()
    {
        return new PlaylistStorage((PropellerDatabase)propeller.get(), (PropellerRx)propellerRx.get(), (AccountOperations)accountOperations.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(propeller);
        set.add(propellerRx);
        set.add(accountOperations);
    }

    public ()
    {
        super("com.soundcloud.android.playlists.PlaylistStorage", "members/com.soundcloud.android.playlists.PlaylistStorage", false, com/soundcloud/android/playlists/PlaylistStorage);
    }
}
