// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.likes;

import com.soundcloud.android.sync.SyncResult;
import rx.b;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.likes:
//            PlaylistLikeOperations, PlaylistLikesStorage

class this._cls0
    implements f
{

    final PlaylistLikeOperations this$0;

    public volatile Object call(Object obj)
    {
        return call((SyncResult)obj);
    }

    public b call(SyncResult syncresult)
    {
        return PlaylistLikeOperations.access$300(PlaylistLikeOperations.this).loadLikedPlaylists(30, 0x7fffffffffffffffL).subscribeOn(PlaylistLikeOperations.access$200(PlaylistLikeOperations.this));
    }

    ()
    {
        this$0 = PlaylistLikeOperations.this;
        super();
    }
}
