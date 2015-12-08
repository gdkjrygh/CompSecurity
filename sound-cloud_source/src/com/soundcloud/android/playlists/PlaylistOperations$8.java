// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playlists;

import com.soundcloud.android.model.Urn;
import com.soundcloud.android.sync.SyncResult;
import rx.b;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.playlists:
//            PlaylistOperations

class val.playlistUrn
    implements f
{

    final PlaylistOperations this$0;
    final Urn val$playlistUrn;

    public volatile Object call(Object obj)
    {
        return call((SyncResult)obj);
    }

    public b call(SyncResult syncresult)
    {
        return PlaylistOperations.access$300(PlaylistOperations.this, val$playlistUrn).flatMap(PlaylistOperations.access$200(PlaylistOperations.this));
    }

    ()
    {
        this$0 = final_playlistoperations;
        val$playlistUrn = Urn.this;
        super();
    }
}
