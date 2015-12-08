// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.likes;

import com.soundcloud.android.sync.SyncInitiator;
import com.soundcloud.android.utils.NetworkConnectionHelper;
import java.util.List;
import rx.b.b;

// Referenced classes of package com.soundcloud.android.likes:
//            PlaylistLikeOperations

class this._cls0
    implements b
{

    final PlaylistLikeOperations this$0;

    public volatile void call(Object obj)
    {
        call((List)obj);
    }

    public void call(List list)
    {
        if (PlaylistLikeOperations.access$000(PlaylistLikeOperations.this).isWifiConnected() && !list.isEmpty())
        {
            PlaylistLikeOperations.access$100(PlaylistLikeOperations.this).requestPlaylistSync(list);
        }
    }

    ()
    {
        this$0 = PlaylistLikeOperations.this;
        super();
    }
}
