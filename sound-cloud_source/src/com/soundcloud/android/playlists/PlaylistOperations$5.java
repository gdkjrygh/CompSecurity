// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playlists;

import rx.b;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.playlists:
//            PlaylistWithTracks, PlaylistOperations

class this._cls0
    implements f
{

    final PlaylistOperations this$0;

    public volatile Object call(Object obj)
    {
        return call((PlaylistWithTracks)obj);
    }

    public b call(PlaylistWithTracks playlistwithtracks)
    {
        if (playlistwithtracks.isMissingMetaData())
        {
            return b.error(new aylistMissingException());
        } else
        {
            return b.just(playlistwithtracks);
        }
    }

    aylistMissingException()
    {
        this$0 = PlaylistOperations.this;
        super();
    }
}
