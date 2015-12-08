// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playlists;

import android.content.res.Resources;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.playlists:
//            PlaylistDetailsController

public class PlaylistsModule
{

    public static final String LOAD_POSTED_PLAYLISTS = "LoadPostedPlaylists";

    public PlaylistsModule()
    {
    }

    public PlaylistDetailsController providePlaylistViewController(Resources resources, Provider provider, Provider provider1)
    {
        if (resources.getBoolean(0x7f0d0004))
        {
            return (PlaylistDetailsController)provider.get();
        } else
        {
            return (PlaylistDetailsController)provider1.get();
        }
    }
}
