// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playlists;

import dagger.a.b;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.playlists:
//            EmptyPlaylistTracksRenderer

public final class Q extends b
    implements Provider
{

    public final EmptyPlaylistTracksRenderer get()
    {
        return new EmptyPlaylistTracksRenderer();
    }

    public final volatile Object get()
    {
        return get();
    }

    public Q()
    {
        super("com.soundcloud.android.playlists.EmptyPlaylistTracksRenderer", "members/com.soundcloud.android.playlists.EmptyPlaylistTracksRenderer", false, com/soundcloud/android/playlists/EmptyPlaylistTracksRenderer);
    }
}
