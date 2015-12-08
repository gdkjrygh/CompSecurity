// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playlists;

import com.soundcloud.android.model.Urn;

// Referenced classes of package com.soundcloud.android.playlists:
//            AddTrackToPlaylistCommand

static final class trackUrn
{

    final Urn playlistUrn;
    final Urn trackUrn;

    Y(Urn urn, Urn urn1)
    {
        playlistUrn = urn;
        trackUrn = urn1;
    }
}
