// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playlists;

import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

public final class  extends b
    implements Provider
{

    private b injectionProvider;

    public final void attach(l l1)
    {
        injectionProvider = l1.a("javax.inject.Provider<com.soundcloud.android.playlists.PlaylistDetailsController>", com/soundcloud/android/playlists/PlaylistDetailsController$Provider, getClass().getClassLoader());
    }

    public final injectionProvider get()
    {
        return new injectionProvider((Provider)injectionProvider.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(injectionProvider);
    }

    public ()
    {
        super("com.soundcloud.android.playlists.PlaylistDetailsController$Provider", "members/com.soundcloud.android.playlists.PlaylistDetailsController$Provider", false, com/soundcloud/android/playlists/PlaylistDetailsController$Provider);
    }
}
