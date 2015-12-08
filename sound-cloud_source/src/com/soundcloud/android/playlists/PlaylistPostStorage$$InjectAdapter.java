// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playlists;

import com.soundcloud.propeller.rx.PropellerRx;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.playlists:
//            PlaylistPostStorage

public final class I extends b
    implements Provider
{

    private b propellerRx;

    public final void attach(l l1)
    {
        propellerRx = l1.a("com.soundcloud.propeller.rx.PropellerRx", com/soundcloud/android/playlists/PlaylistPostStorage, getClass().getClassLoader());
    }

    public final PlaylistPostStorage get()
    {
        return new PlaylistPostStorage((PropellerRx)propellerRx.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(propellerRx);
    }

    public I()
    {
        super("com.soundcloud.android.playlists.PlaylistPostStorage", "members/com.soundcloud.android.playlists.PlaylistPostStorage", false, com/soundcloud/android/playlists/PlaylistPostStorage);
    }
}
