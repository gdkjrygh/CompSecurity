// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playlists;

import com.soundcloud.android.model.Urn;
import com.soundcloud.android.offline.OfflineContentOperations;
import rx.b;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.playlists:
//            PlaylistOperations

class this._cls0
    implements f
{

    final PlaylistOperations this$0;

    public volatile Object call(Object obj)
    {
        return call((Urn)obj);
    }

    public b call(Urn urn)
    {
        return PlaylistOperations.access$100(PlaylistOperations.this).makePlaylistAvailableOffline(urn);
    }

    s()
    {
        this$0 = PlaylistOperations.this;
        super();
    }
}
